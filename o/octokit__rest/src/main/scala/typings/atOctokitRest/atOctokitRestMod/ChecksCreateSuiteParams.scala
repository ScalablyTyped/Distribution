package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateSuiteParams extends js.Object {
  /**
    * The sha of the head commit.
    */
  var head_sha: String
  var owner: String
  var repo: String
}

object ChecksCreateSuiteParams {
  @scala.inline
  def apply(head_sha: String, owner: String, repo: String): ChecksCreateSuiteParams = {
    val __obj = js.Dynamic.literal(head_sha = head_sha, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ChecksCreateSuiteParams]
  }
}

