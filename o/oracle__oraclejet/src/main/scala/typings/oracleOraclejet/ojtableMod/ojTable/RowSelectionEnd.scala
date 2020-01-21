package typings.oracleOraclejet.ojtableMod.ojTable

import typings.oracleOraclejet.AnonRow
import typings.oracleOraclejet.AnonRowK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typings.oracleOraclejet.AnonEndIndexEndKeyAnonRow[K]
  - typings.oracleOraclejet.AnonEndIndexEndKeyAnonRowAnonRowK[K]
*/
trait RowSelectionEnd[K] extends js.Object

object RowSelectionEnd {
  @scala.inline
  def AnonEndIndexEndKeyAnonRow[K](endIndex: AnonRow, endKey: AnonRowK[K] = null): RowSelectionEnd[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    if (endKey != null) __obj.updateDynamic("endKey")(endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionEnd[K]]
  }
  @scala.inline
  def AnonEndIndexEndKeyAnonRowAnonRowK[K](endKey: AnonRowK[K], endIndex: AnonRow = null): RowSelectionEnd[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionEnd[K]]
  }
}

