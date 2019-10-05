package typings.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("microsoftTeams.getTabInstances")
@js.native
object getTabInstances extends js.Object {
  /**
    * Allows an app to retrieve for this user tabs that are owned by this app.
    * If no TabInstanceParameters are passed, the app defaults to favorite teams and favorite channels.
    * @param callback The callback to invoke when the {@link TabInstanceParameters} object is retrieved.
    * @param tabInstanceParameters OPTIONAL Flags that specify whether to scope call to favorite teams or channels.
    */
  def apply(callback: js.Function1[/* tabInfo */ TabInformation, Unit]): Unit = js.native
  def apply(
    callback: js.Function1[/* tabInfo */ TabInformation, Unit],
    tabInstanceParameters: TabInstanceParameters
  ): Unit = js.native
}

