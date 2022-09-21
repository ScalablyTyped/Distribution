package typings.openapiTypes.mod.OpenAPIV31

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openapi-types.openapi-types.OpenAPIV3_1.Modify<openapi-types.openapi-types.OpenAPIV3.ResponseObject, {  headers :{[header: string] : openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.HeaderObject} | undefined,   content :{[media: string] : openapi-types.openapi-types.OpenAPIV3_1.MediaTypeObject} | undefined,   links :{[link: string] : openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.LinkObject} | undefined}> */
trait ResponseObject extends StObject {
  
  var content: js.UndefOr[StringDictionary[MediaTypeObject]] = js.undefined
  
  var description: String
  
  var headers: js.UndefOr[StringDictionary[ReferenceObject | HeaderObject]] = js.undefined
  
  var links: js.UndefOr[StringDictionary[ReferenceObject | LinkObject]] = js.undefined
}
object ResponseObject {
  
  inline def apply(description: String): ResponseObject = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
  
  extension [Self <: ResponseObject](x: Self) {
    
    inline def setContent(value: StringDictionary[MediaTypeObject]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: StringDictionary[ReferenceObject | HeaderObject]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setLinks(value: StringDictionary[ReferenceObject | LinkObject]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
  }
}
