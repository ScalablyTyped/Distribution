package typings.oracleOraclejet.ojtableMod.ojTable

import typings.oracleOraclejet.anon.`24`
import typings.oracleOraclejet.anon.`25`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typings.oracleOraclejet.anon.EndIndexEndKey[K]
  - typings.oracleOraclejet.anon.EndKey25[K]
*/
trait RowSelectionEnd[K] extends js.Object

object RowSelectionEnd {
  @scala.inline
  def EndIndexEndKey[K](endIndex: `24`): RowSelectionEnd[K] = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionEnd[K]]
  }
  @scala.inline
  def EndKey25[K](endKey: `25`[K]): RowSelectionEnd[K] = {
    val __obj = js.Dynamic.literal(endKey = endKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionEnd[K]]
  }
}

