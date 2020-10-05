package typings.node.childProcessMod

import typings.node.BufferEncoding
import typings.node.nodeStrings.buffer_
import typings.node.nodeStrings.ignore
import typings.node.nodeStrings.inherit
import typings.node.nodeStrings.ipc
import typings.node.nodeStrings.pipe
import typings.node.processMod.global.NodeJS.Signals
import typings.node.streamMod.Stream
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecSyncOptions extends CommonOptions {
  var encoding: js.UndefOr[BufferEncoding | buffer_ | Null] = js.native
  var input: js.UndefOr[String | Uint8Array] = js.native
  var killSignal: js.UndefOr[Signals | Double] = js.native
  var maxBuffer: js.UndefOr[Double] = js.native
  var shell: js.UndefOr[String] = js.native
  var stdio: js.UndefOr[StdioOptions] = js.native
}

object ExecSyncOptions {
  @scala.inline
  def apply(): ExecSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecSyncOptions]
  }
  @scala.inline
  implicit class ExecSyncOptionsOps[Self <: ExecSyncOptions] (val x: Self) extends AnyVal {
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
    def setEncoding(value: BufferEncoding | buffer_): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    @scala.inline
    def setInput(value: String | Uint8Array): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
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
    @scala.inline
    def setStdioVarargs(value: (js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null])*): Self = this.set("stdio", js.Array(value :_*))
    @scala.inline
    def setStdio(value: StdioOptions): Self = this.set("stdio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdio: Self = this.set("stdio", js.undefined)
  }
  
}

