package typings.node.readlineMod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadLineOptions extends js.Object {
  var completer: js.UndefOr[Completer | AsyncCompleter] = js.undefined
  var crlfDelay: js.UndefOr[Double] = js.undefined
  var escapeCodeTimeout: js.UndefOr[Double] = js.undefined
  var historySize: js.UndefOr[Double] = js.undefined
  var input: ReadableStream
  var output: js.UndefOr[WritableStream] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var removeHistoryDuplicates: js.UndefOr[Boolean] = js.undefined
  var tabSize: js.UndefOr[Double] = js.undefined
  var terminal: js.UndefOr[Boolean] = js.undefined
}

object ReadLineOptions {
  @scala.inline
  def apply(
    input: ReadableStream,
    completer: Completer | AsyncCompleter = null,
    crlfDelay: js.UndefOr[Double] = js.undefined,
    escapeCodeTimeout: js.UndefOr[Double] = js.undefined,
    historySize: js.UndefOr[Double] = js.undefined,
    output: WritableStream = null,
    prompt: String = null,
    removeHistoryDuplicates: js.UndefOr[Boolean] = js.undefined,
    tabSize: js.UndefOr[Double] = js.undefined,
    terminal: js.UndefOr[Boolean] = js.undefined
  ): ReadLineOptions = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    if (completer != null) __obj.updateDynamic("completer")(completer.asInstanceOf[js.Any])
    if (!js.isUndefined(crlfDelay)) __obj.updateDynamic("crlfDelay")(crlfDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeCodeTimeout)) __obj.updateDynamic("escapeCodeTimeout")(escapeCodeTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(historySize)) __obj.updateDynamic("historySize")(historySize.get.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (!js.isUndefined(removeHistoryDuplicates)) __obj.updateDynamic("removeHistoryDuplicates")(removeHistoryDuplicates.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabSize)) __obj.updateDynamic("tabSize")(tabSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(terminal)) __obj.updateDynamic("terminal")(terminal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadLineOptions]
  }
}

