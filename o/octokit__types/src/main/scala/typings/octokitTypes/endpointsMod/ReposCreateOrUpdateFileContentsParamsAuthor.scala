package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileContentsParamsAuthor extends js.Object {
  var email: String
  var name: String
}

object ReposCreateOrUpdateFileContentsParamsAuthor {
  @scala.inline
  def apply(email: String, name: String): ReposCreateOrUpdateFileContentsParamsAuthor = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateOrUpdateFileContentsParamsAuthor]
  }
}

