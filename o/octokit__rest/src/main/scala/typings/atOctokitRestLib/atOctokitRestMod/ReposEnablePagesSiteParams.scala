package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposEnablePagesSiteParams extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  var source: js.UndefOr[ReposEnablePagesSiteParamsSource] = js.undefined
}

object ReposEnablePagesSiteParams {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, source: ReposEnablePagesSiteParamsSource = null): ReposEnablePagesSiteParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ReposEnablePagesSiteParams]
  }
}

