package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateSuiteEndpoint extends js.Object {
  var head_sha: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
}

object ChecksCreateSuiteEndpoint {
  @scala.inline
  def apply(head_sha: java.lang.String, owner: java.lang.String, repo: java.lang.String): ChecksCreateSuiteEndpoint = {
    val __obj = js.Dynamic.literal(head_sha = head_sha, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ChecksCreateSuiteEndpoint]
  }
}

