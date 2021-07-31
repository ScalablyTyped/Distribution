package typings.pkijs

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeStampReqMod {
  
  @JSImport("pkijs/src/TimeStampReq", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with TimeStampReq {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var messageImprint: typings.pkijs.messageImprintMod.default = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
    
    /* CompleteClass */
    var version: Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/TimeStampReq", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @scala.inline
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait TimeStampReq extends StObject {
    
    var certReq: js.UndefOr[Boolean] = js.undefined
    
    var extensions: js.UndefOr[js.Array[typings.pkijs.extensionMod.default]] = js.undefined
    
    def fromSchema(schema: js.Any): Unit
    
    var messageImprint: typings.pkijs.messageImprintMod.default
    
    var nonce: js.UndefOr[Integer] = js.undefined
    
    var reqPolicy: js.UndefOr[String] = js.undefined
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
    
    var version: Double
  }
  object TimeStampReq {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      messageImprint: typings.pkijs.messageImprintMod.default,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      version: Double
    ): TimeStampReq = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), messageImprint = messageImprint.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeStampReq]
    }
    
    @scala.inline
    implicit class TimeStampReqMutableBuilder[Self <: TimeStampReq] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertReq(value: Boolean): Self = StObject.set(x, "certReq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertReqUndefined: Self = StObject.set(x, "certReq", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[typings.pkijs.extensionMod.default]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: typings.pkijs.extensionMod.default*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMessageImprint(value: typings.pkijs.messageImprintMod.default): Self = StObject.set(x, "messageImprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: Integer): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setReqPolicy(value: String): Self = StObject.set(x, "reqPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqPolicyUndefined: Self = StObject.set(x, "reqPolicy", js.undefined)
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
