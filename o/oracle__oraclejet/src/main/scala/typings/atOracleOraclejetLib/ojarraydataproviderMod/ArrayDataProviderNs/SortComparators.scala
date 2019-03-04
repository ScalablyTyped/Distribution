package typings
package atOracleOraclejetLib.ojarraydataproviderMod.ArrayDataProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortComparators[D] extends js.Object {
  var comparators: stdLib.Map[java.lang.String, js.Function2[/* a */ _, /* b */ _, scala.Double]]
}

object SortComparators {
  @scala.inline
  def apply[D](comparators: stdLib.Map[java.lang.String, js.Function2[/* a */ _, /* b */ _, scala.Double]]): SortComparators[D] = {
    val __obj = js.Dynamic.literal(comparators = comparators)
  
    __obj.asInstanceOf[SortComparators[D]]
  }
}

