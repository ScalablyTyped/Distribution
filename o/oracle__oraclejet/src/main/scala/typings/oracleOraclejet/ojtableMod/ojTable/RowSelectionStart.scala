package typings.oracleOraclejet.ojtableMod.ojTable

import typings.oracleOraclejet.anon.RowNumber
import typings.oracleOraclejet.anon.`23`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typings.oracleOraclejet.anon.StartIndexRowNumber[K]
  - typings.oracleOraclejet.anon.StartKey23[K]
*/
trait RowSelectionStart[K] extends js.Object

object RowSelectionStart {
  @scala.inline
  def StartIndexRowNumber[K](startIndex: RowNumber, startKey: `23`[K] = null): RowSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    if (startKey != null) __obj.updateDynamic("startKey")(startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionStart[K]]
  }
  @scala.inline
  def StartKey23[K](startKey: `23`[K], startIndex: RowNumber = null): RowSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionStart[K]]
  }
}

