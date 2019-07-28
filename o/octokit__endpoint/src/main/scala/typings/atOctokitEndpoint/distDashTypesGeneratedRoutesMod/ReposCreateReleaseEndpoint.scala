package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateReleaseEndpoint extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var draft: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var owner: String
  var prerelease: js.UndefOr[Boolean] = js.undefined
  var repo: String
  var tag_name: String
  var target_commitish: js.UndefOr[String] = js.undefined
}

object ReposCreateReleaseEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    tag_name: String,
    body: String = null,
    draft: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    prerelease: js.UndefOr[Boolean] = js.undefined,
    target_commitish: String = null
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

