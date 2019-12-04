package typings.ngDashGrid

import org.scalablytyped.runtime.TopLevel
import typings.ngDashGrid.ngGrid.IGridInstance
import typings.ngDashGrid.ngGrid.IGridScope
import typings.ngDashGrid.ngGrid.IRow
import typings.ngDashGrid.ngGrid.ISelectionProvider
import typings.ngDashGrid.ngGrid.ISelectionProviderStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngSelectionProvider")
@js.native
class ngSelectionProvider protected () extends ISelectionProvider {
  def this(
    grid: IGridInstance,
    $scope: IGridScope,
    $parse: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IParseService */ js.Any
  ) = this()
  /* CompleteClass */
  override var ignoreSelectedItemChanges: Boolean = js.native
  /* CompleteClass */
  override var lastClickedRow: js.Any = js.native
  /* CompleteClass */
  override var multi: Boolean = js.native
  /* CompleteClass */
  override var pKeyParser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ICompiledExpression */ js.Any = js.native
  /* CompleteClass */
  override var selectedIndex: Double = js.native
  /* CompleteClass */
  override var selectedItems: js.Array[_] = js.native
  /* CompleteClass */
  override def ChangeSelection(rowItem: js.Any, event: js.Any): Unit = js.native
  /* CompleteClass */
  override def getSelection(entity: js.Any): Double = js.native
  /* CompleteClass */
  override def getSelectionIndex(entity: js.Any): Double = js.native
  /* CompleteClass */
  override def setSelection(rowItem: IRow, isSelected: Boolean): Unit = js.native
  /* CompleteClass */
  override def toggleSelectAll(checkAll: Boolean, bypass: Boolean, selectFiltered: Boolean): Unit = js.native
}

@JSGlobal("ngSelectionProvider")
@js.native
object ngSelectionProvider extends TopLevel[ISelectionProviderStatic]

