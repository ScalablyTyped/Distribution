package typings.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies a number of samples attributed to a certain source position.
  */
@js.native
trait PositionTickInfo extends js.Object {
  
  /**
    * Source line number (1-based).
    */
  var line: Double = js.native
  
  /**
    * Number of samples attributed to the source line.
    */
  var ticks: Double = js.native
}
object PositionTickInfo {
  
  @scala.inline
  def apply(line: Double, ticks: Double): PositionTickInfo = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionTickInfo]
  }
  
  @scala.inline
  implicit class PositionTickInfoOps[Self <: PositionTickInfo] (val x: Self) extends AnyVal {
    
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
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicks(value: Double): Self = this.set("ticks", value.asInstanceOf[js.Any])
  }
}
