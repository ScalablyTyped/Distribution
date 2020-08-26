package typings.node.workerThreadsMod

import typings.node.NodeJS.Dict
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerOptions extends js.Object {
  /**
    * List of arguments which would be stringified and appended to
    * `process.argv` in the worker. This is mostly similar to the `workerData`
    * but the values will be available on the global `process.argv` as if they
    * were passed as CLI options to the script.
    */
  var argv: js.UndefOr[js.Array[_]] = js.native
  var env: js.UndefOr[Dict[String] | js.Symbol] = js.native
  var eval: js.UndefOr[Boolean] = js.native
  var execArgv: js.UndefOr[js.Array[String]] = js.native
  var resourceLimits: js.UndefOr[ResourceLimits] = js.native
  var stderr: js.UndefOr[Boolean] = js.native
  var stdin: js.UndefOr[Boolean] = js.native
  var stdout: js.UndefOr[Boolean] = js.native
  /**
    * Additional data to send in the first worker message.
    */
  var transferList: js.UndefOr[js.Array[ArrayBuffer | MessagePort]] = js.native
  var workerData: js.UndefOr[js.Any] = js.native
}

object WorkerOptions {
  @scala.inline
  def apply(): WorkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerOptions]
  }
  @scala.inline
  implicit class WorkerOptionsOps[Self <: WorkerOptions] (val x: Self) extends AnyVal {
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
    def setArgvVarargs(value: js.Any*): Self = this.set("argv", js.Array(value :_*))
    @scala.inline
    def setArgv(value: js.Array[_]): Self = this.set("argv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgv: Self = this.set("argv", js.undefined)
    @scala.inline
    def setEnv(value: Dict[String] | js.Symbol): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setEval(value: Boolean): Self = this.set("eval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEval: Self = this.set("eval", js.undefined)
    @scala.inline
    def setExecArgvVarargs(value: String*): Self = this.set("execArgv", js.Array(value :_*))
    @scala.inline
    def setExecArgv(value: js.Array[String]): Self = this.set("execArgv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecArgv: Self = this.set("execArgv", js.undefined)
    @scala.inline
    def setResourceLimits(value: ResourceLimits): Self = this.set("resourceLimits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceLimits: Self = this.set("resourceLimits", js.undefined)
    @scala.inline
    def setStderr(value: Boolean): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStderr: Self = this.set("stderr", js.undefined)
    @scala.inline
    def setStdin(value: Boolean): Self = this.set("stdin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
    @scala.inline
    def setStdout(value: Boolean): Self = this.set("stdout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
    @scala.inline
    def setTransferListVarargs(value: (ArrayBuffer | MessagePort)*): Self = this.set("transferList", js.Array(value :_*))
    @scala.inline
    def setTransferList(value: js.Array[ArrayBuffer | MessagePort]): Self = this.set("transferList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferList: Self = this.set("transferList", js.undefined)
    @scala.inline
    def setWorkerData(value: js.Any): Self = this.set("workerData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerData: Self = this.set("workerData", js.undefined)
  }
  
}

