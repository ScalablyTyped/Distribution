package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatHit extends js.Object {
  
  /** Client-reported identification. */
  var clientInfo: js.UndefOr[ClientInfo] = js.native
  
  /** The threat entry responsible for the hit. Full hash should be reported for hash-based hits. */
  var entry: js.UndefOr[ThreatEntry] = js.native
  
  /** The platform type reported. */
  var platformType: js.UndefOr[String] = js.native
  
  /** The resources related to the threat hit. */
  var resources: js.UndefOr[js.Array[ThreatSource]] = js.native
  
  /** The threat type reported. */
  var threatType: js.UndefOr[String] = js.native
  
  /** Details about the user that encountered the threat. */
  var userInfo: js.UndefOr[UserInfo] = js.native
}
object ThreatHit {
  
  @scala.inline
  def apply(): ThreatHit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatHit]
  }
  
  @scala.inline
  implicit class ThreatHitOps[Self <: ThreatHit] (val x: Self) extends AnyVal {
    
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
    def setClientInfo(value: ClientInfo): Self = this.set("clientInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientInfo: Self = this.set("clientInfo", js.undefined)
    
    @scala.inline
    def setEntry(value: ThreatEntry): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntry: Self = this.set("entry", js.undefined)
    
    @scala.inline
    def setPlatformType(value: String): Self = this.set("platformType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformType: Self = this.set("platformType", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: ThreatSource*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[ThreatSource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setThreatType(value: String): Self = this.set("threatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatType: Self = this.set("threatType", js.undefined)
    
    @scala.inline
    def setUserInfo(value: UserInfo): Self = this.set("userInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserInfo: Self = this.set("userInfo", js.undefined)
  }
}
