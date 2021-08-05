package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindThreatMatchesRequest extends StObject {
  
  /** The client metadata. */
  var client: js.UndefOr[ClientInfo] = js.undefined
  
  /** The lists and entries to be checked for matches. */
  var threatInfo: js.UndefOr[ThreatInfo] = js.undefined
}
object FindThreatMatchesRequest {
  
  inline def apply(): FindThreatMatchesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindThreatMatchesRequest]
  }
  
  extension [Self <: FindThreatMatchesRequest](x: Self) {
    
    inline def setClient(value: ClientInfo): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setThreatInfo(value: ThreatInfo): Self = StObject.set(x, "threatInfo", value.asInstanceOf[js.Any])
    
    inline def setThreatInfoUndefined: Self = StObject.set(x, "threatInfo", js.undefined)
  }
}
