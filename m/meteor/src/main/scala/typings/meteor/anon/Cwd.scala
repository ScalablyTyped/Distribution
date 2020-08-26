package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cwd extends js.Object {
  var cwd: js.UndefOr[js.Object] = js.native
  var destination: js.UndefOr[js.Any] = js.native
  var env: js.UndefOr[js.Object] = js.native
  var stdio: js.UndefOr[js.Array[_] | String] = js.native
  var waitForClose: js.UndefOr[String] = js.native
}

object Cwd {
  @scala.inline
  def apply(): Cwd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cwd]
  }
  @scala.inline
  implicit class CwdOps[Self <: Cwd] (val x: Self) extends AnyVal {
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
    def setCwd(value: js.Object): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setDestination(value: js.Any): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setEnv(value: js.Object): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setStdioVarargs(value: js.Any*): Self = this.set("stdio", js.Array(value :_*))
    @scala.inline
    def setStdio(value: js.Array[_] | String): Self = this.set("stdio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdio: Self = this.set("stdio", js.undefined)
    @scala.inline
    def setWaitForClose(value: String): Self = this.set("waitForClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForClose: Self = this.set("waitForClose", js.undefined)
  }
  
}

