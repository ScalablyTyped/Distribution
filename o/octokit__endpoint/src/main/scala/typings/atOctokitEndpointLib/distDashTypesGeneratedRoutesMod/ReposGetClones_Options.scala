package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetClones_Options extends js.Object {
  var owner: java.lang.String
  var per: js.UndefOr[java.lang.String] = js.undefined
  var repo: java.lang.String
}

object ReposGetClones_Options {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, per: java.lang.String = null): ReposGetClones_Options = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (per != null) __obj.updateDynamic("per")(per)
    __obj.asInstanceOf[ReposGetClones_Options]
  }
}

