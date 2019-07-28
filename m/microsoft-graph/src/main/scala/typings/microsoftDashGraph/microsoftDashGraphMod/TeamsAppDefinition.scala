package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAppDefinition extends Entity {
  // The name of the app provided by the app developer.
  var displayName: js.UndefOr[String] = js.undefined
  // The id from the Teams App manifest.
  var teamsAppId: js.UndefOr[String] = js.undefined
  // The version number of the application.
  var version: js.UndefOr[String] = js.undefined
}

object TeamsAppDefinition {
  @scala.inline
  def apply(displayName: String = null, id: String = null, teamsAppId: String = null, version: String = null): TeamsAppDefinition = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (teamsAppId != null) __obj.updateDynamic("teamsAppId")(teamsAppId)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[TeamsAppDefinition]
  }
}

