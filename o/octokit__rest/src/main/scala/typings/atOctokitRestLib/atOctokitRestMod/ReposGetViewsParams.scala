package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetViewsParams extends js.Object {
  var owner: java.lang.String
  /**
    * Must be one of: `day`, `week`.
    */
  var per: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.day | atOctokitRestLib.atOctokitRestLibStrings.week
  ] = js.undefined
  var repo: java.lang.String
}

object ReposGetViewsParams {
  @scala.inline
  def apply(
    owner: java.lang.String,
    repo: java.lang.String,
    per: atOctokitRestLib.atOctokitRestLibStrings.day | atOctokitRestLib.atOctokitRestLibStrings.week = null
  ): ReposGetViewsParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (per != null) __obj.updateDynamic("per")(per.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetViewsParams]
  }
}

