package typings
package microsoftteamsLib.microsoftTeamsNs.settingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("microsoftTeams.settings")
@js.native
object ^ extends js.Object {
  /**
    * Gets the settings for the current instance.
    * @param callback The callback to invoke when the {@link Settings} object is retrieved.
    */
  def getSettings(callback: js.Function1[/* settings */ Settings, scala.Unit]): scala.Unit = js.native
  /**
    * Registers a handler for user attempts to remove content. This handler should be used
    * to remove the underlying resource powering the content.
    * The object passed to the handler must be used to indicate whether to proceed with the removal.
    * Only one handler may be registered at a time. Subsequent registrations will override the first.
    * @param handler The handler to invoke when the user selects the remove button.
    */
  def registerOnRemoveHandler(handler: js.Function1[/* evt */ RemoveEvent, scala.Unit]): scala.Unit = js.native
  /**
    * Registers a handler for when the user attempts to save the settings. This handler should be used
    * to create or update the underlying resource powering the content.
    * The object passed to the handler must be used to notify whether to proceed with the save.
    * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
    * @param handler The handler to invoke when the user selects the save button.
    */
  def registerOnSaveHandler(handler: js.Function1[/* evt */ SaveEvent, scala.Unit]): scala.Unit = js.native
  /**
    * Sets the settings for the current instance.
    * This is an asynchronous operation; calls to getSettings are not guaranteed to reflect the changed state.
    * @param settings The desired settings for this instance.
    */
  def setSettings(settings: Settings): scala.Unit = js.native
  /**
    * Sets the validity state for the settings.
    * The initial value is false, so the user cannot save the settings until this is called with true.
    * @param validityState Indicates whether the save or remove button is enabled for the user.
    */
  def setValidityState(validityState: scala.Boolean): scala.Unit = js.native
}

