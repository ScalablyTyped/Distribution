package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseObject extends StObject {
  
  var content: js.UndefOr[StringDictionary[MediaTypeObject]] = js.native
  
  var description: String = js.native
  
  var headers: js.UndefOr[StringDictionary[ReferenceObject | HeaderObject]] = js.native
  
  var links: js.UndefOr[StringDictionary[ReferenceObject | LinkObject]] = js.native
}
object ResponseObject {
  
  @scala.inline
  def apply(description: String): ResponseObject = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseObject]
  }
  
  @scala.inline
  implicit class ResponseObjectMutableBuilder[Self <: ResponseObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: StringDictionary[MediaTypeObject]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: StringDictionary[ReferenceObject | HeaderObject]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setLinks(value: StringDictionary[ReferenceObject | LinkObject]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
  }
}
