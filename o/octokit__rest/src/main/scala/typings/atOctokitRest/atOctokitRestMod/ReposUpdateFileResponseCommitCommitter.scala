package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateFileResponseCommitCommitter extends js.Object {
  var date: String
  var email: String
  var name: String
}

object ReposUpdateFileResponseCommitCommitter {
  @scala.inline
  def apply(date: String, email: String, name: String): ReposUpdateFileResponseCommitCommitter = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposUpdateFileResponseCommitCommitter]
  }
}

