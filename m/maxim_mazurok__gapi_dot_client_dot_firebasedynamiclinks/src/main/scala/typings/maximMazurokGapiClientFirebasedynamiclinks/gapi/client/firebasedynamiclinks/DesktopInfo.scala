package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DesktopInfo extends js.Object {
  
  /** Link to open on desktop. */
  var desktopFallbackLink: js.UndefOr[String] = js.native
}
object DesktopInfo {
  
  @scala.inline
  def apply(): DesktopInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DesktopInfo]
  }
  
  @scala.inline
  implicit class DesktopInfoOps[Self <: DesktopInfo] (val x: Self) extends AnyVal {
    
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
    def setDesktopFallbackLink(value: String): Self = this.set("desktopFallbackLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesktopFallbackLink: Self = this.set("desktopFallbackLink", js.undefined)
  }
}
