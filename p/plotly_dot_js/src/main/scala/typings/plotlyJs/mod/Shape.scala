package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialShapeLine
import typings.plotlyJs.plotlyJsStrings.above
import typings.plotlyJs.plotlyJsStrings.below
import typings.plotlyJs.plotlyJsStrings.circle
import typings.plotlyJs.plotlyJsStrings.line
import typings.plotlyJs.plotlyJsStrings.paper
import typings.plotlyJs.plotlyJsStrings.path
import typings.plotlyJs.plotlyJsStrings.pixel
import typings.plotlyJs.plotlyJsStrings.rect
import typings.plotlyJs.plotlyJsStrings.scaled
import typings.plotlyJs.plotlyJsStrings.x
import typings.plotlyJs.plotlyJsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shape extends js.Object {
  var fillcolor: String = js.native
  var layer: below | above = js.native
  var line: PartialShapeLine = js.native
  var name: String = js.native
  var opacity: Double = js.native
  var path: String = js.native
  var templateitemname: String = js.native
  var `type`: rect | circle | line | path = js.native
  var visible: Boolean = js.native
  var x0: Datum = js.native
  var x1: Datum = js.native
  var xanchor: Double | String = js.native
  // x-reference is assigned to the x-values
  var xref: x | paper = js.native
  var xsizemode: scaled | pixel = js.native
  var y0: Datum = js.native
  var y1: Datum = js.native
  var yanchor: Double | String = js.native
  // y-reference is assigned to the plot paper [0,1]
  var yref: paper | y = js.native
  var ysizemode: scaled | pixel = js.native
}

object Shape {
  @scala.inline
  def apply(
    fillcolor: String,
    layer: below | above,
    line: PartialShapeLine,
    name: String,
    opacity: Double,
    path: String,
    templateitemname: String,
    `type`: rect | circle | line | path,
    visible: Boolean,
    xanchor: Double | String,
    xref: x | paper,
    xsizemode: scaled | pixel,
    yanchor: Double | String,
    yref: paper | y,
    ysizemode: scaled | pixel
  ): Shape = {
    val __obj = js.Dynamic.literal(fillcolor = fillcolor.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], templateitemname = templateitemname.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], xref = xref.asInstanceOf[js.Any], xsizemode = xsizemode.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any], yref = yref.asInstanceOf[js.Any], ysizemode = ysizemode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  implicit class ShapeOps[Self <: Shape] (val x: Self) extends AnyVal {
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
    def setFillcolor(value: String): Self = this.set("fillcolor", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayer(value: below | above): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: PartialShapeLine): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateitemname(value: String): Self = this.set("templateitemname", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: rect | circle | line | path): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setXanchor(value: Double | String): Self = this.set("xanchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setXref(value: typings.plotlyJs.plotlyJsStrings.x | paper): Self = this.set("xref", value.asInstanceOf[js.Any])
    @scala.inline
    def setXsizemode(value: scaled | pixel): Self = this.set("xsizemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setYanchor(value: Double | String): Self = this.set("yanchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setYref(value: paper | y): Self = this.set("yref", value.asInstanceOf[js.Any])
    @scala.inline
    def setYsizemode(value: scaled | pixel): Self = this.set("ysizemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setX0(value: Datum): Self = this.set("x0", value.asInstanceOf[js.Any])
    @scala.inline
    def setX0Null: Self = this.set("x0", null)
    @scala.inline
    def setX1(value: Datum): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def setX1Null: Self = this.set("x1", null)
    @scala.inline
    def setY0(value: Datum): Self = this.set("y0", value.asInstanceOf[js.Any])
    @scala.inline
    def setY0Null: Self = this.set("y0", null)
    @scala.inline
    def setY1(value: Datum): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def setY1Null: Self = this.set("y1", null)
  }
  
}

