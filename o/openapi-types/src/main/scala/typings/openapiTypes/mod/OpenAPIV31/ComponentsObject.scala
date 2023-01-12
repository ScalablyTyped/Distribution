package typings.openapiTypes.mod.OpenAPIV31

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openapi-types.openapi-types.OpenAPIV3_1.Modify<openapi-types.openapi-types.OpenAPIV3.ComponentsObject, {  schemas :std.Record<string, openapi-types.openapi-types.OpenAPIV3_1.SchemaObject> | undefined,   responses :std.Record<string, openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.ResponseObject> | undefined,   parameters :std.Record<string, openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.ParameterObject> | undefined,   examples :std.Record<string, openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.ExampleObject> | undefined,   requestBodies :std.Record<string, openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.RequestBodyObject> | undefined,   headers :std.Record<string, openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.HeaderObject> | undefined,   securitySchemes :std.Record<string, openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.SecuritySchemeObject> | undefined,   links :std.Record<string, openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.LinkObject> | undefined,   callbacks :std.Record<string, openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.CallbackObject> | undefined,   pathItems :std.Record<string, openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.PathItemObject<{}>> | undefined}> */
trait ComponentsObject extends StObject {
  
  var callbacks: js.UndefOr[Record[String, ReferenceObject | CallbackObject]] = js.undefined
  
  var examples: js.UndefOr[Record[String, ReferenceObject | ExampleObject]] = js.undefined
  
  var headers: js.UndefOr[Record[String, ReferenceObject | HeaderObject]] = js.undefined
  
  var links: js.UndefOr[Record[String, ReferenceObject | LinkObject]] = js.undefined
  
  var parameters: js.UndefOr[Record[String, ReferenceObject | ParameterObject]] = js.undefined
  
  var pathItems: js.UndefOr[Record[String, ReferenceObject | PathItemObject[js.Object]]] = js.undefined
  
  var requestBodies: js.UndefOr[Record[String, ReferenceObject | RequestBodyObject]] = js.undefined
  
  var responses: js.UndefOr[Record[String, ReferenceObject | ResponseObject]] = js.undefined
  
  var schemas: js.UndefOr[Record[String, SchemaObject]] = js.undefined
  
  var securitySchemes: js.UndefOr[Record[String, ReferenceObject | SecuritySchemeObject]] = js.undefined
}
object ComponentsObject {
  
  inline def apply(): ComponentsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentsObject] (val x: Self) extends AnyVal {
    
    inline def setCallbacks(value: Record[String, ReferenceObject | CallbackObject]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    inline def setExamples(value: Record[String, ReferenceObject | ExampleObject]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setHeaders(value: Record[String, ReferenceObject | HeaderObject]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setLinks(value: Record[String, ReferenceObject | LinkObject]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setParameters(value: Record[String, ReferenceObject | ParameterObject]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPathItems(value: Record[String, ReferenceObject | PathItemObject[js.Object]]): Self = StObject.set(x, "pathItems", value.asInstanceOf[js.Any])
    
    inline def setPathItemsUndefined: Self = StObject.set(x, "pathItems", js.undefined)
    
    inline def setRequestBodies(value: Record[String, ReferenceObject | RequestBodyObject]): Self = StObject.set(x, "requestBodies", value.asInstanceOf[js.Any])
    
    inline def setRequestBodiesUndefined: Self = StObject.set(x, "requestBodies", js.undefined)
    
    inline def setResponses(value: Record[String, ReferenceObject | ResponseObject]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setSchemas(value: Record[String, SchemaObject]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSecuritySchemes(value: Record[String, ReferenceObject | SecuritySchemeObject]): Self = StObject.set(x, "securitySchemes", value.asInstanceOf[js.Any])
    
    inline def setSecuritySchemesUndefined: Self = StObject.set(x, "securitySchemes", js.undefined)
  }
}
