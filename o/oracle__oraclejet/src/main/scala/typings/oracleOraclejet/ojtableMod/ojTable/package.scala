package typings.oracleOraclejet.ojtableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojTable {
  type ojAnimateEnd = typings.std.CustomEvent[typings.oracleOraclejet.AnonActionAdd]
  type ojAnimateStart = typings.std.CustomEvent[typings.oracleOraclejet.AnonActionAddElement]
  type ojBeforeCurrentRow[K] = typings.std.CustomEvent[typings.oracleOraclejet.AnonCurrentRow[K]]
  type ojBeforeRowEdit = typings.std.CustomEvent[typings.oracleOraclejet.AnonPropNameRowContext]
  type ojBeforeRowEditEnd = typings.std.CustomEvent[typings.oracleOraclejet.AnonCancelEditPropName]
  type ojSort = typings.std.CustomEvent[typings.oracleOraclejet.AnonAscendingDescending]
}
