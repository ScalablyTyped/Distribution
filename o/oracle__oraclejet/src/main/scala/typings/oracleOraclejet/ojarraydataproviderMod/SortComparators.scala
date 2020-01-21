package typings.oracleOraclejet.ojarraydataproviderMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortComparators[D] extends js.Object {
  var comparators: Map[String, js.Function2[/* a */ _, /* b */ _, Double]]
}

object SortComparators {
  @scala.inline
  def apply[D](comparators: Map[String, js.Function2[/* a */ _, /* b */ _, Double]]): SortComparators[D] = {
    val __obj = js.Dynamic.literal(comparators = comparators.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortComparators[D]]
  }
}

