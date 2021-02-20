package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportProductSetsResponse extends StObject {
  
  /** The list of reference_images that are imported successfully. */
  var referenceImages: js.UndefOr[js.Array[ReferenceImage]] = js.native
  
  /**
    * The rpc status for each ImportProductSet request, including both successes and errors. The number of statuses here matches the number of lines in the csv file, and statuses[i]
    * stores the success or failure status of processing the i-th line of the csv, starting from line 0.
    */
  var statuses: js.UndefOr[js.Array[Status]] = js.native
}
object ImportProductSetsResponse {
  
  @scala.inline
  def apply(): ImportProductSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportProductSetsResponse]
  }
  
  @scala.inline
  implicit class ImportProductSetsResponseMutableBuilder[Self <: ImportProductSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReferenceImages(value: js.Array[ReferenceImage]): Self = StObject.set(x, "referenceImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceImagesUndefined: Self = StObject.set(x, "referenceImages", js.undefined)
    
    @scala.inline
    def setReferenceImagesVarargs(value: ReferenceImage*): Self = StObject.set(x, "referenceImages", js.Array(value :_*))
    
    @scala.inline
    def setStatuses(value: js.Array[Status]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
    
    @scala.inline
    def setStatusesVarargs(value: Status*): Self = StObject.set(x, "statuses", js.Array(value :_*))
  }
}
