package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsGetCommitAuthorsEndpoint extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  var since: js.UndefOr[java.lang.String] = js.undefined
}

object MigrationsGetCommitAuthorsEndpoint {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, since: java.lang.String = null): MigrationsGetCommitAuthorsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (since != null) __obj.updateDynamic("since")(since)
    __obj.asInstanceOf[MigrationsGetCommitAuthorsEndpoint]
  }
}

