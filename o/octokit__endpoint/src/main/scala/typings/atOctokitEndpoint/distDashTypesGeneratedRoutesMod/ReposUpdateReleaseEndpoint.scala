package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateReleaseEndpoint extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var draft: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var owner: String
  var prerelease: js.UndefOr[Boolean] = js.undefined
  var release_id: Double
  var repo: String
  var tag_name: js.UndefOr[String] = js.undefined
  var target_commitish: js.UndefOr[String] = js.undefined
}

object ReposUpdateReleaseEndpoint {
  @scala.inline
  def apply(
    owner: String,
    release_id: Double,
    repo: String,
    body: String = null,
    draft: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    prerelease: js.UndefOr[Boolean] = js.undefined,
    tag_name: String = null,
    target_commitish: String = null
  ): ReposUpdateReleaseEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, release_id = release_id, repo = repo)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(prerelease)) __obj.updateDynamic("prerelease")(prerelease)
    if (tag_name != null) __obj.updateDynamic("tag_name")(tag_name)
    if (target_commitish != null) __obj.updateDynamic("target_commitish")(target_commitish)
    __obj.asInstanceOf[ReposUpdateReleaseEndpoint]
  }
}

