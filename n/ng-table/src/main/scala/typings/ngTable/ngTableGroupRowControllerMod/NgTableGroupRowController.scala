package typings.ngTable.ngTableGroupRowControllerMod

import typings.angular.mod.IPromise
import typings.ngTable.groupingFuncMod.IGroupingFunc
import typings.ngTable.ngTableControllerMod.ITableScope
import typings.ngTable.publicInterfacesMod.IColumnDef
import typings.ngTable.resultsMod.DataResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ng-table/src/browser/ngTableGroupRowController", "NgTableGroupRowController")
@js.native
class NgTableGroupRowController[T] protected () extends js.Object {
  def this($scope: ITableScope[T] with IScopeExtensions[T]) = this()
  
  @JSName("$scope")
  var $scope: js.Any = js.native
  
  /* private */ def changeSortDirection(): js.Any = js.native
  
  /* private */ def findGroupColumn(groupKey: js.Any): js.Any = js.native
  
  def getGroupTitle(group: IGroupingFunc[_]): String = js.native
  def getGroupTitle(group: IColumnDef): String = js.native
  
  def getGroupables(): js.Array[IGroupingFunc[_] | IColumnDef] = js.native
  
  def getVisibleColumns(): js.Array[IColumnDef] = js.native
  
  def groupBy(group: IGroupingFunc[_]): Unit = js.native
  def groupBy(group: IColumnDef): Unit = js.native
  
  var groupFns: js.Any = js.native
  
  /* private */ def isGroupingFunc(`val`: js.Any): js.Any = js.native
  
  def isSelectedGroup(group: IGroupingFunc[_]): Boolean = js.native
  def isSelectedGroup(group: IColumnDef): Boolean = js.native
  
  /* private */ def setGroup(grouping: js.Any): js.Any = js.native
  
  def toggleDetail(): IPromise[
    js.Array[
      DataResult[
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ _
      ]
    ]
  ] = js.native
}
/* static members */
@JSImport("ng-table/src/browser/ngTableGroupRowController", "NgTableGroupRowController")
@js.native
object NgTableGroupRowController extends js.Object {
  
  @JSName("$inject")
  var $inject: js.Array[String] = js.native
}
