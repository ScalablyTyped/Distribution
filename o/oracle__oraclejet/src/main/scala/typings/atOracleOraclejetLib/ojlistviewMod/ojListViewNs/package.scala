package typings
package atOracleOraclejetLib.ojlistviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojListViewNs {
  type ojAnimateEnd = stdLib.CustomEvent[atOracleOraclejetLib.Anon_Action]
  type ojAnimateStart = stdLib.CustomEvent[atOracleOraclejetLib.Anon_ActionElement]
  type ojBeforeCollapse[K] = stdLib.CustomEvent[atOracleOraclejetLib.Anon_ItemKey[K]]
  type ojBeforeCurrentItem[K] = stdLib.CustomEvent[atOracleOraclejetLib.Anon_ItemKeyPreviousItem[K]]
  type ojBeforeExpand[K] = stdLib.CustomEvent[atOracleOraclejetLib.Anon_ItemKey[K]]
  type ojCollapse[K] = stdLib.CustomEvent[atOracleOraclejetLib.Anon_ItemKey[K]]
  type ojCopy = stdLib.CustomEvent[atOracleOraclejetLib.Anon_ItemsPropName]
  type ojCut = stdLib.CustomEvent[atOracleOraclejetLib.Anon_ItemsPropName]
  type ojExpand[K] = stdLib.CustomEvent[atOracleOraclejetLib.Anon_ItemKey[K]]
  type ojPaste = stdLib.CustomEvent[atOracleOraclejetLib.Anon_ItemPropName]
  type ojReorder = stdLib.CustomEvent[atOracleOraclejetLib.Anon_ItemsPosition]
}
