package typings.numeric.anon

import typings.numeric.mod.Matrix
import typings.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S extends js.Object {
  var S: Vector = js.native
  var U: Matrix = js.native
  var V: Matrix = js.native
}

object S {
  @scala.inline
  def apply(S: Vector, U: Matrix, V: Matrix): S = {
    val __obj = js.Dynamic.literal(S = S.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any], V = V.asInstanceOf[js.Any])
    __obj.asInstanceOf[S]
  }
  @scala.inline
  implicit class SOps[Self <: S] (val x: Self) extends AnyVal {
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
    def setSVarargs(value: Double*): Self = this.set("S", js.Array(value :_*))
    @scala.inline
    def setS(value: Vector): Self = this.set("S", value.asInstanceOf[js.Any])
    @scala.inline
    def setUVarargs(value: js.Array[Double]*): Self = this.set("U", js.Array(value :_*))
    @scala.inline
    def setU(value: Matrix): Self = this.set("U", value.asInstanceOf[js.Any])
    @scala.inline
    def setVVarargs(value: js.Array[Double]*): Self = this.set("V", js.Array(value :_*))
    @scala.inline
    def setV(value: Matrix): Self = this.set("V", value.asInstanceOf[js.Any])
  }
  
}

