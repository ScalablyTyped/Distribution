package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartnerCost extends js.Object {
  
  /** Required. The type of the partner cost. */
  var costType: js.UndefOr[String] = js.native
  
  /**
    * The CPM fee amount in micros of advertiser's currency. Applicable when the fee_type is `PARTNER_FEE_TYPE_CPM_FEE`. Must be greater than or equal to 0. For example, for 1.5 standard
    * unit of the advertiser's currency, set this field to 1500000.
    */
  var feeAmount: js.UndefOr[String] = js.native
  
  /**
    * The media fee percentage in millis (1/1000 of a percent). Applicable when the fee_type is `PARTNER_FEE_TYPE_MEDIA_FEE`. Must be greater than or equal to 0. For example: 100
    * represents 0.1%.
    */
  var feePercentageMillis: js.UndefOr[String] = js.native
  
  /** Required. The fee type for this partner cost. */
  var feeType: js.UndefOr[String] = js.native
  
  /**
    * The invoice type for this partner cost. * Required when cost_type is one of: - `PARTNER_COST_TYPE_ADLOOX` - `PARTNER_COST_TYPE_DOUBLE_VERIFY` -
    * `PARTNER_COST_TYPE_INTEGRAL_AD_SCIENCE`. * Output only for other types.
    */
  var invoiceType: js.UndefOr[String] = js.native
}
object PartnerCost {
  
  @scala.inline
  def apply(): PartnerCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerCost]
  }
  
  @scala.inline
  implicit class PartnerCostOps[Self <: PartnerCost] (val x: Self) extends AnyVal {
    
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
    def setCostType(value: String): Self = this.set("costType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCostType: Self = this.set("costType", js.undefined)
    
    @scala.inline
    def setFeeAmount(value: String): Self = this.set("feeAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeeAmount: Self = this.set("feeAmount", js.undefined)
    
    @scala.inline
    def setFeePercentageMillis(value: String): Self = this.set("feePercentageMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeePercentageMillis: Self = this.set("feePercentageMillis", js.undefined)
    
    @scala.inline
    def setFeeType(value: String): Self = this.set("feeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeeType: Self = this.set("feeType", js.undefined)
    
    @scala.inline
    def setInvoiceType(value: String): Self = this.set("invoiceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoiceType: Self = this.set("invoiceType", js.undefined)
  }
}
