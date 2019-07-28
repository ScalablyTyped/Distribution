package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppCatalogs extends Entity {
  var teamsApps: js.UndefOr[js.Array[TeamsApp]] = js.undefined
}

object AppCatalogs {
  @scala.inline
  def apply(id: String = null, teamsApps: js.Array[TeamsApp] = null): AppCatalogs = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (teamsApps != null) __obj.updateDynamic("teamsApps")(teamsApps)
    __obj.asInstanceOf[AppCatalogs]
  }
}

