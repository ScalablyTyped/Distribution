package typings.atOracleOraclejet.ojmasonrylayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojMasonryLayoutNs {
  import typings.atOracleOraclejet.Anon_Action
  import typings.atOracleOraclejet.Anon_ActionElement
  import typings.atOracleOraclejet.Anon_FromIndex
  import typings.atOracleOraclejet.Anon_FromIndexPropName
  import typings.atOracleOraclejet.Anon_IndexPropName
  import typings.atOracleOraclejet.Anon_PreviousSizeStyleClass
  import typings.atOracleOraclejet.Anon_PropNameTile
  import typings.std.CustomEvent

  type ojAnimateEnd = CustomEvent[Anon_Action]
  type ojAnimateStart = CustomEvent[Anon_ActionElement]
  type ojBeforeInsert = CustomEvent[Anon_IndexPropName]
  type ojBeforeRemove = CustomEvent[Anon_PropNameTile]
  type ojBeforeReorder = CustomEvent[Anon_FromIndex]
  type ojBeforeResize = CustomEvent[Anon_PreviousSizeStyleClass]
  type ojInsert = CustomEvent[Anon_IndexPropName]
  type ojRemove = CustomEvent[Anon_PropNameTile]
  type ojReorder = CustomEvent[Anon_FromIndexPropName]
  type ojResize = CustomEvent[Anon_PreviousSizeStyleClass]
}
