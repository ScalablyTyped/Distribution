package typings.microsoftteams.microsoftTeams.settings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("microsoftTeams.settings.setValidityState")
@js.native
object setValidityState extends js.Object {
  /**
    * Sets the validity state for the settings.
    * The initial value is false, so the user cannot save the settings until this is called with true.
    * @param validityState Indicates whether the save or remove button is enabled for the user.
    */
  def apply(validityState: Boolean): Unit = js.native
}

