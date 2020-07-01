package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`gh-pages`
import typings.octokitTypes.octokitTypesStrings.master
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreatePagesSiteParamsSource extends js.Object {
  var branch: js.UndefOr[master | `gh-pages`] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object ReposCreatePagesSiteParamsSource {
  @scala.inline
  def apply(branch: master | `gh-pages` = null, path: String = null): ReposCreatePagesSiteParamsSource = {
    val __obj = js.Dynamic.literal()
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreatePagesSiteParamsSource]
  }
}

