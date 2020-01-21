package typings.microsoftGraph.mod

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
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (teamsAppId != null) __obj.updateDynamic("teamsAppId")(teamsAppId.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsAppDefinition]
  }
}

