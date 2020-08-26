package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @memberof PIXI
  * @typedef {object} IBitmapFontDataChar
  * @property {string} id
  * @property {number} page
  * @property {number} x
  * @property {number} y
  * @property {number} width
  * @property {number} height
  * @property {number} xoffset
  * @property {number} yoffset
  * @property {number} xadvance
  */
@js.native
trait IBitmapFontDataChar extends js.Object {
  var height: Double = js.native
  var id: String = js.native
  var page: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var xadvance: Double = js.native
  var xoffset: Double = js.native
  var y: Double = js.native
  var yoffset: Double = js.native
}

object IBitmapFontDataChar {
  @scala.inline
  def apply(
    height: Double,
    id: String,
    page: Double,
    width: Double,
    x: Double,
    xadvance: Double,
    xoffset: Double,
    y: Double,
    yoffset: Double
  ): IBitmapFontDataChar = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xadvance = xadvance.asInstanceOf[js.Any], xoffset = xoffset.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yoffset = yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontDataChar]
  }
  @scala.inline
  implicit class IBitmapFontDataCharOps[Self <: IBitmapFontDataChar] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setXadvance(value: Double): Self = this.set("xadvance", value.asInstanceOf[js.Any])
    @scala.inline
    def setXoffset(value: Double): Self = this.set("xoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setYoffset(value: Double): Self = this.set("yoffset", value.asInstanceOf[js.Any])
  }
  
}

