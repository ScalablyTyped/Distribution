package typings.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("microsoftTeams.registerOnThemeChangeHandler")
@js.native
object registerOnThemeChangeHandler extends js.Object {
  /**
    * Registers a handler for theme changes.
    * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
    * @param handler The handler to invoke when the user changes their theme.
    */
  def apply(handler: js.Function1[/* theme */ String, Unit]): Unit = js.native
}

