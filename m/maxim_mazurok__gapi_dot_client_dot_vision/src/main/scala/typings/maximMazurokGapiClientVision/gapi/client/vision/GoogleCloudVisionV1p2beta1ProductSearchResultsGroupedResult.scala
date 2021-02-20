package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p2beta1ProductSearchResultsGroupedResult extends StObject {
  
  /** The bounding polygon around the product detected in the query image. */
  var boundingPoly: js.UndefOr[GoogleCloudVisionV1p2beta1BoundingPoly] = js.native
  
  /** List of generic predictions for the object in the bounding box. */
  var objectAnnotations: js.UndefOr[js.Array[GoogleCloudVisionV1p2beta1ProductSearchResultsObjectAnnotation]] = js.native
  
  /** List of results, one for each product match. */
  var results: js.UndefOr[js.Array[GoogleCloudVisionV1p2beta1ProductSearchResultsResult]] = js.native
}
object GoogleCloudVisionV1p2beta1ProductSearchResultsGroupedResult {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p2beta1ProductSearchResultsGroupedResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p2beta1ProductSearchResultsGroupedResult]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p2beta1ProductSearchResultsGroupedResultMutableBuilder[Self <: GoogleCloudVisionV1p2beta1ProductSearchResultsGroupedResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingPoly(value: GoogleCloudVisionV1p2beta1BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    @scala.inline
    def setObjectAnnotations(value: js.Array[GoogleCloudVisionV1p2beta1ProductSearchResultsObjectAnnotation]): Self = StObject.set(x, "objectAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectAnnotationsUndefined: Self = StObject.set(x, "objectAnnotations", js.undefined)
    
    @scala.inline
    def setObjectAnnotationsVarargs(value: GoogleCloudVisionV1p2beta1ProductSearchResultsObjectAnnotation*): Self = StObject.set(x, "objectAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[GoogleCloudVisionV1p2beta1ProductSearchResultsResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: GoogleCloudVisionV1p2beta1ProductSearchResultsResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
