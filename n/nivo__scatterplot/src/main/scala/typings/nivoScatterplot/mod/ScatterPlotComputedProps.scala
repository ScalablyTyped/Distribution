package typings.nivoScatterplot.mod

import typings.nivoScales.mod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterPlotComputedProps extends js.Object {
  var innerHeight: Double = js.native
  var innerWidth: Double = js.native
  var nodes: js.Array[Node] = js.native
  var outerHeight: Double = js.native
  var outerWidth: Double = js.native
  var xScale: Scale = js.native
  var yScale: Scale = js.native
}

object ScatterPlotComputedProps {
  @scala.inline
  def apply(
    innerHeight: Double,
    innerWidth: Double,
    nodes: js.Array[Node],
    outerHeight: Double,
    outerWidth: Double,
    xScale: Scale,
    yScale: Scale
  ): ScatterPlotComputedProps = {
    val __obj = js.Dynamic.literal(innerHeight = innerHeight.asInstanceOf[js.Any], innerWidth = innerWidth.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], outerHeight = outerHeight.asInstanceOf[js.Any], outerWidth = outerWidth.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterPlotComputedProps]
  }
  @scala.inline
  implicit class ScatterPlotComputedPropsOps[Self <: ScatterPlotComputedProps] (val x: Self) extends AnyVal {
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
    def setInnerHeight(value: Double): Self = this.set("innerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerWidth(value: Double): Self = this.set("innerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: Node*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setOuterHeight(value: Double): Self = this.set("outerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setOuterWidth(value: Double): Self = this.set("outerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setXScale(value: Scale): Self = this.set("xScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setYScale(value: Scale): Self = this.set("yScale", value.asInstanceOf[js.Any])
  }
  
}

