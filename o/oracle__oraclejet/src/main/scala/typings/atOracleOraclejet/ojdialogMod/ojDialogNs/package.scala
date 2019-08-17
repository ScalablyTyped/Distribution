package typings.atOracleOraclejet.ojdialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojDialogNs {
  import typings.atOracleOraclejet.Anon_ActionClose
  import typings.atOracleOraclejet.Anon_ActionCloseElement
  import typings.atOracleOraclejet.Anon_Event
  import typings.std.CustomEvent

  type ojAnimateEnd = CustomEvent[Anon_ActionClose]
  type ojAnimateStart = CustomEvent[Anon_ActionCloseElement]
  type ojBeforeClose = CustomEvent[Anon_Event]
  type ojBeforeOpen = CustomEvent[Anon_Event]
  type ojClose = CustomEvent[Anon_Event]
  type ojFocus = CustomEvent[Anon_Event]
  type ojOpen = CustomEvent[Anon_Event]
  type ojResize = CustomEvent[Anon_Event]
  type ojResizeStart = CustomEvent[Anon_Event]
  type ojResizeStop = CustomEvent[Anon_Event]
}
