package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommenderV1CostProjection extends StObject {
  
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
  implicit class GoogleCloudRecommenderV1CostProjectionMutableBuilder[Self <: GoogleCloudRecommenderV1CostProjection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCost(value: GoogleTypeMoney): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
