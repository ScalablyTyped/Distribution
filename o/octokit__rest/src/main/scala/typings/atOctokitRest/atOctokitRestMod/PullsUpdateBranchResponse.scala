package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateBranchResponse extends js.Object {
  var message: String
  var url: String
}

object PullsUpdateBranchResponse {
  @scala.inline
  def apply(message: String, url: String): PullsUpdateBranchResponse = {
    val __obj = js.Dynamic.literal(message = message, url = url)
  
    __obj.asInstanceOf[PullsUpdateBranchResponse]
  }
}

