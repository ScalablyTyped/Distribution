package typings.nopt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cooked extends js.Object {
  var cooked: js.Array[String] = js.native
  var original: js.Array[String] = js.native
  var remain: js.Array[String] = js.native
}

object Cooked {
  @scala.inline
  def apply(cooked: js.Array[String], original: js.Array[String], remain: js.Array[String]): Cooked = {
    val __obj = js.Dynamic.literal(cooked = cooked.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], remain = remain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cooked]
  }
  @scala.inline
  implicit class CookedOps[Self <: Cooked] (val x: Self) extends AnyVal {
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
    def setCookedVarargs(value: String*): Self = this.set("cooked", js.Array(value :_*))
    @scala.inline
    def setCooked(value: js.Array[String]): Self = this.set("cooked", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalVarargs(value: String*): Self = this.set("original", js.Array(value :_*))
    @scala.inline
    def setOriginal(value: js.Array[String]): Self = this.set("original", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemainVarargs(value: String*): Self = this.set("remain", js.Array(value :_*))
    @scala.inline
    def setRemain(value: js.Array[String]): Self = this.set("remain", value.asInstanceOf[js.Any])
  }
  
}

