package typings
package ngDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngRow")
@js.native
class ngRow protected ()
  extends ngDashGridLib.ngGridNs.IRow {
  def this(entity: js.Any, config: ngDashGridLib.ngGridNs.IRowConfig, selectionProvider: ngDashGridLib.ngGridNs.ISelectionProvider, rowIndex: scala.Double, $utils: js.Any) = this()
  /* CompleteClass */
  override var config: ngDashGridLib.ngGridNs.IRowConfig = js.native
  /* CompleteClass */
  override var cursor: java.lang.String = js.native
  /* CompleteClass */
  override var entity: js.Any = js.native
  /* CompleteClass */
  override var offsetTop: scala.Double = js.native
  /* CompleteClass */
  override var rowDisplayIndex: scala.Double = js.native
  /* CompleteClass */
  override var rowIndex: scala.Double = js.native
  /* CompleteClass */
  override var selected: scala.Boolean = js.native
  /* CompleteClass */
  override var selectionProvider: ngDashGridLib.ngGridNs.ISelectionProvider = js.native
  /* CompleteClass */
  override var utils: js.Any = js.native
  /* CompleteClass */
  override def afterSelectionChange(): scala.Unit = js.native
  /* CompleteClass */
  override def alternatingRowClass(): scala.Unit = js.native
  /* CompleteClass */
  override def beforeSelectionChange(): scala.Unit = js.native
  /* CompleteClass */
  override def continueSelection(event: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def copy(): ngDashGridLib.ngGridNs.IRow = js.native
  /* CompleteClass */
  override def ensureEntity(expected: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def getProperty(path: java.lang.String): js.Any = js.native
  /* CompleteClass */
  override def setSelection(isSelected: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def setVars(fromRow: ngDashGridLib.ngGridNs.IRow): scala.Unit = js.native
  /* CompleteClass */
  override def toggleSelected(event: js.Any): scala.Boolean = js.native
}

