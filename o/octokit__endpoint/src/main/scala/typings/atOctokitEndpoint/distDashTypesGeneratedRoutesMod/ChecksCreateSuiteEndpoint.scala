package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateSuiteEndpoint extends js.Object {
  var head_sha: String
  var owner: String
  var repo: String
}

object ChecksCreateSuiteEndpoint {
  @scala.inline
  def apply(head_sha: String, owner: String, repo: String): ChecksCreateSuiteEndpoint = {
    val __obj = js.Dynamic.literal(head_sha = head_sha, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ChecksCreateSuiteEndpoint]
  }
}

