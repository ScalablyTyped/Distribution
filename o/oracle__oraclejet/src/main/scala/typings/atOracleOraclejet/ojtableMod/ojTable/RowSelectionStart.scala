package typings.atOracleOraclejet.ojtableMod.ojTable

import typings.atOracleOraclejet.Anon_Row
import typings.atOracleOraclejet.Anon_RowK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typings.atOracleOraclejet.Anon_StartIndexStartKeyAnonRow[K]
  - typings.atOracleOraclejet.Anon_StartIndexStartKeyAnonRowAnonRowK[K]
*/
trait RowSelectionStart[K] extends js.Object

object RowSelectionStart {
  @scala.inline
  def Anon_StartIndexStartKeyAnonRow[K](startIndex: Anon_Row, startKey: Anon_RowK[K] = null): RowSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    if (startKey != null) __obj.updateDynamic("startKey")(startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionStart[K]]
  }
  @scala.inline
  def Anon_StartIndexStartKeyAnonRowAnonRowK[K](startKey: Anon_RowK[K], startIndex: Anon_Row = null): RowSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionStart[K]]
  }
}

