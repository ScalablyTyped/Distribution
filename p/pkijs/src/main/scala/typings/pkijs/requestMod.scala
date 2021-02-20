package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("pkijs/src/Request", JSImport.Default)
  @js.native
  class default () extends Request {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/Request", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/Request", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/Request", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/Request", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait Request extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var reqCert: typings.pkijs.certIDMod.default = js.native
    
    var singleRequestExtensions: js.UndefOr[js.Array[typings.pkijs.extensionMod.default]] = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
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
