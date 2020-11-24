package typings.pendoIoBrowser.anon

import typings.pendoIoBrowser.pendoIoBrowserStrings.desktop
import typings.pendoIoBrowser.pendoIoBrowserStrings.mobile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Desktop extends js.Object {
  
  var desktop: Boolean = js.native
  
  var mobile: Boolean = js.native
  
  var `type`: desktop | mobile = js.native
}
object Desktop {
  
  @scala.inline
  def apply(desktop: Boolean, mobile: Boolean, `type`: desktop | mobile): Desktop = {
    val __obj = js.Dynamic.literal(desktop = desktop.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Desktop]
  }
  
  @scala.inline
  implicit class DesktopOps[Self <: Desktop] (val x: Self) extends AnyVal {
    
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
    def setDesktop(value: Boolean): Self = this.set("desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile(value: Boolean): Self = this.set("mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: desktop | mobile): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
