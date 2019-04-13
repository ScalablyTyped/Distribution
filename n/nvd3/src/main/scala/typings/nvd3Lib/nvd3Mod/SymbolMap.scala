package typings
package nvd3Lib.nvd3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolMap extends js.Object {
  def set(name: java.lang.String, func: js.Function1[/* size */ js.Any, scala.Unit]): scala.Unit
}

object SymbolMap {
  @scala.inline
  def apply(set: (java.lang.String, js.Function1[/* size */ js.Any, scala.Unit]) => scala.Unit): SymbolMap = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[SymbolMap]
  }
}

