package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateInformationAboutPagesSiteEndpoint extends js.Object {
  var cname: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
  var source: js.UndefOr[String] = js.undefined
}

object ReposUpdateInformationAboutPagesSiteEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, cname: String = null, source: String = null): ReposUpdateInformationAboutPagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (cname != null) __obj.updateDynamic("cname")(cname)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ReposUpdateInformationAboutPagesSiteEndpoint]
  }
}

