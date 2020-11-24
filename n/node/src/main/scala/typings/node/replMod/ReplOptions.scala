package typings.node.replMod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.readlineMod.AsyncCompleter
import typings.node.readlineMod.Completer
import typings.node.readlineMod.CompleterResult
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplOptions extends js.Object {
  
  /**
    * Stop evaluating the current piece of code when `SIGINT` is received, i.e. `Ctrl+C` is
    * pressed. This cannot be used together with a custom `eval` function.
    * Default: `false`.
    */
  var breakEvalOnSigint: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional function used for custom Tab auto completion.
    *
    * @see https://nodejs.org/dist/latest-v11.x/docs/api/readline.html#readline_use_of_the_completer_function
    */
  var completer: js.UndefOr[Completer | AsyncCompleter] = js.native
  
  /**
    * The function to be used when evaluating each given line of input.
    * Default: an async wrapper for the JavaScript `eval()` function. An `eval` function can
    * error with `repl.Recoverable` to indicate the input was incomplete and prompt for
    * additional lines.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_default_evaluation
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_custom_evaluation_functions
    */
  var eval: js.UndefOr[REPLEval] = js.native
  
  /**
    * If `true`, specifies that the default writer will not output the return value of a
    * command if it evaluates to `undefined`.
    * Default: `false`.
    */
  var ignoreUndefined: js.UndefOr[Boolean] = js.native
  
  /**
    * The `Readable` stream from which REPL input will be read.
    * Default: `process.stdin`
    */
  var input: js.UndefOr[ReadableStream] = js.native
  
  /**
    * The `Writable` stream to which REPL output will be written.
    * Default: `process.stdout`
    */
  var output: js.UndefOr[WritableStream] = js.native
  
  /**
    * Defines if the repl prints output previews or not.
    * @default `true` Always `false` in case `terminal` is falsy.
    */
  var preview: js.UndefOr[Boolean] = js.native
  
  /**
    * The input prompt to display.
    * Default: `"> "`
    */
  var prompt: js.UndefOr[String] = js.native
  
  /**
    * A flag that specifies whether the default evaluator executes all JavaScript commands in
    * strict mode or default (sloppy) mode.
    * Accepted values are:
    * - `repl.REPL_MODE_SLOPPY` - evaluates expressions in sloppy mode.
    * - `repl.REPL_MODE_STRICT` - evaluates expressions in strict mode. This is equivalent to
    *   prefacing every repl statement with `'use strict'`.
    */
  var replMode: js.UndefOr[js.Symbol] = js.native
  
  /**
    * If `true`, specifies that the output should be treated as a TTY terminal, and have
    * ANSI/VT100 escape codes written to it.
    * Default: checking the value of the `isTTY` property on the output stream upon
    * instantiation.
    */
  var terminal: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, specifies that the default `writer` function should include ANSI color
    * styling to REPL output. If a custom `writer` function is provided then this has no
    * effect.
    * Default: the REPL instance's `terminal` value.
    */
  var useColors: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, specifies that the default evaluation function will use the JavaScript
    * `global` as the context as opposed to creating a new separate context for the REPL
    * instance. The node CLI REPL sets this value to `true`.
    * Default: `false`.
    */
  var useGlobal: js.UndefOr[Boolean] = js.native
  
  /**
    * The function to invoke to format the output of each command before writing to `output`.
    * Default: a wrapper for `util.inspect`.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_customizing_repl_output
    */
  var writer: js.UndefOr[REPLWriter] = js.native
}
object ReplOptions {
  
  @scala.inline
  def apply(): ReplOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplOptions]
  }
  
  @scala.inline
  implicit class ReplOptionsOps[Self <: ReplOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBreakEvalOnSigint(value: Boolean): Self = this.set("breakEvalOnSigint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakEvalOnSigint: Self = this.set("breakEvalOnSigint", js.undefined)
    
    @scala.inline
    def setCompleterFunction2(
      value: (/* line */ String, /* callback */ js.Function2[/* err */ js.UndefOr[Null | Error], /* result */ js.UndefOr[CompleterResult], Unit]) => js.Any
    ): Self = this.set("completer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCompleterFunction1(value: /* line */ String => CompleterResult): Self = this.set("completer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleter(value: Completer | AsyncCompleter): Self = this.set("completer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleter: Self = this.set("completer", js.undefined)
    
    @scala.inline
    def setEval(value: REPLEval): Self = this.set("eval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEval: Self = this.set("eval", js.undefined)
    
    @scala.inline
    def setIgnoreUndefined(value: Boolean): Self = this.set("ignoreUndefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUndefined: Self = this.set("ignoreUndefined", js.undefined)
    
    @scala.inline
    def setInput(value: ReadableStream): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setOutput(value: WritableStream): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setPreview(value: Boolean): Self = this.set("preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    
    @scala.inline
    def setReplMode(value: js.Symbol): Self = this.set("replMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplMode: Self = this.set("replMode", js.undefined)
    
    @scala.inline
    def setTerminal(value: Boolean): Self = this.set("terminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminal: Self = this.set("terminal", js.undefined)
    
    @scala.inline
    def setUseColors(value: Boolean): Self = this.set("useColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseColors: Self = this.set("useColors", js.undefined)
    
    @scala.inline
    def setUseGlobal(value: Boolean): Self = this.set("useGlobal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseGlobal: Self = this.set("useGlobal", js.undefined)
    
    @scala.inline
    def setWriter(value: REPLWriter): Self = this.set("writer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriter: Self = this.set("writer", js.undefined)
  }
}
