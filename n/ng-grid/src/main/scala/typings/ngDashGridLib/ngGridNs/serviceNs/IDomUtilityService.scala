package typings
package ngDashGridLib.ngGridNs.serviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDomUtilityService extends js.Object {
  var LetterW: scala.Double
  var ScrollH: scala.Double
  var ScrollW: scala.Double
  var eventStorage: js.Any
  var immediate: scala.Double
  var numberOfGrids: scala.Double
  def AssignGridContainers(
    $scope: ngDashGridLib.ngGridNs.IGridScope,
    rootel: angularLib.angularMod.angularNs.IAugmentedJQuery,
    grid: ngDashGridLib.ngGridNs.IGridInstance
  ): scala.Unit
  def BuildStyles(
    $scope: ngDashGridLib.ngGridNs.IGridScope,
    grid: ngDashGridLib.ngGridNs.IGridInstance,
    digest: scala.Boolean
  ): scala.Unit
  def RebuildGrid($scope: ngDashGridLib.ngGridNs.IGridScope, grid: ngDashGridLib.ngGridNs.IGridInstance): scala.Unit
  def UpdateGridLayout($scope: ngDashGridLib.ngGridNs.IGridScope, grid: ngDashGridLib.ngGridNs.IGridInstance): scala.Unit
  def digest($scope: ngDashGridLib.ngGridNs.IGridScope): scala.Unit
  def getRealWidth(obj: ngDashGridLib.ngGridNs.IDimension): scala.Double
  def setColLeft(
    col: ngDashGridLib.ngGridNs.IColumn,
    colLeft: scala.Double,
    grid: ngDashGridLib.ngGridNs.IGridInstance
  ): scala.Unit
  def setStyleText(grid: ngDashGridLib.ngGridNs.IGridInstance, css: java.lang.String): scala.Unit
}

object IDomUtilityService {
  @scala.inline
  def apply(
    AssignGridContainers: (ngDashGridLib.ngGridNs.IGridScope, angularLib.angularMod.angularNs.IAugmentedJQuery, ngDashGridLib.ngGridNs.IGridInstance) => scala.Unit,
    BuildStyles: (ngDashGridLib.ngGridNs.IGridScope, ngDashGridLib.ngGridNs.IGridInstance, scala.Boolean) => scala.Unit,
    LetterW: scala.Double,
    RebuildGrid: (ngDashGridLib.ngGridNs.IGridScope, ngDashGridLib.ngGridNs.IGridInstance) => scala.Unit,
    ScrollH: scala.Double,
    ScrollW: scala.Double,
    UpdateGridLayout: (ngDashGridLib.ngGridNs.IGridScope, ngDashGridLib.ngGridNs.IGridInstance) => scala.Unit,
    digest: ngDashGridLib.ngGridNs.IGridScope => scala.Unit,
    eventStorage: js.Any,
    getRealWidth: ngDashGridLib.ngGridNs.IDimension => scala.Double,
    immediate: scala.Double,
    numberOfGrids: scala.Double,
    setColLeft: (ngDashGridLib.ngGridNs.IColumn, scala.Double, ngDashGridLib.ngGridNs.IGridInstance) => scala.Unit,
    setStyleText: (ngDashGridLib.ngGridNs.IGridInstance, java.lang.String) => scala.Unit
  ): IDomUtilityService = {
    val __obj = js.Dynamic.literal(AssignGridContainers = js.Any.fromFunction3(AssignGridContainers), BuildStyles = js.Any.fromFunction3(BuildStyles), LetterW = LetterW, RebuildGrid = js.Any.fromFunction2(RebuildGrid), ScrollH = ScrollH, ScrollW = ScrollW, UpdateGridLayout = js.Any.fromFunction2(UpdateGridLayout), digest = js.Any.fromFunction1(digest), eventStorage = eventStorage, getRealWidth = js.Any.fromFunction1(getRealWidth), immediate = immediate, numberOfGrids = numberOfGrids, setColLeft = js.Any.fromFunction3(setColLeft), setStyleText = js.Any.fromFunction2(setStyleText))
  
    __obj.asInstanceOf[IDomUtilityService]
  }
}

