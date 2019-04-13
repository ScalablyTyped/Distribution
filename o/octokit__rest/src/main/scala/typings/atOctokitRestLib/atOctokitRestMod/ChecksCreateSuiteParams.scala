package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateSuiteParams extends js.Object {
  /**
    * The sha of the head commit.
    */
  var head_sha: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
}

object ChecksCreateSuiteParams {
  @scala.inline
  def apply(head_sha: java.lang.String, owner: java.lang.String, repo: java.lang.String): ChecksCreateSuiteParams = {
    val __obj = js.Dynamic.literal(head_sha = head_sha, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ChecksCreateSuiteParams]
  }
}

