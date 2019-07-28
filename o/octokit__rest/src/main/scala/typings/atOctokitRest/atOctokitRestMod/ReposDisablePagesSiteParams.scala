package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDisablePagesSiteParams extends js.Object {
  var owner: String
  var repo: String
}

object ReposDisablePagesSiteParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposDisablePagesSiteParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposDisablePagesSiteParams]
  }
}

