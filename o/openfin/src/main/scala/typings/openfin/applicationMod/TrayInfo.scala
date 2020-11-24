package typings.openfin.applicationMod

import typings.openfin.monitorMod.MonitorInfo
import typings.openfin.shapesMod.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrayInfo extends js.Object {
  
  var bounds: Bounds = js.native
  
  var monitorInfo: MonitorInfo = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object TrayInfo {
  
  @scala.inline
  def apply(bounds: Bounds, monitorInfo: MonitorInfo, x: Double, y: Double): TrayInfo = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], monitorInfo = monitorInfo.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrayInfo]
  }
  
  @scala.inline
  implicit class TrayInfoOps[Self <: TrayInfo] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: Bounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorInfo(value: MonitorInfo): Self = this.set("monitorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
