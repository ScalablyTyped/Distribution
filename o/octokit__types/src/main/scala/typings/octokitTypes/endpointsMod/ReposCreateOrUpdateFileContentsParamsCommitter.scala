package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileContentsParamsCommitter extends js.Object {
  var email: String
  var name: String
}

object ReposCreateOrUpdateFileContentsParamsCommitter {
  @scala.inline
  def apply(email: String, name: String): ReposCreateOrUpdateFileContentsParamsCommitter = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateOrUpdateFileContentsParamsCommitter]
  }
}

