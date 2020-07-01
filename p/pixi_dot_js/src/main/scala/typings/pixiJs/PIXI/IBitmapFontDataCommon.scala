package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @memberof PIXI
  * @typedef {object} IBitmapFontDataCommon
  * @property {number} lineHeight
  */
trait IBitmapFontDataCommon extends js.Object {
  var lineHeight: Double
}

object IBitmapFontDataCommon {
  @scala.inline
  def apply(lineHeight: Double): IBitmapFontDataCommon = {
    val __obj = js.Dynamic.literal(lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontDataCommon]
  }
}

