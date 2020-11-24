package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WINDOWS extends js.Object {
  
  /**
    * Total minutes used on macOS runner machines.
    */
  var MACOS: Double = js.native
  
  /**
    * Total minutes used on Ubuntu runner machines.
    */
  var UBUNTU: Double = js.native
  
  /**
    * Total minutes used on Windows runner machines.
    */
  var WINDOWS: Double = js.native
}
object WINDOWS {
  
  @scala.inline
  def apply(MACOS: Double, UBUNTU: Double, WINDOWS: Double): WINDOWS = {
    val __obj = js.Dynamic.literal(MACOS = MACOS.asInstanceOf[js.Any], UBUNTU = UBUNTU.asInstanceOf[js.Any], WINDOWS = WINDOWS.asInstanceOf[js.Any])
    __obj.asInstanceOf[WINDOWS]
  }
  
  @scala.inline
  implicit class WINDOWSOps[Self <: WINDOWS] (val x: Self) extends AnyVal {
    
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
    def setMACOS(value: Double): Self = this.set("MACOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUBUNTU(value: Double): Self = this.set("UBUNTU", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWINDOWS(value: Double): Self = this.set("WINDOWS", value.asInstanceOf[js.Any])
  }
}
