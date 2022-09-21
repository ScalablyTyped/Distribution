package typings.ngTable

import typings.ngTable.groupingFuncMod.Grouping
import typings.ngTable.sortingMod.ISortingValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("ng-table/src/core/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertSortToOrderBy(sorting: ISortingValues): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertSortToOrderBy")(sorting.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def isGroupingFun(`val`: String): /* is ng-table.ng-table/src/core/grouping/groupingFunc.IGroupingFunc<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGroupingFun")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is ng-table.ng-table/src/core/grouping/groupingFunc.IGroupingFunc<any> */ Boolean]
  inline def isGroupingFun(`val`: Grouping[Any]): /* is ng-table.ng-table/src/core/grouping/groupingFunc.IGroupingFunc<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGroupingFun")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is ng-table.ng-table/src/core/grouping/groupingFunc.IGroupingFunc<any> */ Boolean]
}
