package typings.oracleOraclejet.ojtableMod.ojTable

import typings.oracleOraclejet.Anon23
import typings.oracleOraclejet.AnonRowNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typings.oracleOraclejet.AnonEndIndexEndKey[K]
  - typings.oracleOraclejet.AnonEndIndexAnonRowNumber[K]
*/
trait RowSelectionEnd[K] extends js.Object

object RowSelectionEnd {
  @scala.inline
  def AnonEndIndexEndKey[K](endIndex: AnonRowNumber, endKey: Anon23[K] = null): RowSelectionEnd[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    if (endKey != null) __obj.updateDynamic("endKey")(endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionEnd[K]]
  }
  @scala.inline
  def AnonEndIndexAnonRowNumber[K](endKey: Anon23[K], endIndex: AnonRowNumber = null): RowSelectionEnd[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionEnd[K]]
  }
}

