package typings.atOracleOraclejet.ojdatagridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojDataGridNs {
  import typings.atOracleOraclejet.Anon_Ascending
  import typings.atOracleOraclejet.Anon_CancelEdit
  import typings.atOracleOraclejet.Anon_CellContext
  import typings.atOracleOraclejet.Anon_CurrentCell
  import typings.atOracleOraclejet.Anon_Header
  import typings.atOracleOraclejet.Anon_PropNameScrollX
  import typings.std.CustomEvent

  type ojBeforeCurrentCell[K] = CustomEvent[Anon_CurrentCell[K]]
  type ojBeforeEdit[K, D] = CustomEvent[Anon_CellContext[K, D]]
  type ojBeforeEditEnd[K, D] = CustomEvent[Anon_CancelEdit[K, D]]
  type ojResize = CustomEvent[Anon_Header]
  type ojScroll = CustomEvent[Anon_PropNameScrollX]
  type ojSort = CustomEvent[Anon_Ascending]
}
