package typings.ngDashTable

import org.scalablytyped.runtime.StringDictionary
import typings.ngDashTable.srcCoreFilteringFilterComparatorMod.FilterComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/filtering/filterFunc", JSImport.Namespace)
@js.native
object srcCoreFilteringFilterFuncMod extends js.Object {
  type IFilterFunc[T] = js.Function3[
    /* data */ js.Array[T], 
    /* filter */ IFilterValues, 
    /* filterComparator */ FilterComparator[T], 
    js.Array[T]
  ]
  type IFilterValues = StringDictionary[js.Any]
}

