package typings.newGithubReleaseUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  /**
  		The description text of the release.
  		*/
  val body: js.UndefOr[String] = js.undefined
  /**
  		Whether the release should be marked as a pre-release.
  		@default false
  		*/
  val isPrerelease: js.UndefOr[Boolean] = js.undefined
  /**
  		The tag name of the release.
  		*/
  val tag: js.UndefOr[String] = js.undefined
  /**
  		The branch name or commit SHA to point the release's tag at, if the tag doesn't already exist.
  		Default: The default branch.
  		*/
  val target: js.UndefOr[String] = js.undefined
  /**
  		The title of the release.
  		GitHub shows the `tag` name when not specified.
  		*/
  val title: js.UndefOr[String] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(
    body: String = null,
    isPrerelease: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    target: String = null,
    title: String = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrerelease)) __obj.updateDynamic("isPrerelease")(isPrerelease.get.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

