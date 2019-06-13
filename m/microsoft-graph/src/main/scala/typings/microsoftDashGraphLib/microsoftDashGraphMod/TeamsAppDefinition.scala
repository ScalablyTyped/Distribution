package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAppDefinition extends Entity {
  /** The name of the app provided by the app developer. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The id from the Teams App manifest. */
  var teamsAppId: js.UndefOr[java.lang.String] = js.undefined
  /** The version number of the application. */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object TeamsAppDefinition {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    teamsAppId: java.lang.String = null,
    version: java.lang.String = null
  ): TeamsAppDefinition = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (teamsAppId != null) __obj.updateDynamic("teamsAppId")(teamsAppId)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[TeamsAppDefinition]
  }
}

