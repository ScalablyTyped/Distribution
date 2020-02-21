package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitResponseCommitCommitter extends js.Object {
  var date: String
  var email: String
  var name: String
}

object ReposGetCommitResponseCommitCommitter {
  @scala.inline
  def apply(date: String, email: String, name: String): ReposGetCommitResponseCommitCommitter = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetCommitResponseCommitCommitter]
  }
}

