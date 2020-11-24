package typings.openfin.systemWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowInfo extends js.Object {
  
  var childWindows: js.Array[WindowDetail] = js.native
  
  var mainWindow: WindowDetail = js.native
  
  var uuid: String = js.native
}
object WindowInfo {
  
  @scala.inline
  def apply(childWindows: js.Array[WindowDetail], mainWindow: WindowDetail, uuid: String): WindowInfo = {
    val __obj = js.Dynamic.literal(childWindows = childWindows.asInstanceOf[js.Any], mainWindow = mainWindow.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowInfo]
  }
  
  @scala.inline
  implicit class WindowInfoOps[Self <: WindowInfo] (val x: Self) extends AnyVal {
    
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
    def setChildWindowsVarargs(value: WindowDetail*): Self = this.set("childWindows", js.Array(value :_*))
    
    @scala.inline
    def setChildWindows(value: js.Array[WindowDetail]): Self = this.set("childWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainWindow(value: WindowDetail): Self = this.set("mainWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
}
