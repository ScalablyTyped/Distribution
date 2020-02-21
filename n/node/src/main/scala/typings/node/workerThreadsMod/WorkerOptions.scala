package typings.node.workerThreadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerOptions extends js.Object {
  /**
    * List of arguments which would be stringified and appended to
    * `process.argv` in the worker. This is mostly similar to the `workerData`
    * but the values will be available on the global `process.argv` as if they
    * were passed as CLI options to the script.
    */
  var argv: js.UndefOr[js.Array[_]] = js.undefined
  var eval: js.UndefOr[Boolean] = js.undefined
  var execArgv: js.UndefOr[js.Array[String]] = js.undefined
  var resourceLimits: js.UndefOr[ResourceLimits] = js.undefined
  var stderr: js.UndefOr[Boolean] = js.undefined
  var stdin: js.UndefOr[Boolean] = js.undefined
  var stdout: js.UndefOr[Boolean] = js.undefined
  var workerData: js.UndefOr[js.Any] = js.undefined
}

object WorkerOptions {
  @scala.inline
  def apply(
    argv: js.Array[_] = null,
    eval: js.UndefOr[Boolean] = js.undefined,
    execArgv: js.Array[String] = null,
    resourceLimits: ResourceLimits = null,
    stderr: js.UndefOr[Boolean] = js.undefined,
    stdin: js.UndefOr[Boolean] = js.undefined,
    stdout: js.UndefOr[Boolean] = js.undefined,
    workerData: js.Any = null
  ): WorkerOptions = {
    val __obj = js.Dynamic.literal()
    if (argv != null) __obj.updateDynamic("argv")(argv.asInstanceOf[js.Any])
    if (!js.isUndefined(eval)) __obj.updateDynamic("eval")(eval.asInstanceOf[js.Any])
    if (execArgv != null) __obj.updateDynamic("execArgv")(execArgv.asInstanceOf[js.Any])
    if (resourceLimits != null) __obj.updateDynamic("resourceLimits")(resourceLimits.asInstanceOf[js.Any])
    if (!js.isUndefined(stderr)) __obj.updateDynamic("stderr")(stderr.asInstanceOf[js.Any])
    if (!js.isUndefined(stdin)) __obj.updateDynamic("stdin")(stdin.asInstanceOf[js.Any])
    if (!js.isUndefined(stdout)) __obj.updateDynamic("stdout")(stdout.asInstanceOf[js.Any])
    if (workerData != null) __obj.updateDynamic("workerData")(workerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOptions]
  }
}

