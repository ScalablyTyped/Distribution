package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRow extends StObject {
  
  def afterSelectionChange(): Unit
  
  def alternatingRowClass(): Unit
  
  def beforeSelectionChange(): Unit
  
  var config: IRowConfig
  
  def continueSelection(event: Any): Unit
  
  def copy(): IRow
  
  var cursor: String
  
  def ensureEntity(expected: Any): Unit
  
  var entity: Any
  
  def getProperty(path: String): Any
  
  var offsetTop: Double
  
  var rowDisplayIndex: Double
  
  var rowIndex: Double
  
  var selected: Boolean
  
  var selectionProvider: ISelectionProvider
  
  def setSelection(isSelected: Boolean): Unit
  
  def setVars(fromRow: IRow): Unit
  
  def toggleSelected(event: Any): Boolean
  
  var utils: Any
}
object IRow {
  
  inline def apply(
    afterSelectionChange: () => Unit,
    alternatingRowClass: () => Unit,
    beforeSelectionChange: () => Unit,
    config: IRowConfig,
    continueSelection: Any => Unit,
    copy: () => IRow,
    cursor: String,
    ensureEntity: Any => Unit,
    entity: Any,
    getProperty: String => Any,
    offsetTop: Double,
    rowDisplayIndex: Double,
    rowIndex: Double,
    selected: Boolean,
    selectionProvider: ISelectionProvider,
    setSelection: Boolean => Unit,
    setVars: IRow => Unit,
    toggleSelected: Any => Boolean,
    utils: Any
  ): IRow = {
    val __obj = js.Dynamic.literal(afterSelectionChange = js.Any.fromFunction0(afterSelectionChange), alternatingRowClass = js.Any.fromFunction0(alternatingRowClass), beforeSelectionChange = js.Any.fromFunction0(beforeSelectionChange), config = config.asInstanceOf[js.Any], continueSelection = js.Any.fromFunction1(continueSelection), copy = js.Any.fromFunction0(copy), cursor = cursor.asInstanceOf[js.Any], ensureEntity = js.Any.fromFunction1(ensureEntity), entity = entity.asInstanceOf[js.Any], getProperty = js.Any.fromFunction1(getProperty), offsetTop = offsetTop.asInstanceOf[js.Any], rowDisplayIndex = rowDisplayIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectionProvider = selectionProvider.asInstanceOf[js.Any], setSelection = js.Any.fromFunction1(setSelection), setVars = js.Any.fromFunction1(setVars), toggleSelected = js.Any.fromFunction1(toggleSelected), utils = utils.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRow] (val x: Self) extends AnyVal {
    
    inline def setAfterSelectionChange(value: () => Unit): Self = StObject.set(x, "afterSelectionChange", js.Any.fromFunction0(value))
    
    inline def setAlternatingRowClass(value: () => Unit): Self = StObject.set(x, "alternatingRowClass", js.Any.fromFunction0(value))
    
    inline def setBeforeSelectionChange(value: () => Unit): Self = StObject.set(x, "beforeSelectionChange", js.Any.fromFunction0(value))
    
    inline def setConfig(value: IRowConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setContinueSelection(value: Any => Unit): Self = StObject.set(x, "continueSelection", js.Any.fromFunction1(value))
    
    inline def setCopy(value: () => IRow): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setEnsureEntity(value: Any => Unit): Self = StObject.set(x, "ensureEntity", js.Any.fromFunction1(value))
    
    inline def setEntity(value: Any): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setGetProperty(value: String => Any): Self = StObject.set(x, "getProperty", js.Any.fromFunction1(value))
    
    inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    inline def setRowDisplayIndex(value: Double): Self = StObject.set(x, "rowDisplayIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectionProvider(value: ISelectionProvider): Self = StObject.set(x, "selectionProvider", value.asInstanceOf[js.Any])
    
    inline def setSetSelection(value: Boolean => Unit): Self = StObject.set(x, "setSelection", js.Any.fromFunction1(value))
    
    inline def setSetVars(value: IRow => Unit): Self = StObject.set(x, "setVars", js.Any.fromFunction1(value))
    
    inline def setToggleSelected(value: Any => Boolean): Self = StObject.set(x, "toggleSelected", js.Any.fromFunction1(value))
    
    inline def setUtils(value: Any): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
  }
}
