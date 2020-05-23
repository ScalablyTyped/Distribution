package typings.newGithubReleaseUrl.mod

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
    val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrerelease)) __obj.updateDynamic("isPrerelease")(isPrerelease.get.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRepoOptions]
  }
}

