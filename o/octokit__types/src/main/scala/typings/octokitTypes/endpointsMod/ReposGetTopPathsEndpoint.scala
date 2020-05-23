package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetTopPathsEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetTopPathsEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetTopPathsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetTopPathsEndpoint]
  }
}

