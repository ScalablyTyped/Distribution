package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposEnablePagesSiteEndpoint extends js.Object {
  var owner: String
  var repo: String
  var source: js.UndefOr[js.Object] = js.undefined
  var `source.branch`: js.UndefOr[String] = js.undefined
  var `source.path`: js.UndefOr[String] = js.undefined
}

object ReposEnablePagesSiteEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    source: js.Object = null,
    `source.branch`: String = null,
    `source.path`: String = null
  ): ReposEnablePagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (source != null) __obj.updateDynamic("source")(source)
    if (`source.branch` != null) __obj.updateDynamic("source.branch")(`source.branch`)
    if (`source.path` != null) __obj.updateDynamic("source.path")(`source.path`)
    __obj.asInstanceOf[ReposEnablePagesSiteEndpoint]
  }
}

