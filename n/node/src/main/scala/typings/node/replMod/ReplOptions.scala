package typings.node.replMod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.readlineMod.AsyncCompleter
import typings.node.readlineMod.Completer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplOptions extends js.Object {
  /**
    * Stop evaluating the current piece of code when `SIGINT` is received, i.e. `Ctrl+C` is
    * pressed. This cannot be used together with a custom `eval` function.
    * Default: `false`.
    */
  var breakEvalOnSigint: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional function used for custom Tab auto completion.
    *
    * @see https://nodejs.org/dist/latest-v11.x/docs/api/readline.html#readline_use_of_the_completer_function
    */
  var completer: js.UndefOr[Completer | AsyncCompleter] = js.undefined
  /**
    * The function to be used when evaluating each given line of input.
    * Default: an async wrapper for the JavaScript `eval()` function. An `eval` function can
    * error with `repl.Recoverable` to indicate the input was incomplete and prompt for
    * additional lines.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_default_evaluation
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_custom_evaluation_functions
    */
  var eval: js.UndefOr[REPLEval] = js.undefined
  /**
    * If `true`, specifies that the default writer will not output the return value of a
    * command if it evaluates to `undefined`.
    * Default: `false`.
    */
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
  /**
    * The `Readable` stream from which REPL input will be read.
    * Default: `process.stdin`
    */
  var input: js.UndefOr[ReadableStream] = js.undefined
  /**
    * The `Writable` stream to which REPL output will be written.
    * Default: `process.stdout`
    */
  var output: js.UndefOr[WritableStream] = js.undefined
  /**
    * The input prompt to display.
    * Default: `"> "`
    */
  var prompt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A flag that specifies whether the default evaluator executes all JavaScript commands in
    * strict mode or default (sloppy) mode.
    * Accepted values are:
    * - `repl.REPL_MODE_SLOPPY` - evaluates expressions in sloppy mode.
    * - `repl.REPL_MODE_STRICT` - evaluates expressions in strict mode. This is equivalent to
    *   prefacing every repl statement with `'use strict'`.
    */
  var replMode: js.UndefOr[js.Symbol] = js.undefined
  /**
    * If `true`, specifies that the output should be treated as a TTY terminal, and have
    * ANSI/VT100 escape codes written to it.
    * Default: checking the value of the `isTTY` property on the output stream upon
    * instantiation.
    */
  var terminal: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, specifies that the default `writer` function should include ANSI color
    * styling to REPL output. If a custom `writer` function is provided then this has no
    * effect.
    * Default: the REPL instance's `terminal` value.
    */
  var useColors: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, specifies that the default evaluation function will use the JavaScript
    * `global` as the context as opposed to creating a new separate context for the REPL
    * instance. The node CLI REPL sets this value to `true`.
    * Default: `false`.
    */
  var useGlobal: js.UndefOr[Boolean] = js.undefined
  /**
    * The function to invoke to format the output of each command before writing to `output`.
    * Default: a wrapper for `util.inspect`.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_customizing_repl_output
    */
  var writer: js.UndefOr[REPLWriter] = js.undefined
}

object ReplOptions {
  @scala.inline
  def apply(
    breakEvalOnSigint: js.UndefOr[Boolean] = js.undefined,
    completer: Completer | AsyncCompleter = null,
    eval: REPLEval = null,
    ignoreUndefined: js.UndefOr[Boolean] = js.undefined,
    input: ReadableStream = null,
    output: WritableStream = null,
    prompt: java.lang.String = null,
    replMode: js.Symbol = null,
    terminal: js.UndefOr[Boolean] = js.undefined,
    useColors: js.UndefOr[Boolean] = js.undefined,
    useGlobal: js.UndefOr[Boolean] = js.undefined,
    writer: REPLWriter = null
  ): ReplOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breakEvalOnSigint)) __obj.updateDynamic("breakEvalOnSigint")(breakEvalOnSigint.asInstanceOf[js.Any])
    if (completer != null) __obj.updateDynamic("completer")(completer.asInstanceOf[js.Any])
    if (eval != null) __obj.updateDynamic("eval")(eval.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (replMode != null) __obj.updateDynamic("replMode")(replMode.asInstanceOf[js.Any])
    if (!js.isUndefined(terminal)) __obj.updateDynamic("terminal")(terminal.asInstanceOf[js.Any])
    if (!js.isUndefined(useColors)) __obj.updateDynamic("useColors")(useColors.asInstanceOf[js.Any])
    if (!js.isUndefined(useGlobal)) __obj.updateDynamic("useGlobal")(useGlobal.asInstanceOf[js.Any])
    if (writer != null) __obj.updateDynamic("writer")(writer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplOptions]
  }
}

