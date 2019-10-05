package typings.mz.readlineMod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadLineOptions extends js.Object {
  var completer: js.UndefOr[Completer] = js.undefined
  var historySize: js.UndefOr[Double] = js.undefined
  var input: ReadableStream
  var output: js.UndefOr[WritableStream] = js.undefined
  var terminal: js.UndefOr[Boolean] = js.undefined
}

object ReadLineOptions {
  @scala.inline
  def apply(
    input: ReadableStream,
    completer: Completer = null,
    historySize: Int | Double = null,
    output: WritableStream = null,
    terminal: js.UndefOr[Boolean] = js.undefined
  ): ReadLineOptions = {
    val __obj = js.Dynamic.literal(input = input)
    if (completer != null) __obj.updateDynamic("completer")(completer)
    if (historySize != null) __obj.updateDynamic("historySize")(historySize.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output)
    if (!js.isUndefined(terminal)) __obj.updateDynamic("terminal")(terminal)
    __obj.asInstanceOf[ReadLineOptions]
  }
}

