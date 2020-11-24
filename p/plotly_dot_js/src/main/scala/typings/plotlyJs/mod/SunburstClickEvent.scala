package typings.plotlyJs.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SunburstClickEvent extends js.Object {
  
  var event: MouseEvent = js.native
  
  var nextLevel: String = js.native
  
  var points: js.Array[SunburstPlotDatum] = js.native
}
object SunburstClickEvent {
  
  @scala.inline
  def apply(event: MouseEvent, nextLevel: String, points: js.Array[SunburstPlotDatum]): SunburstClickEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nextLevel = nextLevel.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[SunburstClickEvent]
  }
  
  @scala.inline
  implicit class SunburstClickEventOps[Self <: SunburstClickEvent] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: MouseEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextLevel(value: String): Self = this.set("nextLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: SunburstPlotDatum*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[SunburstPlotDatum]): Self = this.set("points", value.asInstanceOf[js.Any])
  }
}
