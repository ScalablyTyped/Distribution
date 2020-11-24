package typings.ngTable

import typings.ngTable.groupingFuncMod.Grouping
import typings.ngTable.sortingMod.ISortingValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ng-table/src/core/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def convertSortToOrderBy(sorting: ISortingValues): js.Array[String] = js.native
  
  def isGroupingFun(`val`: String): /* is ng-table.ng-table/src/core/grouping/groupingFunc.IGroupingFunc<any> */ Boolean = js.native
  def isGroupingFun(`val`: Grouping[_]): /* is ng-table.ng-table/src/core/grouping/groupingFunc.IGroupingFunc<any> */ Boolean = js.native
}
