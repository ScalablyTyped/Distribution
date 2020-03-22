package typings.oracleOraclejet.ojtableMod.ojTable

import typings.oracleOraclejet.Anon23
import typings.oracleOraclejet.AnonRowNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typings.oracleOraclejet.AnonStartIndexAnonRowNumber[K]
  - typings.oracleOraclejet.AnonStartKeyAnon23[K]
*/
trait RowSelectionStart[K] extends js.Object

object RowSelectionStart {
  @scala.inline
  def AnonStartIndexAnonRowNumber[K](startIndex: AnonRowNumber, startKey: Anon23[K] = null): RowSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    if (startKey != null) __obj.updateDynamic("startKey")(startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionStart[K]]
  }
  @scala.inline
  def AnonStartKeyAnon23[K](startKey: Anon23[K], startIndex: AnonRowNumber = null): RowSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionStart[K]]
  }
}

