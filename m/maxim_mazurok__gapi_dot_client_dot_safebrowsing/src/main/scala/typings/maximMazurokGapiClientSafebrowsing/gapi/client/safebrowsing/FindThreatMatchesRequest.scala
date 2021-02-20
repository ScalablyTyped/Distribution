package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindThreatMatchesRequest extends StObject {
  
  /** The client metadata. */
  var client: js.UndefOr[ClientInfo] = js.native
  
  /** The lists and entries to be checked for matches. */
  var threatInfo: js.UndefOr[ThreatInfo] = js.native
}
object FindThreatMatchesRequest {
  
  @scala.inline
  def apply(): FindThreatMatchesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindThreatMatchesRequest]
  }
  
  @scala.inline
  implicit class FindThreatMatchesRequestMutableBuilder[Self <: FindThreatMatchesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: ClientInfo): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setThreatInfo(value: ThreatInfo): Self = StObject.set(x, "threatInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatInfoUndefined: Self = StObject.set(x, "threatInfo", js.undefined)
  }
}
