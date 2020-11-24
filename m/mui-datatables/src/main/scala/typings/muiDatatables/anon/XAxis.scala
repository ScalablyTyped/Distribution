package typings.muiDatatables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XAxis extends js.Object {
  
  /** @deprecated use `fixedHeader` */
  var xAxis: Boolean = js.native
  
  /** @deprecated use `fixedSelectColumn` */
  var yAxis: Boolean = js.native
}
object XAxis {
  
  @scala.inline
  def apply(xAxis: Boolean, yAxis: Boolean): XAxis = {
    val __obj = js.Dynamic.literal(xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxis]
  }
  
  @scala.inline
  implicit class XAxisOps[Self <: XAxis] (val x: Self) extends AnyVal {
    
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
    def setXAxis(value: Boolean): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxis(value: Boolean): Self = this.set("yAxis", value.asInstanceOf[js.Any])
  }
}
