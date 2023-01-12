package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowIndexRowKey[K]
  extends StObject
     with typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K] {
  
  var rowIndex: js.UndefOr[Double] = js.undefined
  
  var rowKey: K
}
object RowIndexRowKey {
  
  inline def apply[K](rowKey: K): RowIndexRowKey[K] = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowIndexRowKey[K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowIndexRowKey[?], K] (val x: Self & RowIndexRowKey[K]) extends AnyVal {
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setRowKey(value: K): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
  }
}
