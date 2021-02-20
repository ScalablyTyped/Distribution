package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupObjectsResponse extends StObject {
  
  /** The object ID of the created group. */
  var objectId: js.UndefOr[String] = js.native
}
object GroupObjectsResponse {
  
  @scala.inline
  def apply(): GroupObjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupObjectsResponse]
  }
  
  @scala.inline
  implicit class GroupObjectsResponseMutableBuilder[Self <: GroupObjectsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
