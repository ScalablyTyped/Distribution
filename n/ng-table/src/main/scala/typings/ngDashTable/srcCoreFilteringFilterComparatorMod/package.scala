package typings.ngDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcCoreFilteringFilterComparatorMod {
  type FilterComparator[T] = Boolean | IFilterComparatorFunc[T]
  type IFilterComparatorFunc[T] = js.Function2[/* actual */ T, /* expected */ T, Boolean]
}
