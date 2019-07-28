package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetBlobResponse extends js.Object {
  var content: String
  var encoding: String
  var sha: String
  var size: Double
  var url: String
}

object GitGetBlobResponse {
  @scala.inline
  def apply(content: String, encoding: String, sha: String, size: Double, url: String): GitGetBlobResponse = {
    val __obj = js.Dynamic.literal(content = content, encoding = encoding, sha = sha, size = size, url = url)
  
    __obj.asInstanceOf[GitGetBlobResponse]
  }
}

