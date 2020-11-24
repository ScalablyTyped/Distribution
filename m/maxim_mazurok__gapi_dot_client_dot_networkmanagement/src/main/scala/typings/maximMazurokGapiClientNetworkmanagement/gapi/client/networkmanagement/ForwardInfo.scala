package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardInfo extends js.Object {
  
  /** URI of the resource that the packet is forwarded to. */
  var resourceUri: js.UndefOr[String] = js.native
  
  /** Target type where this packet is forwarded to. */
  var target: js.UndefOr[String] = js.native
}
object ForwardInfo {
  
  @scala.inline
  def apply(): ForwardInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardInfo]
  }
  
  @scala.inline
  implicit class ForwardInfoOps[Self <: ForwardInfo] (val x: Self) extends AnyVal {
    
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
    def setResourceUri(value: String): Self = this.set("resourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUri: Self = this.set("resourceUri", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
