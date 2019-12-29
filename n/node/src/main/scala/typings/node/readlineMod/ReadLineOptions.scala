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
  var prompt: js.UndefOr[String] = js.undefined
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
    prompt: String = null,
    removeHistoryDuplicates: js.UndefOr[Boolean] = js.undefined,
    terminal: js.UndefOr[Boolean] = js.undefined
  ): ReadLineOptions = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    if (completer != null) __obj.updateDynamic("completer")(completer.asInstanceOf[js.Any])
    if (crlfDelay != null) __obj.updateDynamic("crlfDelay")(crlfDelay.asInstanceOf[js.Any])
    if (historySize != null) __obj.updateDynamic("historySize")(historySize.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (!js.isUndefined(removeHistoryDuplicates)) __obj.updateDynamic("removeHistoryDuplicates")(removeHistoryDuplicates.asInstanceOf[js.Any])
    if (!js.isUndefined(terminal)) __obj.updateDynamic("terminal")(terminal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadLineOptions]
  }
}

