package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowKey[K]
  extends typings.oracleOraclejet.ojtableMod.ojTable.CurrentRow[K] {
  
  var rowIndex: Double = js.native
  
  var rowKey: js.UndefOr[K] = js.native
}
object RowKey {
  
  @scala.inline
  def apply[K](rowIndex: Double): RowKey[K] = {
    val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowKey[K]]
  }
  
  @scala.inline
  implicit class RowKeyMutableBuilder[Self <: RowKey[_], K] (val x: Self with RowKey[K]) extends AnyVal {
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowKey(value: K): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
  }
}
