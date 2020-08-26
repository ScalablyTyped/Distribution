package typings.mnemonist.symspellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymSpellMatch extends js.Object {
  var count: Double = js.native
  var distance: Double = js.native
  var term: String = js.native
}

object SymSpellMatch {
  @scala.inline
  def apply(count: Double, distance: Double, term: String): SymSpellMatch = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymSpellMatch]
  }
  @scala.inline
  implicit class SymSpellMatchOps[Self <: SymSpellMatch] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
  }
  
}

