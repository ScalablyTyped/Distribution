package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateBlobResponse extends js.Object {
  var sha: String
  var url: String
}

object GitCreateBlobResponse {
  @scala.inline
  def apply(sha: String, url: String): GitCreateBlobResponse = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitCreateBlobResponse]
  }
}

