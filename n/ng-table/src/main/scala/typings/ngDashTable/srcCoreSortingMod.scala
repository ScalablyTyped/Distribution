package typings.ngDashTable

import org.scalablytyped.runtime.StringDictionary
import typings.ngDashTable.srcCoreGroupingGroupingFuncMod.GroupSort
import typings.ngDashTable.srcCoreSortingMod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/sorting", JSImport.Namespace)
@js.native
object srcCoreSortingMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.ngDashTable.ngDashTableStrings.asc
    - typings.ngDashTable.ngDashTableStrings.desc
  */
  trait SortDirection extends GroupSort
  
  type ISortingValues = StringDictionary[SortDirection]
}

