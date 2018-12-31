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

