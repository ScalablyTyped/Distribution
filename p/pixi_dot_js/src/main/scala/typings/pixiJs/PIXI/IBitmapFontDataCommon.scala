package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @memberof PIXI
  * @typedef {object} IBitmapFontDataCommon
  * @property {number} lineHeight
  */
@js.native
trait IBitmapFontDataCommon extends js.Object {
  var lineHeight: Double = js.native
}

object IBitmapFontDataCommon {
  @scala.inline
  def apply(lineHeight: Double): IBitmapFontDataCommon = {
    val __obj = js.Dynamic.literal(lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontDataCommon]
  }
  @scala.inline
  implicit class IBitmapFontDataCommonOps[Self <: IBitmapFontDataCommon] (val x: Self) extends AnyVal {
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
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
  }
  
}

