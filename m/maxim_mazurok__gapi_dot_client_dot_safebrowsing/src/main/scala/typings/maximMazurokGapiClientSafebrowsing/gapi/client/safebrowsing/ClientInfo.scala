package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientInfo extends StObject {
  
  /** A client ID that (hopefully) uniquely identifies the client implementation of the Safe Browsing API. */
  var clientId: js.UndefOr[String] = js.native
  
  /** The version of the client implementation. */
  var clientVersion: js.UndefOr[String] = js.native
}
object ClientInfo {
  
  @scala.inline
  def apply(): ClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientInfo]
  }
  
  @scala.inline
  implicit class ClientInfoMutableBuilder[Self <: ClientInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
  }
}
