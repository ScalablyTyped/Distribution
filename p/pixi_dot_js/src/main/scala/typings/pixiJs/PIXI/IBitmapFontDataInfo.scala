package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @memberof PIXI
  * @typedef {object} IBitmapFontDataInfo
  * @property {string} face
  * @property {number} size
  */
@js.native
trait IBitmapFontDataInfo extends js.Object {
  var face: String = js.native
  var size: Double = js.native
}

object IBitmapFontDataInfo {
  @scala.inline
  def apply(face: String, size: Double): IBitmapFontDataInfo = {
    val __obj = js.Dynamic.literal(face = face.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontDataInfo]
  }
  @scala.inline
  implicit class IBitmapFontDataInfoOps[Self <: IBitmapFontDataInfo] (val x: Self) extends AnyVal {
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
    def setFace(value: String): Self = this.set("face", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

