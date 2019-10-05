package typings.node.readlineMod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadLineOptions extends js.Object {
  var completer: js.UndefOr[Completer | AsyncCompleter] = js.undefined
  var crlfDelay: js.UndefOr[Double] = js.undefined
  var historySize: js.UndefOr[Double] = js.undefined
  var input: ReadableStream
  var output: js.UndefOr[WritableStream] = js.undefined
  var prompt: js.UndefOr[java.lang.String] = js.undefined
  var removeHistoryDuplicates: js.UndefOr[Boolean] = js.undefined
  var terminal: js.UndefOr[Boolean] = js.undefined
}

object ReadLineOptions {
  @scala.inline
  def apply(
    input: ReadableStream,
    completer: Completer | AsyncCompleter = null,
    crlfDelay: Int | Double = null,
    historySize: Int | Double = null,
    output: WritableStream = null,
    prompt: java.lang.String = null,
    removeHistoryDuplicates: js.UndefOr[Boolean] = js.undefined,
    terminal: js.UndefOr[Boolean] = js.undefined
  ): ReadLineOptions = {
    val __obj = js.Dynamic.literal(input = input)
    if (completer != null) __obj.updateDynamic("completer")(completer.asInstanceOf[js.Any])
    if (crlfDelay != null) __obj.updateDynamic("crlfDelay")(crlfDelay.asInstanceOf[js.Any])
    if (historySize != null) __obj.updateDynamic("historySize")(historySize.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (!js.isUndefined(removeHistoryDuplicates)) __obj.updateDynamic("removeHistoryDuplicates")(removeHistoryDuplicates)
    if (!js.isUndefined(terminal)) __obj.updateDynamic("terminal")(terminal)
    __obj.asInstanceOf[ReadLineOptions]
  }
}

