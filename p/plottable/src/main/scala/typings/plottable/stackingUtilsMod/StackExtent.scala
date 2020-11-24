package typings.plottable.stackingUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackExtent[D] extends js.Object {
  
  var axisValue: D = js.native
  
  var extent: Double = js.native
  
  var stackedDatum: GenericStackedDatum[D] = js.native
}
object StackExtent {
  
  @scala.inline
  def apply[D](axisValue: D, extent: Double, stackedDatum: GenericStackedDatum[D]): StackExtent[D] = {
    val __obj = js.Dynamic.literal(axisValue = axisValue.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], stackedDatum = stackedDatum.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackExtent[D]]
  }
  
  @scala.inline
  implicit class StackExtentOps[Self <: StackExtent[_], D] (val x: Self with StackExtent[D]) extends AnyVal {
    
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
    def setAxisValue(value: D): Self = this.set("axisValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtent(value: Double): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackedDatum(value: GenericStackedDatum[D]): Self = this.set("stackedDatum", value.asInstanceOf[js.Any])
  }
}
