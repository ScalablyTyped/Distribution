package typings.nivoHeatmap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeData extends js.Object {
  var height: Double = js.native
  var key: String = js.native
  var opacity: Double = js.native
  var value: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var xKey: String | Double = js.native
  var y: Double = js.native
  var yKey: String | Double = js.native
}

object NodeData {
  @scala.inline
  def apply(
    height: Double,
    key: String,
    opacity: Double,
    value: Double,
    width: Double,
    x: Double,
    xKey: String | Double,
    y: Double,
    yKey: String | Double
  ): NodeData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xKey = xKey.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yKey = yKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeData]
  }
  @scala.inline
  implicit class NodeDataOps[Self <: NodeData] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setXKey(value: String | Double): Self = this.set("xKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setYKey(value: String | Double): Self = this.set("yKey", value.asInstanceOf[js.Any])
  }
  
}

