package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindThreatMatchesRequest extends js.Object {
  
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
  implicit class FindThreatMatchesRequestOps[Self <: FindThreatMatchesRequest] (val x: Self) extends AnyVal {
    
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
    def setClient(value: ClientInfo): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setThreatInfo(value: ThreatInfo): Self = this.set("threatInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatInfo: Self = this.set("threatInfo", js.undefined)
  }
}
