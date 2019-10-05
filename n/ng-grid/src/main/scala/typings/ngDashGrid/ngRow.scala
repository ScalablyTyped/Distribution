package typings.ngDashGrid

import org.scalablytyped.runtime.TopLevel
import typings.ngDashGrid.ngGrid.IRow
import typings.ngDashGrid.ngGrid.IRowConfig
import typings.ngDashGrid.ngGrid.IRowStatic
import typings.ngDashGrid.ngGrid.ISelectionProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngRow")
@js.native
class ngRow protected () extends IRow {
  def this(
    entity: js.Any,
    config: IRowConfig,
    selectionProvider: ISelectionProvider,
    rowIndex: Double,
    $utils: js.Any
  ) = this()
  /* CompleteClass */
  override var config: IRowConfig = js.native
  /* CompleteClass */
  override var cursor: String = js.native
  /* CompleteClass */
  override var entity: js.Any = js.native
  /* CompleteClass */
  override var offsetTop: Double = js.native
  /* CompleteClass */
  override var rowDisplayIndex: Double = js.native
  /* CompleteClass */
  override var rowIndex: Double = js.native
  /* CompleteClass */
  override var selected: Boolean = js.native
  /* CompleteClass */
  override var selectionProvider: ISelectionProvider = js.native
  /* CompleteClass */
  override var utils: js.Any = js.native
  /* CompleteClass */
  override def afterSelectionChange(): Unit = js.native
  /* CompleteClass */
  override def alternatingRowClass(): Unit = js.native
  /* CompleteClass */
  override def beforeSelectionChange(): Unit = js.native
  /* CompleteClass */
  override def continueSelection(event: js.Any): Unit = js.native
  /* CompleteClass */
  override def copy(): IRow = js.native
  /* CompleteClass */
  override def ensureEntity(expected: js.Any): Unit = js.native
  /* CompleteClass */
  override def getProperty(path: String): js.Any = js.native
  /* CompleteClass */
  override def setSelection(isSelected: Boolean): Unit = js.native
  /* CompleteClass */
  override def setVars(fromRow: IRow): Unit = js.native
  /* CompleteClass */
  override def toggleSelected(event: js.Any): Boolean = js.native
}

@JSGlobal("ngRow")
@js.native
object ngRow extends TopLevel[IRowStatic]

