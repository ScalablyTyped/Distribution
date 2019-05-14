package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposEnablePagesSite_Options extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  var source: js.UndefOr[js.Object] = js.undefined
  var `source.branch`: js.UndefOr[java.lang.String] = js.undefined
  var `source.path`: js.UndefOr[java.lang.String] = js.undefined
}

object ReposEnablePagesSite_Options {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    source: js.Object = null,
    `source.branch`: java.lang.String = null,
    `source.path`: java.lang.String = null
  ): ReposEnablePagesSite_Options = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (source != null) __obj.updateDynamic("source")(source)
    if (`source.branch` != null) __obj.updateDynamic("source.branch")(`source.branch`)
    if (`source.path` != null) __obj.updateDynamic("source.path")(`source.path`)
    __obj.asInstanceOf[ReposEnablePagesSite_Options]
  }
}

