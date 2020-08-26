package typings.nivoScatterplot.mod

import typings.nivoCore.mod.CssMixBlendMode
import typings.std.VoidFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeProps extends js.Object {
  var blendMode: CssMixBlendMode = js.native
  var color: String = js.native
  var node: Node = js.native
  var onClick: js.UndefOr[VoidFunction] = js.native
  var onMouseEnter: js.UndefOr[VoidFunction] = js.native
  var onMouseLeave: js.UndefOr[VoidFunction] = js.native
  var onMouseMove: js.UndefOr[VoidFunction] = js.native
  var size: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object NodeProps {
  @scala.inline
  def apply(blendMode: CssMixBlendMode, color: String, node: Node, size: Double, x: Double, y: Double): NodeProps = {
    val __obj = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProps]
  }
  @scala.inline
  implicit class NodePropsOps[Self <: NodeProps] (val x: Self) extends AnyVal {
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
    def setBlendMode(value: CssMixBlendMode): Self = this.set("blendMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: Node): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: () => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: () => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseMove(value: () => Unit): Self = this.set("onMouseMove", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
  }
  
}

