package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateBlobResponseData extends js.Object {
  var sha: String
  var url: String
}

object GitCreateBlobResponseData {
  @scala.inline
  def apply(sha: String, url: String): GitCreateBlobResponseData = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateBlobResponseData]
  }
}

