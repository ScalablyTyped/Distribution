package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommenderV1Impact extends js.Object {
  
  /** Category that is being targeted. */
  var category: js.UndefOr[String] = js.native
  
  /** Use with CategoryType.COST */
  var costProjection: js.UndefOr[GoogleCloudRecommenderV1CostProjection] = js.native
}
object GoogleCloudRecommenderV1Impact {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1Impact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1Impact]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1ImpactOps[Self <: GoogleCloudRecommenderV1Impact] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setCostProjection(value: GoogleCloudRecommenderV1CostProjection): Self = this.set("costProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCostProjection: Self = this.set("costProjection", js.undefined)
  }
}
