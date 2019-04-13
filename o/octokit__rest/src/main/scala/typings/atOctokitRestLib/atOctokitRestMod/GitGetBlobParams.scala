package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetBlobParams extends js.Object {
  var file_sha: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
}

object GitGetBlobParams {
  @scala.inline
  def apply(file_sha: java.lang.String, owner: java.lang.String, repo: java.lang.String): GitGetBlobParams = {
    val __obj = js.Dynamic.literal(file_sha = file_sha, owner = owner, repo = repo)
  
    __obj.asInstanceOf[GitGetBlobParams]
  }
}

