package typings.nyaapi.mod.pantsu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchOptionsTerm extends SearchOptions {
  @JSName("term")
  var term_SearchOptionsTerm: String = js.native
}

object SearchOptionsTerm {
  @scala.inline
  def apply(term: String): SearchOptionsTerm = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptionsTerm]
  }
  @scala.inline
  implicit class SearchOptionsTermOps[Self <: SearchOptionsTerm] (val x: Self) extends AnyVal {
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
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
  }
  
}

