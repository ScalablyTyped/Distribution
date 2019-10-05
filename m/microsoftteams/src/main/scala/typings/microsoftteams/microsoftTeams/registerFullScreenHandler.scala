package typings.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("microsoftTeams.registerFullScreenHandler")
@js.native
object registerFullScreenHandler extends js.Object {
  /**
    * Registers a handler for changes from or to full-screen view for a tab.
    * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
    * @param handler The handler to invoke when the user toggles full-screen view for a tab.
    */
  def apply(handler: js.Function1[/* isFullScreen */ Boolean, Unit]): Unit = js.native
}

