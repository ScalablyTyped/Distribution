package typings.microsoftteams.microsoftTeams.settings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("microsoftTeams.settings.setSettings")
@js.native
object setSettings extends js.Object {
  /**
    * Sets the settings for the current instance.
    * This is an asynchronous operation; calls to getSettings are not guaranteed to reflect the changed state.
    * @param settings The desired settings for this instance.
    */
  def apply(settings: Settings): Unit = js.native
}

