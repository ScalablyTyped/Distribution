package typings.oracleOraclejet.ojtableMod.ojTable

import typings.oracleOraclejet.anon.`24`
import typings.oracleOraclejet.anon.`25`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
/* Rewritten from type alias, can be one of: 
  - typings.oracleOraclejet.anon.StartIndex24[K]
  - typings.oracleOraclejet.anon.StartKey25[K]
*/
trait RowSelectionStart[K] extends js.Object

object RowSelectionStart {
  @scala.inline
  def StartIndex24[K](startIndex: `24`): RowSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionStart[K]]
  }
  @scala.inline
  def StartKey25[K](startKey: `25`[K]): RowSelectionStart[K] = {
    val __obj = js.Dynamic.literal(startKey = startKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectionStart[K]]
  }
}

