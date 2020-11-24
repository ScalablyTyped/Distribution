package typings.openfin.eventsApplicationMod

import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.openfinNumbers.`0`
import typings.openfin.openfinNumbers.`1`
import typings.openfin.openfinNumbers.`2`
import typings.openfin.shapesMod.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrayIconClicked[Topic, Type] extends ApplicationEvent[Topic, Type] {
  
  var bounds: Bounds = js.native
  
  var button: `0` | `1` | `2` = js.native
  
  var monitorInfo: js.Any = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object TrayIconClicked {
  
  @scala.inline
  def apply[Topic, Type](
    bounds: Bounds,
    button: `0` | `1` | `2`,
    monitorInfo: js.Any,
    topic: Topic,
    `type`: Type,
    uuid: String,
    x: Double,
    y: Double
  ): TrayIconClicked[Topic, Type] = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], monitorInfo = monitorInfo.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrayIconClicked[Topic, Type]]
  }
  
  @scala.inline
  implicit class TrayIconClickedOps[Self <: TrayIconClicked[_, _], Topic, Type] (val x: Self with (TrayIconClicked[Topic, Type])) extends AnyVal {
    
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
    def setButton(value: `0` | `1` | `2`): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorInfo(value: js.Any): Self = this.set("monitorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
