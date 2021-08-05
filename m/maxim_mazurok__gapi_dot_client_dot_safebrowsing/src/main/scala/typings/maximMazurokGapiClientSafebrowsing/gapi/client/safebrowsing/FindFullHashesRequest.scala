package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindFullHashesRequest extends StObject {
  
  /** Client metadata associated with callers of higher-level APIs built on top of the client's implementation. */
  var apiClient: js.UndefOr[ClientInfo] = js.undefined
  
  /** The client metadata. */
  var client: js.UndefOr[ClientInfo] = js.undefined
  
  /** The current client states for each of the client's local threat lists. */
  var clientStates: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The lists and hashes to be checked. */
  var threatInfo: js.UndefOr[ThreatInfo] = js.undefined
}
object FindFullHashesRequest {
  
  inline def apply(): FindFullHashesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindFullHashesRequest]
  }
  
  extension [Self <: FindFullHashesRequest](x: Self) {
    
    inline def setApiClient(value: ClientInfo): Self = StObject.set(x, "apiClient", value.asInstanceOf[js.Any])
    
    inline def setApiClientUndefined: Self = StObject.set(x, "apiClient", js.undefined)
    
    inline def setClient(value: ClientInfo): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientStates(value: js.Array[String]): Self = StObject.set(x, "clientStates", value.asInstanceOf[js.Any])
    
    inline def setClientStatesUndefined: Self = StObject.set(x, "clientStates", js.undefined)
    
    inline def setClientStatesVarargs(value: String*): Self = StObject.set(x, "clientStates", js.Array(value :_*))
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setThreatInfo(value: ThreatInfo): Self = StObject.set(x, "threatInfo", value.asInstanceOf[js.Any])
    
    inline def setThreatInfoUndefined: Self = StObject.set(x, "threatInfo", js.undefined)
  }
}
