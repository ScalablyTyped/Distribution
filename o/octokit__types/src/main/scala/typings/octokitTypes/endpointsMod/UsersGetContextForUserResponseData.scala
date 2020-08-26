package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Octicon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersGetContextForUserResponseData extends js.Object {
  var contexts: js.Array[Octicon] = js.native
}

object UsersGetContextForUserResponseData {
  @scala.inline
  def apply(contexts: js.Array[Octicon]): UsersGetContextForUserResponseData = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetContextForUserResponseData]
  }
  @scala.inline
  implicit class UsersGetContextForUserResponseDataOps[Self <: UsersGetContextForUserResponseData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContextsVarargs(value: Octicon*): Self = this.set("contexts", js.Array(value :_*))
    @scala.inline
    def setContexts(value: js.Array[Octicon]): Self = this.set("contexts", value.asInstanceOf[js.Any])
  }
  
}

