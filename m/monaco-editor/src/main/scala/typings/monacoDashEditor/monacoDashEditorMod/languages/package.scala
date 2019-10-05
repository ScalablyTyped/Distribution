package typings.monacoDashEditor.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object languages {
  import typings.monacoDashEditor.monacoDashEditorMod.Thenable
  import typings.std.RegExp

  type CharacterPair = js.Tuple2[String, String]
  type Definition = Location | (js.Array[Location | LocationLink])
  type IMonarchLanguageAction = IShortMonarchLanguageAction | IExpandedMonarchLanguageAction | (js.Array[IExpandedMonarchLanguageAction | IShortMonarchLanguageAction])
  type IMonarchLanguageRule = IShortMonarchLanguageRule1 | IShortMonarchLanguageRule2 | IExpandedMonarchLanguageRule
  type IShortMonarchLanguageAction = String
  type IShortMonarchLanguageRule1 = js.Tuple2[RegExp, IMonarchLanguageAction]
  type IShortMonarchLanguageRule2 = js.Tuple3[RegExp, IMonarchLanguageAction, String]
  type ProviderResult[T] = js.UndefOr[T | Null | (Thenable[js.UndefOr[T | Null]])]
}
