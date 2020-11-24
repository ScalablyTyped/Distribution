package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p4beta1ProductSearchResultsGroupedResult extends js.Object {
  
  /** The bounding polygon around the product detected in the query image. */
  var boundingPoly: js.UndefOr[GoogleCloudVisionV1p4beta1BoundingPoly] = js.native
  
  /** List of generic predictions for the object in the bounding box. */
  var objectAnnotations: js.UndefOr[js.Array[GoogleCloudVisionV1p4beta1ProductSearchResultsObjectAnnotation]] = js.native
  
  /** List of results, one for each product match. */
  var results: js.UndefOr[js.Array[GoogleCloudVisionV1p4beta1ProductSearchResultsResult]] = js.native
}
object GoogleCloudVisionV1p4beta1ProductSearchResultsGroupedResult {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p4beta1ProductSearchResultsGroupedResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1ProductSearchResultsGroupedResult]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p4beta1ProductSearchResultsGroupedResultOps[Self <: GoogleCloudVisionV1p4beta1ProductSearchResultsGroupedResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoundingPoly(value: GoogleCloudVisionV1p4beta1BoundingPoly): Self = this.set("boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingPoly: Self = this.set("boundingPoly", js.undefined)
    
    @scala.inline
    def setObjectAnnotationsVarargs(value: GoogleCloudVisionV1p4beta1ProductSearchResultsObjectAnnotation*): Self = this.set("objectAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setObjectAnnotations(value: js.Array[GoogleCloudVisionV1p4beta1ProductSearchResultsObjectAnnotation]): Self = this.set("objectAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectAnnotations: Self = this.set("objectAnnotations", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: GoogleCloudVisionV1p4beta1ProductSearchResultsResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[GoogleCloudVisionV1p4beta1ProductSearchResultsResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
}
