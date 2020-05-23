package typings.oracleOraclejet.ojlistviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojListView {
  type ojAnimateEnd = typings.std.CustomEvent[typings.oracleOraclejet.anon.Action]
  type ojAnimateStart = typings.std.CustomEvent[typings.oracleOraclejet.anon.Element]
  type ojBeforeCollapse[K] = typings.std.CustomEvent[typings.oracleOraclejet.anon.DictpropNameItem[K]]
  type ojBeforeCurrentItem[K] = typings.std.CustomEvent[typings.oracleOraclejet.anon.PreviousItem[K]]
  type ojBeforeExpand[K] = typings.std.CustomEvent[typings.oracleOraclejet.anon.DictpropNameItem[K]]
  type ojCollapse[K] = typings.std.CustomEvent[typings.oracleOraclejet.anon.DictpropNameItem[K]]
  type ojCopy = typings.std.CustomEvent[typings.oracleOraclejet.anon.DictpropNameItems]
  type ojCut = typings.std.CustomEvent[typings.oracleOraclejet.anon.DictpropNameItems]
  type ojExpand[K] = typings.std.CustomEvent[typings.oracleOraclejet.anon.DictpropNameItem[K]]
  type ojPaste = typings.std.CustomEvent[typings.oracleOraclejet.anon.DictpropNameStringAny]
  type ojReorder = typings.std.CustomEvent[typings.oracleOraclejet.anon.Reference]
}
