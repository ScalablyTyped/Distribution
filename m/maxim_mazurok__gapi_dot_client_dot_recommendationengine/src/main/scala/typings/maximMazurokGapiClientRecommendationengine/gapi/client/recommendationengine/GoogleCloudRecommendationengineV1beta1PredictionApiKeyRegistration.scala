package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration extends StObject {
  
  /** The API key. */
  var apiKey: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration {
  
  inline def apply(): GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration] (val x: Self) extends AnyVal {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
  }
}
