package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileResponseCommitAuthor extends js.Object {
  var date: String
  var email: String
  var name: String
}

object ReposDeleteFileResponseCommitAuthor {
  @scala.inline
  def apply(date: String, email: String, name: String): ReposDeleteFileResponseCommitAuthor = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposDeleteFileResponseCommitAuthor]
  }
}

