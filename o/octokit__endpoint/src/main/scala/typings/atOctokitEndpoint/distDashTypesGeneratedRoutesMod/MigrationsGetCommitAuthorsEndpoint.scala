package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsGetCommitAuthorsEndpoint extends js.Object {
  var owner: String
  var repo: String
  var since: js.UndefOr[String] = js.undefined
}

object MigrationsGetCommitAuthorsEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, since: String = null): MigrationsGetCommitAuthorsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (since != null) __obj.updateDynamic("since")(since)
    __obj.asInstanceOf[MigrationsGetCommitAuthorsEndpoint]
  }
}

