package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsMapCommitAuthorParams extends js.Object {
  var author_id: Double
  /**
    * The new Git author email.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * The new Git author name.
    */
  var name: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
}

object MigrationsMapCommitAuthorParams {
  @scala.inline
  def apply(author_id: Double, owner: String, repo: String, email: String = null, name: String = null): MigrationsMapCommitAuthorParams = {
    val __obj = js.Dynamic.literal(author_id = author_id, owner = owner, repo = repo)
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MigrationsMapCommitAuthorParams]
  }
}

