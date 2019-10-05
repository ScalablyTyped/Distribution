package typings.microsoftteams.microsoftTeams.settings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("microsoftTeams.settings.registerOnRemoveHandler")
@js.native
object registerOnRemoveHandler extends js.Object {
  /**
    * Registers a handler for user attempts to remove content. This handler should be used
    * to remove the underlying resource powering the content.
    * The object passed to the handler must be used to indicate whether to proceed with the removal.
    * Only one handler may be registered at a time. Subsequent registrations will override the first.
    * @param handler The handler to invoke when the user selects the remove button.
    */
  def apply(handler: js.Function1[/* evt */ RemoveEvent, Unit]): Unit = js.native
}

