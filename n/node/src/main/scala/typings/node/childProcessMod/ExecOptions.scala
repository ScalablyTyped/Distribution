package typings.node.childProcessMod

import typings.node.processMod.global.NodeJS.Signals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecOptions extends CommonOptions {
  var killSignal: js.UndefOr[Signals | Double] = js.native
  var maxBuffer: js.UndefOr[Double] = js.native
  var shell: js.UndefOr[String] = js.native
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
    def setKillSignal(value: Signals | Double): Self = this.set("killSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKillSignal: Self = this.set("killSignal", js.undefined)
    @scala.inline
    def setMaxBuffer(value: Double): Self = this.set("maxBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBuffer: Self = this.set("maxBuffer", js.undefined)
    @scala.inline
    def setShell(value: String): Self = this.set("shell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShell: Self = this.set("shell", js.undefined)
  }
  
}

