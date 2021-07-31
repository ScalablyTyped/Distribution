package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p3beta1ProductSearchResults extends StObject {
  
  /**
    * Timestamp of the index which provided these results. Products added to the product set and products removed from the product set after this time are not reflected in the current
    * results.
    */
  var indexTime: js.UndefOr[String] = js.undefined
  
  /**
    * List of results grouped by products detected in the query image. Each entry corresponds to one bounding polygon in the query image, and contains the matching products specific to
    * that region. There may be duplicate product matches in the union of all the per-product results.
    */
  var productGroupedResults: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1ProductSearchResultsGroupedResult]] = js.undefined
  
  /** List of results, one for each product match. */
  var results: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1ProductSearchResultsResult]] = js.undefined
}
object GoogleCloudVisionV1p3beta1ProductSearchResults {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p3beta1ProductSearchResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p3beta1ProductSearchResults]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p3beta1ProductSearchResultsMutableBuilder[Self <: GoogleCloudVisionV1p3beta1ProductSearchResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexTime(value: String): Self = StObject.set(x, "indexTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexTimeUndefined: Self = StObject.set(x, "indexTime", js.undefined)
    
    @scala.inline
    def setProductGroupedResults(value: js.Array[GoogleCloudVisionV1p3beta1ProductSearchResultsGroupedResult]): Self = StObject.set(x, "productGroupedResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductGroupedResultsUndefined: Self = StObject.set(x, "productGroupedResults", js.undefined)
    
    @scala.inline
    def setProductGroupedResultsVarargs(value: GoogleCloudVisionV1p3beta1ProductSearchResultsGroupedResult*): Self = StObject.set(x, "productGroupedResults", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[GoogleCloudVisionV1p3beta1ProductSearchResultsResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: GoogleCloudVisionV1p3beta1ProductSearchResultsResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
