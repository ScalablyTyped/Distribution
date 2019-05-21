package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsMapCommitAuthorEndpoint extends js.Object {
  var author_id: scala.Double
  var email: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object MigrationsMapCommitAuthorEndpoint {
  @scala.inline
  def apply(
    author_id: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    email: java.lang.String = null,
    name: java.lang.String = null
  ): MigrationsMapCommitAuthorEndpoint = {
    val __obj = js.Dynamic.literal(author_id = author_id, owner = owner, repo = repo)
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MigrationsMapCommitAuthorEndpoint]
  }
}

