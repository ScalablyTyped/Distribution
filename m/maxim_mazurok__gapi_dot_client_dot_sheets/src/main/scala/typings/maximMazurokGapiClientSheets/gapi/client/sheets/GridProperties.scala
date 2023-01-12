package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridProperties extends StObject {
  
  /** The number of columns in the grid. */
  var columnCount: js.UndefOr[Double] = js.undefined
  
  /** True if the column grouping control toggle is shown after the group. */
  var columnGroupControlAfter: js.UndefOr[Boolean] = js.undefined
  
  /** The number of columns that are frozen in the grid. */
  var frozenColumnCount: js.UndefOr[Double] = js.undefined
  
  /** The number of rows that are frozen in the grid. */
  var frozenRowCount: js.UndefOr[Double] = js.undefined
  
  /** True if the grid isn't showing gridlines in the UI. */
  var hideGridlines: js.UndefOr[Boolean] = js.undefined
  
  /** The number of rows in the grid. */
  var rowCount: js.UndefOr[Double] = js.undefined
  
  /** True if the row grouping control toggle is shown after the group. */
  var rowGroupControlAfter: js.UndefOr[Boolean] = js.undefined
}
object GridProperties {
  
  inline def apply(): GridProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridProperties] (val x: Self) extends AnyVal {
    
    inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    inline def setColumnGroupControlAfter(value: Boolean): Self = StObject.set(x, "columnGroupControlAfter", value.asInstanceOf[js.Any])
    
    inline def setColumnGroupControlAfterUndefined: Self = StObject.set(x, "columnGroupControlAfter", js.undefined)
    
    inline def setFrozenColumnCount(value: Double): Self = StObject.set(x, "frozenColumnCount", value.asInstanceOf[js.Any])
    
    inline def setFrozenColumnCountUndefined: Self = StObject.set(x, "frozenColumnCount", js.undefined)
    
    inline def setFrozenRowCount(value: Double): Self = StObject.set(x, "frozenRowCount", value.asInstanceOf[js.Any])
    
    inline def setFrozenRowCountUndefined: Self = StObject.set(x, "frozenRowCount", js.undefined)
    
    inline def setHideGridlines(value: Boolean): Self = StObject.set(x, "hideGridlines", value.asInstanceOf[js.Any])
    
    inline def setHideGridlinesUndefined: Self = StObject.set(x, "hideGridlines", js.undefined)
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setRowGroupControlAfter(value: Boolean): Self = StObject.set(x, "rowGroupControlAfter", value.asInstanceOf[js.Any])
    
    inline def setRowGroupControlAfterUndefined: Self = StObject.set(x, "rowGroupControlAfter", js.undefined)
  }
}
