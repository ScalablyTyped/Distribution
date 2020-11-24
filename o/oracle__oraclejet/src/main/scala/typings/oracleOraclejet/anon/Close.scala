package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Close extends js.Object {
  
  var close: Scaling = js.native
  
  var group: TooltipDisplay = js.native
  
  var high: Scaling = js.native
  
  var label: ConverterScaling = js.native
  
  var low: Scaling = js.native
  
  var open: Scaling = js.native
  
  var q1: Scaling = js.native
  
  var q2: Scaling = js.native
  
  var q3: Scaling = js.native
  
  var series: TooltipLabel = js.native
  
  var targetValue: Scaling = js.native
  
  var value: Scaling = js.native
  
  var volume: Scaling = js.native
  
  var x: Scaling = js.native
  
  var y: Scaling = js.native
  
  var y2: Scaling = js.native
  
  var z: Scaling = js.native
}
object Close {
  
  @scala.inline
  def apply(
    close: Scaling,
    group: TooltipDisplay,
    high: Scaling,
    label: ConverterScaling,
    low: Scaling,
    open: Scaling,
    q1: Scaling,
    q2: Scaling,
    q3: Scaling,
    series: TooltipLabel,
    targetValue: Scaling,
    value: Scaling,
    volume: Scaling,
    x: Scaling,
    y: Scaling,
    y2: Scaling,
    z: Scaling
  ): Close = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], q1 = q1.asInstanceOf[js.Any], q2 = q2.asInstanceOf[js.Any], q3 = q3.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], targetValue = targetValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
  
  @scala.inline
  implicit class CloseOps[Self <: Close] (val x: Self) extends AnyVal {
    
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
    def setClose(value: Scaling): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: TooltipDisplay): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigh(value: Scaling): Self = this.set("high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: ConverterScaling): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLow(value: Scaling): Self = this.set("low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Scaling): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ1(value: Scaling): Self = this.set("q1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ2(value: Scaling): Self = this.set("q2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ3(value: Scaling): Self = this.set("q3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeries(value: TooltipLabel): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetValue(value: Scaling): Self = this.set("targetValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Scaling): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: Scaling): Self = this.set("volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Scaling): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Scaling): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Scaling): Self = this.set("y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Scaling): Self = this.set("z", value.asInstanceOf[js.Any])
  }
}
