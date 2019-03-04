package typings
package newDashGithubDashReleaseDashUrlLib.newDashGithubDashReleaseDashUrlMod.newGithubReleaseUrlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRepoOptions extends BaseOptions {
  /**
    * GitHub repo.
    */
  var repo: java.lang.String
  /**
    * GitHub username or organization.
    */
  var user: java.lang.String
}

object UserRepoOptions {
  @scala.inline
  def apply(
    repo: java.lang.String,
    user: java.lang.String,
    body: java.lang.String = null,
    isPrerelease: js.UndefOr[scala.Boolean] = js.undefined,
    tag: java.lang.String = null,
    target: java.lang.String = null,
    title: java.lang.String = null
  ): UserRepoOptions = {
    val __obj = js.Dynamic.literal(repo = repo, user = user)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(isPrerelease)) __obj.updateDynamic("isPrerelease")(isPrerelease)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (target != null) __obj.updateDynamic("target")(target)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[UserRepoOptions]
  }
}

