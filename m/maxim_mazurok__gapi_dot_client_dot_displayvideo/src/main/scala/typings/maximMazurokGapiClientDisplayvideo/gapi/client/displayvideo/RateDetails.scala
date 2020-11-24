package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateDetails extends js.Object {
  
  /** The rate type. Acceptable values are `INVENTORY_SOURCE_RATE_TYPE_CPM_FIXED`, `INVENTORY_SOURCE_RATE_TYPE_CPM_FLOOR`, and `INVENTORY_SOURCE_RATE_TYPE_CPD`. */
  var inventorySourceRateType: js.UndefOr[String] = js.native
  
  /** Output only. The amount that the buyer has committed to spending on the inventory source up front. Only applicable for guaranteed inventory sources. */
  var minimumSpend: js.UndefOr[Money] = js.native
  
  /** The rate for the inventory source. */
  var rate: js.UndefOr[Money] = js.native
  
  /** Required for guaranteed inventory sources. The number of impressions guaranteed by the seller. */
  var unitsPurchased: js.UndefOr[String] = js.native
}
object RateDetails {
  
  @scala.inline
  def apply(): RateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateDetails]
  }
  
  @scala.inline
  implicit class RateDetailsOps[Self <: RateDetails] (val x: Self) extends AnyVal {
    
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
    def setInventorySourceRateType(value: String): Self = this.set("inventorySourceRateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventorySourceRateType: Self = this.set("inventorySourceRateType", js.undefined)
    
    @scala.inline
    def setMinimumSpend(value: Money): Self = this.set("minimumSpend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumSpend: Self = this.set("minimumSpend", js.undefined)
    
    @scala.inline
    def setRate(value: Money): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    
    @scala.inline
    def setUnitsPurchased(value: String): Self = this.set("unitsPurchased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitsPurchased: Self = this.set("unitsPurchased", js.undefined)
  }
}
