package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersGetContextForUserResponse extends js.Object {
  var contexts: js.Array[UsersGetContextForUserResponseContextsItem]
}

object UsersGetContextForUserResponse {
  @scala.inline
  def apply(contexts: js.Array[UsersGetContextForUserResponseContextsItem]): UsersGetContextForUserResponse = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsersGetContextForUserResponse]
  }
}

