package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsMapCommitAuthorParams extends js.Object {
  var author_id: scala.Double
  /**
    * The new Git author email.
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The new Git author name.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object MigrationsMapCommitAuthorParams {
  @scala.inline
  def apply(
    author_id: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    email: java.lang.String = null,
    name: java.lang.String = null
  ): MigrationsMapCommitAuthorParams = {
    val __obj = js.Dynamic.literal(author_id = author_id, owner = owner, repo = repo)
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MigrationsMapCommitAuthorParams]
  }
}

