package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateFileParamsCommitter extends js.Object {
  /**
    * The email of the author or committer of the commit. You'll receive a `422` status code if `email` is omitted.
    */
  var email: String
  /**
    * The name of the author or committer of the commit. You'll receive a `422` status code if `name` is omitted.
    */
  var name: String
}

object ReposUpdateFileParamsCommitter {
  @scala.inline
  def apply(email: String, name: String): ReposUpdateFileParamsCommitter = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposUpdateFileParamsCommitter]
  }
}

