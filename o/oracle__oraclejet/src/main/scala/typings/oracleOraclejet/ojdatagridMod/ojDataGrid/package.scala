package typings.oracleOraclejet.ojdatagridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojDataGrid {
  type ojBeforeCurrentCell[K] = typings.std.CustomEvent[typings.oracleOraclejet.AnonCurrentCell[K]]
  type ojBeforeEdit[K, D] = typings.std.CustomEvent[typings.oracleOraclejet.AnonCellContext[K, D]]
  type ojBeforeEditEnd[K, D] = typings.std.CustomEvent[typings.oracleOraclejet.AnonCancelEdit[K, D]]
  type ojResize = typings.std.CustomEvent[typings.oracleOraclejet.AnonHeader]
  type ojScroll = typings.std.CustomEvent[typings.oracleOraclejet.AnonPropNameScrollX]
  type ojSort = typings.std.CustomEvent[typings.oracleOraclejet.AnonAscending]
}
