package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetCommitResponseCommitter extends js.Object {
  var date: String
  var email: String
  var name: String
}

object GitGetCommitResponseCommitter {
  @scala.inline
  def apply(date: String, email: String, name: String): GitGetCommitResponseCommitter = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitGetCommitResponseCommitter]
  }
}

