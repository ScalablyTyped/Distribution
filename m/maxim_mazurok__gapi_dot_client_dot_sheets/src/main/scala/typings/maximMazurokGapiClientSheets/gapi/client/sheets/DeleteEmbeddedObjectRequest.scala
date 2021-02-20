package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEmbeddedObjectRequest extends StObject {
  
  /** The ID of the embedded object to delete. */
  var objectId: js.UndefOr[Double] = js.native
}
object DeleteEmbeddedObjectRequest {
  
  @scala.inline
  def apply(): DeleteEmbeddedObjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEmbeddedObjectRequest]
  }
  
  @scala.inline
  implicit class DeleteEmbeddedObjectRequestMutableBuilder[Self <: DeleteEmbeddedObjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
