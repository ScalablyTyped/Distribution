package typings.oktaOktaVue.anon

import typings.oktaOktaVue.oktaOktaVueStrings.cookie
import typings.oktaOktaVue.oktaOktaVueStrings.localStorage
import typings.oktaOktaVue.oktaOktaVueStrings.sessionStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoRenew extends js.Object {
  
  var autoRenew: js.UndefOr[Boolean] = js.native
  
  var secure: js.UndefOr[Boolean] = js.native
  
  var storage: js.UndefOr[localStorage | sessionStorage | cookie] = js.native
}
object AutoRenew {
  
  @scala.inline
  def apply(): AutoRenew = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoRenew]
  }
  
  @scala.inline
  implicit class AutoRenewOps[Self <: AutoRenew] (val x: Self) extends AnyVal {
    
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
    def setAutoRenew(value: Boolean): Self = this.set("autoRenew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRenew: Self = this.set("autoRenew", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setStorage(value: localStorage | sessionStorage | cookie): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
  }
}
