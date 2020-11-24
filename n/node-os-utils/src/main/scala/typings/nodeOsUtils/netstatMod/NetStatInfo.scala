package typings.nodeOsUtils.netstatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetStatInfo extends js.Object {
  
  var inputBytes: String = js.native
  
  var interface: String = js.native
  
  var outputBytes: String = js.native
}
object NetStatInfo {
  
  @scala.inline
  def apply(inputBytes: String, interface: String, outputBytes: String): NetStatInfo = {
    val __obj = js.Dynamic.literal(inputBytes = inputBytes.asInstanceOf[js.Any], interface = interface.asInstanceOf[js.Any], outputBytes = outputBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetStatInfo]
  }
  
  @scala.inline
  implicit class NetStatInfoOps[Self <: NetStatInfo] (val x: Self) extends AnyVal {
    
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
    def setInputBytes(value: String): Self = this.set("inputBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterface(value: String): Self = this.set("interface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputBytes(value: String): Self = this.set("outputBytes", value.asInstanceOf[js.Any])
  }
}
