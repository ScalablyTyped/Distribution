package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadLineItemsResponse extends StObject {
  
  /** Status of upload. */
  var uploadStatus: js.UndefOr[UploadStatus] = js.undefined
}
object UploadLineItemsResponse {
  
  @scala.inline
  def apply(): UploadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadLineItemsResponse]
  }
  
  @scala.inline
  implicit class UploadLineItemsResponseMutableBuilder[Self <: UploadLineItemsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUploadStatus(value: UploadStatus): Self = StObject.set(x, "uploadStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadStatusUndefined: Self = StObject.set(x, "uploadStatus", js.undefined)
  }
}
