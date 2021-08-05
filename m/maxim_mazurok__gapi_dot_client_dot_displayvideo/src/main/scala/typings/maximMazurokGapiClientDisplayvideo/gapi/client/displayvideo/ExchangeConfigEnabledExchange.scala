package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeConfigEnabledExchange extends StObject {
  
  /** The enabled exchange. */
  var exchange: js.UndefOr[String] = js.undefined
  
  /** Output only. Agency ID of Google Ad Manager. The field is only relevant when Google Ad Manager is the enabled exchange. */
  var googleAdManagerAgencyId: js.UndefOr[String] = js.undefined
  
  /** Output only. Network ID of Google Ad Manager. The field is only relevant when Google Ad Manager is the enabled exchange. */
  var googleAdManagerBuyerNetworkId: js.UndefOr[String] = js.undefined
  
  /** Output only. Seat ID of the enabled exchange. */
  var seatId: js.UndefOr[String] = js.undefined
}
object ExchangeConfigEnabledExchange {
  
  inline def apply(): ExchangeConfigEnabledExchange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangeConfigEnabledExchange]
  }
  
  extension [Self <: ExchangeConfigEnabledExchange](x: Self) {
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
    
    inline def setGoogleAdManagerAgencyId(value: String): Self = StObject.set(x, "googleAdManagerAgencyId", value.asInstanceOf[js.Any])
    
    inline def setGoogleAdManagerAgencyIdUndefined: Self = StObject.set(x, "googleAdManagerAgencyId", js.undefined)
    
    inline def setGoogleAdManagerBuyerNetworkId(value: String): Self = StObject.set(x, "googleAdManagerBuyerNetworkId", value.asInstanceOf[js.Any])
    
    inline def setGoogleAdManagerBuyerNetworkIdUndefined: Self = StObject.set(x, "googleAdManagerBuyerNetworkId", js.undefined)
    
    inline def setSeatId(value: String): Self = StObject.set(x, "seatId", value.asInstanceOf[js.Any])
    
    inline def setSeatIdUndefined: Self = StObject.set(x, "seatId", js.undefined)
  }
}
