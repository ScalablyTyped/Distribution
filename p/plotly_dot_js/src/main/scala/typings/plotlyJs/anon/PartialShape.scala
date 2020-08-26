package typings.plotlyJs.anon

import typings.plotlyJs.mod.Datum
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

/* Inlined std.Partial<plotly.js.plotly.js.Shape> */
@js.native
trait PartialShape extends js.Object {
  var fillcolor: js.UndefOr[String] = js.native
  var layer: js.UndefOr[below | above] = js.native
  var line: js.UndefOr[PartialShapeLine] = js.native
  var name: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var path: js.UndefOr[String] = js.native
  var templateitemname: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[rect | circle | line | path] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var x0: js.UndefOr[Datum] = js.native
  var x1: js.UndefOr[Datum] = js.native
  var xanchor: js.UndefOr[Double | String] = js.native
  var xref: js.UndefOr[x | paper] = js.native
  var xsizemode: js.UndefOr[scaled | pixel] = js.native
  var y0: js.UndefOr[Datum] = js.native
  var y1: js.UndefOr[Datum] = js.native
  var yanchor: js.UndefOr[Double | String] = js.native
  var yref: js.UndefOr[paper | y] = js.native
  var ysizemode: js.UndefOr[scaled | pixel] = js.native
}

object PartialShape {
  @scala.inline
  def apply(): PartialShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShape]
  }
  @scala.inline
  implicit class PartialShapeOps[Self <: PartialShape] (val x: Self) extends AnyVal {
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
    def deleteFillcolor: Self = this.set("fillcolor", js.undefined)
    @scala.inline
    def setLayer(value: below | above): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    @scala.inline
    def setLine(value: PartialShapeLine): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setTemplateitemname(value: String): Self = this.set("templateitemname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateitemname: Self = this.set("templateitemname", js.undefined)
    @scala.inline
    def setType(value: rect | circle | line | path): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setX0(value: Datum): Self = this.set("x0", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX0: Self = this.set("x0", js.undefined)
    @scala.inline
    def setX0Null: Self = this.set("x0", null)
    @scala.inline
    def setX1(value: Datum): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX1: Self = this.set("x1", js.undefined)
    @scala.inline
    def setX1Null: Self = this.set("x1", null)
    @scala.inline
    def setXanchor(value: Double | String): Self = this.set("xanchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXanchor: Self = this.set("xanchor", js.undefined)
    @scala.inline
    def setXref(value: typings.plotlyJs.plotlyJsStrings.x | paper): Self = this.set("xref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXref: Self = this.set("xref", js.undefined)
    @scala.inline
    def setXsizemode(value: scaled | pixel): Self = this.set("xsizemode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXsizemode: Self = this.set("xsizemode", js.undefined)
    @scala.inline
    def setY0(value: Datum): Self = this.set("y0", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY0: Self = this.set("y0", js.undefined)
    @scala.inline
    def setY0Null: Self = this.set("y0", null)
    @scala.inline
    def setY1(value: Datum): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY1: Self = this.set("y1", js.undefined)
    @scala.inline
    def setY1Null: Self = this.set("y1", null)
    @scala.inline
    def setYanchor(value: Double | String): Self = this.set("yanchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYanchor: Self = this.set("yanchor", js.undefined)
    @scala.inline
    def setYref(value: paper | y): Self = this.set("yref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYref: Self = this.set("yref", js.undefined)
    @scala.inline
    def setYsizemode(value: scaled | pixel): Self = this.set("ysizemode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYsizemode: Self = this.set("ysizemode", js.undefined)
  }
  
}

