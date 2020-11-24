package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1FeatureMap extends js.Object {
  
  /**
    * Categorical features that can take on one of a limited number of possible values. Some examples would be the brand/maker of a product, or country of a customer. Feature names and
    * values must be UTF-8 encoded strings. For example: `{ "colors": {"value": ["yellow", "green"]}, "sizes": {"value":["S", "M"]}`
    */
  var categoricalFeatures: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.recommendationengine.gapi.client.recommendationengine.GoogleCloudRecommendationengineV1beta1FeatureMapStringList}
    */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1FeatureMap with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Numerical features. Some examples would be the height/weight of a product, or age of a customer. Feature names must be UTF-8 encoded strings. For example: `{ "lengths_cm":
    * {"value":[2.3, 15.4]}, "heights_cm": {"value":[8.1, 6.4]} }`
    */
  var numericalFeatures: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.recommendationengine.gapi.client.recommendationengine.GoogleCloudRecommendationengineV1beta1FeatureMapFloatList}
    */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1FeatureMap with TopLevel[js.Any]
  ] = js.native
}
object GoogleCloudRecommendationengineV1beta1FeatureMap {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1FeatureMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1FeatureMap]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1FeatureMapOps[Self <: GoogleCloudRecommendationengineV1beta1FeatureMap] (val x: Self) extends AnyVal {
    
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
    def setCategoricalFeatures(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.recommendationengine.gapi.client.recommendationengine.GoogleCloudRecommendationengineV1beta1FeatureMapStringList}
      */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1FeatureMap with TopLevel[js.Any]
    ): Self = this.set("categoricalFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoricalFeatures: Self = this.set("categoricalFeatures", js.undefined)
    
    @scala.inline
    def setNumericalFeatures(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.recommendationengine.gapi.client.recommendationengine.GoogleCloudRecommendationengineV1beta1FeatureMapFloatList}
      */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1FeatureMap with TopLevel[js.Any]
    ): Self = this.set("numericalFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumericalFeatures: Self = this.set("numericalFeatures", js.undefined)
  }
}
