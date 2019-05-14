package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitListRefs_Options extends js.Object {
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
}

object GitListRefs_Options {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    namespace: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): GitListRefs_Options = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitListRefs_Options]
  }
}

