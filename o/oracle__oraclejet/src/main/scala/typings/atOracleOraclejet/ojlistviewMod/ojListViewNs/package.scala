package typings.atOracleOraclejet.ojlistviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojListViewNs {
  import typings.atOracleOraclejet.Anon_Action
  import typings.atOracleOraclejet.Anon_ActionElement
  import typings.atOracleOraclejet.Anon_ItemKey
  import typings.atOracleOraclejet.Anon_ItemKeyPreviousItem
  import typings.atOracleOraclejet.Anon_ItemPropName
  import typings.atOracleOraclejet.Anon_ItemsPosition
  import typings.atOracleOraclejet.Anon_ItemsPropName
  import typings.std.CustomEvent

  type ojAnimateEnd = CustomEvent[Anon_Action]
  type ojAnimateStart = CustomEvent[Anon_ActionElement]
  type ojBeforeCollapse[K] = CustomEvent[Anon_ItemKey[K]]
  type ojBeforeCurrentItem[K] = CustomEvent[Anon_ItemKeyPreviousItem[K]]
  type ojBeforeExpand[K] = CustomEvent[Anon_ItemKey[K]]
  type ojCollapse[K] = CustomEvent[Anon_ItemKey[K]]
  type ojCopy = CustomEvent[Anon_ItemsPropName]
  type ojCut = CustomEvent[Anon_ItemsPropName]
  type ojExpand[K] = CustomEvent[Anon_ItemKey[K]]
  type ojPaste = CustomEvent[Anon_ItemPropName]
  type ojReorder = CustomEvent[Anon_ItemsPosition]
}
