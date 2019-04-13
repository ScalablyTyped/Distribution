package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsGetCommitAuthorsParams extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  /**
    * Only authors found after this id are returned. Provide the highest author ID you've seen so far. New authors may be added to the list at any point while the importer is performing the `raw` step.
    */
  var since: js.UndefOr[java.lang.String] = js.undefined
}

object MigrationsGetCommitAuthorsParams {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, since: java.lang.String = null): MigrationsGetCommitAuthorsParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (since != null) __obj.updateDynamic("since")(since)
    __obj.asInstanceOf[MigrationsGetCommitAuthorsParams]
  }
}

