package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeConfig extends StObject {
  
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
  implicit class ExchangeConfigMutableBuilder[Self <: ExchangeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabledExchanges(value: js.Array[ExchangeConfigEnabledExchange]): Self = StObject.set(x, "enabledExchanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledExchangesUndefined: Self = StObject.set(x, "enabledExchanges", js.undefined)
    
    @scala.inline
    def setEnabledExchangesVarargs(value: ExchangeConfigEnabledExchange*): Self = StObject.set(x, "enabledExchanges", js.Array(value :_*))
  }
}
