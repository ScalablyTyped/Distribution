package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposTestPushHookParams extends js.Object {
  var hook_id: Double
  var owner: String
  var repo: String
}

object ReposTestPushHookParams {
  @scala.inline
  def apply(hook_id: Double, owner: String, repo: String): ReposTestPushHookParams = {
    val __obj = js.Dynamic.literal(hook_id = hook_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposTestPushHookParams]
  }
}

