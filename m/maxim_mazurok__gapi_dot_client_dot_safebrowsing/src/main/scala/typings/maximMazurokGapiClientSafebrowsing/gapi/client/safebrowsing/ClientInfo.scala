package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientInfo extends StObject {
  
  /** A client ID that (hopefully) uniquely identifies the client implementation of the Safe Browsing API. */
  var clientId: js.UndefOr[String] = js.undefined
  
  /** The version of the client implementation. */
  var clientVersion: js.UndefOr[String] = js.undefined
}
object ClientInfo {
  
  inline def apply(): ClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientInfo]
  }
  
  extension [Self <: ClientInfo](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    inline def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
  }
}
