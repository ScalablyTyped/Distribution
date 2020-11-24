package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationInfo extends js.Object {
  
  /** If this option is on, FDL click will be forced to redirect rather than show an interstitial page. */
  var enableForcedRedirect: js.UndefOr[Boolean] = js.native
}
object NavigationInfo {
  
  @scala.inline
  def apply(): NavigationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationInfo]
  }
  
  @scala.inline
  implicit class NavigationInfoOps[Self <: NavigationInfo] (val x: Self) extends AnyVal {
    
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
    def setEnableForcedRedirect(value: Boolean): Self = this.set("enableForcedRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableForcedRedirect: Self = this.set("enableForcedRedirect", js.undefined)
  }
}
