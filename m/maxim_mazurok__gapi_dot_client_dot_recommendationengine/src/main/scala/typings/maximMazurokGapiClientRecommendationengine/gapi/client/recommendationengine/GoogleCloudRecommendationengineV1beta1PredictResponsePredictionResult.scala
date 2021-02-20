package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult extends StObject {
  
  /** ID of the recommended catalog item */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Additional item metadata / annotations. Possible values: * `catalogItem`: JSON representation of the catalogItem. Will be set if `returnCatalogItem` is set to true in
    * `PredictRequest.params`. * `score`: Prediction score in double value. Will be set if `returnItemScore` is set to true in `PredictRequest.params`.
    */
  var itemMetadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult with TopLevel[js.Any]
  ] = js.native
}
object GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResultMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setItemMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult with TopLevel[js.Any]
    ): Self = StObject.set(x, "itemMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemMetadataUndefined: Self = StObject.set(x, "itemMetadata", js.undefined)
  }
}
