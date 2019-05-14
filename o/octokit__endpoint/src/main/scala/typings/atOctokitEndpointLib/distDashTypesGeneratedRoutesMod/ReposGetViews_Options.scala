package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetViews_Options extends js.Object {
  var owner: java.lang.String
  var per: js.UndefOr[java.lang.String] = js.undefined
  var repo: java.lang.String
}

object ReposGetViews_Options {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, per: java.lang.String = null): ReposGetViews_Options = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (per != null) __obj.updateDynamic("per")(per)
    __obj.asInstanceOf[ReposGetViews_Options]
  }
}

