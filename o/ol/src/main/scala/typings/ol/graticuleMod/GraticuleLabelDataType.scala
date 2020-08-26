package typings.ol.graticuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraticuleLabelDataType extends js.Object {
  var geom: typings.ol.pointMod.default = js.native
  var text: String = js.native
}

object GraticuleLabelDataType {
  @scala.inline
  def apply(geom: typings.ol.pointMod.default, text: String): GraticuleLabelDataType = {
    val __obj = js.Dynamic.literal(geom = geom.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraticuleLabelDataType]
  }
  @scala.inline
  implicit class GraticuleLabelDataTypeOps[Self <: GraticuleLabelDataType] (val x: Self) extends AnyVal {
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
    def setGeom(value: typings.ol.pointMod.default): Self = this.set("geom", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

