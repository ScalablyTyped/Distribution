package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetEndpoint extends js.Object {
  var owner: String
  var pull_number: Double
  var repo: String
}

object PullsGetEndpoint {
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String): PullsGetEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsGetEndpoint]
  }
}

