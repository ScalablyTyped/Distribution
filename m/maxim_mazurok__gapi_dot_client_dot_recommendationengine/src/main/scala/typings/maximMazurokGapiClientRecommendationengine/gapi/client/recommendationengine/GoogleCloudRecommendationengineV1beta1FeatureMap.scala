package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1FeatureMap extends StObject {
  
  /**
    * Categorical features that can take on one of a limited number of possible values. Some examples would be the brand/maker of a product, or country of a customer. Feature names and
    * values must be UTF-8 encoded strings. For example: `{ "colors": {"value": ["yellow", "green"]}, "sizes": {"value":["S", "M"]}`
    */
  var categoricalFeatures: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.recommendationengine.gapi.client.recommendationengine.GoogleCloudRecommendationengineV1beta1FeatureMapStringList}
    */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1FeatureMap & TopLevel[Any]
  ] = js.undefined
  
  /**
    * Numerical features. Some examples would be the height/weight of a product, or age of a customer. Feature names must be UTF-8 encoded strings. For example: `{ "lengths_cm":
    * {"value":[2.3, 15.4]}, "heights_cm": {"value":[8.1, 6.4]} }`
    */
  var numericalFeatures: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.recommendationengine.gapi.client.recommendationengine.GoogleCloudRecommendationengineV1beta1FeatureMapFloatList}
    */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1FeatureMap & TopLevel[Any]
  ] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1FeatureMap {
  
  inline def apply(): GoogleCloudRecommendationengineV1beta1FeatureMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1FeatureMap]
  }
  
  extension [Self <: GoogleCloudRecommendationengineV1beta1FeatureMap](x: Self) {
    
    inline def setCategoricalFeatures(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.recommendationengine.gapi.client.recommendationengine.GoogleCloudRecommendationengineV1beta1FeatureMapStringList}
      */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1FeatureMap & TopLevel[Any]
    ): Self = StObject.set(x, "categoricalFeatures", value.asInstanceOf[js.Any])
    
    inline def setCategoricalFeaturesUndefined: Self = StObject.set(x, "categoricalFeatures", js.undefined)
    
    inline def setNumericalFeatures(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.recommendationengine.gapi.client.recommendationengine.GoogleCloudRecommendationengineV1beta1FeatureMapFloatList}
      */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1FeatureMap & TopLevel[Any]
    ): Self = StObject.set(x, "numericalFeatures", value.asInstanceOf[js.Any])
    
    inline def setNumericalFeaturesUndefined: Self = StObject.set(x, "numericalFeatures", js.undefined)
  }
}
