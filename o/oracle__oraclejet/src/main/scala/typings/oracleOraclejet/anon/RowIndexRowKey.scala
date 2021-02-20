package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowIndexRowKey[K]
  extends typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K] {
  
  var rowIndex: js.UndefOr[Double] = js.native
  
  var rowKey: K = js.native
}
object RowIndexRowKey {
  
  @scala.inline
  def apply[K](rowKey: K): RowIndexRowKey[K] = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowIndexRowKey[K]]
  }
  
  @scala.inline
  implicit class RowIndexRowKeyMutableBuilder[Self <: RowIndexRowKey[_], K] (val x: Self with RowIndexRowKey[K]) extends AnyVal {
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    @scala.inline
    def setRowKey(value: K): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
  }
}
