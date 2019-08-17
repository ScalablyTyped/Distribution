package typings.ngDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcCoreFilteringFilterFuncMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.ngDashTable.srcCoreFilteringFilterComparatorMod.FilterComparator

  type IFilterFunc[T] = js.Function3[
    /* data */ js.Array[T], 
    /* filter */ IFilterValues, 
    /* filterComparator */ FilterComparator[T], 
    js.Array[T]
  ]
  type IFilterValues = StringDictionary[js.Any]
}
