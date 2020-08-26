package typings.ol.textMod

import typings.ol.textPlacementMod.TextPlacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var backgroundFill: js.UndefOr[typings.ol.fillMod.default] = js.native
  var backgroundStroke: js.UndefOr[typings.ol.strokeMod.default] = js.native
  var fill: js.UndefOr[typings.ol.fillMod.default] = js.native
  var font: js.UndefOr[String] = js.native
  var maxAngle: js.UndefOr[Double] = js.native
  var offsetX: js.UndefOr[Double] = js.native
  var offsetY: js.UndefOr[Double] = js.native
  var overflow: js.UndefOr[Boolean] = js.native
  var padding: js.UndefOr[js.Array[Double]] = js.native
  var placement: js.UndefOr[TextPlacement | String] = js.native
  var rotateWithView: js.UndefOr[Boolean] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[Double] = js.native
  var stroke: js.UndefOr[typings.ol.strokeMod.default] = js.native
  var text: js.UndefOr[String] = js.native
  var textAlign: js.UndefOr[String] = js.native
  var textBaseline: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setBackgroundFill(value: typings.ol.fillMod.default): Self = this.set("backgroundFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundFill: Self = this.set("backgroundFill", js.undefined)
    @scala.inline
    def setBackgroundStroke(value: typings.ol.strokeMod.default): Self = this.set("backgroundStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundStroke: Self = this.set("backgroundStroke", js.undefined)
    @scala.inline
    def setFill(value: typings.ol.fillMod.default): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setMaxAngle(value: Double): Self = this.set("maxAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAngle: Self = this.set("maxAngle", js.undefined)
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setOverflow(value: Boolean): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    @scala.inline
    def setPadding(value: js.Array[Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPlacement(value: TextPlacement | String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setRotateWithView(value: Boolean): Self = this.set("rotateWithView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateWithView: Self = this.set("rotateWithView", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setStroke(value: typings.ol.strokeMod.default): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setTextBaseline(value: String): Self = this.set("textBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextBaseline: Self = this.set("textBaseline", js.undefined)
  }
  
}

