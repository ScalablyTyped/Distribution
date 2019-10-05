package typings.ngDashGrid

import org.scalablytyped.runtime.TopLevel
import typings.angular.angularMod.IParseService
import typings.ngDashGrid.ngGrid.IGridInstance
import typings.ngDashGrid.ngGrid.IGridScope
import typings.ngDashGrid.ngGrid.ISelectionProvider
import typings.ngDashGrid.ngGrid.ISelectionProviderStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngSelectionProvider")
@js.native
class ngSelectionProvider protected () extends ISelectionProvider {
  def this(grid: IGridInstance, $scope: IGridScope, $parse: IParseService) = this()
}

@JSGlobal("ngSelectionProvider")
@js.native
object ngSelectionProvider extends TopLevel[ISelectionProviderStatic]

