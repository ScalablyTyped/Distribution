package typings.ngDashGrid

import typings.angular.angularMod.IFilterService
import typings.ngDashGrid.ngGridNs.IGridInstance
import typings.ngDashGrid.ngGridNs.IGridScope
import typings.ngDashGrid.ngGridNs.ISearchProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngSearchProvider")
@js.native
class ngSearchProvider protected () extends ISearchProvider {
  def this($scope: IGridScope, grid: IGridInstance, $filter: IFilterService) = this()
  /* CompleteClass */
  override var extFilter: Boolean = js.native
  /* CompleteClass */
  override var fieldMap: js.Any = js.native
  /* CompleteClass */
  override def evalFilter(): Unit = js.native
}

