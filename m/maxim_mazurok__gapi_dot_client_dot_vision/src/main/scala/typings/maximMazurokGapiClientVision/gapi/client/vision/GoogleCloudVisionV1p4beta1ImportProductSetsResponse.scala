package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p4beta1ImportProductSetsResponse extends StObject {
  
  /** The list of reference_images that are imported successfully. */
  var referenceImages: js.UndefOr[js.Array[GoogleCloudVisionV1p4beta1ReferenceImage]] = js.undefined
  
  /**
    * The rpc status for each ImportProductSet request, including both successes and errors. The number of statuses here matches the number of lines in the csv file, and statuses[i]
    * stores the success or failure status of processing the i-th line of the csv, starting from line 0.
    */
  var statuses: js.UndefOr[js.Array[Status]] = js.undefined
}
object GoogleCloudVisionV1p4beta1ImportProductSetsResponse {
  
  inline def apply(): GoogleCloudVisionV1p4beta1ImportProductSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1ImportProductSetsResponse]
  }
  
  extension [Self <: GoogleCloudVisionV1p4beta1ImportProductSetsResponse](x: Self) {
    
    inline def setReferenceImages(value: js.Array[GoogleCloudVisionV1p4beta1ReferenceImage]): Self = StObject.set(x, "referenceImages", value.asInstanceOf[js.Any])
    
    inline def setReferenceImagesUndefined: Self = StObject.set(x, "referenceImages", js.undefined)
    
    inline def setReferenceImagesVarargs(value: GoogleCloudVisionV1p4beta1ReferenceImage*): Self = StObject.set(x, "referenceImages", js.Array(value :_*))
    
    inline def setStatuses(value: js.Array[Status]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
    
    inline def setStatusesVarargs(value: Status*): Self = StObject.set(x, "statuses", js.Array(value :_*))
  }
}
