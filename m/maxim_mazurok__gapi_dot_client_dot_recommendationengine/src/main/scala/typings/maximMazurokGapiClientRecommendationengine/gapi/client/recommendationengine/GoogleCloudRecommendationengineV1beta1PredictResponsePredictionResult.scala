package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult extends StObject {
  
  /** ID of the recommended catalog item */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Additional item metadata / annotations. Possible values: * `catalogItem`: JSON representation of the catalogItem. Will be set if `returnCatalogItem` is set to true in
    * `PredictRequest.params`. * `score`: Prediction score in double value. Will be set if `returnItemScore` is set to true in `PredictRequest.params`.
    */
  var itemMetadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult {
  
  inline def apply(): GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult]
  }
  
  extension [Self <: GoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItemMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "itemMetadata", value.asInstanceOf[js.Any])
    
    inline def setItemMetadataUndefined: Self = StObject.set(x, "itemMetadata", js.undefined)
  }
}
