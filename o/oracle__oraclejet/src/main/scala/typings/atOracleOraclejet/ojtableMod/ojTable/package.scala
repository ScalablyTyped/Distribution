package typings.atOracleOraclejet.ojtableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojTable {
  import typings.atOracleOraclejet.Anon_ActionAdd
  import typings.atOracleOraclejet.Anon_ActionAddElement
  import typings.atOracleOraclejet.Anon_AscendingDescending
  import typings.atOracleOraclejet.Anon_CancelEditPropName
  import typings.atOracleOraclejet.Anon_CurrentRow
  import typings.atOracleOraclejet.Anon_PropNameRowContext
  import typings.std.CustomEvent

  type ojAnimateEnd = CustomEvent[Anon_ActionAdd]
  type ojAnimateStart = CustomEvent[Anon_ActionAddElement]
  type ojBeforeCurrentRow[K] = CustomEvent[Anon_CurrentRow[K]]
  type ojBeforeRowEdit = CustomEvent[Anon_PropNameRowContext]
  type ojBeforeRowEditEnd = CustomEvent[Anon_CancelEditPropName]
  type ojSort = CustomEvent[Anon_AscendingDescending]
}
