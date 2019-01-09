package typings
package ngDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcCoreFilteringFilterComparatorMod {
  type FilterComparator[T] = scala.Boolean | IFilterComparatorFunc[T]
  type IFilterComparatorFunc[T] = js.Function2[/* actual */ T, /* expected */ T, scala.Boolean]
}
