package typings.atOracleOraclejet.ojtableMod.ojTable

import typings.atOracleOraclejet.Anon_ColumnK
import typings.atOracleOraclejet.Anon_ColumnNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typings.atOracleOraclejet.Anon_StartIndex[K]
  - typings.atOracleOraclejet.Anon_StartIndexStartKey[K]
*/
trait ColumnSelectionStart[K] extends js.Object

object ColumnSelectionStart {
  @scala.inline
  def Anon_StartIndex[K](startIndex: Anon_ColumnNumber, startKey: Anon_ColumnK[K] = null): ColumnSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    if (startKey != null) __obj.updateDynamic("startKey")(startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSelectionStart[K]]
  }
  @scala.inline
  def Anon_StartIndexStartKey[K](startKey: Anon_ColumnK[K], startIndex: Anon_ColumnNumber = null): ColumnSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSelectionStart[K]]
  }
}

