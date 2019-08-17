package typings.atOracleOraclejet.ojmenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojMenuNs {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atOracleOraclejet.Anon_ActionClose
  import typings.atOracleOraclejet.Anon_ActionCloseElement
  import typings.atOracleOraclejet.Anon_Event
  import typings.atOracleOraclejet.Anon_OpenOptions
  import typings.std.CustomEvent

  type ojAction = CustomEvent[StringDictionary[js.Any]]
  type ojAnimateEnd = CustomEvent[Anon_ActionClose]
  type ojAnimateStart = CustomEvent[Anon_ActionCloseElement]
  type ojBeforeOpen = CustomEvent[Anon_OpenOptions]
  type ojClose = CustomEvent[Anon_Event]
  type ojOpen = CustomEvent[Anon_Event]
}
