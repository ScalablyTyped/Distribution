package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesDeleteLabelEndpoint extends js.Object {
  var name: String
  var owner: String
  var repo: String
}

object IssuesDeleteLabelEndpoint {
  @scala.inline
  def apply(name: String, owner: String, repo: String): IssuesDeleteLabelEndpoint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesDeleteLabelEndpoint]
  }
}

