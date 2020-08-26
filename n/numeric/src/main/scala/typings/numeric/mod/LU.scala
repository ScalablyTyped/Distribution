package typings.numeric.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LU extends js.Object {
  var L: Matrix = js.native
  var U: Matrix = js.native
}

object LU {
  @scala.inline
  def apply(L: Matrix, U: Matrix): LU = {
    val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any])
    __obj.asInstanceOf[LU]
  }
  @scala.inline
  implicit class LUOps[Self <: LU] (val x: Self) extends AnyVal {
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
    def setLVarargs(value: js.Array[Double]*): Self = this.set("L", js.Array(value :_*))
    @scala.inline
    def setL(value: Matrix): Self = this.set("L", value.asInstanceOf[js.Any])
    @scala.inline
    def setUVarargs(value: js.Array[Double]*): Self = this.set("U", js.Array(value :_*))
    @scala.inline
    def setU(value: Matrix): Self = this.set("U", value.asInstanceOf[js.Any])
  }
  
}

