package typings.mnemonist.symspellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymSpell extends js.Object {
  // Members
  var size: Double = js.native
  def add(string: String): this.type = js.native
  // Methods
  def clear(): Unit = js.native
  def search(query: String): js.Array[SymSpellMatch] = js.native
}

object SymSpell {
  @scala.inline
  def apply(
    add: String => SymSpell,
    clear: () => Unit,
    search: String => js.Array[SymSpellMatch],
    size: Double
  ): SymSpell = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), search = js.Any.fromFunction1(search), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymSpell]
  }
  @scala.inline
  implicit class SymSpellOps[Self <: SymSpell] (val x: Self) extends AnyVal {
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
    def setAdd(value: String => SymSpell): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setSearch(value: String => js.Array[SymSpellMatch]): Self = this.set("search", js.Any.fromFunction1(value))
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

