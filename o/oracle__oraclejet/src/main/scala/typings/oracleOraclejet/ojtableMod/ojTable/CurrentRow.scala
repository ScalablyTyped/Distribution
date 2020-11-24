package typings.oracleOraclejet.ojtableMod.ojTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.oracleOraclejet.anon.RowKey[K]
  - typings.oracleOraclejet.anon.RowIndexRowKey[K]
*/
trait CurrentRow[K] extends js.Object
object CurrentRow {
  
  @scala.inline
  def RowKey[K](rowIndex: Double): CurrentRow[K] = {
    val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRow[K]]
  }
  
  @scala.inline
  def RowIndexRowKey[K](rowKey: K): CurrentRow[K] = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRow[K]]
  }
}
