package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadLineItemsResponse extends StObject {
  
  /** Status of upload. */
  var uploadStatus: js.UndefOr[UploadStatus] = js.undefined
}
object UploadLineItemsResponse {
  
  inline def apply(): UploadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadLineItemsResponse]
  }
  
  extension [Self <: UploadLineItemsResponse](x: Self) {
    
    inline def setUploadStatus(value: UploadStatus): Self = StObject.set(x, "uploadStatus", value.asInstanceOf[js.Any])
    
    inline def setUploadStatusUndefined: Self = StObject.set(x, "uploadStatus", js.undefined)
  }
}
