package typings
package mzLib.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadLineOptions extends js.Object {
  var completer: js.UndefOr[Completer] = js.undefined
  var historySize: js.UndefOr[scala.Double] = js.undefined
  var input: nodeLib.NodeJSNs.ReadableStream
  var output: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
  var terminal: js.UndefOr[scala.Boolean] = js.undefined
}

object ReadLineOptions {
  @scala.inline
  def apply(
    input: nodeLib.NodeJSNs.ReadableStream,
    completer: Completer = null,
    historySize: scala.Int | scala.Double = null,
    output: nodeLib.NodeJSNs.WritableStream = null,
    terminal: js.UndefOr[scala.Boolean] = js.undefined
  ): ReadLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("input")(input)
    if (completer != null) __obj.updateDynamic("completer")(completer)
    if (historySize != null) __obj.updateDynamic("historySize")(historySize.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output)
    if (!js.isUndefined(terminal)) __obj.updateDynamic("terminal")(terminal)
    __obj.asInstanceOf[ReadLineOptions]
  }
}

