package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowKey[K]
  extends StObject
     with typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K] {
  
  var rowIndex: Double
  
  var rowKey: js.UndefOr[K] = js.undefined
}
object RowKey {
  
  inline def apply[K](rowIndex: Double): RowKey[K] = {
    val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowKey[K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowKey[?], K] (val x: Self & RowKey[K]) extends AnyVal {
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowKey(value: K): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
    
    inline def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
  }
}
