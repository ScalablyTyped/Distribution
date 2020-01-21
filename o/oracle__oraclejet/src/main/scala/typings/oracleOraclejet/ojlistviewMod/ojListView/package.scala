package typings.oracleOraclejet.ojlistviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojListView {
  type ojAnimateEnd = typings.std.CustomEvent[typings.oracleOraclejet.AnonAction]
  type ojAnimateStart = typings.std.CustomEvent[typings.oracleOraclejet.AnonActionElement]
  type ojBeforeCollapse[K] = typings.std.CustomEvent[typings.oracleOraclejet.AnonItemKey[K]]
  type ojBeforeCurrentItem[K] = typings.std.CustomEvent[typings.oracleOraclejet.AnonItemKeyPreviousItem[K]]
  type ojBeforeExpand[K] = typings.std.CustomEvent[typings.oracleOraclejet.AnonItemKey[K]]
  type ojCollapse[K] = typings.std.CustomEvent[typings.oracleOraclejet.AnonItemKey[K]]
  type ojCopy = typings.std.CustomEvent[typings.oracleOraclejet.AnonItemsPropName]
  type ojCut = typings.std.CustomEvent[typings.oracleOraclejet.AnonItemsPropName]
  type ojExpand[K] = typings.std.CustomEvent[typings.oracleOraclejet.AnonItemKey[K]]
  type ojPaste = typings.std.CustomEvent[typings.oracleOraclejet.AnonItemPropName]
  type ojReorder = typings.std.CustomEvent[typings.oracleOraclejet.AnonItemsPosition]
}
