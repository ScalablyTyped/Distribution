package typings.oracleOraclejet.ojlistviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojListView {
  type ojAnimateEnd = typings.std.CustomEvent[typings.oracleOraclejet.AnonAction]
  type ojAnimateStart = typings.std.CustomEvent[typings.oracleOraclejet.AnonElement]
  type ojBeforeCollapse[K] = typings.std.CustomEvent[typings.oracleOraclejet.AnonDictpropNameItem[K]]
  type ojBeforeCurrentItem[K] = typings.std.CustomEvent[typings.oracleOraclejet.AnonPreviousItem[K]]
  type ojBeforeExpand[K] = typings.std.CustomEvent[typings.oracleOraclejet.AnonDictpropNameItem[K]]
  type ojCollapse[K] = typings.std.CustomEvent[typings.oracleOraclejet.AnonDictpropNameItem[K]]
  type ojCopy = typings.std.CustomEvent[typings.oracleOraclejet.AnonDictpropNameItems]
  type ojCut = typings.std.CustomEvent[typings.oracleOraclejet.AnonDictpropNameItems]
  type ojExpand[K] = typings.std.CustomEvent[typings.oracleOraclejet.AnonDictpropNameItem[K]]
  type ojPaste = typings.std.CustomEvent[typings.oracleOraclejet.AnonDictpropNameStringAny]
  type ojReorder = typings.std.CustomEvent[typings.oracleOraclejet.AnonReference]
}
