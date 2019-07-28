package typings.newDashGithubDashReleaseDashUrl.newDashGithubDashReleaseDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoUrlOptions extends BaseOptions {
  /**
  		The full URL to the repo.
  		*/
  val repoUrl: String
}

object RepoUrlOptions {
  @scala.inline
  def apply(
    repoUrl: String,
    body: String = null,
    isPrerelease: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    target: String = null,
    title: String = null
  ): RepoUrlOptions = {
    val __obj = js.Dynamic.literal(repoUrl = repoUrl)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(isPrerelease)) __obj.updateDynamic("isPrerelease")(isPrerelease)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (target != null) __obj.updateDynamic("target")(target)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[RepoUrlOptions]
  }
}

