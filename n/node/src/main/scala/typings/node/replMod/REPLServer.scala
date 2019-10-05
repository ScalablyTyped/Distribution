package typings.node.replMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Error
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.nodeStrings.exit
import typings.node.nodeStrings.reset
import typings.node.readlineMod.AsyncCompleter
import typings.node.readlineMod.Completer
import typings.node.readlineMod.Interface
import typings.node.vmMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a customizable Read-Eval-Print-Loop (REPL).
  *
  * Instances of `repl.REPLServer` will accept individual lines of user input, evaluate those
  * according to a user-defined evaluation function, then output the result. Input and output
  * may be from `stdin` and `stdout`, respectively, or may be connected to any Node.js `stream`.
  *
  * Instances of `repl.REPLServer` support automatic completion of inputs, simplistic Emacs-style
  * line editing, multi-line inputs, ANSI-styled output, saving and restoring current REPL session
  * state, error recovery, and customizable evaluation functions.
  *
  * Instances of `repl.REPLServer` are created using the `repl.start()` method and _should not_
  * be created directly using the JavaScript `new` keyword.
  *
  * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_repl
  */
@js.native
trait REPLServer extends Interface {
  /**
    * The commands registered via `replServer.defineCommand()`.
    */
  val commands: StringDictionary[js.UndefOr[REPLCommand]] = js.native
  /**
    * Specified in the REPL options, this is the function to use for custom Tab auto-completion.
    */
  val completer: Completer | AsyncCompleter = js.native
  /**
    * The `vm.Context` provided to the `eval` function to be used for JavaScript
    * evaluation.
    */
  val context: Context = js.native
  /**
    * A value indicating whether the REPL is currently in "editor mode".
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_commands_and_special_keys
    */
  val editorMode: Boolean = js.native
  /**
    * Specified in the REPL options, this is a value indicating whether the default `writer`
    * function should output the result of a command if it evaluates to `undefined`.
    */
  val ignoreUndefined: Boolean = js.native
  /**
    * The `Readable` stream from which REPL input will be read.
    */
  val inputStream: ReadableStream = js.native
  /**
    * The last evaluation result from the REPL (assigned to the `_` variable inside of the REPL).
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_assignment_of_the_underscore_variable
    */
  val last: js.Any = js.native
  /**
    * The last error raised inside the REPL (assigned to the `_error` variable inside of the REPL).
    *
    * @since v9.8.0
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_assignment_of_the_underscore_variable
    */
  val lastError: js.Any = js.native
  /**
    * The `Writable` stream to which REPL output will be written.
    */
  val outputStream: WritableStream = js.native
  /**
    * Specified in the REPL options, this is a flag that specifies whether the default `eval`
    * function should execute all JavaScript commands in strict mode or default (sloppy) mode.
    * Possible values are:
    * - `repl.REPL_MODE_SLOPPY` - evaluates expressions in sloppy mode.
    * - `repl.REPL_MODE_STRICT` - evaluates expressions in strict mode. This is equivalent to
    *    prefacing every repl statement with `'use strict'`.
    */
  val replMode: js.Symbol = js.native
  /**
    * A value indicating whether the `_` variable has been assigned.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_assignment_of_the_underscore_variable
    */
  val underscoreAssigned: Boolean = js.native
  /**
    * A value indicating whether the `_error` variable has been assigned.
    *
    * @since v9.8.0
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_assignment_of_the_underscore_variable
    */
  val underscoreErrAssigned: Boolean = js.native
  /**
    * Specified in the REPL options, this is a value indicating whether the default
    * `writer` function should include ANSI color styling to REPL output.
    */
  val useColors: Boolean = js.native
  /**
    * Specified in the REPL options, this is a value indicating whether the default `eval`
    * function will use the JavaScript `global` as the context as opposed to creating a new
    * separate context for the REPL instance.
    */
  val useGlobal: Boolean = js.native
  @JSName("addListener")
  def addListener_exit(event: exit, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_reset(event: reset, listener: js.Function1[/* context */ Context, Unit]): this.type = js.native
  /**
    * Clears any command that has been buffered but not yet executed.
    *
    * This method is primarily intended to be called from within the action function for
    * commands registered using the `replServer.defineCommand()` method.
    *
    * @since v9.0.0
    */
  def clearBufferedCommand(): Unit = js.native
  def defineCommand(keyword: java.lang.String, cmd: REPLCommand): Unit = js.native
  /**
    * Used to add new `.`-prefixed commands to the REPL instance. Such commands are invoked
    * by typing a `.` followed by the `keyword`.
    *
    * @param keyword The command keyword (_without_ a leading `.` character).
    * @param cmd The function to invoke when the command is processed.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_replserver_definecommand_keyword_cmd
    */
  def defineCommand(keyword: java.lang.String, cmd: REPLCommandAction): Unit = js.native
  /**
    * Readies the REPL instance for input from the user, printing the configured `prompt` to a
    * new line in the `output` and resuming the `input` to accept new input.
    *
    * When multi-line input is being entered, an ellipsis is printed rather than the 'prompt'.
    *
    * This method is primarily intended to be called from within the action function for
    * commands registered using the `replServer.defineCommand()` method.
    *
    * @param preserveCursor When `true`, the cursor placement will not be reset to `0`.
    */
  def displayPrompt(): Unit = js.native
  def displayPrompt(preserveCursor: Boolean): Unit = js.native
  @JSName("emit")
  def emit_exit(event: exit): Boolean = js.native
  @JSName("emit")
  def emit_reset(event: reset, context: Context): Boolean = js.native
  /**
    * Specified in the REPL options, this is the function to be used when evaluating each
    * given line of input. If not specified in the REPL options, this is an async wrapper
    * for the JavaScript `eval()` function.
    */
  def eval(
    `this`: REPLServer,
    evalCmd: java.lang.String,
    context: Context,
    file: java.lang.String,
    cb: js.Function2[/* err */ Error | Null, /* result */ js.Any, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_exit(event: exit, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_reset(event: reset, listener: js.Function1[/* context */ Context, Unit]): this.type = js.native
  @JSName("once")
  def once_exit(event: exit, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_reset(event: reset, listener: js.Function1[/* context */ Context, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_exit(event: exit, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_reset(event: reset, listener: js.Function1[/* context */ Context, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(event: exit, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_reset(event: reset, listener: js.Function1[/* context */ Context, Unit]): this.type = js.native
  /**
    * Initializes a history log file for the REPL instance. When executing the
    * Node.js binary and using the command line REPL, a history file is initialized
    * by default. However, this is not the case when creating a REPL
    * programmatically. Use this method to initialize a history log file when working
    * with REPL instances programmatically.
    * @param path The path to the history file
    */
  def setupHistory(path: java.lang.String, cb: js.Function2[/* err */ Error | Null, /* repl */ this.type, Unit]): Unit = js.native
  /**
    * Specified in the REPL options, this is the function to invoke to format the output of
    * each command before writing to `outputStream`. If not specified in the REPL options,
    * this will be a wrapper for `util.inspect`.
    */
  def writer(`this`: REPLServer, obj: js.Any): java.lang.String = js.native
}

