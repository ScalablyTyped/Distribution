package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommitsResponseItemCommitAuthor extends js.Object {
  var date: String
  var email: String
  var name: String
}

object ReposListCommitsResponseItemCommitAuthor {
  @scala.inline
  def apply(date: String, email: String, name: String): ReposListCommitsResponseItemCommitAuthor = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposListCommitsResponseItemCommitAuthor]
  }
}

