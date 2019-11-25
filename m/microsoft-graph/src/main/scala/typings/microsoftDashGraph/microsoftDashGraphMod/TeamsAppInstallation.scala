package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAppInstallation extends Entity {
  // The app that is installed.
  var teamsApp: js.UndefOr[TeamsApp] = js.undefined
  // The details of this version of the app.
  var teamsAppDefinition: js.UndefOr[TeamsAppDefinition] = js.undefined
}

object TeamsAppInstallation {
  @scala.inline
  def apply(id: String = null, teamsApp: TeamsApp = null, teamsAppDefinition: TeamsAppDefinition = null): TeamsAppInstallation = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (teamsApp != null) __obj.updateDynamic("teamsApp")(teamsApp.asInstanceOf[js.Any])
    if (teamsAppDefinition != null) __obj.updateDynamic("teamsAppDefinition")(teamsAppDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAppInstallation]
  }
}

