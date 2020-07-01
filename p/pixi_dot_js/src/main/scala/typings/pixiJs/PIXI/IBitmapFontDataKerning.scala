package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @memberof PIXI
  * @typedef {object} IBitmapFontDataKerning
  * @property {number} first
  * @property {number} second
  * @property {number} amount
  */
trait IBitmapFontDataKerning extends js.Object {
  var amount: Double
  var first: Double
  var second: Double
}

object IBitmapFontDataKerning {
  @scala.inline
  def apply(amount: Double, first: Double, second: Double): IBitmapFontDataKerning = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontDataKerning]
  }
}

