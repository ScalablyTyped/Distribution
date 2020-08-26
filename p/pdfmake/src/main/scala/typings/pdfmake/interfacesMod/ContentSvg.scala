package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentSvg
  extends ContentBase
     with _Content {
  var fit: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var height: js.UndefOr[Double] = js.native
  var svg: String = js.native
  var width: js.UndefOr[Double] = js.native
}

object ContentSvg {
  @scala.inline
  def apply(svg: String): ContentSvg = {
    val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentSvg]
  }
  @scala.inline
  implicit class ContentSvgOps[Self <: ContentSvg] (val x: Self) extends AnyVal {
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
    def setSvg(value: String): Self = this.set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def setFit(value: js.Tuple2[Double, Double]): Self = this.set("fit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

