package typings.pkijs

import typings.asn1js.mod.Integer
import typings.std.BufferSource
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tstinfoMod {
  
  @JSImport("pkijs/src/TSTInfo", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with TSTInfo {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var genTime: Date = js.native
    
    /* CompleteClass */
    var messageImprint: typings.pkijs.messageImprintMod.default = js.native
    
    /* CompleteClass */
    var policy: String = js.native
    
    /* CompleteClass */
    var serialNumber: Integer = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
    
    /* CompleteClass */
    override def verify(params: VerifyParams): js.Thenable[Boolean] = js.native
    
    /* CompleteClass */
    var version: Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/TSTInfo", JSImport.Default)
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
  
  trait TSTInfo extends StObject {
    
    var accuracy: js.UndefOr[typings.pkijs.accuracyMod.default] = js.undefined
    
    var extensions: js.UndefOr[js.Array[typings.pkijs.extensionMod.default]] = js.undefined
    
    def fromSchema(schema: js.Any): Unit
    
    var genTime: Date
    
    var messageImprint: typings.pkijs.messageImprintMod.default
    
    var nonce: js.UndefOr[Integer] = js.undefined
    
    var ordering: js.UndefOr[Boolean] = js.undefined
    
    var policy: String
    
    var serialNumber: Integer
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
    
    var tsa: js.UndefOr[typings.pkijs.generalNameMod.default] = js.undefined
    
    def verify(params: VerifyParams): js.Thenable[Boolean]
    
    var version: Double
  }
  object TSTInfo {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      genTime: Date,
      messageImprint: typings.pkijs.messageImprintMod.default,
      policy: String,
      serialNumber: Integer,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      verify: VerifyParams => js.Thenable[Boolean],
      version: Double
    ): TSTInfo = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), genTime = genTime.asInstanceOf[js.Any], messageImprint = messageImprint.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), verify = js.Any.fromFunction1(verify), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[TSTInfo]
    }
    
    @scala.inline
    implicit class TSTInfoMutableBuilder[Self <: TSTInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccuracy(value: typings.pkijs.accuracyMod.default): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[typings.pkijs.extensionMod.default]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: typings.pkijs.extensionMod.default*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGenTime(value: Date): Self = StObject.set(x, "genTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageImprint(value: typings.pkijs.messageImprintMod.default): Self = StObject.set(x, "messageImprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: Integer): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setOrdering(value: Boolean): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
      
      @scala.inline
      def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTsa(value: typings.pkijs.generalNameMod.default): Self = StObject.set(x, "tsa", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTsaUndefined: Self = StObject.set(x, "tsa", js.undefined)
      
      @scala.inline
      def setVerify(value: VerifyParams => js.Thenable[Boolean]): Self = StObject.set(x, "verify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait VerifyParams extends StObject {
    
    var data: BufferSource
    
    var notAfter: js.UndefOr[Date] = js.undefined
    
    var notBefore: js.UndefOr[Date] = js.undefined
  }
  object VerifyParams {
    
    @scala.inline
    def apply(data: BufferSource): VerifyParams = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyParams]
    }
    
    @scala.inline
    implicit class VerifyParamsMutableBuilder[Self <: VerifyParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: BufferSource): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotAfter(value: Date): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
      
      @scala.inline
      def setNotBefore(value: Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
    }
  }
}
