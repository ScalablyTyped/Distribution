package typings
package atOracleOraclejetLib.ojdatagridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojDataGridNs {
  type ojBeforeCurrentCell[K] = stdLib.CustomEvent[atOracleOraclejetLib.Anon_CurrentCell[K]]
  type ojBeforeEdit[K, D] = stdLib.CustomEvent[atOracleOraclejetLib.Anon_CellContext[K, D]]
  type ojBeforeEditEnd[K, D] = stdLib.CustomEvent[atOracleOraclejetLib.Anon_CancelEdit[K, D]]
  type ojResize = stdLib.CustomEvent[atOracleOraclejetLib.Anon_Header]
  type ojScroll = stdLib.CustomEvent[atOracleOraclejetLib.Anon_PropNameScrollX]
  type ojSort = stdLib.CustomEvent[atOracleOraclejetLib.Anon_Ascending]
}
