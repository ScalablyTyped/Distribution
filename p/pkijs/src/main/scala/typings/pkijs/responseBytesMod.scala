package typings.pkijs

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responseBytesMod {
  
  @JSImport("pkijs/src/ResponseBytes", JSImport.Default)
  @js.native
  class default () extends ResponseBytes {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/ResponseBytes", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/ResponseBytes", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/ResponseBytes", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/ResponseBytes", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait ResponseBytes extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var response: OctetString = js.native
    
    var responseType: String = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object ResponseBytes {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      response: OctetString,
      responseType: String,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): ResponseBytes = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), response = response.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[ResponseBytes]
    }
    
    @scala.inline
    implicit class ResponseBytesMutableBuilder[Self <: ResponseBytes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResponse(value: OctetString): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
