package typings.openui5.anon

import typings.openui5.int
import typings.openui5.sapUiModelContextMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowContext extends StObject {
  
  /**
    * binding context of the row which has been clicked so that selection has been changed
    */
  var rowContext: js.UndefOr[default] = js.undefined
  
  /**
    * row index which has been clicked so that the selection has been changed (either selected or deselected)
    */
  var rowIndex: js.UndefOr[int] = js.undefined
  
  /**
    * array of row indices which selection has been changed (either selected or deselected)
    */
  var rowIndices: js.UndefOr[js.Array[int]] = js.undefined
  
  /**
    * indicator if "select all" function is used to select rows
    */
  var selectAll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * indicates that the event was fired due to an explicit user interaction like clicking the row header or
    * using the keyboard (SPACE or ENTER) to select a row or a range of rows.
    */
  var userInteraction: js.UndefOr[Boolean] = js.undefined
}
object RowContext {
  
  inline def apply(): RowContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowContext] (val x: Self) extends AnyVal {
    
    inline def setRowContext(value: default): Self = StObject.set(x, "rowContext", value.asInstanceOf[js.Any])
    
    inline def setRowContextUndefined: Self = StObject.set(x, "rowContext", js.undefined)
    
    inline def setRowIndex(value: int): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setRowIndices(value: js.Array[int]): Self = StObject.set(x, "rowIndices", value.asInstanceOf[js.Any])
    
    inline def setRowIndicesUndefined: Self = StObject.set(x, "rowIndices", js.undefined)
    
    inline def setRowIndicesVarargs(value: int*): Self = StObject.set(x, "rowIndices", js.Array(value*))
    
    inline def setSelectAll(value: Boolean): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
    
    inline def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
    
    inline def setUserInteraction(value: Boolean): Self = StObject.set(x, "userInteraction", value.asInstanceOf[js.Any])
    
    inline def setUserInteractionUndefined: Self = StObject.set(x, "userInteraction", js.undefined)
  }
}
