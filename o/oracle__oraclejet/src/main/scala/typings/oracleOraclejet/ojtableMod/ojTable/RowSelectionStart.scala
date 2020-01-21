package typings.oracleOraclejet.ojtableMod.ojTable

import typings.oracleOraclejet.AnonRow
import typings.oracleOraclejet.AnonRowK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typings.oracleOraclejet.AnonStartIndexStartKeyAnonRow[K]
  - typings.oracleOraclejet.AnonStartIndexStartKeyAnonRowAnonRowK[K]
*/
trait RowSelectionStart[K] extends js.Object

object RowSelectionStart {
  @scala.inline
  def AnonStartIndexStartKeyAnonRow[K](startIndex: AnonRow, startKey: AnonRowK[K] = null): RowSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    if (startKey != null) __obj.updateDynamic("startKey")(startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionStart[K]]
  }
  @scala.inline
  def AnonStartIndexStartKeyAnonRowAnonRowK[K](startKey: AnonRowK[K], startIndex: AnonRow = null): RowSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionStart[K]]
  }
}

