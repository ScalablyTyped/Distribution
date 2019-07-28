package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetBlobParams extends js.Object {
  var file_sha: String
  var owner: String
  var repo: String
}

object GitGetBlobParams {
  @scala.inline
  def apply(file_sha: String, owner: String, repo: String): GitGetBlobParams = {
    val __obj = js.Dynamic.literal(file_sha = file_sha, owner = owner, repo = repo)
  
    __obj.asInstanceOf[GitGetBlobParams]
  }
}

