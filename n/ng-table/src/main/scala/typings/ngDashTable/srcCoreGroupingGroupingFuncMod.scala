package typings.ngDashTable

import org.scalablytyped.runtime.StringDictionary
import typings.ngDashTable.srcCoreGroupingGroupingFuncMod.GroupSort
import typings.ngDashTable.srcCoreGroupingGroupingFuncMod.IGroupValues
import typings.ngDashTable.srcCoreGroupingGroupingFuncMod.IGroupingFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/grouping/groupingFunc", JSImport.Namespace)
@js.native
object srcCoreGroupingGroupingFuncMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.ngDashTable.srcCoreSortingMod.SortDirection
    - typings.ngDashTable.ngDashTableStrings.Empty
  */
  trait GroupSort extends js.Object
  
  @js.native
  trait IGroupingFunc[T] extends js.Object {
    /**
      * leave undefined to let the value of `ISettings.groupOptions.defaultSort` apply
      */
    var sortDirection: js.UndefOr[GroupSort] = js.native
    var title: js.UndefOr[String] = js.native
    def apply(item: T): String = js.native
  }
  
  type Grouping[T] = IGroupValues | IGroupingFunc[T]
  type IGroupValues = StringDictionary[GroupSort]
}

