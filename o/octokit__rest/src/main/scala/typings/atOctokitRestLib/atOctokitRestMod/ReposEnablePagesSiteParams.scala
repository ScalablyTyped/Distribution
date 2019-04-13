package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposEnablePagesSiteParams extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * The repository branch used to publish your [site's source files](https://help.github.com/articles/configuring-a-publishing-source-for-github-pages/). Can be either `master` or `gh-pages`.
    */
  var `source[branch]`: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.master | atOctokitRestLib.atOctokitRestLibStrings.`gh-pages`
  ] = js.undefined
  /**
    * The repository directory that includes the source files for the Pages site. When `branch` is `master`, you can change `path` to `/docs`. When `branch` is `gh-pages`, you are unable to specify a `path` other than `/`.
    */
  var `source[path]`: js.UndefOr[java.lang.String] = js.undefined
}

object ReposEnablePagesSiteParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    `source[branch]`: atOctokitRestLib.atOctokitRestLibStrings.master | atOctokitRestLib.atOctokitRestLibStrings.`gh-pages` = null,
    `source[path]`: java.lang.String = null
  ): ReposEnablePagesSiteParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (`source[branch]` != null) __obj.updateDynamic("source[branch]")(`source[branch]`.asInstanceOf[js.Any])
    if (`source[path]` != null) __obj.updateDynamic("source[path]")(`source[path]`)
    __obj.asInstanceOf[ReposEnablePagesSiteParams]
  }
}

