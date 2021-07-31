package typings.node

import typings.node.NodeJS.ReadOnlyDict
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.Options
import typings.node.nodeStrings.exit
import typings.node.nodeStrings.reset
import typings.node.readlineMod.AsyncCompleter
import typings.node.readlineMod.Completer
import typings.node.readlineMod.CompleterResult
import typings.node.readlineMod.Interface
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
  class REPLServer protected () extends Interface {
    
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
    
    /**
      * A value indicating whether the REPL is currently in "editor mode".
      *
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_commands_and_special_keys
      */
    val editorMode: Boolean = js.native
    
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
      evalCmd: java.lang.String,
      context: Context,
      file: java.lang.String,
      cb: js.Function2[/* err */ Error | Null, /* result */ js.Any, Unit]
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
    val last: js.Any = js.native
    
    /**
      * The last error raised inside the REPL (assigned to the `_error` variable inside of the REPL).
      *
      * @since v9.8.0
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_assignment_of_the_underscore_variable
      */
    val lastError: js.Any = js.native
    
    @JSName("on")
    def on_exit(event: exit, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_reset(event: reset, listener: js.Function1[/* context */ Context, Unit]): this.type = js.native
    
    @JSName("once")
    def once_exit(event: exit, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_reset(event: reset, listener: js.Function1[/* context */ Context, Unit]): this.type = js.native
    
    /**
      * The `Writable` stream to which REPL output will be written.
      */
    val output: WritableStream = js.native
    
    /**
      * @deprecated since v14.3.0 - Use `output` instead.
      */
    val outputStream: WritableStream = js.native
    
    @JSName("prependListener")
    def prependListener_exit(event: exit, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_reset(event: reset, listener: js.Function1[/* context */ Context, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_exit(event: exit, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_reset(event: reset, listener: js.Function1[/* context */ Context, Unit]): this.type = js.native
    
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
      * Node.js binary and using the command line REPL, a history file is initialized
      * by default. However, this is not the case when creating a REPL
      * programmatically. Use this method to initialize a history log file when working
      * with REPL instances programmatically.
      * @param path The path to the history file
      */
    def setupHistory(path: java.lang.String, cb: js.Function2[/* err */ Error | Null, /* repl */ this.type, Unit]): Unit = js.native
    
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
    def writer(obj: js.Any): java.lang.String = js.native
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
  class Recoverable protected ()
    extends StObject
       with Error {
    def this(err: Error) = this()
    
    var err: Error = js.native
    
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* CompleteClass */
    var name: java.lang.String = js.native
  }
  
  /**
    * Creates and starts a `repl.REPLServer` instance.
    *
    * @param options The options for the `REPLServer`. If `options` is a string, then it specifies
    * the input prompt.
    */
  @scala.inline
  def start(): REPLServer = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[REPLServer]
  @scala.inline
  def start(options: java.lang.String): REPLServer = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[REPLServer]
  @scala.inline
  def start(options: ReplOptions): REPLServer = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[REPLServer]
  
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
    def action(text: java.lang.String): Unit
    /**
      * The function to execute, optionally accepting a single string argument.
      */
    @JSName("action")
    var action_Original: REPLCommandAction
    
    /**
      * Help text to be displayed when `.help` is entered.
      */
    var help: js.UndefOr[java.lang.String] = js.undefined
  }
  object REPLCommand {
    
    @scala.inline
    def apply(action: REPLCommandAction): REPLCommand = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[REPLCommand]
    }
    
    @scala.inline
    implicit class REPLCommandMutableBuilder[Self <: REPLCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: REPLCommandAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelp(value: java.lang.String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    }
  }
  
  type REPLCommandAction = js.ThisFunction1[/* this */ REPLServer, /* text */ java.lang.String, Unit]
  
  type REPLEval = js.ThisFunction4[
    /* this */ REPLServer, 
    /* evalCmd */ java.lang.String, 
    /* context */ Context, 
    /* file */ java.lang.String, 
    /* cb */ js.Function2[/* err */ Error | Null, /* result */ js.Any, Unit], 
    Unit
  ]
  
  type REPLWriter = js.ThisFunction1[/* this */ REPLServer, /* obj */ js.Any, java.lang.String]
  
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
      * Default: `process.stdin`
      */
    var input: js.UndefOr[ReadableStream] = js.undefined
    
    /**
      * The `Writable` stream to which REPL output will be written.
      * Default: `process.stdout`
      */
    var output: js.UndefOr[WritableStream] = js.undefined
    
    /**
      * Defines if the repl prints output previews or not.
      * @default `true` Always `false` in case `terminal` is falsy.
      */
    var preview: js.UndefOr[Boolean] = js.undefined
    
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
    def apply(): ReplOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplOptions]
    }
    
    @scala.inline
    implicit class ReplOptionsMutableBuilder[Self <: ReplOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakEvalOnSigint(value: Boolean): Self = StObject.set(x, "breakEvalOnSigint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakEvalOnSigintUndefined: Self = StObject.set(x, "breakEvalOnSigint", js.undefined)
      
      @scala.inline
      def setCompleter(value: Completer | AsyncCompleter): Self = StObject.set(x, "completer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleterFunction1(value: /* line */ java.lang.String => CompleterResult): Self = StObject.set(x, "completer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCompleterFunction2(
        value: (/* line */ java.lang.String, /* callback */ js.Function2[/* err */ js.UndefOr[Null | Error], /* result */ js.UndefOr[CompleterResult], Unit]) => js.Any
      ): Self = StObject.set(x, "completer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompleterUndefined: Self = StObject.set(x, "completer", js.undefined)
      
      @scala.inline
      def setEval(value: REPLEval): Self = StObject.set(x, "eval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalUndefined: Self = StObject.set(x, "eval", js.undefined)
      
      @scala.inline
      def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
      
      @scala.inline
      def setInput(value: ReadableStream): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setOutput(value: WritableStream): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      @scala.inline
      def setPrompt(value: java.lang.String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setReplMode(value: js.Symbol): Self = StObject.set(x, "replMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplModeUndefined: Self = StObject.set(x, "replMode", js.undefined)
      
      @scala.inline
      def setTerminal(value: Boolean): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
      
      @scala.inline
      def setUseColors(value: Boolean): Self = StObject.set(x, "useColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseColorsUndefined: Self = StObject.set(x, "useColors", js.undefined)
      
      @scala.inline
      def setUseGlobal(value: Boolean): Self = StObject.set(x, "useGlobal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseGlobalUndefined: Self = StObject.set(x, "useGlobal", js.undefined)
      
      @scala.inline
      def setWriter(value: REPLWriter): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
    }
  }
}
