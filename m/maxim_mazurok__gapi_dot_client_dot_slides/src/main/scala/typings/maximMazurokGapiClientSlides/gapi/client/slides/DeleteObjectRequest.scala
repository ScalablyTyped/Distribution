package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteObjectRequest extends StObject {
  
  /**
    * The object ID of the page or page element to delete. If after a delete operation a group contains only 1 or no page elements, the group is also deleted. If a placeholder is deleted
    * on a layout, any empty inheriting shapes are also deleted.
    */
  var objectId: js.UndefOr[String] = js.undefined
}
object DeleteObjectRequest {
  
  @scala.inline
  def apply(): DeleteObjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteObjectRequest]
  }
  
  @scala.inline
  implicit class DeleteObjectRequestMutableBuilder[Self <: DeleteObjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
