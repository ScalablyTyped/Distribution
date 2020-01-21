package typings.node.workerThreadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerOptions extends js.Object {
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
    eval: js.UndefOr[Boolean] = js.undefined,
    execArgv: js.Array[String] = null,
    resourceLimits: ResourceLimits = null,
    stderr: js.UndefOr[Boolean] = js.undefined,
    stdin: js.UndefOr[Boolean] = js.undefined,
    stdout: js.UndefOr[Boolean] = js.undefined,
    workerData: js.Any = null
  ): WorkerOptions = {
    val __obj = js.Dynamic.literal()
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

