package typings.node

import typings.node.NodeJS.ReadOnlyDict
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.Options
import typings.node.readlineMod.AsyncCompleter
import typings.node.readlineMod.Completer
import typings.node.readlineMod.CompleterResult
import typings.node.vmMod.Context
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replMod {
  
  @JSImport("repl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Instances of `repl.REPLServer` are created using the {@link start} method
    * or directly using the JavaScript `new` keyword.
    *
    * ```js
    * const repl = require('repl');
    *
    * const options = { useColors: true };
    *
    * const firstInstance = repl.start(options);
    * const secondInstance = new repl.REPLServer(options);
    * ```
    * @since v0.1.91
    */
  @JSImport("repl", "REPLServer")
  @js.native
  /**
    * NOTE: According to the documentation:
    *
    * > Instances of `repl.REPLServer` are created using the `repl.start()` method and
    * > _should not_ be created directly using the JavaScript `new` keyword.
    *
    * `REPLServer` cannot be subclassed due to implementation specifics in NodeJS.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_class_replserver
    */
  /* private */ open class REPLServer () extends StObject {
    
    @JSName("addListener")
    @scala.annotation.targetName("addListener_SIGTSTP")
    def addListener(event: "SIGTSTP", listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    @scala.annotation.targetName("addListener_resume")
    def addListener(event: "resume", listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    @scala.annotation.targetName("addListener_SIGCONT")
    def addListener(event: "SIGCONT", listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    @scala.annotation.targetName("addListener_exit")
    def addListener(event: "exit", listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    @scala.annotation.targetName("addListener_pause")
    def addListener(event: "pause", listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    @scala.annotation.targetName("addListener_SIGINT")
    def addListener(event: "SIGINT", listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    @scala.annotation.targetName("addListener_close")
    def addListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    @scala.annotation.targetName("addListener_line")
    def addListener(event: "line", listener: js.Function1[/* input */ String, Unit]): this.type = js.native
    @JSName("addListener")
    @scala.annotation.targetName("addListener_reset")
    def addListener(event: "reset", listener: js.Function1[/* context */ Context, Unit]): this.type = js.native
    /**
      * events.EventEmitter
      * 1. close - inherited from `readline.Interface`
      * 2. line - inherited from `readline.Interface`
      * 3. pause - inherited from `readline.Interface`
      * 4. resume - inherited from `readline.Interface`
      * 5. SIGCONT - inherited from `readline.Interface`
      * 6. SIGINT - inherited from `readline.Interface`
      * 7. SIGTSTP - inherited from `readline.Interface`
      * 8. exit
      * 9. reset
      */
    def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * The `replServer.clearBufferedCommand()` method clears any command that has been
      * buffered but not yet executed. This method is primarily intended to be
      * called from within the action function for commands registered using the`replServer.defineCommand()` method.
      * @since v9.0.0
      */
    def clearBufferedCommand(): Unit = js.native
    
    /**
      * The commands registered via `replServer.defineCommand()`.
      */
    val commands: ReadOnlyDict[REPLCommand] = js.native
    
    /**
      * Specified in the REPL options, this is the function to use for custom Tab auto-completion.
      */
    val completer: Completer | AsyncCompleter = js.native
    
    /**
      * The `vm.Context` provided to the `eval` function to be used for JavaScript
      * evaluation.
      */
    val context: Context = js.native
    
    def defineCommand(keyword: String, cmd: REPLCommand): Unit = js.native
    /**
      * The `replServer.defineCommand()` method is used to add new `.`\-prefixed commands
      * to the REPL instance. Such commands are invoked by typing a `.` followed by the`keyword`. The `cmd` is either a `Function` or an `Object` with the following
      * properties:
      *
      * The following example shows two new commands added to the REPL instance:
      *
      * ```js
      * const repl = require('repl');
      *
      * const replServer = repl.start({ prompt: '> ' });
      * replServer.defineCommand('sayhello', {
      *   help: 'Say hello',
      *   action(name) {
      *     this.clearBufferedCommand();
      *     console.log(`Hello, ${name}!`);
      *     this.displayPrompt();
      *   }
      * });
      * replServer.defineCommand('saybye', function saybye() {
      *   console.log('Goodbye!');
      *   this.close();
      * });
      * ```
      *
      * The new commands can then be used from within the REPL instance:
      *
      * ```console
      * > .sayhello Node.js User
      * Hello, Node.js User!
      * > .saybye
      * Goodbye!
      * ```
      * @since v0.3.0
      * @param keyword The command keyword (_without_ a leading `.` character).
      * @param cmd The function to invoke when the command is processed.
      */
    def defineCommand(keyword: String, cmd: REPLCommandAction): Unit = js.native
    
    /**
      * The `replServer.displayPrompt()` method readies the REPL instance for input
      * from the user, printing the configured `prompt` to a new line in the `output`and resuming the `input` to accept new input.
      *
      * When multi-line input is being entered, an ellipsis is printed rather than the
      * 'prompt'.
      *
      * When `preserveCursor` is `true`, the cursor placement will not be reset to `0`.
      *
      * The `replServer.displayPrompt` method is primarily intended to be called from
      * within the action function for commands registered using the`replServer.defineCommand()` method.
      * @since v0.1.91
      */
    def displayPrompt(): Unit = js.native
    def displayPrompt(preserveCursor: Boolean): Unit = js.native
    
    /**
      * A value indicating whether the REPL is currently in "editor mode".
      *
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_commands_and_special_keys
      */
    val editorMode: Boolean = js.native
    
    @JSName("emit")
    @scala.annotation.targetName("emit_close")
    def emit(event: "close"): Boolean = js.native
    @JSName("emit")
    @scala.annotation.targetName("emit_SIGTSTP")
    def emit(event: "SIGTSTP"): Boolean = js.native
    @JSName("emit")
    @scala.annotation.targetName("emit_resume")
    def emit(event: "resume"): Boolean = js.native
    @JSName("emit")
    @scala.annotation.targetName("emit_SIGINT")
    def emit(event: "SIGINT"): Boolean = js.native
    @JSName("emit")
    @scala.annotation.targetName("emit_exit")
    def emit(event: "exit"): Boolean = js.native
    @JSName("emit")
    @scala.annotation.targetName("emit_SIGCONT")
    def emit(event: "SIGCONT"): Boolean = js.native
    @JSName("emit")
    @scala.annotation.targetName("emit_pause")
    def emit(event: "pause"): Boolean = js.native
    @JSName("emit")
    @scala.annotation.targetName("emit_reset")
    def emit(event: "reset", context: Context): Boolean = js.native
    @JSName("emit")
    @scala.annotation.targetName("emit_line")
    def emit(event: "line", input: String): Boolean = js.native
    def emit(event: String, args: Any*): Boolean = js.native
    def emit(event: js.Symbol, args: Any*): Boolean = js.native
    
    /**
      * Specified in the REPL options, this is the function to be used when evaluating each
      * given line of input. If not specified in the REPL options, this is an async wrapper
      * for the JavaScript `eval()` function.
      */
    def eval(
      evalCmd: String,
      context: Context,
      file: String,
      cb: js.Function2[/* err */ js.Error | Null, /* result */ Any, Unit]
    ): Unit = js.native
    
    /**
      * Specified in the REPL options, this is a value indicating whether the default `writer`
      * function should output the result of a command if it evaluates to `undefined`.
      */
    val ignoreUndefined: Boolean = js.native
    
    /**
      * The `Readable` stream from which REPL input will be read.
      */
    val input: ReadableStream = js.native
    
    /**
      * @deprecated since v14.3.0 - Use `input` instead.
      */
    val inputStream: ReadableStream = js.native
    
    /**
      * The last evaluation result from the REPL (assigned to the `_` variable inside of the REPL).
      *
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_assignment_of_the_underscore_variable
      */
    val last: Any = js.native
    
    /**
      * The last error raised inside the REPL (assigned to the `_error` variable inside of the REPL).
      *
      * @since v9.8.0
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_assignment_of_the_underscore_variable
      */
    val lastError: Any = js.native
    
    @JSName("on")
    @scala.annotation.targetName("on_resume")
    def on(event: "resume", listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    @scala.annotation.targetName("on_exit")
    def on(event: "exit", listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    @scala.annotation.targetName("on_pause")
    def on(event: "pause", listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    @scala.annotation.targetName("on_close")
    def on(event: "close", listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    @scala.annotation.targetName("on_SIGCONT")
    def on(event: "SIGCONT", listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    @scala.annotation.targetName("on_SIGINT")
    def on(event: "SIGINT", listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    @scala.annotation.targetName("on_SIGTSTP")
    def on(event: "SIGTSTP", listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    @scala.annotation.targetName("on_line")
    def on(event: "line", listener: js.Function1[/* input */ String, Unit]): this.type = js.native
    @JSName("on")
    @scala.annotation.targetName("on_reset")
    def on(event: "reset", listener: js.Function1[/* context */ Context, Unit]): this.type = js.native
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    @JSName("once")
    @scala.annotation.targetName("once_pause")
    def once(event: "pause", listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    @scala.annotation.targetName("once_SIGCONT")
    def once(event: "SIGCONT", listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    @scala.annotation.targetName("once_SIGTSTP")
    def once(event: "SIGTSTP", listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    @scala.annotation.targetName("once_SIGINT")
    def once(event: "SIGINT", listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    @scala.annotation.targetName("once_resume")
    def once(event: "resume", listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    @scala.annotation.targetName("once_close")
    def once(event: "close", listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    @scala.annotation.targetName("once_exit")
    def once(event: "exit", listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    @scala.annotation.targetName("once_reset")
    def once(event: "reset", listener: js.Function1[/* context */ Context, Unit]): this.type = js.native
    @JSName("once")
    @scala.annotation.targetName("once_line")
    def once(event: "line", listener: js.Function1[/* input */ String, Unit]): this.type = js.native
    def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * The `Writable` stream to which REPL output will be written.
      */
    val output: WritableStream = js.native
    
    /**
      * @deprecated since v14.3.0 - Use `output` instead.
      */
    val outputStream: WritableStream = js.native
    
    @JSName("prependListener")
    @scala.annotation.targetName("prependListener_SIGCONT")
    def prependListener(event: "SIGCONT", listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    @scala.annotation.targetName("prependListener_close")
    def prependListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    @scala.annotation.targetName("prependListener_pause")
    def prependListener(event: "pause", listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    @scala.annotation.targetName("prependListener_exit")
    def prependListener(event: "exit", listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    @scala.annotation.targetName("prependListener_SIGINT")
    def prependListener(event: "SIGINT", listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    @scala.annotation.targetName("prependListener_resume")
    def prependListener(event: "resume", listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    @scala.annotation.targetName("prependListener_SIGTSTP")
    def prependListener(event: "SIGTSTP", listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    @scala.annotation.targetName("prependListener_line")
    def prependListener(event: "line", listener: js.Function1[/* input */ String, Unit]): this.type = js.native
    @JSName("prependListener")
    @scala.annotation.targetName("prependListener_reset")
    def prependListener(event: "reset", listener: js.Function1[/* context */ Context, Unit]): this.type = js.native
    def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    @scala.annotation.targetName("prependOnceListener_SIGTSTP")
    def prependOnceListener(event: "SIGTSTP", listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    @scala.annotation.targetName("prependOnceListener_exit")
    def prependOnceListener(event: "exit", listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    @scala.annotation.targetName("prependOnceListener_resume")
    def prependOnceListener(event: "resume", listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    @scala.annotation.targetName("prependOnceListener_SIGINT")
    def prependOnceListener(event: "SIGINT", listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    @scala.annotation.targetName("prependOnceListener_close")
    def prependOnceListener(event: "close", listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    @scala.annotation.targetName("prependOnceListener_SIGCONT")
    def prependOnceListener(event: "SIGCONT", listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    @scala.annotation.targetName("prependOnceListener_pause")
    def prependOnceListener(event: "pause", listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    @scala.annotation.targetName("prependOnceListener_line")
    def prependOnceListener(event: "line", listener: js.Function1[/* input */ String, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    @scala.annotation.targetName("prependOnceListener_reset")
    def prependOnceListener(event: "reset", listener: js.Function1[/* context */ Context, Unit]): this.type = js.native
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
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
      * Initializes a history log file for the REPL instance. When executing the
      * Node.js binary and using the command-line REPL, a history file is initialized
      * by default. However, this is not the case when creating a REPL
      * programmatically. Use this method to initialize a history log file when working
      * with REPL instances programmatically.
      * @since v11.10.0
      * @param historyPath the path to the history file
      * @param callback called when history writes are ready or upon error
      */
    def setupHistory(path: String, callback: js.Function2[/* err */ js.Error | Null, /* repl */ this.type, Unit]): Unit = js.native
    
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
    
    /**
      * Specified in the REPL options, this is the function to invoke to format the output of
      * each command before writing to `outputStream`. If not specified in the REPL options,
      * this will be a wrapper for `util.inspect`.
      */
    def writer(obj: Any): String = js.native
  }
  
  /**
    * A flag passed in the REPL options. Evaluates expressions in sloppy mode.
    */
  @JSImport("repl", "REPL_MODE_SLOPPY")
  @js.native
  val REPL_MODE_SLOPPY: js.Symbol = js.native
  
  /**
    * A flag passed in the REPL options. Evaluates expressions in strict mode.
    * This is equivalent to prefacing every repl statement with `'use strict'`.
    */
  @JSImport("repl", "REPL_MODE_STRICT")
  @js.native
  val REPL_MODE_STRICT: js.Symbol = js.native
  
  /**
    * Indicates a recoverable error that a `REPLServer` can use to support multi-line input.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_recoverable_errors
    */
  @JSImport("repl", "Recoverable")
  @js.native
  open class Recoverable protected ()
    extends StObject
       with Error {
    def this(err: js.Error) = this()
    
    var err: js.Error = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /**
    * The `repl.start()` method creates and starts a {@link REPLServer} instance.
    *
    * If `options` is a string, then it specifies the input prompt:
    *
    * ```js
    * const repl = require('repl');
    *
    * // a Unix style prompt
    * repl.start('$ ');
    * ```
    * @since v0.1.91
    */
  inline def start(): REPLServer = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[REPLServer]
  inline def start(options: String): REPLServer = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[REPLServer]
  inline def start(options: ReplOptions): REPLServer = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[REPLServer]
  
  /**
    * This is the default "writer" value, if none is passed in the REPL options,
    * and it can be overridden by custom print functions.
    */
  @JSImport("repl", "writer")
  @js.native
  val writer: REPLWriter & Options = js.native
  
  trait REPLCommand extends StObject {
    
    /**
      * The function to execute, optionally accepting a single string argument.
      */
    def action(text: String): Unit
    /**
      * The function to execute, optionally accepting a single string argument.
      */
    @JSName("action")
    var action_Original: REPLCommandAction
    
    /**
      * Help text to be displayed when `.help` is entered.
      */
    var help: js.UndefOr[String] = js.undefined
  }
  object REPLCommand {
    
    inline def apply(action: REPLCommandAction): REPLCommand = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[REPLCommand]
    }
    
    extension [Self <: REPLCommand](x: Self) {
      
      inline def setAction(value: REPLCommandAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    }
  }
  
  type REPLCommandAction = js.ThisFunction1[/* this */ REPLServer, /* text */ String, Unit]
  
  type REPLEval = js.ThisFunction4[
    /* this */ REPLServer, 
    /* evalCmd */ String, 
    /* context */ Context, 
    /* file */ String, 
    /* cb */ js.Function2[/* err */ js.Error | Null, /* result */ Any, Unit], 
    Unit
  ]
  
  type REPLWriter = js.ThisFunction1[/* this */ REPLServer, /* obj */ Any, String]
  
  trait ReplOptions extends StObject {
    
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
      * @default process.stdin
      */
    var input: js.UndefOr[ReadableStream] = js.undefined
    
    /**
      * The `Writable` stream to which REPL output will be written.
      * @default process.stdout
      */
    var output: js.UndefOr[WritableStream] = js.undefined
    
    /**
      * Defines if the repl prints output previews or not.
      * @default `true` Always `false` in case `terminal` is falsy.
      */
    var preview: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The input prompt to display.
      * @default "> "
      */
    var prompt: js.UndefOr[String] = js.undefined
    
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
    
    inline def apply(): ReplOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplOptions]
    }
    
    extension [Self <: ReplOptions](x: Self) {
      
      inline def setBreakEvalOnSigint(value: Boolean): Self = StObject.set(x, "breakEvalOnSigint", value.asInstanceOf[js.Any])
      
      inline def setBreakEvalOnSigintUndefined: Self = StObject.set(x, "breakEvalOnSigint", js.undefined)
      
      inline def setCompleter(value: Completer | AsyncCompleter): Self = StObject.set(x, "completer", value.asInstanceOf[js.Any])
      
      inline def setCompleterFunction1(value: /* line */ String => CompleterResult): Self = StObject.set(x, "completer", js.Any.fromFunction1(value))
      
      inline def setCompleterFunction2(
        value: (/* line */ String, /* callback */ js.Function2[
              /* err */ js.UndefOr[Null | js.Error], 
              /* result */ js.UndefOr[CompleterResult], 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "completer", js.Any.fromFunction2(value))
      
      inline def setCompleterUndefined: Self = StObject.set(x, "completer", js.undefined)
      
      inline def setEval(value: REPLEval): Self = StObject.set(x, "eval", value.asInstanceOf[js.Any])
      
      inline def setEvalUndefined: Self = StObject.set(x, "eval", js.undefined)
      
      inline def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
      
      inline def setInput(value: ReadableStream): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setOutput(value: WritableStream): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setReplMode(value: js.Symbol): Self = StObject.set(x, "replMode", value.asInstanceOf[js.Any])
      
      inline def setReplModeUndefined: Self = StObject.set(x, "replMode", js.undefined)
      
      inline def setTerminal(value: Boolean): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
      
      inline def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
      
      inline def setUseColors(value: Boolean): Self = StObject.set(x, "useColors", value.asInstanceOf[js.Any])
      
      inline def setUseColorsUndefined: Self = StObject.set(x, "useColors", js.undefined)
      
      inline def setUseGlobal(value: Boolean): Self = StObject.set(x, "useGlobal", value.asInstanceOf[js.Any])
      
      inline def setUseGlobalUndefined: Self = StObject.set(x, "useGlobal", js.undefined)
      
      inline def setWriter(value: REPLWriter): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
      
      inline def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
    }
  }
}
