package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalDocumentationObject extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var url: String = js.native
}
object ExternalDocumentationObject {
  
  @scala.inline
  def apply(url: String): ExternalDocumentationObject = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalDocumentationObject]
  }
  
  @scala.inline
  implicit class ExternalDocumentationObjectMutableBuilder[Self <: ExternalDocumentationObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
