package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1PredictResponse extends StObject {
  
  /** True if the dryRun property was set in the request. */
  var dryRun: js.UndefOr[Boolean] = js.native
  
  /** IDs of items in the request that were missing from the catalog. */
  var itemsMissingInCatalog: js.UndefOr[js.Array[String]] = js.native
  
  /** Additional domain specific prediction response metadata. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1PredictResponse with TopLevel[js.Any]
  ] = js.native
  
  /** If empty, the list is complete. If nonempty, the token to pass to the next request's PredictRequest.page_token. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * A unique recommendation token. This should be included in the user event logs resulting from this recommendation, which enables accurate attribution of recommendation model
    * performance.
    */
  var recommendationToken: js.UndefOr[String] = js.native
  
  /** A list of recommended items. The order represents the ranking (from the most relevant item to the least). */
  var results: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult]] = js.native
}
object GoogleCloudRecommendationengineV1beta1PredictResponse {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1PredictResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1PredictResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1PredictResponseMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1PredictResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    @scala.inline
    def setItemsMissingInCatalog(value: js.Array[String]): Self = StObject.set(x, "itemsMissingInCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsMissingInCatalogUndefined: Self = StObject.set(x, "itemsMissingInCatalog", js.undefined)
    
    @scala.inline
    def setItemsMissingInCatalogVarargs(value: String*): Self = StObject.set(x, "itemsMissingInCatalog", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1PredictResponse with TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRecommendationToken(value: String): Self = StObject.set(x, "recommendationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationTokenUndefined: Self = StObject.set(x, "recommendationToken", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
