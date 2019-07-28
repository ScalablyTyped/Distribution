package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteHookParams extends js.Object {
  var hook_id: Double
  var owner: String
  var repo: String
}

object ReposDeleteHookParams {
  @scala.inline
  def apply(hook_id: Double, owner: String, repo: String): ReposDeleteHookParams = {
    val __obj = js.Dynamic.literal(hook_id = hook_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposDeleteHookParams]
  }
}

