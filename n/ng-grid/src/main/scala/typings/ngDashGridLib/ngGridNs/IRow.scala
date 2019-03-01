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
    afterSelectionChange: js.Function0[scala.Unit],
    alternatingRowClass: js.Function0[scala.Unit],
    beforeSelectionChange: js.Function0[scala.Unit],
    config: IRowConfig,
    continueSelection: js.Function1[js.Any, scala.Unit],
    copy: js.Function0[IRow],
    cursor: java.lang.String,
    ensureEntity: js.Function1[js.Any, scala.Unit],
    entity: js.Any,
    getProperty: js.Function1[java.lang.String, js.Any],
    offsetTop: scala.Double,
    rowDisplayIndex: scala.Double,
    rowIndex: scala.Double,
    selected: scala.Boolean,
    selectionProvider: ISelectionProvider,
    setSelection: js.Function1[scala.Boolean, scala.Unit],
    setVars: js.Function1[IRow, scala.Unit],
    toggleSelected: js.Function1[js.Any, scala.Boolean],
    utils: js.Any
  ): IRow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterSelectionChange")(afterSelectionChange)
    __obj.updateDynamic("alternatingRowClass")(alternatingRowClass)
    __obj.updateDynamic("beforeSelectionChange")(beforeSelectionChange)
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("continueSelection")(continueSelection)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("cursor")(cursor)
    __obj.updateDynamic("ensureEntity")(ensureEntity)
    __obj.updateDynamic("entity")(entity)
    __obj.updateDynamic("getProperty")(getProperty)
    __obj.updateDynamic("offsetTop")(offsetTop)
    __obj.updateDynamic("rowDisplayIndex")(rowDisplayIndex)
    __obj.updateDynamic("rowIndex")(rowIndex)
    __obj.updateDynamic("selected")(selected)
    __obj.updateDynamic("selectionProvider")(selectionProvider)
    __obj.updateDynamic("setSelection")(setSelection)
    __obj.updateDynamic("setVars")(setVars)
    __obj.updateDynamic("toggleSelected")(toggleSelected)
    __obj.updateDynamic("utils")(utils)
    __obj.asInstanceOf[IRow]
  }
}

