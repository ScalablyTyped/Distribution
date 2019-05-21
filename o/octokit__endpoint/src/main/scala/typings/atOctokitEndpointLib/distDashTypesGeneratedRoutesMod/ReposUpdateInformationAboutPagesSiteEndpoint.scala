package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateInformationAboutPagesSiteEndpoint extends js.Object {
  var cname: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object ReposUpdateInformationAboutPagesSiteEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    cname: java.lang.String = null,
    source: java.lang.String = null
  ): ReposUpdateInformationAboutPagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (cname != null) __obj.updateDynamic("cname")(cname)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ReposUpdateInformationAboutPagesSiteEndpoint]
  }
}

