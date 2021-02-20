package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.`oj-table-cell`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnIndexKey extends StObject {
  
  var columnIndex: Double = js.native
  
  var key: String = js.native
  
  var rowIndex: Double = js.native
  
  var subId: `oj-table-cell` = js.native
}
object ColumnIndexKey {
  
  @scala.inline
  def apply(columnIndex: Double, key: String, rowIndex: Double, subId: `oj-table-cell`): ColumnIndexKey = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnIndexKey]
  }
  
  @scala.inline
  implicit class ColumnIndexKeyMutableBuilder[Self <: ColumnIndexKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubId(value: `oj-table-cell`): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
  }
}
