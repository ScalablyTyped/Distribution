package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import typings.openapiTypes.mod.OpenAPI.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationObject
  extends StObject
     with Operation {
  
  var callbacks: js.UndefOr[StringDictionary[ReferenceObject | CallbackObject]] = js.undefined
  
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  
  var operationId: js.UndefOr[String] = js.undefined
  
  var parameters: js.UndefOr[js.Array[ReferenceObject | ParameterObject]] = js.undefined
  
  var requestBody: js.UndefOr[ReferenceObject | RequestBodyObject] = js.undefined
  
  var responses: js.UndefOr[ResponsesObject] = js.undefined
  
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.undefined
  
  var servers: js.UndefOr[js.Array[ServerObject]] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object OperationObject {
  
  inline def apply(): OperationObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationObject]
  }
  
  extension [Self <: OperationObject](x: Self) {
    
    inline def setCallbacks(value: StringDictionary[ReferenceObject | CallbackObject]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExternalDocs(value: ExternalDocumentationObject): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    inline def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setParameters(value: js.Array[ReferenceObject | ParameterObject]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: (ReferenceObject | ParameterObject)*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    inline def setRequestBody(value: ReferenceObject | RequestBodyObject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: ResponsesObject): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setSecurity(value: js.Array[SecurityRequirementObject]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSecurityVarargs(value: SecurityRequirementObject*): Self = StObject.set(x, "security", js.Array(value :_*))
    
    inline def setServers(value: js.Array[ServerObject]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
    
    inline def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
    
    inline def setServersVarargs(value: ServerObject*): Self = StObject.set(x, "servers", js.Array(value :_*))
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
