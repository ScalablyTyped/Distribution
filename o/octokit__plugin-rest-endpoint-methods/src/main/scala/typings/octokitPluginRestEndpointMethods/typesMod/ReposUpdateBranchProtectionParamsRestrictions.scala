package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionParamsRestrictions extends js.Object {
  /**
    * The list of app `slug`s with push access
    */
  var apps: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The list of team `slug`s with push access
    */
  var teams: js.Array[String]
  /**
    * The list of user `login`s with push access
    */
  var users: js.Array[String]
}

object ReposUpdateBranchProtectionParamsRestrictions {
  @scala.inline
  def apply(teams: js.Array[String], users: js.Array[String], apps: js.Array[String] = null): ReposUpdateBranchProtectionParamsRestrictions = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    if (apps != null) __obj.updateDynamic("apps")(apps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRestrictions]
  }
}

