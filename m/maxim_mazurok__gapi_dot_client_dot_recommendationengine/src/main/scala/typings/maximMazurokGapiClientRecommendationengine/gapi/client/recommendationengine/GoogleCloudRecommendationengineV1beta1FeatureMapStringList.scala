package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1FeatureMapStringList extends StObject {
  
  /** String feature value with a length limit of 128 bytes. */
  var value: js.UndefOr[js.Array[String]] = js.native
}
object GoogleCloudRecommendationengineV1beta1FeatureMapStringList {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1FeatureMapStringList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1FeatureMapStringList]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1FeatureMapStringListMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1FeatureMapStringList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
