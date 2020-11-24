package typings.mobileMessagingCordova.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationCodePersistingDisabled extends js.Object {
  
  var applicationCodePersistingDisabled: js.UndefOr[Boolean] = js.native
  
  var carrierInfoSendingDisabled: js.UndefOr[Boolean] = js.native
  
  var systemInfoSendingDisabled: js.UndefOr[Boolean] = js.native
  
  var userDataPersistingDisabled: js.UndefOr[Boolean] = js.native
}
object ApplicationCodePersistingDisabled {
  
  @scala.inline
  def apply(): ApplicationCodePersistingDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationCodePersistingDisabled]
  }
  
  @scala.inline
  implicit class ApplicationCodePersistingDisabledOps[Self <: ApplicationCodePersistingDisabled] (val x: Self) extends AnyVal {
    
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
    def setApplicationCodePersistingDisabled(value: Boolean): Self = this.set("applicationCodePersistingDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationCodePersistingDisabled: Self = this.set("applicationCodePersistingDisabled", js.undefined)
    
    @scala.inline
    def setCarrierInfoSendingDisabled(value: Boolean): Self = this.set("carrierInfoSendingDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrierInfoSendingDisabled: Self = this.set("carrierInfoSendingDisabled", js.undefined)
    
    @scala.inline
    def setSystemInfoSendingDisabled(value: Boolean): Self = this.set("systemInfoSendingDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemInfoSendingDisabled: Self = this.set("systemInfoSendingDisabled", js.undefined)
    
    @scala.inline
    def setUserDataPersistingDisabled(value: Boolean): Self = this.set("userDataPersistingDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDataPersistingDisabled: Self = this.set("userDataPersistingDisabled", js.undefined)
  }
}
