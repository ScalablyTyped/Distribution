package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRow extends StObject {
  
  def afterSelectionChange(): Unit = js.native
  
  def alternatingRowClass(): Unit = js.native
  
  def beforeSelectionChange(): Unit = js.native
  
  var config: IRowConfig = js.native
  
  def continueSelection(event: js.Any): Unit = js.native
  
  def copy(): IRow = js.native
  
  var cursor: String = js.native
  
  def ensureEntity(expected: js.Any): Unit = js.native
  
  var entity: js.Any = js.native
  
  def getProperty(path: String): js.Any = js.native
  
  var offsetTop: Double = js.native
  
  var rowDisplayIndex: Double = js.native
  
  var rowIndex: Double = js.native
  
  var selected: Boolean = js.native
  
  var selectionProvider: ISelectionProvider = js.native
  
  def setSelection(isSelected: Boolean): Unit = js.native
  
  def setVars(fromRow: IRow): Unit = js.native
  
  def toggleSelected(event: js.Any): Boolean = js.native
  
  var utils: js.Any = js.native
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
  implicit class IRowMutableBuilder[Self <: IRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterSelectionChange(value: () => Unit): Self = StObject.set(x, "afterSelectionChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAlternatingRowClass(value: () => Unit): Self = StObject.set(x, "alternatingRowClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeSelectionChange(value: () => Unit): Self = StObject.set(x, "beforeSelectionChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConfig(value: IRowConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueSelection(value: js.Any => Unit): Self = StObject.set(x, "continueSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopy(value: () => IRow): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnsureEntity(value: js.Any => Unit): Self = StObject.set(x, "ensureEntity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEntity(value: js.Any): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetProperty(value: String => js.Any): Self = StObject.set(x, "getProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDisplayIndex(value: Double): Self = StObject.set(x, "rowDisplayIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionProvider(value: ISelectionProvider): Self = StObject.set(x, "selectionProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetSelection(value: Boolean => Unit): Self = StObject.set(x, "setSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVars(value: IRow => Unit): Self = StObject.set(x, "setVars", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleSelected(value: js.Any => Boolean): Self = StObject.set(x, "toggleSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUtils(value: js.Any): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
  }
}
