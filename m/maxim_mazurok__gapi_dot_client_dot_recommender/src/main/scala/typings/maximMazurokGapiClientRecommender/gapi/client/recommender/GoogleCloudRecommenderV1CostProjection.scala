package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1CostProjection extends StObject {
  
  /**
    * An approximate projection on amount saved or amount incurred. Negative cost units indicate cost savings and positive cost units indicate increase. See google.type.Money
    * documentation for positive/negative units. A user's permissions may affect whether the cost is computed using list prices or custom contract prices.
    */
  var cost: js.UndefOr[GoogleTypeMoney] = js.undefined
  
  /** Duration for which this cost applies. */
  var duration: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommenderV1CostProjection {
  
  inline def apply(): GoogleCloudRecommenderV1CostProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1CostProjection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRecommenderV1CostProjection] (val x: Self) extends AnyVal {
    
    inline def setCost(value: GoogleTypeMoney): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
