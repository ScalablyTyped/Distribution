package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetViewsEndpoint extends js.Object {
  var owner: String
  var per: js.UndefOr[String] = js.undefined
  var repo: String
}

object ReposGetViewsEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, per: String = null): ReposGetViewsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (per != null) __obj.updateDynamic("per")(per)
    __obj.asInstanceOf[ReposGetViewsEndpoint]
  }
}

