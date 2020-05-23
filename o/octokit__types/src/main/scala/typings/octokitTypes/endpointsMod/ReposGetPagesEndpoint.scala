package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetPagesEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetPagesEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetPagesEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetPagesEndpoint]
  }
}

