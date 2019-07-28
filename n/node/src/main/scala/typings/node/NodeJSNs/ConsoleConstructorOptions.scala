package typings.node.NodeJSNs

import typings.node.nodeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleConstructorOptions extends js.Object {
  var colorMode: js.UndefOr[Boolean | auto] = js.undefined
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  var inspectOptions: js.UndefOr[InspectOptions] = js.undefined
  var stderr: js.UndefOr[WritableStream] = js.undefined
  var stdout: WritableStream
}

object ConsoleConstructorOptions {
  @scala.inline
  def apply(
    stdout: WritableStream,
    colorMode: Boolean | auto = null,
    ignoreErrors: js.UndefOr[Boolean] = js.undefined,
    inspectOptions: InspectOptions = null,
    stderr: WritableStream = null
  ): ConsoleConstructorOptions = {
    val __obj = js.Dynamic.literal(stdout = stdout)
    if (colorMode != null) __obj.updateDynamic("colorMode")(colorMode.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors)
    if (inspectOptions != null) __obj.updateDynamic("inspectOptions")(inspectOptions)
    if (stderr != null) __obj.updateDynamic("stderr")(stderr)
    __obj.asInstanceOf[ConsoleConstructorOptions]
  }
}

