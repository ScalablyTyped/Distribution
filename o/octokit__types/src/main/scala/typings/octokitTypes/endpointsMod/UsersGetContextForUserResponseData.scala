package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Octicon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersGetContextForUserResponseData extends js.Object {
  var contexts: js.Array[Octicon]
}

object UsersGetContextForUserResponseData {
  @scala.inline
  def apply(contexts: js.Array[Octicon]): UsersGetContextForUserResponseData = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetContextForUserResponseData]
  }
}

