package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateReleaseEndpoint extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var draft: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var prerelease: js.UndefOr[scala.Boolean] = js.undefined
  var repo: java.lang.String
  var tag_name: java.lang.String
  var target_commitish: js.UndefOr[java.lang.String] = js.undefined
}

object ReposCreateReleaseEndpoint {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    tag_name: java.lang.String,
    body: java.lang.String = null,
    draft: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    prerelease: js.UndefOr[scala.Boolean] = js.undefined,
    target_commitish: java.lang.String = null
  ): ReposCreateReleaseEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, tag_name = tag_name)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(prerelease)) __obj.updateDynamic("prerelease")(prerelease)
    if (target_commitish != null) __obj.updateDynamic("target_commitish")(target_commitish)
    __obj.asInstanceOf[ReposCreateReleaseEndpoint]
  }
}

