package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAnnotateImagesRequest extends StObject {
  
  /**
    * Optional. Target project and location to make a call. Format: `projects/{project-id}/locations/{location-id}`. If no parent is specified, a region will be chosen automatically.
    * Supported location-ids: `us`: USA country only, `asia`: East asia areas, like Japan, Taiwan, `eu`: The European Union. Example: `projects/project-A/locations/eu`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /** Required. Individual image annotation requests for this batch. */
  var requests: js.UndefOr[js.Array[AnnotateImageRequest]] = js.undefined
}
object BatchAnnotateImagesRequest {
  
  inline def apply(): BatchAnnotateImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAnnotateImagesRequest]
  }
  
  extension [Self <: BatchAnnotateImagesRequest](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequests(value: js.Array[AnnotateImageRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: AnnotateImageRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
