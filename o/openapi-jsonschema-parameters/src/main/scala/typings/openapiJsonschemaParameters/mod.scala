package typings.openapiJsonschemaParameters

import typings.openapiTypes.mod.IJsonSchema
import typings.openapiTypes.mod.OpenAPI.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-jsonschema-parameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertParametersToJSONSchema(parameters: Parameters): OpenAPIParametersAsJSONSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("convertParametersToJSONSchema")(parameters.asInstanceOf[js.Any]).asInstanceOf[OpenAPIParametersAsJSONSchema]
  
  trait OpenAPIParametersAsJSONSchema extends StObject {
    
    var body: js.UndefOr[IJsonSchema] = js.undefined
    
    var cookie: js.UndefOr[IJsonSchema] = js.undefined
    
    var formData: js.UndefOr[IJsonSchema] = js.undefined
    
    var headers: js.UndefOr[IJsonSchema] = js.undefined
    
    var path: js.UndefOr[IJsonSchema] = js.undefined
    
    var query: js.UndefOr[IJsonSchema] = js.undefined
  }
  object OpenAPIParametersAsJSONSchema {
    
    @scala.inline
    def apply(): OpenAPIParametersAsJSONSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenAPIParametersAsJSONSchema]
    }
    
    @scala.inline
    implicit class OpenAPIParametersAsJSONSchemaMutableBuilder[Self <: OpenAPIParametersAsJSONSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: IJsonSchema): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCookie(value: IJsonSchema): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setFormData(value: IJsonSchema): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
      
      @scala.inline
      def setHeaders(value: IJsonSchema): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setPath(value: IJsonSchema): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setQuery(value: IJsonSchema): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
}
