package typings.nivoSankey.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SankeyNodeDatum extends js.Object {
  var color: String = js.native
  var depth: Double = js.native
  var height: Double = js.native
  var id: String = js.native
  var index: Double = js.native
  var label: String = js.native
  var layer: Double = js.native
  var sourceLinks: js.Array[SankeyLinkDatum] = js.native
  var targetLinks: js.Array[SankeyLinkDatum] = js.native
  var value: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var x0: Double = js.native
  var x1: Double = js.native
  var y: Double = js.native
  var y0: Double = js.native
  var y1: Double = js.native
}

object SankeyNodeDatum {
  @scala.inline
  def apply(
    color: String,
    depth: Double,
    height: Double,
    id: String,
    index: Double,
    label: String,
    layer: Double,
    sourceLinks: js.Array[SankeyLinkDatum],
    targetLinks: js.Array[SankeyLinkDatum],
    value: Double,
    width: Double,
    x: Double,
    x0: Double,
    x1: Double,
    y: Double,
    y0: Double,
    y1: Double
  ): SankeyNodeDatum = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], sourceLinks = sourceLinks.asInstanceOf[js.Any], targetLinks = targetLinks.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[SankeyNodeDatum]
  }
  @scala.inline
  implicit class SankeyNodeDatumOps[Self <: SankeyNodeDatum] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayer(value: Double): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceLinksVarargs(value: SankeyLinkDatum*): Self = this.set("sourceLinks", js.Array(value :_*))
    @scala.inline
    def setSourceLinks(value: js.Array[SankeyLinkDatum]): Self = this.set("sourceLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetLinksVarargs(value: SankeyLinkDatum*): Self = this.set("targetLinks", js.Array(value :_*))
    @scala.inline
    def setTargetLinks(value: js.Array[SankeyLinkDatum]): Self = this.set("targetLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setX0(value: Double): Self = this.set("x0", value.asInstanceOf[js.Any])
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setY0(value: Double): Self = this.set("y0", value.asInstanceOf[js.Any])
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
  }
  
}

