package typings.parse.mod.global.Parse.Cloud

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionRequest[T /* <: Params */] extends js.Object {
  var installationId: js.UndefOr[String] = js.native
  var master: js.UndefOr[Boolean] = js.native
  var params: T = js.native
  var user: js.UndefOr[User[Attributes]] = js.native
}

object FunctionRequest {
  @scala.inline
  def apply[/* <: typings.parse.mod.global.Parse.Cloud.Params */ T](params: T): FunctionRequest[T] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionRequest[T]]
  }
  @scala.inline
  implicit class FunctionRequestOps[Self <: FunctionRequest[_], /* <: typings.parse.mod.global.Parse.Cloud.Params */ T] (val x: Self with FunctionRequest[T]) extends AnyVal {
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
    def setParams(value: T): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstallationId(value: String): Self = this.set("installationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallationId: Self = this.set("installationId", js.undefined)
    @scala.inline
    def setMaster(value: Boolean): Self = this.set("master", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster: Self = this.set("master", js.undefined)
    @scala.inline
    def setUser(value: User[Attributes]): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

