package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ListCatalogsResponse extends js.Object {
  
  /** Output only. All the customer's catalogs. */
  var catalogs: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1Catalog]] = js.native
  
  /** Pagination token, if not returned indicates the last page. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1ListCatalogsResponse {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ListCatalogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ListCatalogsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ListCatalogsResponseOps[Self <: GoogleCloudRecommendationengineV1beta1ListCatalogsResponse] (val x: Self) extends AnyVal {
    
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
    def setCatalogsVarargs(value: GoogleCloudRecommendationengineV1beta1Catalog*): Self = this.set("catalogs", js.Array(value :_*))
    
    @scala.inline
    def setCatalogs(value: js.Array[GoogleCloudRecommendationengineV1beta1Catalog]): Self = this.set("catalogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogs: Self = this.set("catalogs", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
