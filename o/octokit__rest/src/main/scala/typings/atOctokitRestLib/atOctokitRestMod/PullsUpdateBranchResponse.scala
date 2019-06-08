package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateBranchResponse extends js.Object {
  var message: java.lang.String
  var url: java.lang.String
}

object PullsUpdateBranchResponse {
  @scala.inline
  def apply(message: java.lang.String, url: java.lang.String): PullsUpdateBranchResponse = {
    val __obj = js.Dynamic.literal(message = message, url = url)
  
    __obj.asInstanceOf[PullsUpdateBranchResponse]
  }
}

