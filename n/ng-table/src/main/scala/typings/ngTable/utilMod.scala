package typings.ngTable

import typings.ngTable.groupingFuncMod.Grouping
import typings.ngTable.sortingMod.ISortingValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("ng-table/src/core/util", "convertSortToOrderBy")
  @js.native
  def convertSortToOrderBy(sorting: ISortingValues): js.Array[String] = js.native
  
  @JSImport("ng-table/src/core/util", "isGroupingFun")
  @js.native
  def isGroupingFun(`val`: String): /* is ng-table.ng-table/src/core/grouping/groupingFunc.IGroupingFunc<any> */ Boolean = js.native
  @JSImport("ng-table/src/core/util", "isGroupingFun")
  @js.native
  def isGroupingFun(`val`: Grouping[_]): /* is ng-table.ng-table/src/core/grouping/groupingFunc.IGroupingFunc<any> */ Boolean = js.native
}
