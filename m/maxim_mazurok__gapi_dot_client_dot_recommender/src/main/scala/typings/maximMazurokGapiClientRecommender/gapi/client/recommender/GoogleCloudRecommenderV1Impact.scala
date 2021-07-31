package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1Impact extends StObject {
  
  /** Category that is being targeted. */
  var category: js.UndefOr[String] = js.undefined
  
  /** Use with CategoryType.COST */
  var costProjection: js.UndefOr[GoogleCloudRecommenderV1CostProjection] = js.undefined
}
object GoogleCloudRecommenderV1Impact {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1Impact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1Impact]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1ImpactMutableBuilder[Self <: GoogleCloudRecommenderV1Impact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCostProjection(value: GoogleCloudRecommenderV1CostProjection): Self = StObject.set(x, "costProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostProjectionUndefined: Self = StObject.set(x, "costProjection", js.undefined)
  }
}
