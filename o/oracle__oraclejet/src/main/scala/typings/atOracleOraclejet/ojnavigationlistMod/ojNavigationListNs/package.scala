package typings.atOracleOraclejet.ojnavigationlistMod

import typings.atOracleOraclejet.Anon_Action
import typings.atOracleOraclejet.Anon_ActionElement
import typings.atOracleOraclejet.Anon_ItemKeyPreviousItemPreviousKey
import typings.atOracleOraclejet.Anon_ItemKeyPropName
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojNavigationListNs {
  type ojAnimateEnd = CustomEvent[Anon_Action]
  type ojAnimateStart = CustomEvent[Anon_ActionElement]
  type ojBeforeCollapse = CustomEvent[Anon_ItemKeyPropName]
  type ojBeforeCurrentItem = CustomEvent[Anon_ItemKeyPreviousItemPreviousKey]
  type ojBeforeExpand = CustomEvent[Anon_ItemKeyPropName]
  type ojBeforeSelect = CustomEvent[Anon_ItemKeyPropName]
  type ojCollapse = CustomEvent[Anon_ItemKeyPropName]
  type ojExpand = CustomEvent[Anon_ItemKeyPropName]
}
