package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetBlobResponse extends js.Object {
  var content: java.lang.String
  var encoding: java.lang.String
  var sha: java.lang.String
  var size: scala.Double
  var url: java.lang.String
}

object GitGetBlobResponse {
  @scala.inline
  def apply(
    content: java.lang.String,
    encoding: java.lang.String,
    sha: java.lang.String,
    size: scala.Double,
    url: java.lang.String
  ): GitGetBlobResponse = {
    val __obj = js.Dynamic.literal(content = content, encoding = encoding, sha = sha, size = size, url = url)
  
    __obj.asInstanceOf[GitGetBlobResponse]
  }
}

