package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRow extends js.Object {
  var config: IRowConfig
  var cursor: java.lang.String
  var entity: js.Any
  var offsetTop: scala.Double
  var rowDisplayIndex: scala.Double
  var rowIndex: scala.Double
  var selected: scala.Boolean
  var selectionProvider: ISelectionProvider
  var utils: js.Any
  def afterSelectionChange(): scala.Unit
  def alternatingRowClass(): scala.Unit
  def beforeSelectionChange(): scala.Unit
  def continueSelection(event: js.Any): scala.Unit
  def copy(): IRow
  def ensureEntity(expected: js.Any): scala.Unit
  def getProperty(path: java.lang.String): js.Any
  def setSelection(isSelected: scala.Boolean): scala.Unit
  def setVars(fromRow: IRow): scala.Unit
  def toggleSelected(event: js.Any): scala.Boolean
}

object IRow {
  @scala.inline
  def apply(
    afterSelectionChange: () => scala.Unit,
    alternatingRowClass: () => scala.Unit,
    beforeSelectionChange: () => scala.Unit,
    config: IRowConfig,
    continueSelection: js.Any => scala.Unit,
    copy: () => IRow,
    cursor: java.lang.String,
    ensureEntity: js.Any => scala.Unit,
    entity: js.Any,
    getProperty: java.lang.String => js.Any,
    offsetTop: scala.Double,
    rowDisplayIndex: scala.Double,
    rowIndex: scala.Double,
    selected: scala.Boolean,
    selectionProvider: ISelectionProvider,
    setSelection: scala.Boolean => scala.Unit,
    setVars: IRow => scala.Unit,
    toggleSelected: js.Any => scala.Boolean,
    utils: js.Any
  ): IRow = {
    val __obj = js.Dynamic.literal(afterSelectionChange = js.Any.fromFunction0(afterSelectionChange), alternatingRowClass = js.Any.fromFunction0(alternatingRowClass), beforeSelectionChange = js.Any.fromFunction0(beforeSelectionChange), config = config, continueSelection = js.Any.fromFunction1(continueSelection), copy = js.Any.fromFunction0(copy), cursor = cursor, ensureEntity = js.Any.fromFunction1(ensureEntity), entity = entity, getProperty = js.Any.fromFunction1(getProperty), offsetTop = offsetTop, rowDisplayIndex = rowDisplayIndex, rowIndex = rowIndex, selected = selected, selectionProvider = selectionProvider, setSelection = js.Any.fromFunction1(setSelection), setVars = js.Any.fromFunction1(setVars), toggleSelected = js.Any.fromFunction1(toggleSelected), utils = utils)
  
    __obj.asInstanceOf[IRow]
  }
}

