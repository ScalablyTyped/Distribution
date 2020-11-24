package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommenderV1CostProjection extends js.Object {
  
  /**
    * An approximate projection on amount saved or amount incurred. Negative cost units indicate cost savings and positive cost units indicate increase. See google.type.Money
    * documentation for positive/negative units.
    */
  var cost: js.UndefOr[GoogleTypeMoney] = js.native
  
  /** Duration for which this cost applies. */
  var duration: js.UndefOr[String] = js.native
}
object GoogleCloudRecommenderV1CostProjection {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1CostProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1CostProjection]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1CostProjectionOps[Self <: GoogleCloudRecommenderV1CostProjection] (val x: Self) extends AnyVal {
    
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
    def setCost(value: GoogleTypeMoney): Self = this.set("cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCost: Self = this.set("cost", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
  }
}
