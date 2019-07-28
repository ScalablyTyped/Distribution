package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityStarRepoParams extends js.Object {
  var owner: String
  var repo: String
}

object ActivityStarRepoParams {
  @scala.inline
  def apply(owner: String, repo: String): ActivityStarRepoParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ActivityStarRepoParams]
  }
}

