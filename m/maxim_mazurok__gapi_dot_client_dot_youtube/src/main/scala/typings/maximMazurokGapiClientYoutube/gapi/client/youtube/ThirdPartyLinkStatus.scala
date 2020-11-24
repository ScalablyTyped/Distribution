package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThirdPartyLinkStatus extends js.Object {
  
  var linkStatus: js.UndefOr[String] = js.native
}
object ThirdPartyLinkStatus {
  
  @scala.inline
  def apply(): ThirdPartyLinkStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyLinkStatus]
  }
  
  @scala.inline
  implicit class ThirdPartyLinkStatusOps[Self <: ThirdPartyLinkStatus] (val x: Self) extends AnyVal {
    
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
    def setLinkStatus(value: String): Self = this.set("linkStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkStatus: Self = this.set("linkStatus", js.undefined)
  }
}
