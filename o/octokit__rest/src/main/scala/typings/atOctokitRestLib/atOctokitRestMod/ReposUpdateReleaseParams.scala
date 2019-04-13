package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateReleaseParams extends js.Object {
  /**
    * Text describing the contents of the tag.
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * `true` makes the release a draft, and `false` publishes the release.
    */
  var draft: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the release.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  /**
    * `true` to identify the release as a prerelease, `false` to identify the release as a full release.
    */
  var prerelease: js.UndefOr[scala.Boolean] = js.undefined
  var release_id: scala.Double
  var repo: java.lang.String
  /**
    * The name of the tag.
    */
  var tag_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists.
    */
  var target_commitish: js.UndefOr[java.lang.String] = js.undefined
}

object ReposUpdateReleaseParams {
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
  ): ReposUpdateReleaseParams = {
    val __obj = js.Dynamic.literal(owner = owner, release_id = release_id, repo = repo)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(prerelease)) __obj.updateDynamic("prerelease")(prerelease)
    if (tag_name != null) __obj.updateDynamic("tag_name")(tag_name)
    if (target_commitish != null) __obj.updateDynamic("target_commitish")(target_commitish)
    __obj.asInstanceOf[ReposUpdateReleaseParams]
  }
}

