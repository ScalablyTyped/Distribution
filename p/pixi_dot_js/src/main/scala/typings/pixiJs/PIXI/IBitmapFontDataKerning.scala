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
@js.native
trait IBitmapFontDataKerning extends js.Object {
  var amount: Double = js.native
  var first: Double = js.native
  var second: Double = js.native
}

object IBitmapFontDataKerning {
  @scala.inline
  def apply(amount: Double, first: Double, second: Double): IBitmapFontDataKerning = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapFontDataKerning]
  }
  @scala.inline
  implicit class IBitmapFontDataKerningOps[Self <: IBitmapFontDataKerning] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirst(value: Double): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecond(value: Double): Self = this.set("second", value.asInstanceOf[js.Any])
  }
  
}

