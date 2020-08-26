package typings.node.childProcessMod

import typings.node.processMod.global.NodeJS.Signals
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpawnSyncReturns[T] extends js.Object {
  var error: js.UndefOr[Error] = js.native
  var output: js.Array[String] = js.native
  var pid: Double = js.native
  var signal: Signals | Null = js.native
  var status: Double | Null = js.native
  var stderr: T = js.native
  var stdout: T = js.native
}

object SpawnSyncReturns {
  @scala.inline
  def apply[T](output: js.Array[String], pid: Double, stderr: T, stdout: T): SpawnSyncReturns[T] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnSyncReturns[T]]
  }
  @scala.inline
  implicit class SpawnSyncReturnsOps[Self <: SpawnSyncReturns[_], T] (val x: Self with SpawnSyncReturns[T]) extends AnyVal {
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
    def setOutputVarargs(value: String*): Self = this.set("output", js.Array(value :_*))
    @scala.inline
    def setOutput(value: js.Array[String]): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setStderr(value: T): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdout(value: T): Self = this.set("stdout", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setSignal(value: Signals): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignalNull: Self = this.set("signal", null)
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
  
}

