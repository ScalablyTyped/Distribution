package typings.node

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.AutoCommit
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.Abortable
import typings.node.nodeStrings.SIGCONT
import typings.node.nodeStrings.SIGINT
import typings.node.nodeStrings.SIGTSTP
import typings.node.nodeStrings.close
import typings.node.nodeStrings.history
import typings.node.nodeStrings.pause
import typings.node.nodeStrings.resume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readlineMod {
  
  @JSImport("readline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("readline", "Interface")
  @js.native
  open class Interface protected () extends StObject {
    /**
      * NOTE: According to the documentation:
      *
      * > Instances of the `readline.Interface` class are constructed using the
      * > `readline.createInterface()` method.
      *
      * @see https://nodejs.org/dist/latest-v20.x/docs/api/readline.html#class-interfaceconstructor
      */
    /* protected */ def this(input: ReadableStream) = this()
    /**
      * NOTE: According to the documentation:
      *
      * > Instances of the `readline.Interface` class are constructed using the
      * > `readline.createInterface()` method.
      *
      * @see https://nodejs.org/dist/latest-v20.x/docs/api/readline.html#class-interfaceconstructor
      */
    /* protected */ def this(options: ReadLineOptions) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream) = this()
    /* protected */ def this(input: ReadableStream, output: Unit, completer: AsyncCompleter) = this()
    /* protected */ def this(input: ReadableStream, output: Unit, completer: Completer) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream, completer: Completer) = this()
    /* protected */ def this(input: ReadableStream, output: Unit, completer: Unit, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream, output: Unit, completer: AsyncCompleter, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream, output: Unit, completer: Completer, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream, completer: Unit, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean) = this()
    
    /**
      * events.EventEmitter
      * 1. close
      * 2. line
      * 3. pause
      * 4. resume
      * 5. SIGCONT
      * 6. SIGINT
      * 7. SIGTSTP
      * 8. history
      */
    def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_history(event: history, listener: js.Function1[/* history */ js.Array[String], Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_line(event: typings.node.nodeStrings.line, listener: js.Function1[/* input */ String, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * The `rl.close()` method closes the `Interface` instance and
      * relinquishes control over the `input` and `output` streams. When called,
      * the `'close'` event will be emitted.
      *
      * Calling `rl.close()` does not immediately stop other events (including `'line'`)
      * from being emitted by the `Interface` instance.
      * @since v0.1.98
      */
    def close(): Unit = js.native
    
    /**
      * The cursor position relative to `rl.line`.
      *
      * This will track where the current cursor lands in the input string, when
      * reading input from a TTY stream. The position of cursor determines the
      * portion of the input string that will be modified as input is processed,
      * as well as the column where the terminal caret will be rendered.
      * @since v0.1.98
      */
    val cursor: Double = js.native
    
    def emit(event: String, args: Any*): Boolean = js.native
    def emit(event: js.Symbol, args: Any*): Boolean = js.native
    @JSName("emit")
    def emit_SIGCONT(event: SIGCONT): Boolean = js.native
    @JSName("emit")
    def emit_SIGINT(event: SIGINT): Boolean = js.native
    @JSName("emit")
    def emit_SIGTSTP(event: SIGTSTP): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_history(event: history, history: js.Array[String]): Boolean = js.native
    @JSName("emit")
    def emit_line(event: typings.node.nodeStrings.line, input: String): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    
    /**
      * Returns the real position of the cursor in relation to the input
      * prompt + string. Long input (wrapping) strings, as well as multiple
      * line prompts are included in the calculations.
      * @since v13.5.0, v12.16.0
      */
    def getCursorPos(): CursorPos = js.native
    
    /**
      * The `rl.getPrompt()` method returns the current prompt used by `rl.prompt()`.
      * @since v15.3.0, v14.17.0
      * @return the current prompt string
      */
    def getPrompt(): String = js.native
    
    /**
      * The current input data being processed by node.
      *
      * This can be used when collecting input from a TTY stream to retrieve the
      * current value that has been processed thus far, prior to the `line` event
      * being emitted. Once the `line` event has been emitted, this property will
      * be an empty string.
      *
      * Be aware that modifying the value during the instance runtime may have
      * unintended consequences if `rl.cursor` is not also controlled.
      *
      * **If not using a TTY stream for input, use the `'line'` event.**
      *
      * One possible use case would be as follows:
      *
      * ```js
      * const values = ['lorem ipsum', 'dolor sit amet'];
      * const rl = readline.createInterface(process.stdin);
      * const showResults = debounce(() => {
      *   console.log(
      *     '\n',
      *     values.filter((val) => val.startsWith(rl.line)).join(' '),
      *   );
      * }, 300);
      * process.stdin.on('keypress', (c, k) => {
      *   showResults();
      * });
      * ```
      * @since v0.1.98
      */
    val line: String = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_history(event: history, listener: js.Function1[/* history */ js.Array[String], Unit]): this.type = js.native
    @JSName("on")
    def on_line(event: typings.node.nodeStrings.line, listener: js.Function1[/* input */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_history(event: history, listener: js.Function1[/* history */ js.Array[String], Unit]): this.type = js.native
    @JSName("once")
    def once_line(event: typings.node.nodeStrings.line, listener: js.Function1[/* input */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * The `rl.pause()` method pauses the `input` stream, allowing it to be resumed
      * later if necessary.
      *
      * Calling `rl.pause()` does not immediately pause other events (including`'line'`) from being emitted by the `Interface` instance.
      * @since v0.3.4
      */
    def pause(): this.type = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_history(event: history, listener: js.Function1[/* history */ js.Array[String], Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_line(event: typings.node.nodeStrings.line, listener: js.Function1[/* input */ String, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_history(event: history, listener: js.Function1[/* history */ js.Array[String], Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_line(event: typings.node.nodeStrings.line, listener: js.Function1[/* input */ String, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * The `rl.prompt()` method writes the `Interface` instances configured`prompt` to a new line in `output` in order to provide a user with a new
      * location at which to provide input.
      *
      * When called, `rl.prompt()` will resume the `input` stream if it has been
      * paused.
      *
      * If the `Interface` was created with `output` set to `null` or`undefined` the prompt is not written.
      * @since v0.1.98
      * @param preserveCursor If `true`, prevents the cursor placement from being reset to `0`.
      */
    def prompt(): Unit = js.native
    def prompt(preserveCursor: Boolean): Unit = js.native
    
    /**
      * The `rl.question()` method displays the `query` by writing it to the `output`,
      * waits for user input to be provided on `input`, then invokes the `callback`function passing the provided input as the first argument.
      *
      * When called, `rl.question()` will resume the `input` stream if it has been
      * paused.
      *
      * If the `Interface` was created with `output` set to `null` or`undefined` the `query` is not written.
      *
      * The `callback` function passed to `rl.question()` does not follow the typical
      * pattern of accepting an `Error` object or `null` as the first argument.
      * The `callback` is called with the provided answer as the only argument.
      *
      * An error will be thrown if calling `rl.question()` after `rl.close()`.
      *
      * Example usage:
      *
      * ```js
      * rl.question('What is your favorite food? ', (answer) => {
      *   console.log(`Oh, so your favorite food is ${answer}`);
      * });
      * ```
      *
      * Using an `AbortController` to cancel a question.
      *
      * ```js
      * const ac = new AbortController();
      * const signal = ac.signal;
      *
      * rl.question('What is your favorite food? ', { signal }, (answer) => {
      *   console.log(`Oh, so your favorite food is ${answer}`);
      * });
      *
      * signal.addEventListener('abort', () => {
      *   console.log('The food question timed out');
      * }, { once: true });
      *
      * setTimeout(() => ac.abort(), 10000);
      * ```
      * @since v0.3.3
      * @param query A statement or query to write to `output`, prepended to the prompt.
      * @param callback A callback function that is invoked with the user's input in response to the `query`.
      */
    def question(query: String, callback: js.Function1[/* answer */ String, Unit]): Unit = js.native
    def question(query: String, options: Abortable, callback: js.Function1[/* answer */ String, Unit]): Unit = js.native
    
    /**
      * The `rl.resume()` method resumes the `input` stream if it has been paused.
      * @since v0.3.4
      */
    def resume(): this.type = js.native
    
    /**
      * The `rl.setPrompt()` method sets the prompt that will be written to `output`whenever `rl.prompt()` is called.
      * @since v0.1.98
      */
    def setPrompt(prompt: String): Unit = js.native
    
    val terminal: Boolean = js.native
    
    /**
      * The `rl.write()` method will write either `data` or a key sequence identified
      * by `key` to the `output`. The `key` argument is supported only if `output` is
      * a `TTY` text terminal. See `TTY keybindings` for a list of key
      * combinations.
      *
      * If `key` is specified, `data` is ignored.
      *
      * When called, `rl.write()` will resume the `input` stream if it has been
      * paused.
      *
      * If the `Interface` was created with `output` set to `null` or`undefined` the `data` and `key` are not written.
      *
      * ```js
      * rl.write('Delete this!');
      * // Simulate Ctrl+U to delete the line written previously
      * rl.write(null, { ctrl: true, name: 'u' });
      * ```
      *
      * The `rl.write()` method will write the data to the `readline` `Interface`'s`input`_as if it were provided by the user_.
      * @since v0.1.98
      */
    def write(data: String): Unit = js.native
    def write(data: String, key: Key): Unit = js.native
    def write(data: Null, key: Key): Unit = js.native
    def write(data: Unit, key: Key): Unit = js.native
    def write(data: Buffer): Unit = js.native
    def write(data: Buffer, key: Key): Unit = js.native
  }
  
  inline def clearLine(stream: WritableStream, dir: Direction): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")(stream.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def clearLine(stream: WritableStream, dir: Direction, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")(stream.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def clearScreenDown(stream: WritableStream): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clearScreenDown")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def clearScreenDown(stream: WritableStream, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearScreenDown")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createInterface(input: ReadableStream): Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any]).asInstanceOf[Interface]
  inline def createInterface(input: ReadableStream, output: Unit, completer: Unit, terminal: Boolean): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[Interface]
  inline def createInterface(input: ReadableStream, output: Unit, completer: AsyncCompleter): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[Interface]
  inline def createInterface(input: ReadableStream, output: Unit, completer: AsyncCompleter, terminal: Boolean): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[Interface]
  inline def createInterface(input: ReadableStream, output: Unit, completer: Completer): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[Interface]
  inline def createInterface(input: ReadableStream, output: Unit, completer: Completer, terminal: Boolean): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[Interface]
  inline def createInterface(input: ReadableStream, output: WritableStream): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Interface]
  inline def createInterface(input: ReadableStream, output: WritableStream, completer: Unit, terminal: Boolean): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[Interface]
  inline def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[Interface]
  inline def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[Interface]
  inline def createInterface(input: ReadableStream, output: WritableStream, completer: Completer): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[Interface]
  inline def createInterface(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[Interface]
  inline def createInterface(options: ReadLineOptions): Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(options.asInstanceOf[js.Any]).asInstanceOf[Interface]
  
  inline def cursorTo(stream: WritableStream, x: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cursorTo(stream: WritableStream, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cursorTo(stream: WritableStream, x: Double, y: Double, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cursorTo(stream: WritableStream, x: Double, y: Unit, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def emitKeypressEvents(stream: ReadableStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emitKeypressEvents")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def emitKeypressEvents(stream: ReadableStream, readlineInterface: Interface): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emitKeypressEvents")(stream.asInstanceOf[js.Any], readlineInterface.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def moveCursor(stream: WritableStream, dx: Double, dy: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("moveCursor")(stream.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def moveCursor(stream: WritableStream, dx: Double, dy: Double, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("moveCursor")(stream.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  object promises {
    
    @JSImport("readline", "promises")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Instances of the `readlinePromises.Interface` class are constructed using the`readlinePromises.createInterface()` method. Every instance is associated with a
      * single `input` `Readable` stream and a single `output` `Writable` stream.
      * The `output` stream is used to print prompts for user input that arrives on,
      * and is read from, the `input` stream.
      * @since v17.0.0
      */
    @JSImport("readline", "promises.Interface")
    @js.native
    open class Interface protected () extends StObject {
      /**
        * NOTE: According to the documentation:
        *
        * > Instances of the `readline.Interface` class are constructed using the
        * > `readline.createInterface()` method.
        *
        * @see https://nodejs.org/dist/latest-v20.x/docs/api/readline.html#class-interfaceconstructor
        */
      /* protected */ def this(input: ReadableStream) = this()
      /**
        * NOTE: According to the documentation:
        *
        * > Instances of the `readline.Interface` class are constructed using the
        * > `readline.createInterface()` method.
        *
        * @see https://nodejs.org/dist/latest-v20.x/docs/api/readline.html#class-interfaceconstructor
        */
      /* protected */ def this(options: ReadLineOptions) = this()
      /* protected */ def this(input: ReadableStream, output: WritableStream) = this()
      /* protected */ def this(input: ReadableStream, output: Unit, completer: AsyncCompleter) = this()
      /* protected */ def this(input: ReadableStream, output: Unit, completer: Completer) = this()
      /* protected */ def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter) = this()
      /* protected */ def this(input: ReadableStream, output: WritableStream, completer: Completer) = this()
      /* protected */ def this(input: ReadableStream, output: Unit, completer: Unit, terminal: Boolean) = this()
      /* protected */ def this(input: ReadableStream, output: Unit, completer: AsyncCompleter, terminal: Boolean) = this()
      /* protected */ def this(input: ReadableStream, output: Unit, completer: Completer, terminal: Boolean) = this()
      /* protected */ def this(input: ReadableStream, output: WritableStream, completer: Unit, terminal: Boolean) = this()
      /* protected */ def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean) = this()
      /* protected */ def this(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean) = this()
    }
    
    /**
      * @since v17.0.0
      */
    @JSImport("readline", "promises.Readline")
    @js.native
    open class Readline protected ()
      extends typings.node.nodeColonreadlinePromisesMod.Readline {
      /**
        * @param stream A TTY stream.
        */
      def this(stream: WritableStream) = this()
      def this(stream: WritableStream, options: AutoCommit) = this()
    }
    
    /**
      * The `readlinePromises.createInterface()` method creates a new `readlinePromises.Interface`instance.
      *
      * ```js
      * const readlinePromises = require('node:readline/promises');
      * const rl = readlinePromises.createInterface({
      *   input: process.stdin,
      *   output: process.stdout,
      * });
      * ```
      *
      * Once the `readlinePromises.Interface` instance is created, the most common case
      * is to listen for the `'line'` event:
      *
      * ```js
      * rl.on('line', (line) => {
      *   console.log(`Received: ${line}`);
      * });
      * ```
      *
      * If `terminal` is `true` for this instance then the `output` stream will get
      * the best compatibility if it defines an `output.columns` property and emits
      * a `'resize'` event on the `output` if or when the columns ever change
      * (`process.stdout` does this automatically when it is a TTY).
      * @since v17.0.0
      */
    inline def createInterface(input: ReadableStream): typings.node.readlinePromisesMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any]).asInstanceOf[typings.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: Unit, completer: Unit, terminal: Boolean): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: Unit, completer: AsyncCompleter): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: Unit, completer: AsyncCompleter, terminal: Boolean): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: Unit, completer: Completer): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: Unit, completer: Completer, terminal: Boolean): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: WritableStream): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: WritableStream, completer: Unit, terminal: Boolean): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: WritableStream, completer: Completer): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
    inline def createInterface(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
    inline def createInterface(options: ReadLineOptions): typings.node.readlinePromisesMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(options.asInstanceOf[js.Any]).asInstanceOf[typings.node.readlinePromisesMod.Interface]
  }
  
  type AsyncCompleter = js.Function2[
    /* line */ String, 
    /* callback */ js.Function2[
      /* err */ js.UndefOr[Null | js.Error], 
      /* result */ js.UndefOr[CompleterResult], 
      Unit
    ], 
    Unit
  ]
  
  type Completer = js.Function1[/* line */ String, CompleterResult]
  
  type CompleterResult = js.Tuple2[js.Array[String], String]
  
  trait CursorPos extends StObject {
    
    var cols: Double
    
    var rows: Double
  }
  object CursorPos {
    
    inline def apply(cols: Double, rows: Double): CursorPos = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[CursorPos]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CursorPos] (val x: Self) extends AnyVal {
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.nodeInts.`-1`
    - typings.node.nodeInts.`0`
    - typings.node.nodeInts.`1`
  */
  trait Direction extends StObject
  object Direction {
    
    inline def `-1`: typings.node.nodeInts.`-1` = -1.asInstanceOf[typings.node.nodeInts.`-1`]
    
    inline def `0`: typings.node.nodeInts.`0` = 0.asInstanceOf[typings.node.nodeInts.`0`]
    
    inline def `1`: typings.node.nodeInts.`1` = 1.asInstanceOf[typings.node.nodeInts.`1`]
  }
  
  trait Key extends StObject {
    
    var ctrl: js.UndefOr[Boolean] = js.undefined
    
    var meta: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var sequence: js.UndefOr[String] = js.undefined
    
    var shift: js.UndefOr[Boolean] = js.undefined
  }
  object Key {
    
    inline def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setCtrl(value: Boolean): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
      
      inline def setCtrlUndefined: Self = StObject.set(x, "ctrl", js.undefined)
      
      inline def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
      
      inline def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    }
  }
  
  type ReadLine = Interface
  
  trait ReadLineOptions extends StObject {
    
    var completer: js.UndefOr[Completer | AsyncCompleter] = js.undefined
    
    var crlfDelay: js.UndefOr[Double] = js.undefined
    
    var escapeCodeTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      *  Initial list of history lines. This option makes sense
      * only if `terminal` is set to `true` by the user or by an internal `output`
      * check, otherwise the history caching mechanism is not initialized at all.
      * @default []
      */
    var history: js.UndefOr[js.Array[String]] = js.undefined
    
    var historySize: js.UndefOr[Double] = js.undefined
    
    var input: ReadableStream
    
    var output: js.UndefOr[WritableStream] = js.undefined
    
    var prompt: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, when a new input line added
      * to the history list duplicates an older one, this removes the older line
      * from the list.
      * @default false
      */
    var removeHistoryDuplicates: js.UndefOr[Boolean] = js.undefined
    
    var tabSize: js.UndefOr[Double] = js.undefined
    
    var terminal: js.UndefOr[Boolean] = js.undefined
  }
  object ReadLineOptions {
    
    inline def apply(input: ReadableStream): ReadLineOptions = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadLineOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadLineOptions] (val x: Self) extends AnyVal {
      
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
      
      inline def setCrlfDelay(value: Double): Self = StObject.set(x, "crlfDelay", value.asInstanceOf[js.Any])
      
      inline def setCrlfDelayUndefined: Self = StObject.set(x, "crlfDelay", js.undefined)
      
      inline def setEscapeCodeTimeout(value: Double): Self = StObject.set(x, "escapeCodeTimeout", value.asInstanceOf[js.Any])
      
      inline def setEscapeCodeTimeoutUndefined: Self = StObject.set(x, "escapeCodeTimeout", js.undefined)
      
      inline def setHistory(value: js.Array[String]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistorySize(value: Double): Self = StObject.set(x, "historySize", value.asInstanceOf[js.Any])
      
      inline def setHistorySizeUndefined: Self = StObject.set(x, "historySize", js.undefined)
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setHistoryVarargs(value: String*): Self = StObject.set(x, "history", js.Array(value*))
      
      inline def setInput(value: ReadableStream): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: WritableStream): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setRemoveHistoryDuplicates(value: Boolean): Self = StObject.set(x, "removeHistoryDuplicates", value.asInstanceOf[js.Any])
      
      inline def setRemoveHistoryDuplicatesUndefined: Self = StObject.set(x, "removeHistoryDuplicates", js.undefined)
      
      inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      inline def setTerminal(value: Boolean): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
      
      inline def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
    }
  }
}
