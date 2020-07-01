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
trait IBitmapFontDataInfo extends js.Object {
  var face: String
  var size: Double
}

object IBitmapFontDataInfo {
  @scala.inline
  def apply(face: String, size: Double): IBitmapFontDataInfo = {
    val __obj = js.Dynamic.literal(face = face.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontDataInfo]
  }
}

