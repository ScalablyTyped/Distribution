package typings.p2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pairs extends js.Object {
  var pairs: js.Array[typings.p2.mod.Body] = js.native
  var `type`: String = js.native
}

object Pairs {
  @scala.inline
  def apply(pairs: js.Array[typings.p2.mod.Body], `type`: String): Pairs = {
    val __obj = js.Dynamic.literal(pairs = pairs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pairs]
  }
  @scala.inline
  implicit class PairsOps[Self <: Pairs] (val x: Self) extends AnyVal {
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
    def setPairsVarargs(value: typings.p2.mod.Body*): Self = this.set("pairs", js.Array(value :_*))
    @scala.inline
    def setPairs(value: js.Array[typings.p2.mod.Body]): Self = this.set("pairs", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

