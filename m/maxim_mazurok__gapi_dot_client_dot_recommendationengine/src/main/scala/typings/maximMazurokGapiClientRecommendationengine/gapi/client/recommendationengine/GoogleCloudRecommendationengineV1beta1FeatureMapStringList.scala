package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1FeatureMapStringList extends js.Object {
  
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
  implicit class GoogleCloudRecommendationengineV1beta1FeatureMapStringListOps[Self <: GoogleCloudRecommendationengineV1beta1FeatureMapStringList] (val x: Self) extends AnyVal {
    
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
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
