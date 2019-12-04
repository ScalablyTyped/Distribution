package typings.atOracleOraclejet.ojnavigationlistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojTabBar {
  import typings.atOracleOraclejet.Anon_Action
  import typings.atOracleOraclejet.Anon_ActionElement
  import typings.atOracleOraclejet.Anon_After
  import typings.atOracleOraclejet.Anon_FromItem
  import typings.atOracleOraclejet.Anon_ItemKeyPreviousItemPreviousKey
  import typings.atOracleOraclejet.Anon_ItemKeyPropName
  import typings.atOracleOraclejet.Anon_ItemKeyPropNameAny
  import typings.std.CustomEvent

  type ojAnimateEnd = CustomEvent[Anon_Action]
  type ojAnimateStart = CustomEvent[Anon_ActionElement]
  type ojBeforeCurrentItem = CustomEvent[Anon_ItemKeyPreviousItemPreviousKey]
  type ojBeforeDeselect = CustomEvent[Anon_FromItem]
  type ojBeforeRemove = CustomEvent[Anon_ItemKeyPropNameAny]
  type ojBeforeSelect = CustomEvent[Anon_ItemKeyPropName]
  type ojDeselect = CustomEvent[Anon_FromItem]
  type ojRemove = CustomEvent[Anon_ItemKeyPropNameAny]
  type ojReorder = CustomEvent[Anon_After]
}
