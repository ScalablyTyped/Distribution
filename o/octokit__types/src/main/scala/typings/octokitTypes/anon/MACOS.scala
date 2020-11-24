package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MACOS extends js.Object {
  
  var MACOS: Jobs = js.native
  
  var UBUNTU: Jobs = js.native
  
  var WINDOWS: Jobs = js.native
}
object MACOS {
  
  @scala.inline
  def apply(MACOS: Jobs, UBUNTU: Jobs, WINDOWS: Jobs): MACOS = {
    val __obj = js.Dynamic.literal(MACOS = MACOS.asInstanceOf[js.Any], UBUNTU = UBUNTU.asInstanceOf[js.Any], WINDOWS = WINDOWS.asInstanceOf[js.Any])
    __obj.asInstanceOf[MACOS]
  }
  
  @scala.inline
  implicit class MACOSOps[Self <: MACOS] (val x: Self) extends AnyVal {
    
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
    def setMACOS(value: Jobs): Self = this.set("MACOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUBUNTU(value: Jobs): Self = this.set("UBUNTU", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWINDOWS(value: Jobs): Self = this.set("WINDOWS", value.asInstanceOf[js.Any])
  }
}
