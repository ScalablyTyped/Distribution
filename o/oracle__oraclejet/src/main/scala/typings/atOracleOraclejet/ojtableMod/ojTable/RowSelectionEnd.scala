package typings.atOracleOraclejet.ojtableMod.ojTable

import typings.atOracleOraclejet.Anon_Row
import typings.atOracleOraclejet.Anon_RowK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typings.atOracleOraclejet.Anon_EndIndexEndKeyAnonRow[K]
  - typings.atOracleOraclejet.Anon_EndIndexEndKeyAnonRowAnonRowK[K]
*/
trait RowSelectionEnd[K] extends js.Object

object RowSelectionEnd {
  @scala.inline
  def Anon_EndIndexEndKeyAnonRow[K](endIndex: Anon_Row, endKey: Anon_RowK[K] = null): RowSelectionEnd[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    if (endKey != null) __obj.updateDynamic("endKey")(endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionEnd[K]]
  }
  @scala.inline
  def Anon_EndIndexEndKeyAnonRowAnonRowK[K](endKey: Anon_RowK[K], endIndex: Anon_Row = null): RowSelectionEnd[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionEnd[K]]
  }
}

