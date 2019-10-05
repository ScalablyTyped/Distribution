package typings.ngDashGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRow extends js.Object {
  var config: IRowConfig
  var cursor: String
  var entity: js.Any
  var offsetTop: Double
  var rowDisplayIndex: Double
  var rowIndex: Double
  var selected: Boolean
  var selectionProvider: ISelectionProvider
  var utils: js.Any
  def afterSelectionChange(): Unit
  def alternatingRowClass(): Unit
  def beforeSelectionChange(): Unit
  def continueSelection(event: js.Any): Unit
  def copy(): IRow
  def ensureEntity(expected: js.Any): Unit
  def getProperty(path: String): js.Any
  def setSelection(isSelected: Boolean): Unit
  def setVars(fromRow: IRow): Unit
  def toggleSelected(event: js.Any): Boolean
}

object IRow {
  @scala.inline
  def apply(
    afterSelectionChange: () => Unit,
    alternatingRowClass: () => Unit,
    beforeSelectionChange: () => Unit,
    config: IRowConfig,
    continueSelection: js.Any => Unit,
    copy: () => IRow,
    cursor: String,
    ensureEntity: js.Any => Unit,
    entity: js.Any,
    getProperty: String => js.Any,
    offsetTop: Double,
    rowDisplayIndex: Double,
    rowIndex: Double,
    selected: Boolean,
    selectionProvider: ISelectionProvider,
    setSelection: Boolean => Unit,
    setVars: IRow => Unit,
    toggleSelected: js.Any => Boolean,
    utils: js.Any
  ): IRow = {
    val __obj = js.Dynamic.literal(afterSelectionChange = js.Any.fromFunction0(afterSelectionChange), alternatingRowClass = js.Any.fromFunction0(alternatingRowClass), beforeSelectionChange = js.Any.fromFunction0(beforeSelectionChange), config = config, continueSelection = js.Any.fromFunction1(continueSelection), copy = js.Any.fromFunction0(copy), cursor = cursor, ensureEntity = js.Any.fromFunction1(ensureEntity), entity = entity, getProperty = js.Any.fromFunction1(getProperty), offsetTop = offsetTop, rowDisplayIndex = rowDisplayIndex, rowIndex = rowIndex, selected = selected, selectionProvider = selectionProvider, setSelection = js.Any.fromFunction1(setSelection), setVars = js.Any.fromFunction1(setVars), toggleSelected = js.Any.fromFunction1(toggleSelected), utils = utils)
  
    __obj.asInstanceOf[IRow]
  }
}

