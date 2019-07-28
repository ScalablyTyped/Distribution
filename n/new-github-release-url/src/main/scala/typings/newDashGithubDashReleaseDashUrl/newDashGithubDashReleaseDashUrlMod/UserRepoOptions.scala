package typings.newDashGithubDashReleaseDashUrl.newDashGithubDashReleaseDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRepoOptions extends BaseOptions {
  /**
  		GitHub repo.
  		*/
  val repo: String
  /**
  		GitHub username or organization.
  		*/
  val user: String
}

object UserRepoOptions {
  @scala.inline
  def apply(
    repo: String,
    user: String,
    body: String = null,
    isPrerelease: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    target: String = null,
    title: String = null
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

