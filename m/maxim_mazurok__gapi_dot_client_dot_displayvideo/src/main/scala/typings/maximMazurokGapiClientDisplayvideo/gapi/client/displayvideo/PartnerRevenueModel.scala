package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartnerRevenueModel extends js.Object {
  
  /**
    * Required. The markup amount of the partner revenue model. Must be greater than or equal to 0. * When the markup_type is set to be `PARTNER_REVENUE_MODEL_MARKUP_TYPE_CPM`, this field
    * represents the CPM markup in micros of advertiser's currency. For example, 1500000 represents 1.5 standard units of the currency. * When the markup_type is set to be
    * `PARTNER_REVENUE_MODEL_MARKUP_TYPE_MEDIA_COST_MARKUP`, this field represents the media cost percent markup in millis. For example, 100 represents 0.1% (decimal 0.001). * When the
    * markup_type is set to be `PARTNER_REVENUE_MODEL_MARKUP_TYPE_TOTAL_MEDIA_COST_MARKUP`, this field represents the total media cost percent markup in millis. For example, 100
    * represents 0.1% (decimal 0.001).
    */
  var markupAmount: js.UndefOr[String] = js.native
  
  /** Required. The markup type of the partner revenue model. */
  var markupType: js.UndefOr[String] = js.native
}
object PartnerRevenueModel {
  
  @scala.inline
  def apply(): PartnerRevenueModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerRevenueModel]
  }
  
  @scala.inline
  implicit class PartnerRevenueModelOps[Self <: PartnerRevenueModel] (val x: Self) extends AnyVal {
    
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
    def setMarkupAmount(value: String): Self = this.set("markupAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkupAmount: Self = this.set("markupAmount", js.undefined)
    
    @scala.inline
    def setMarkupType(value: String): Self = this.set("markupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkupType: Self = this.set("markupType", js.undefined)
  }
}
