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
    AssignGridContainers: js.Function3[
      ngDashGridLib.ngGridNs.IGridScope, 
      angularLib.angularMod.angularNs.IAugmentedJQuery, 
      ngDashGridLib.ngGridNs.IGridInstance, 
      scala.Unit
    ],
    BuildStyles: js.Function3[
      ngDashGridLib.ngGridNs.IGridScope, 
      ngDashGridLib.ngGridNs.IGridInstance, 
      scala.Boolean, 
      scala.Unit
    ],
    LetterW: scala.Double,
    RebuildGrid: js.Function2[ngDashGridLib.ngGridNs.IGridScope, ngDashGridLib.ngGridNs.IGridInstance, scala.Unit],
    ScrollH: scala.Double,
    ScrollW: scala.Double,
    UpdateGridLayout: js.Function2[ngDashGridLib.ngGridNs.IGridScope, ngDashGridLib.ngGridNs.IGridInstance, scala.Unit],
    digest: js.Function1[ngDashGridLib.ngGridNs.IGridScope, scala.Unit],
    eventStorage: js.Any,
    getRealWidth: js.Function1[ngDashGridLib.ngGridNs.IDimension, scala.Double],
    immediate: scala.Double,
    numberOfGrids: scala.Double,
    setColLeft: js.Function3[
      ngDashGridLib.ngGridNs.IColumn, 
      scala.Double, 
      ngDashGridLib.ngGridNs.IGridInstance, 
      scala.Unit
    ],
    setStyleText: js.Function2[ngDashGridLib.ngGridNs.IGridInstance, java.lang.String, scala.Unit]
  ): IDomUtilityService = {
    val __obj = js.Dynamic.literal(AssignGridContainers = AssignGridContainers, BuildStyles = BuildStyles, LetterW = LetterW, RebuildGrid = RebuildGrid, ScrollH = ScrollH, ScrollW = ScrollW, UpdateGridLayout = UpdateGridLayout, digest = digest, eventStorage = eventStorage, getRealWidth = getRealWidth, immediate = immediate, numberOfGrids = numberOfGrids, setColLeft = setColLeft, setStyleText = setStyleText)
  
    __obj.asInstanceOf[IDomUtilityService]
  }
}

