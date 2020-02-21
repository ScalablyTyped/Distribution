package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposMergeResponseCommitAuthor extends js.Object {
  var date: String
  var email: String
  var name: String
}

object ReposMergeResponseCommitAuthor {
  @scala.inline
  def apply(date: String, email: String, name: String): ReposMergeResponseCommitAuthor = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposMergeResponseCommitAuthor]
  }
}

