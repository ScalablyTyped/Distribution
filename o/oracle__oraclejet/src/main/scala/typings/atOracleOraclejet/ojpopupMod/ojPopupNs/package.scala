package typings.atOracleOraclejet.ojpopupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojPopupNs {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atOracleOraclejet.Anon_ActionClose
  import typings.atOracleOraclejet.Anon_ActionCloseElement
  import typings.std.CustomEvent

  type ojAnimateEnd = CustomEvent[Anon_ActionClose]
  type ojAnimateStart = CustomEvent[Anon_ActionCloseElement]
  type ojBeforeClose = CustomEvent[StringDictionary[js.Any]]
  type ojBeforeOpen = CustomEvent[StringDictionary[js.Any]]
  type ojClose = CustomEvent[StringDictionary[js.Any]]
  type ojFocus = CustomEvent[StringDictionary[js.Any]]
  type ojOpen = CustomEvent[StringDictionary[js.Any]]
}
