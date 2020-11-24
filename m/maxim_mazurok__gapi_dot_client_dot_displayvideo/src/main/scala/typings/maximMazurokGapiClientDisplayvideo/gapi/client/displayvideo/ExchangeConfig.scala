package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeConfig extends js.Object {
  
  /** All enabled exchanges in the partner. Duplicate enabled exchanges will be ignored. */
  var enabledExchanges: js.UndefOr[js.Array[ExchangeConfigEnabledExchange]] = js.native
}
object ExchangeConfig {
  
  @scala.inline
  def apply(): ExchangeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangeConfig]
  }
  
  @scala.inline
  implicit class ExchangeConfigOps[Self <: ExchangeConfig] (val x: Self) extends AnyVal {
    
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
    def setEnabledExchangesVarargs(value: ExchangeConfigEnabledExchange*): Self = this.set("enabledExchanges", js.Array(value :_*))
    
    @scala.inline
    def setEnabledExchanges(value: js.Array[ExchangeConfigEnabledExchange]): Self = this.set("enabledExchanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledExchanges: Self = this.set("enabledExchanges", js.undefined)
  }
}
