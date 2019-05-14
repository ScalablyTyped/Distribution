package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateRelease_Options extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var draft: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var prerelease: js.UndefOr[scala.Boolean] = js.undefined
  var release_id: scala.Double
  var repo: java.lang.String
  var tag_name: js.UndefOr[java.lang.String] = js.undefined
  var target_commitish: js.UndefOr[java.lang.String] = js.undefined
}

object ReposUpdateRelease_Options {
  @scala.inline
  def apply(
    owner: java.lang.String,
    release_id: scala.Double,
    repo: java.lang.String,
    body: java.lang.String = null,
    draft: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    prerelease: js.UndefOr[scala.Boolean] = js.undefined,
    tag_name: java.lang.String = null,
    target_commitish: java.lang.String = null
  ): ReposUpdateRelease_Options = {
    val __obj = js.Dynamic.literal(owner = owner, release_id = release_id, repo = repo)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(prerelease)) __obj.updateDynamic("prerelease")(prerelease)
    if (tag_name != null) __obj.updateDynamic("tag_name")(tag_name)
    if (target_commitish != null) __obj.updateDynamic("target_commitish")(target_commitish)
    __obj.asInstanceOf[ReposUpdateRelease_Options]
  }
}

