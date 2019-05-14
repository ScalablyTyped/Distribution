package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsGetCommitAuthors_Options extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  var since: js.UndefOr[java.lang.String] = js.undefined
}

object MigrationsGetCommitAuthors_Options {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, since: java.lang.String = null): MigrationsGetCommitAuthors_Options = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (since != null) __obj.updateDynamic("since")(since)
    __obj.asInstanceOf[MigrationsGetCommitAuthors_Options]
  }
}

