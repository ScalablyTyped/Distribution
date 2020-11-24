package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatSource extends js.Object {
  
  /** Referrer of the resource. Only set if the referrer is available. */
  var referrer: js.UndefOr[String] = js.native
  
  /** The remote IP of the resource in ASCII format. Either IPv4 or IPv6. */
  var remoteIp: js.UndefOr[String] = js.native
  
  /** The type of source reported. */
  var `type`: js.UndefOr[String] = js.native
  
  /** The URL of the resource. */
  var url: js.UndefOr[String] = js.native
}
object ThreatSource {
  
  @scala.inline
  def apply(): ThreatSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatSource]
  }
  
  @scala.inline
  implicit class ThreatSourceOps[Self <: ThreatSource] (val x: Self) extends AnyVal {
    
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
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    
    @scala.inline
    def setRemoteIp(value: String): Self = this.set("remoteIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteIp: Self = this.set("remoteIp", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
