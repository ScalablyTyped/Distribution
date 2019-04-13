package typings
package newDashGithubDashReleaseDashUrlLib.newDashGithubDashReleaseDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoUrlOptions extends BaseOptions {
  /**
    * The full URL to the repo.
    */
  var repoUrl: java.lang.String
}

object RepoUrlOptions {
  @scala.inline
  def apply(
    repoUrl: java.lang.String,
    body: java.lang.String = null,
    isPrerelease: js.UndefOr[scala.Boolean] = js.undefined,
    tag: java.lang.String = null,
    target: java.lang.String = null,
    title: java.lang.String = null
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

