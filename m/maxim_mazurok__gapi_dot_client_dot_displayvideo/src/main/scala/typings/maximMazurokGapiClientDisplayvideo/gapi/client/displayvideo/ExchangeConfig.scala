package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeConfig extends StObject {
  
  /** All enabled exchanges in the partner. Duplicate enabled exchanges will be ignored. */
  var enabledExchanges: js.UndefOr[js.Array[ExchangeConfigEnabledExchange]] = js.undefined
}
object ExchangeConfig {
  
  inline def apply(): ExchangeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExchangeConfig] (val x: Self) extends AnyVal {
    
    inline def setEnabledExchanges(value: js.Array[ExchangeConfigEnabledExchange]): Self = StObject.set(x, "enabledExchanges", value.asInstanceOf[js.Any])
    
    inline def setEnabledExchangesUndefined: Self = StObject.set(x, "enabledExchanges", js.undefined)
    
    inline def setEnabledExchangesVarargs(value: ExchangeConfigEnabledExchange*): Self = StObject.set(x, "enabledExchanges", js.Array(value*))
  }
}
