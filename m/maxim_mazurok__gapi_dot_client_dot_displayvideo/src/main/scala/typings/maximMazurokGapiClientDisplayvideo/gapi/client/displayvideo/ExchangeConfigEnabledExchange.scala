package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeConfigEnabledExchange extends js.Object {
  
  /** The enabled exchange. */
  var exchange: js.UndefOr[String] = js.native
  
  /** Output only. Agency ID of Google Ad Manager. The field is only relevant when Google Ad Manager is the enabled exchange. */
  var googleAdManagerAgencyId: js.UndefOr[String] = js.native
  
  /** Output only. Network ID of Google Ad Manager. The field is only relevant when Google Ad Manager is the enabled exchange. */
  var googleAdManagerBuyerNetworkId: js.UndefOr[String] = js.native
  
  /** Output only. Seat ID of the enabled exchange. */
  var seatId: js.UndefOr[String] = js.native
}
object ExchangeConfigEnabledExchange {
  
  @scala.inline
  def apply(): ExchangeConfigEnabledExchange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangeConfigEnabledExchange]
  }
  
  @scala.inline
  implicit class ExchangeConfigEnabledExchangeOps[Self <: ExchangeConfigEnabledExchange] (val x: Self) extends AnyVal {
    
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
    def setExchange(value: String): Self = this.set("exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchange: Self = this.set("exchange", js.undefined)
    
    @scala.inline
    def setGoogleAdManagerAgencyId(value: String): Self = this.set("googleAdManagerAgencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleAdManagerAgencyId: Self = this.set("googleAdManagerAgencyId", js.undefined)
    
    @scala.inline
    def setGoogleAdManagerBuyerNetworkId(value: String): Self = this.set("googleAdManagerBuyerNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleAdManagerBuyerNetworkId: Self = this.set("googleAdManagerBuyerNetworkId", js.undefined)
    
    @scala.inline
    def setSeatId(value: String): Self = this.set("seatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeatId: Self = this.set("seatId", js.undefined)
  }
}
