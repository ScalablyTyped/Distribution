package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixedBidStrategy extends js.Object {
  
  /**
    * The fixed bid amount, in micros of the advertiser's currency. For insertion order entity, bid_amount_micros should be set as 0. For line item entity, bid_amount_micros must be
    * greater than or equal to billable unit of the given currency and smaller than or equal to the upper limit 1000000000. For example, 1500000 represents 1.5 standard units of the
    * currency.
    */
  var bidAmountMicros: js.UndefOr[String] = js.native
}
object FixedBidStrategy {
  
  @scala.inline
  def apply(): FixedBidStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedBidStrategy]
  }
  
  @scala.inline
  implicit class FixedBidStrategyOps[Self <: FixedBidStrategy] (val x: Self) extends AnyVal {
    
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
    def setBidAmountMicros(value: String): Self = this.set("bidAmountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBidAmountMicros: Self = this.set("bidAmountMicros", js.undefined)
  }
}
