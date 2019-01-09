package typings
package ngDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcCoreFilteringFilterFuncMod {
  type IFilterFunc[T] = js.Function3[
    /* data */ js.Array[T], 
    /* filter */ IFilterValues, 
    /* filterComparator */ ngDashTableLib.srcCoreFilteringFilterComparatorMod.FilterComparator[T], 
    js.Array[T]
  ]
}
