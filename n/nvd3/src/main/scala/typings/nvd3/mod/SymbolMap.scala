package typings.nvd3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolMap extends js.Object {
  def set(name: String, func: js.Function1[/* size */ js.Any, Unit]): Unit
}

object SymbolMap {
  @scala.inline
  def apply(set: (String, js.Function1[/* size */ js.Any, Unit]) => Unit): SymbolMap = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[SymbolMap]
  }
}

