package typings.ngDashGrid

import typings.angular.angularMod.IParseService
import typings.ngDashGrid.ngGridNs.IGridInstance
import typings.ngDashGrid.ngGridNs.IGridScope
import typings.ngDashGrid.ngGridNs.ISelectionProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngSelectionProvider")
@js.native
class ngSelectionProvider protected () extends ISelectionProvider {
  def this(grid: IGridInstance, $scope: IGridScope, $parse: IParseService) = this()
}

