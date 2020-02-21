package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateHookResponseLastResponse extends js.Object {
  var code: Null
  var message: Null
  var status: String
}

object ReposUpdateHookResponseLastResponse {
  @scala.inline
  def apply(code: Null, message: Null, status: String): ReposUpdateHookResponseLastResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposUpdateHookResponseLastResponse]
  }
}

