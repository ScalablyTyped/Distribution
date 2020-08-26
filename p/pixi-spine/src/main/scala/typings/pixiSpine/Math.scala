package typings.pixiSpine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Math extends js.Object {
  def fround(n: Double): Double = js.native
}

object Math {
  @scala.inline
  def apply(fround: Double => Double): Math = {
    val __obj = js.Dynamic.literal(fround = js.Any.fromFunction1(fround))
    __obj.asInstanceOf[Math]
  }
  @scala.inline
  implicit class MathOps[Self <: Math] (val x: Self) extends AnyVal {
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
    def setFround(value: Double => Double): Self = this.set("fround", js.Any.fromFunction1(value))
  }
  
}

