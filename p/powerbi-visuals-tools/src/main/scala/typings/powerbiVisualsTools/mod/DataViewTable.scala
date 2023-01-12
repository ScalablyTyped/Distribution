package typings.powerbiVisualsTools.mod

import typings.powerbiVisualsTools.mod.data.ISQExpr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewTable extends StObject {
  
  var columns: js.Array[DataViewMetadataColumn]
  
  var identity: js.UndefOr[js.Array[DataViewScopeIdentity]] = js.undefined
  
  /** The set of expressions that define the identity for rows of the table.  This must match items in the DataViewScopeIdentity in the identity. */
  var identityFields: js.UndefOr[js.Array[ISQExpr]] = js.undefined
  
  var rows: js.UndefOr[js.Array[DataViewTableRow]] = js.undefined
  
  var totals: js.UndefOr[js.Array[PrimitiveValue]] = js.undefined
}
object DataViewTable {
  
  inline def apply(columns: js.Array[DataViewMetadataColumn]): DataViewTable = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewTable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataViewTable] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: js.Array[DataViewMetadataColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: DataViewMetadataColumn*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setIdentity(value: js.Array[DataViewScopeIdentity]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityFields(value: js.Array[ISQExpr]): Self = StObject.set(x, "identityFields", value.asInstanceOf[js.Any])
    
    inline def setIdentityFieldsUndefined: Self = StObject.set(x, "identityFields", js.undefined)
    
    inline def setIdentityFieldsVarargs(value: ISQExpr*): Self = StObject.set(x, "identityFields", js.Array(value*))
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setIdentityVarargs(value: DataViewScopeIdentity*): Self = StObject.set(x, "identity", js.Array(value*))
    
    inline def setRows(value: js.Array[DataViewTableRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: DataViewTableRow*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setTotals(value: js.Array[PrimitiveValue]): Self = StObject.set(x, "totals", value.asInstanceOf[js.Any])
    
    inline def setTotalsUndefined: Self = StObject.set(x, "totals", js.undefined)
    
    inline def setTotalsVarargs(value: PrimitiveValue*): Self = StObject.set(x, "totals", js.Array(value*))
  }
}
