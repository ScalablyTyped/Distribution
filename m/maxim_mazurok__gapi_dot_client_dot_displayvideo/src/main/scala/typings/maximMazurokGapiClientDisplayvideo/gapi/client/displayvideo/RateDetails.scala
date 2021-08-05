package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RateDetails extends StObject {
  
  /** The rate type. Acceptable values are `INVENTORY_SOURCE_RATE_TYPE_CPM_FIXED`, `INVENTORY_SOURCE_RATE_TYPE_CPM_FLOOR`, and `INVENTORY_SOURCE_RATE_TYPE_CPD`. */
  var inventorySourceRateType: js.UndefOr[String] = js.undefined
  
  /** Output only. The amount that the buyer has committed to spending on the inventory source up front. Only applicable for guaranteed inventory sources. */
  var minimumSpend: js.UndefOr[Money] = js.undefined
  
  /** The rate for the inventory source. */
  var rate: js.UndefOr[Money] = js.undefined
  
  /** Required for guaranteed inventory sources. The number of impressions guaranteed by the seller. */
  var unitsPurchased: js.UndefOr[String] = js.undefined
}
object RateDetails {
  
  inline def apply(): RateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateDetails]
  }
  
  extension [Self <: RateDetails](x: Self) {
    
    inline def setInventorySourceRateType(value: String): Self = StObject.set(x, "inventorySourceRateType", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceRateTypeUndefined: Self = StObject.set(x, "inventorySourceRateType", js.undefined)
    
    inline def setMinimumSpend(value: Money): Self = StObject.set(x, "minimumSpend", value.asInstanceOf[js.Any])
    
    inline def setMinimumSpendUndefined: Self = StObject.set(x, "minimumSpend", js.undefined)
    
    inline def setRate(value: Money): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setUnitsPurchased(value: String): Self = StObject.set(x, "unitsPurchased", value.asInstanceOf[js.Any])
    
    inline def setUnitsPurchasedUndefined: Self = StObject.set(x, "unitsPurchased", js.undefined)
  }
}
