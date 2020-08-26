package typings.nodeSsh.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecOptions extends js.Object {
  var cwd: js.UndefOr[String] = js.native
  var onStderr: js.UndefOr[js.Function1[/* chunk */ Buffer, Unit]] = js.native
  var onStdout: js.UndefOr[js.Function1[/* chunk */ Buffer, Unit]] = js.native
  var options: js.UndefOr[typings.ssh2.mod.ExecOptions] = js.native
  var stdin: js.UndefOr[String] = js.native
}

object ExecOptions {
  @scala.inline
  def apply(): ExecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecOptions]
  }
  @scala.inline
  implicit class ExecOptionsOps[Self <: ExecOptions] (val x: Self) extends AnyVal {
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setOnStderr(value: /* chunk */ Buffer => Unit): Self = this.set("onStderr", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStderr: Self = this.set("onStderr", js.undefined)
    @scala.inline
    def setOnStdout(value: /* chunk */ Buffer => Unit): Self = this.set("onStdout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStdout: Self = this.set("onStdout", js.undefined)
    @scala.inline
    def setOptions(value: typings.ssh2.mod.ExecOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setStdin(value: String): Self = this.set("stdin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
  }
  
}

