package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repo extends js.Object {
  var repo: Allowmergecommit
  var starred_at: String
}

object Repo {
  @scala.inline
  def apply(repo: Allowmergecommit, starred_at: String): Repo = {
    val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any], starred_at = starred_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repo]
  }
}

