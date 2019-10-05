package typings.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("microsoftTeams.getMruTabInstances")
@js.native
object getMruTabInstances extends js.Object {
  /**
    * Allows an app to retrieve the most recently used tabs for this user.
    * @param callback The callback to invoke when the {@link TabInformation} object is retrieved.
    * @param tabInstanceParameters OPTIONAL Ignored, kept for future use
    */
  def apply(callback: js.Function1[/* tabInfo */ TabInformation, Unit]): Unit = js.native
  def apply(
    callback: js.Function1[/* tabInfo */ TabInformation, Unit],
    tabInstanceParameters: TabInstanceParameters
  ): Unit = js.native
}

