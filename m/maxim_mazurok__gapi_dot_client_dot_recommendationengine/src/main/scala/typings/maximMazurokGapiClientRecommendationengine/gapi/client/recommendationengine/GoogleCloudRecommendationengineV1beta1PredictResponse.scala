package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1PredictResponse extends js.Object {
  
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
  implicit class GoogleCloudRecommendationengineV1beta1PredictResponseOps[Self <: GoogleCloudRecommendationengineV1beta1PredictResponse] (val x: Self) extends AnyVal {
    
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
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    
    @scala.inline
    def setItemsMissingInCatalogVarargs(value: String*): Self = this.set("itemsMissingInCatalog", js.Array(value :_*))
    
    @scala.inline
    def setItemsMissingInCatalog(value: js.Array[String]): Self = this.set("itemsMissingInCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsMissingInCatalog: Self = this.set("itemsMissingInCatalog", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1PredictResponse with TopLevel[js.Any]
    ): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setRecommendationToken(value: String): Self = this.set("recommendationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendationToken: Self = this.set("recommendationToken", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
}
