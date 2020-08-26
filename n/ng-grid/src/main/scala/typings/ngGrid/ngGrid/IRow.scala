package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRow extends js.Object {
  var config: IRowConfig = js.native
  var cursor: String = js.native
  var entity: js.Any = js.native
  var offsetTop: Double = js.native
  var rowDisplayIndex: Double = js.native
  var rowIndex: Double = js.native
  var selected: Boolean = js.native
  var selectionProvider: ISelectionProvider = js.native
  var utils: js.Any = js.native
  def afterSelectionChange(): Unit = js.native
  def alternatingRowClass(): Unit = js.native
  def beforeSelectionChange(): Unit = js.native
  def continueSelection(event: js.Any): Unit = js.native
  def copy(): IRow = js.native
  def ensureEntity(expected: js.Any): Unit = js.native
  def getProperty(path: String): js.Any = js.native
  def setSelection(isSelected: Boolean): Unit = js.native
  def setVars(fromRow: IRow): Unit = js.native
  def toggleSelected(event: js.Any): Boolean = js.native
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
    val __obj = js.Dynamic.literal(afterSelectionChange = js.Any.fromFunction0(afterSelectionChange), alternatingRowClass = js.Any.fromFunction0(alternatingRowClass), beforeSelectionChange = js.Any.fromFunction0(beforeSelectionChange), config = config.asInstanceOf[js.Any], continueSelection = js.Any.fromFunction1(continueSelection), copy = js.Any.fromFunction0(copy), cursor = cursor.asInstanceOf[js.Any], ensureEntity = js.Any.fromFunction1(ensureEntity), entity = entity.asInstanceOf[js.Any], getProperty = js.Any.fromFunction1(getProperty), offsetTop = offsetTop.asInstanceOf[js.Any], rowDisplayIndex = rowDisplayIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectionProvider = selectionProvider.asInstanceOf[js.Any], setSelection = js.Any.fromFunction1(setSelection), setVars = js.Any.fromFunction1(setVars), toggleSelected = js.Any.fromFunction1(toggleSelected), utils = utils.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRow]
  }
  @scala.inline
  implicit class IRowOps[Self <: IRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterSelectionChange(value: () => Unit): Self = this.set("afterSelectionChange", js.Any.fromFunction0(value))
    @scala.inline
    def setAlternatingRowClass(value: () => Unit): Self = this.set("alternatingRowClass", js.Any.fromFunction0(value))
    @scala.inline
    def setBeforeSelectionChange(value: () => Unit): Self = this.set("beforeSelectionChange", js.Any.fromFunction0(value))
    @scala.inline
    def setConfig(value: IRowConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setContinueSelection(value: js.Any => Unit): Self = this.set("continueSelection", js.Any.fromFunction1(value))
    @scala.inline
    def setCopy(value: () => IRow): Self = this.set("copy", js.Any.fromFunction0(value))
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnsureEntity(value: js.Any => Unit): Self = this.set("ensureEntity", js.Any.fromFunction1(value))
    @scala.inline
    def setEntity(value: js.Any): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetProperty(value: String => js.Any): Self = this.set("getProperty", js.Any.fromFunction1(value))
    @scala.inline
    def setOffsetTop(value: Double): Self = this.set("offsetTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowDisplayIndex(value: Double): Self = this.set("rowDisplayIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionProvider(value: ISelectionProvider): Self = this.set("selectionProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetSelection(value: Boolean => Unit): Self = this.set("setSelection", js.Any.fromFunction1(value))
    @scala.inline
    def setSetVars(value: IRow => Unit): Self = this.set("setVars", js.Any.fromFunction1(value))
    @scala.inline
    def setToggleSelected(value: js.Any => Boolean): Self = this.set("toggleSelected", js.Any.fromFunction1(value))
    @scala.inline
    def setUtils(value: js.Any): Self = this.set("utils", value.asInstanceOf[js.Any])
  }
  
}

