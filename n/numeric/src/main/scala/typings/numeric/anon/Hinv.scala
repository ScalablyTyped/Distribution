package typings.numeric.anon

import typings.numeric.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hinv extends js.Object {
  var Hinv: Matrix = js.native
}

object Hinv {
  @scala.inline
  def apply(Hinv: Matrix): Hinv = {
    val __obj = js.Dynamic.literal(Hinv = Hinv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hinv]
  }
  @scala.inline
  implicit class HinvOps[Self <: Hinv] (val x: Self) extends AnyVal {
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
    def setHinvVarargs(value: js.Array[Double]*): Self = this.set("Hinv", js.Array(value :_*))
    @scala.inline
    def setHinv(value: Matrix): Self = this.set("Hinv", value.asInstanceOf[js.Any])
  }
  
}

