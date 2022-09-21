package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  /** The protocol that the bidder endpoint is using. */
  var bidProtocol: js.UndefOr[String] = js.undefined
  
  /** The maximum number of queries per second allowed to be sent to this server. */
  var maximumQps: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Name of the endpoint resource that must follow the pattern `bidders/{bidderAccountId}/endpoints/{endpointId}`, where {bidderAccountId} is the account ID of the bidder
    * who operates this endpoint, and {endpointId} is a unique ID assigned by the server.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The trading location that bid requests should be sent from. See https://developers.google.com/authorized-buyers/rtb/peer-guide#trading-locations for further information. */
  var tradingLocation: js.UndefOr[String] = js.undefined
  
  /** Output only. The URL that bid requests should be sent to. */
  var url: js.UndefOr[String] = js.undefined
}
object Endpoint {
  
  inline def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  
  extension [Self <: Endpoint](x: Self) {
    
    inline def setBidProtocol(value: String): Self = StObject.set(x, "bidProtocol", value.asInstanceOf[js.Any])
    
    inline def setBidProtocolUndefined: Self = StObject.set(x, "bidProtocol", js.undefined)
    
    inline def setMaximumQps(value: String): Self = StObject.set(x, "maximumQps", value.asInstanceOf[js.Any])
    
    inline def setMaximumQpsUndefined: Self = StObject.set(x, "maximumQps", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTradingLocation(value: String): Self = StObject.set(x, "tradingLocation", value.asInstanceOf[js.Any])
    
    inline def setTradingLocationUndefined: Self = StObject.set(x, "tradingLocation", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
