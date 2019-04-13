package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetPunchCardStatsParams extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposGetPunchCardStatsParams {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String): ReposGetPunchCardStatsParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetPunchCardStatsParams]
  }
}

