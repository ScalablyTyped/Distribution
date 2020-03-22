package typings.octokitPluginRestEndpointMethods.typesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.day
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.week
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetClonesParams extends js.Object {
  var owner: String
  /**
    * Must be one of: `day`, `week`.
    */
  var per: js.UndefOr[day | week] = js.undefined
  var repo: String
}

object ReposGetClonesParams {
  @scala.inline
  def apply(owner: String, repo: String, per: day | week = null): ReposGetClonesParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (per != null) __obj.updateDynamic("per")(per.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetClonesParams]
  }
}

