package typings
package newDashGithubDashReleaseDashUrlLib.newDashGithubDashReleaseDashUrlMod.newGithubReleaseUrlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  /**
    * The description text of the release.
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the release should be marked as a pre-release.
    * @default false
    */
  var isPrerelease: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The tag name of the release.
    */
  var tag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The branch name or commit SHA to point the release's tag at, if the tag doesn't already exist.
    * @default The default branch
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title of the release.
    * GitHub shows the `tag` name when not specified.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(
    body: java.lang.String = null,
    isPrerelease: js.UndefOr[scala.Boolean] = js.undefined,
    tag: java.lang.String = null,
    target: java.lang.String = null,
    title: java.lang.String = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(isPrerelease)) __obj.updateDynamic("isPrerelease")(isPrerelease)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (target != null) __obj.updateDynamic("target")(target)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[BaseOptions]
  }
}

