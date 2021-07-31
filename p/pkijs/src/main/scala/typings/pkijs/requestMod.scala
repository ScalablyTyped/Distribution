package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("pkijs/src/Request", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Request {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var reqCert: typings.pkijs.certIDMod.default = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/Request", JSImport.Default)
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
  
  trait Request extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    var reqCert: typings.pkijs.certIDMod.default
    
    var singleRequestExtensions: js.UndefOr[js.Array[typings.pkijs.extensionMod.default]] = js.undefined
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object Request {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      reqCert: typings.pkijs.certIDMod.default,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): Request = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), reqCert = reqCert.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReqCert(value: typings.pkijs.certIDMod.default): Self = StObject.set(x, "reqCert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleRequestExtensions(value: js.Array[typings.pkijs.extensionMod.default]): Self = StObject.set(x, "singleRequestExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleRequestExtensionsUndefined: Self = StObject.set(x, "singleRequestExtensions", js.undefined)
      
      @scala.inline
      def setSingleRequestExtensionsVarargs(value: typings.pkijs.extensionMod.default*): Self = StObject.set(x, "singleRequestExtensions", js.Array(value :_*))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
