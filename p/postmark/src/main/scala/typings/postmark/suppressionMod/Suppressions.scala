package typings.postmark.suppressionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Suppressions extends js.Object {
  var Suppressions: js.Array[Suppression] = js.native
}

object Suppressions {
  @scala.inline
  def apply(Suppressions: js.Array[Suppression]): Suppressions = {
    val __obj = js.Dynamic.literal(Suppressions = Suppressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suppressions]
  }
  @scala.inline
  implicit class SuppressionsOps[Self <: Suppressions] (val x: Self) extends AnyVal {
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
    def setSuppressionsVarargs(value: Suppression*): Self = this.set("Suppressions", js.Array(value :_*))
    @scala.inline
    def setSuppressions(value: js.Array[Suppression]): Self = this.set("Suppressions", value.asInstanceOf[js.Any])
  }
  
}

