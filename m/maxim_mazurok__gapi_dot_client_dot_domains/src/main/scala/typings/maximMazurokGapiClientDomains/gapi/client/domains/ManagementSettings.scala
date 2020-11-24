package typings.maximMazurokGapiClientDomains.gapi.client.domains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagementSettings extends js.Object {
  
  /** Output only. The renewal method for this `Registration`. */
  var renewalMethod: js.UndefOr[String] = js.native
  
  /** Controls whether the domain can be transferred to another registrar. */
  var transferLockState: js.UndefOr[String] = js.native
}
object ManagementSettings {
  
  @scala.inline
  def apply(): ManagementSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagementSettings]
  }
  
  @scala.inline
  implicit class ManagementSettingsOps[Self <: ManagementSettings] (val x: Self) extends AnyVal {
    
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
    def setRenewalMethod(value: String): Self = this.set("renewalMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenewalMethod: Self = this.set("renewalMethod", js.undefined)
    
    @scala.inline
    def setTransferLockState(value: String): Self = this.set("transferLockState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferLockState: Self = this.set("transferLockState", js.undefined)
  }
}
