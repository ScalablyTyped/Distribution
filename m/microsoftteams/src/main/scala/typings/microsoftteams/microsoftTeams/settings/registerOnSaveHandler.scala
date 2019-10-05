package typings.microsoftteams.microsoftTeams.settings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("microsoftTeams.settings.registerOnSaveHandler")
@js.native
object registerOnSaveHandler extends js.Object {
  /**
    * Registers a handler for when the user attempts to save the settings. This handler should be used
    * to create or update the underlying resource powering the content.
    * The object passed to the handler must be used to notify whether to proceed with the save.
    * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
    * @param handler The handler to invoke when the user selects the save button.
    */
  def apply(handler: js.Function1[/* evt */ SaveEvent, Unit]): Unit = js.native
}

