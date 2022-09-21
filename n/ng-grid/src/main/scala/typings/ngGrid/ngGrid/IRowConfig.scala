package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRowConfig extends StObject {
  
  def afterSelectionChangeCallback(): Unit
  
  def beforeSelectionChangeCallback(): Unit
  
  var enableCellSelection: Boolean
  
  var enableRowSelection: Boolean
  
  var jqueryUITheme: Boolean
  
  var rowClasses: js.Array[String]
  
  var rowHeight: Double
  
  var selectWithCheckboxOnly: Boolean
  
  var selectedItems: js.Array[Any]
}
object IRowConfig {
  
  inline def apply(
    afterSelectionChangeCallback: () => Unit,
    beforeSelectionChangeCallback: () => Unit,
    enableCellSelection: Boolean,
    enableRowSelection: Boolean,
    jqueryUITheme: Boolean,
    rowClasses: js.Array[String],
    rowHeight: Double,
    selectWithCheckboxOnly: Boolean,
    selectedItems: js.Array[Any]
  ): IRowConfig = {
    val __obj = js.Dynamic.literal(afterSelectionChangeCallback = js.Any.fromFunction0(afterSelectionChangeCallback), beforeSelectionChangeCallback = js.Any.fromFunction0(beforeSelectionChangeCallback), enableCellSelection = enableCellSelection.asInstanceOf[js.Any], enableRowSelection = enableRowSelection.asInstanceOf[js.Any], jqueryUITheme = jqueryUITheme.asInstanceOf[js.Any], rowClasses = rowClasses.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], selectWithCheckboxOnly = selectWithCheckboxOnly.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowConfig]
  }
  
  extension [Self <: IRowConfig](x: Self) {
    
    inline def setAfterSelectionChangeCallback(value: () => Unit): Self = StObject.set(x, "afterSelectionChangeCallback", js.Any.fromFunction0(value))
    
    inline def setBeforeSelectionChangeCallback(value: () => Unit): Self = StObject.set(x, "beforeSelectionChangeCallback", js.Any.fromFunction0(value))
    
    inline def setEnableCellSelection(value: Boolean): Self = StObject.set(x, "enableCellSelection", value.asInstanceOf[js.Any])
    
    inline def setEnableRowSelection(value: Boolean): Self = StObject.set(x, "enableRowSelection", value.asInstanceOf[js.Any])
    
    inline def setJqueryUITheme(value: Boolean): Self = StObject.set(x, "jqueryUITheme", value.asInstanceOf[js.Any])
    
    inline def setRowClasses(value: js.Array[String]): Self = StObject.set(x, "rowClasses", value.asInstanceOf[js.Any])
    
    inline def setRowClassesVarargs(value: String*): Self = StObject.set(x, "rowClasses", js.Array(value*))
    
    inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setSelectWithCheckboxOnly(value: Boolean): Self = StObject.set(x, "selectWithCheckboxOnly", value.asInstanceOf[js.Any])
    
    inline def setSelectedItems(value: js.Array[Any]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsVarargs(value: Any*): Self = StObject.set(x, "selectedItems", js.Array(value*))
  }
}
