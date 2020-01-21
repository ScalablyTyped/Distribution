package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateFileResponseCommitAuthor extends js.Object {
  var date: String
  var email: String
  var name: String
}

object ReposUpdateFileResponseCommitAuthor {
  @scala.inline
  def apply(date: String, email: String, name: String): ReposUpdateFileResponseCommitAuthor = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposUpdateFileResponseCommitAuthor]
  }
}

