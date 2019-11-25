package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateReleaseParams extends js.Object {
  /**
    * Text describing the contents of the tag.
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * `true` to create a draft (unpublished) release, `false` to create a published one.
    */
  var draft: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the release.
    */
  var name: js.UndefOr[String] = js.undefined
  var owner: String
  /**
    * `true` to identify the release as a prerelease. `false` to identify the release as a full release.
    */
  var prerelease: js.UndefOr[Boolean] = js.undefined
  var repo: String
  /**
    * The name of the tag.
    */
  var tag_name: String
  /**
    * Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository's default branch (usually `master`).
    */
  var target_commitish: js.UndefOr[String] = js.undefined
}

object ReposCreateReleaseParams {
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
  ): ReposCreateReleaseParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(prerelease)) __obj.updateDynamic("prerelease")(prerelease.asInstanceOf[js.Any])
    if (target_commitish != null) __obj.updateDynamic("target_commitish")(target_commitish.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateReleaseParams]
  }
}

