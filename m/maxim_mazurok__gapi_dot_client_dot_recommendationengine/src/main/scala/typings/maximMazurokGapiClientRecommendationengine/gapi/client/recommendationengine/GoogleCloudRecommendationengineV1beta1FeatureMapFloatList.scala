package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1FeatureMapFloatList extends StObject {
  
  /** Float feature value. */
  var value: js.UndefOr[js.Array[Double]] = js.native
}
object GoogleCloudRecommendationengineV1beta1FeatureMapFloatList {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1FeatureMapFloatList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1FeatureMapFloatList]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1FeatureMapFloatListMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1FeatureMapFloatList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
