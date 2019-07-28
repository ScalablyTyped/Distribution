package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsTab extends Entity {
  // Container for custom settings applied to a tab. The tab is considered configured only once this property is set.
  var configuration: js.UndefOr[TeamsTabConfiguration] = js.undefined
  // Name of the tab.
  var displayName: js.UndefOr[String] = js.undefined
  // The application that is linked to the tab. This cannot be changed after tab creation.
  var teamsApp: js.UndefOr[TeamsApp] = js.undefined
  // Deep link url of the tab instance. Read only.
  var webUrl: js.UndefOr[String] = js.undefined
}

object TeamsTab {
  @scala.inline
  def apply(
    configuration: TeamsTabConfiguration = null,
    displayName: String = null,
    id: String = null,
    teamsApp: TeamsApp = null,
    webUrl: String = null
  ): TeamsTab = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (teamsApp != null) __obj.updateDynamic("teamsApp")(teamsApp)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[TeamsTab]
  }
}

