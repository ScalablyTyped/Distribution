package typings.ngDashGrid.ngGrid.service

import typings.angular.angularMod.IAugmentedJQuery
import typings.ngDashGrid.ngGrid.IColumn
import typings.ngDashGrid.ngGrid.IDimension
import typings.ngDashGrid.ngGrid.IGridInstance
import typings.ngDashGrid.ngGrid.IGridScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDomUtilityService extends js.Object {
  var LetterW: Double
  var ScrollH: Double
  var ScrollW: Double
  var eventStorage: js.Any
  var immediate: Double
  var numberOfGrids: Double
  def AssignGridContainers($scope: IGridScope, rootel: IAugmentedJQuery, grid: IGridInstance): Unit
  def BuildStyles($scope: IGridScope, grid: IGridInstance, digest: Boolean): Unit
  def RebuildGrid($scope: IGridScope, grid: IGridInstance): Unit
  def UpdateGridLayout($scope: IGridScope, grid: IGridInstance): Unit
  def digest($scope: IGridScope): Unit
  def getRealWidth(obj: IDimension): Double
  def setColLeft(col: IColumn, colLeft: Double, grid: IGridInstance): Unit
  def setStyleText(grid: IGridInstance, css: String): Unit
}

object IDomUtilityService {
  @scala.inline
  def apply(
    AssignGridContainers: (IGridScope, IAugmentedJQuery, IGridInstance) => Unit,
    BuildStyles: (IGridScope, IGridInstance, Boolean) => Unit,
    LetterW: Double,
    RebuildGrid: (IGridScope, IGridInstance) => Unit,
    ScrollH: Double,
    ScrollW: Double,
    UpdateGridLayout: (IGridScope, IGridInstance) => Unit,
    digest: IGridScope => Unit,
    eventStorage: js.Any,
    getRealWidth: IDimension => Double,
    immediate: Double,
    numberOfGrids: Double,
    setColLeft: (IColumn, Double, IGridInstance) => Unit,
    setStyleText: (IGridInstance, String) => Unit
  ): IDomUtilityService = {
    val __obj = js.Dynamic.literal(AssignGridContainers = js.Any.fromFunction3(AssignGridContainers), BuildStyles = js.Any.fromFunction3(BuildStyles), LetterW = LetterW.asInstanceOf[js.Any], RebuildGrid = js.Any.fromFunction2(RebuildGrid), ScrollH = ScrollH.asInstanceOf[js.Any], ScrollW = ScrollW.asInstanceOf[js.Any], UpdateGridLayout = js.Any.fromFunction2(UpdateGridLayout), digest = js.Any.fromFunction1(digest), eventStorage = eventStorage.asInstanceOf[js.Any], getRealWidth = js.Any.fromFunction1(getRealWidth), immediate = immediate.asInstanceOf[js.Any], numberOfGrids = numberOfGrids.asInstanceOf[js.Any], setColLeft = js.Any.fromFunction3(setColLeft), setStyleText = js.Any.fromFunction2(setStyleText))
  
    __obj.asInstanceOf[IDomUtilityService]
  }
}

