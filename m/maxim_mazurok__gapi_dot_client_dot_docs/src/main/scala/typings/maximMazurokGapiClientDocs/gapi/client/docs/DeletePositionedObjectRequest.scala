package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePositionedObjectRequest extends StObject {
  
  /** The ID of the positioned object to delete. */
  var objectId: js.UndefOr[String] = js.native
}
object DeletePositionedObjectRequest {
  
  @scala.inline
  def apply(): DeletePositionedObjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePositionedObjectRequest]
  }
  
  @scala.inline
  implicit class DeletePositionedObjectRequestMutableBuilder[Self <: DeletePositionedObjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
