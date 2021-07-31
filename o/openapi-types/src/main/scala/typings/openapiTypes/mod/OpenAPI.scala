package typings.openapiTypes.mod

import org.scalablytyped.runtime.StringDictionary
import typings.openapiTypes.mod.OpenAPIV2.Schema
import typings.openapiTypes.mod.OpenAPIV3.CallbackObject
import typings.openapiTypes.mod.OpenAPIV3.ComponentsObject
import typings.openapiTypes.mod.OpenAPIV3.ExternalDocumentationObject
import typings.openapiTypes.mod.OpenAPIV3.InfoObject
import typings.openapiTypes.mod.OpenAPIV3.ParameterObject
import typings.openapiTypes.mod.OpenAPIV3.PathsObject
import typings.openapiTypes.mod.OpenAPIV3.ReferenceObject
import typings.openapiTypes.mod.OpenAPIV3.RequestBodyObject
import typings.openapiTypes.mod.OpenAPIV3.ResponsesObject
import typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
import typings.openapiTypes.mod.OpenAPIV3.ServerObject
import typings.openapiTypes.mod.OpenAPIV3.TagObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OpenAPI {
  
  /* Rewritten from type alias, can be one of: 
    - typings.openapiTypes.mod.OpenAPIV2.Document
    - typings.openapiTypes.mod.OpenAPIV3.Document
  */
  trait Document extends StObject
  object Document {
    
    @scala.inline
    def apply(info: InfoObject, openapi: String, paths: PathsObject): Document = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], openapi = openapi.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[Document]
    }
    
    @scala.inline
    implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: ComponentsObject): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setExternalDocs(value: ExternalDocumentationObject): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
      
      @scala.inline
      def setInfo(value: InfoObject): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenapi(value: String): Self = StObject.set(x, "openapi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaths(value: PathsObject): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurity(value: js.Array[SecurityRequirementObject]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSecurityVarargs(value: SecurityRequirementObject*): Self = StObject.set(x, "security", js.Array(value :_*))
      
      @scala.inline
      def setServers(value: js.Array[ServerObject]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
      
      @scala.inline
      def setServersVarargs(value: ServerObject*): Self = StObject.set(x, "servers", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: js.Array[TagObject]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: TagObject*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def `setX-express-openapi-additional-middleware`(
        value: js.Array[
              js.Function3[
                /* request */ js.Any, 
                /* response */ js.Any, 
                /* next */ js.Any, 
                js.Promise[Unit] | Unit
              ]
            ]
      ): Self = StObject.set(x, "x-express-openapi-additional-middleware", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-express-openapi-additional-middlewareUndefined`: Self = StObject.set(x, "x-express-openapi-additional-middleware", js.undefined)
      
      @scala.inline
      def `setX-express-openapi-additional-middlewareVarargs`(
        value: (js.Function3[
              /* request */ js.Any, 
              /* response */ js.Any, 
              /* next */ js.Any, 
              js.Promise[Unit] | Unit
            ])*
      ): Self = StObject.set(x, "x-express-openapi-additional-middleware", js.Array(value :_*))
      
      @scala.inline
      def `setX-express-openapi-validation-strict`(value: Boolean): Self = StObject.set(x, "x-express-openapi-validation-strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-express-openapi-validation-strictUndefined`: Self = StObject.set(x, "x-express-openapi-validation-strict", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.openapiTypes.mod.OpenAPIV2.OperationObject
    - typings.openapiTypes.mod.OpenAPIV3.OperationObject
  */
  trait Operation extends StObject
  object Operation {
    
    @scala.inline
    def apply(): Operation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Operation]
    }
    
    @scala.inline
    implicit class OperationMutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: StringDictionary[ReferenceObject | CallbackObject]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      @scala.inline
      def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExternalDocs(value: ExternalDocumentationObject): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
      
      @scala.inline
      def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
      
      @scala.inline
      def setParameters(value: js.Array[ReferenceObject | ParameterObject]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParametersVarargs(value: (ReferenceObject | ParameterObject)*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      @scala.inline
      def setRequestBody(value: ReferenceObject | RequestBodyObject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      
      @scala.inline
      def setResponses(value: ResponsesObject): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
      
      @scala.inline
      def setSecurity(value: js.Array[SecurityRequirementObject]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSecurityVarargs(value: SecurityRequirementObject*): Self = StObject.set(x, "security", js.Array(value :_*))
      
      @scala.inline
      def setServers(value: js.Array[ServerObject]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
      
      @scala.inline
      def setServersVarargs(value: ServerObject*): Self = StObject.set(x, "servers", js.Array(value :_*))
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.openapiTypes.mod.OpenAPIV3.ReferenceObject
    - typings.openapiTypes.mod.OpenAPIV3.ParameterObject
    - typings.openapiTypes.mod.OpenAPIV2.ReferenceObject
    - typings.openapiTypes.mod.OpenAPIV2.Parameter
  */
  trait Parameter extends StObject
  object Parameter {
    
    @scala.inline
    def GeneralParameterObject(in: String, name: String, `type`: String): typings.openapiTypes.mod.OpenAPIV2.GeneralParameterObject = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.GeneralParameterObject]
    }
    
    @scala.inline
    def InBodyParameterObject(in: String, name: String, schema: Schema): typings.openapiTypes.mod.OpenAPIV2.InBodyParameterObject = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV2.InBodyParameterObject]
    }
    
    @scala.inline
    def ParameterObject(in: String, name: String): typings.openapiTypes.mod.OpenAPIV3.ParameterObject = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV3.ParameterObject]
    }
    
    @scala.inline
    def ReferenceObject($ref: String): typings.openapiTypes.mod.OpenAPIV3.ReferenceObject = {
      val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openapiTypes.mod.OpenAPIV3.ReferenceObject]
    }
  }
  
  type Parameters = js.Array[
    typings.openapiTypes.mod.OpenAPIV2.Parameter | ParameterObject | ReferenceObject | typings.openapiTypes.mod.OpenAPIV2.ReferenceObject
  ]
  
  trait Request extends StObject {
    
    var body: js.UndefOr[js.Any] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var query: js.UndefOr[js.Object] = js.undefined
  }
  object Request {
    
    @scala.inline
    def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
}
