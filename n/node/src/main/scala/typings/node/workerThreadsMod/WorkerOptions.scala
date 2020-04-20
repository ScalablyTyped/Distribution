package typings.node.workerThreadsMod

import typings.node.NodeJS.Dict
import typings.std.ArrayBuffer
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
  var env: js.UndefOr[Dict[String] | js.Symbol] = js.undefined
  var eval: js.UndefOr[Boolean] = js.undefined
  var execArgv: js.UndefOr[js.Array[String]] = js.undefined
  var resourceLimits: js.UndefOr[ResourceLimits] = js.undefined
  var stderr: js.UndefOr[Boolean] = js.undefined
  var stdin: js.UndefOr[Boolean] = js.undefined
  var stdout: js.UndefOr[Boolean] = js.undefined
  /**
    * Additional data to send in the first worker message.
    */
  var transferList: js.UndefOr[js.Array[ArrayBuffer | MessagePort]] = js.undefined
  var workerData: js.UndefOr[js.Any] = js.undefined
}

object WorkerOptions {
  @scala.inline
  def apply(
    argv: js.Array[_] = null,
    env: Dict[String] | js.Symbol = null,
    eval: js.UndefOr[Boolean] = js.undefined,
    execArgv: js.Array[String] = null,
    resourceLimits: ResourceLimits = null,
    stderr: js.UndefOr[Boolean] = js.undefined,
    stdin: js.UndefOr[Boolean] = js.undefined,
    stdout: js.UndefOr[Boolean] = js.undefined,
    transferList: js.Array[ArrayBuffer | MessagePort] = null,
    workerData: js.Any = null
  ): WorkerOptions = {
    val __obj = js.Dynamic.literal()
    if (argv != null) __obj.updateDynamic("argv")(argv.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(eval)) __obj.updateDynamic("eval")(eval.asInstanceOf[js.Any])
    if (execArgv != null) __obj.updateDynamic("execArgv")(execArgv.asInstanceOf[js.Any])
    if (resourceLimits != null) __obj.updateDynamic("resourceLimits")(resourceLimits.asInstanceOf[js.Any])
    if (!js.isUndefined(stderr)) __obj.updateDynamic("stderr")(stderr.asInstanceOf[js.Any])
    if (!js.isUndefined(stdin)) __obj.updateDynamic("stdin")(stdin.asInstanceOf[js.Any])
    if (!js.isUndefined(stdout)) __obj.updateDynamic("stdout")(stdout.asInstanceOf[js.Any])
    if (transferList != null) __obj.updateDynamic("transferList")(transferList.asInstanceOf[js.Any])
    if (workerData != null) __obj.updateDynamic("workerData")(workerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOptions]
  }
}

