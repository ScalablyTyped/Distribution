package typings.octokitRest.mod.Octokit

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
    val __obj = js.Dynamic.literal(head_sha = head_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksCreateSuiteParams]
  }
}

