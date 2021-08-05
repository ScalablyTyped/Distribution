package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1ListCatalogsResponse extends StObject {
  
  /** Output only. All the customer's catalogs. */
  var catalogs: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1Catalog]] = js.undefined
  
  /** Pagination token, if not returned indicates the last page. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1ListCatalogsResponse {
  
  inline def apply(): GoogleCloudRecommendationengineV1beta1ListCatalogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ListCatalogsResponse]
  }
  
  extension [Self <: GoogleCloudRecommendationengineV1beta1ListCatalogsResponse](x: Self) {
    
    inline def setCatalogs(value: js.Array[GoogleCloudRecommendationengineV1beta1Catalog]): Self = StObject.set(x, "catalogs", value.asInstanceOf[js.Any])
    
    inline def setCatalogsUndefined: Self = StObject.set(x, "catalogs", js.undefined)
    
    inline def setCatalogsVarargs(value: GoogleCloudRecommendationengineV1beta1Catalog*): Self = StObject.set(x, "catalogs", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
