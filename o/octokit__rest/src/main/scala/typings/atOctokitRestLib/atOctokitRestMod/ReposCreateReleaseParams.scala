package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateReleaseParams extends js.Object {
  /**
    * Text describing the contents of the tag.
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * `true` to create a draft (unpublished) release, `false` to create a published one.
    */
  var draft: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the release.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  /**
    * `true` to identify the release as a prerelease. `false` to identify the release as a full release.
    */
  var prerelease: js.UndefOr[scala.Boolean] = js.undefined
  var repo: java.lang.String
  /**
    * The name of the tag.
    */
  var tag_name: java.lang.String
  /**
    * Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists.
    */
  var target_commitish: js.UndefOr[java.lang.String] = js.undefined
}

object ReposCreateReleaseParams {
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
  ): ReposCreateReleaseParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, tag_name = tag_name)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(prerelease)) __obj.updateDynamic("prerelease")(prerelease)
    if (target_commitish != null) __obj.updateDynamic("target_commitish")(target_commitish)
    __obj.asInstanceOf[ReposCreateReleaseParams]
  }
}

