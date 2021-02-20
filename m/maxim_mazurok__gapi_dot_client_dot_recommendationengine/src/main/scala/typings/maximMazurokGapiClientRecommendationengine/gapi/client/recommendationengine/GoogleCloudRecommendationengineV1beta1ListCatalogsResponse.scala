package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ListCatalogsResponse extends StObject {
  
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
  implicit class GoogleCloudRecommendationengineV1beta1ListCatalogsResponseMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1ListCatalogsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogs(value: js.Array[GoogleCloudRecommendationengineV1beta1Catalog]): Self = StObject.set(x, "catalogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogsUndefined: Self = StObject.set(x, "catalogs", js.undefined)
    
    @scala.inline
    def setCatalogsVarargs(value: GoogleCloudRecommendationengineV1beta1Catalog*): Self = StObject.set(x, "catalogs", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
