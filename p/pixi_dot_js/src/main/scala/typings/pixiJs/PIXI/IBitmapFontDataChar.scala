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
trait IBitmapFontDataChar extends js.Object {
  var height: Double
  var id: String
  var page: Double
  var width: Double
  var x: Double
  var xadvance: Double
  var xoffset: Double
  var y: Double
  var yoffset: Double
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
}

