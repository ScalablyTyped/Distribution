package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncBatchAnnotateFilesRequest extends StObject {
  
  /**
    * Optional. Target project and location to make a call. Format: `projects/{project-id}/locations/{location-id}`. If no parent is specified, a region will be chosen automatically.
    * Supported location-ids: `us`: USA country only, `asia`: East asia areas, like Japan, Taiwan, `eu`: The European Union. Example: `projects/project-A/locations/eu`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /** Required. Individual async file annotation requests for this batch. */
  var requests: js.UndefOr[js.Array[AsyncAnnotateFileRequest]] = js.undefined
}
object AsyncBatchAnnotateFilesRequest {
  
  @scala.inline
  def apply(): AsyncBatchAnnotateFilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncBatchAnnotateFilesRequest]
  }
  
  @scala.inline
  implicit class AsyncBatchAnnotateFilesRequestMutableBuilder[Self <: AsyncBatchAnnotateFilesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequests(value: js.Array[AsyncAnnotateFileRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: AsyncAnnotateFileRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
