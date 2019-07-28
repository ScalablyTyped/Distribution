package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.day
import typings.atOctokitRest.atOctokitRestStrings.week
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetViewsParams extends js.Object {
  var owner: String
  /**
    * Must be one of: `day`, `week`.
    */
  var per: js.UndefOr[day | week] = js.undefined
  var repo: String
}

object ReposGetViewsParams {
  @scala.inline
  def apply(owner: String, repo: String, per: day | week = null): ReposGetViewsParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (per != null) __obj.updateDynamic("per")(per.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetViewsParams]
  }
}

