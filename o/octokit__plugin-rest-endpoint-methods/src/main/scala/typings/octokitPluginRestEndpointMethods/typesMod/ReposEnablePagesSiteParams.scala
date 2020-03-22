package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposEnablePagesSiteParams extends js.Object {
  var owner: String
  var repo: String
  var source: js.UndefOr[ReposEnablePagesSiteParamsSource] = js.undefined
}

object ReposEnablePagesSiteParams {
  @scala.inline
  def apply(owner: String, repo: String, source: ReposEnablePagesSiteParamsSource = null): ReposEnablePagesSiteParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposEnablePagesSiteParams]
  }
}

