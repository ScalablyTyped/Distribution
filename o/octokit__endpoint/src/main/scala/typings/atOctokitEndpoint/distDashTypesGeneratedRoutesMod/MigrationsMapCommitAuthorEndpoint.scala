package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsMapCommitAuthorEndpoint extends js.Object {
  var author_id: Double
  var email: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
}

object MigrationsMapCommitAuthorEndpoint {
  @scala.inline
  def apply(author_id: Double, owner: String, repo: String, email: String = null, name: String = null): MigrationsMapCommitAuthorEndpoint = {
    val __obj = js.Dynamic.literal(author_id = author_id, owner = owner, repo = repo)
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MigrationsMapCommitAuthorEndpoint]
  }
}

