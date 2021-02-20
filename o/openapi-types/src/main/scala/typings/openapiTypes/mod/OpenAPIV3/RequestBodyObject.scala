package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestBodyObject extends StObject {
  
  var content: StringDictionary[MediaTypeObject] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
}
object RequestBodyObject {
  
  @scala.inline
  def apply(content: StringDictionary[MediaTypeObject]): RequestBodyObject = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyObject]
  }
  
  @scala.inline
  implicit class RequestBodyObjectMutableBuilder[Self <: RequestBodyObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: StringDictionary[MediaTypeObject]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
