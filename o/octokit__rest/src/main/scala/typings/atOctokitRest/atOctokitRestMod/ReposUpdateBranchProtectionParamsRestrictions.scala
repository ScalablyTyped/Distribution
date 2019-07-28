package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateBranchProtectionParamsRestrictions extends js.Object {
  var teams: js.UndefOr[js.Array[String]] = js.undefined
  var users: js.UndefOr[js.Array[String]] = js.undefined
}

object ReposUpdateBranchProtectionParamsRestrictions {
  @scala.inline
  def apply(teams: js.Array[String] = null, users: js.Array[String] = null): ReposUpdateBranchProtectionParamsRestrictions = {
    val __obj = js.Dynamic.literal()
    if (teams != null) __obj.updateDynamic("teams")(teams)
    if (users != null) __obj.updateDynamic("users")(users)
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRestrictions]
  }
}

