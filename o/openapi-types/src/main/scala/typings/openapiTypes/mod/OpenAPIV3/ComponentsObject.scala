package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentsObject extends StObject {
  
  var callbacks: js.UndefOr[StringDictionary[ReferenceObject | CallbackObject]] = js.undefined
  
  var examples: js.UndefOr[StringDictionary[ReferenceObject | ExampleObject]] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[ReferenceObject | HeaderObject]] = js.undefined
  
  var links: js.UndefOr[StringDictionary[ReferenceObject | LinkObject]] = js.undefined
  
  var parameters: js.UndefOr[StringDictionary[ReferenceObject | ParameterObject]] = js.undefined
  
  var requestBodies: js.UndefOr[StringDictionary[ReferenceObject | RequestBodyObject]] = js.undefined
  
  var responses: js.UndefOr[StringDictionary[ReferenceObject | ResponseObject]] = js.undefined
  
  var schemas: js.UndefOr[StringDictionary[ReferenceObject | SchemaObject]] = js.undefined
  
  var securitySchemes: js.UndefOr[StringDictionary[ReferenceObject | SecuritySchemeObject]] = js.undefined
}
object ComponentsObject {
  
  inline def apply(): ComponentsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentsObject]
  }
  
  extension [Self <: ComponentsObject](x: Self) {
    
    inline def setCallbacks(value: StringDictionary[ReferenceObject | CallbackObject]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    inline def setExamples(value: StringDictionary[ReferenceObject | ExampleObject]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setHeaders(value: StringDictionary[ReferenceObject | HeaderObject]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setLinks(value: StringDictionary[ReferenceObject | LinkObject]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setParameters(value: StringDictionary[ReferenceObject | ParameterObject]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setRequestBodies(value: StringDictionary[ReferenceObject | RequestBodyObject]): Self = StObject.set(x, "requestBodies", value.asInstanceOf[js.Any])
    
    inline def setRequestBodiesUndefined: Self = StObject.set(x, "requestBodies", js.undefined)
    
    inline def setResponses(value: StringDictionary[ReferenceObject | ResponseObject]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setSchemas(value: StringDictionary[ReferenceObject | SchemaObject]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSecuritySchemes(value: StringDictionary[ReferenceObject | SecuritySchemeObject]): Self = StObject.set(x, "securitySchemes", value.asInstanceOf[js.Any])
    
    inline def setSecuritySchemesUndefined: Self = StObject.set(x, "securitySchemes", js.undefined)
  }
}
