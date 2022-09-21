package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1Impact extends StObject {
  
  /** Category that is being targeted. */
  var category: js.UndefOr[String] = js.undefined
  
  /** Use with CategoryType.COST */
  var costProjection: js.UndefOr[GoogleCloudRecommenderV1CostProjection] = js.undefined
  
  /** Use with CategoryType.SECURITY */
  var securityProjection: js.UndefOr[GoogleCloudRecommenderV1SecurityProjection] = js.undefined
}
object GoogleCloudRecommenderV1Impact {
  
  inline def apply(): GoogleCloudRecommenderV1Impact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1Impact]
  }
  
  extension [Self <: GoogleCloudRecommenderV1Impact](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCostProjection(value: GoogleCloudRecommenderV1CostProjection): Self = StObject.set(x, "costProjection", value.asInstanceOf[js.Any])
    
    inline def setCostProjectionUndefined: Self = StObject.set(x, "costProjection", js.undefined)
    
    inline def setSecurityProjection(value: GoogleCloudRecommenderV1SecurityProjection): Self = StObject.set(x, "securityProjection", value.asInstanceOf[js.Any])
    
    inline def setSecurityProjectionUndefined: Self = StObject.set(x, "securityProjection", js.undefined)
  }
}
