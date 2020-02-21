package typings.octokitRest.mod.Octokit

import typings.octokitRest.octokitRestStrings.`gh-pages`
import typings.octokitRest.octokitRestStrings.master
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposEnablePagesSiteParamsSource extends js.Object {
  var branch: js.UndefOr[master | `gh-pages`] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object ReposEnablePagesSiteParamsSource {
  @scala.inline
  def apply(branch: master | `gh-pages` = null, path: String = null): ReposEnablePagesSiteParamsSource = {
    val __obj = js.Dynamic.literal()
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposEnablePagesSiteParamsSource]
  }
}

