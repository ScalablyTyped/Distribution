package typings.node

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.AutoCommit
import typings.node.eventsMod.Abortable
import typings.node.readlineMod.AsyncCompleter
import typings.node.readlineMod.Completer
import typings.node.readlineMod.Direction
import typings.node.readlineMod.ReadLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readlinePromisesMod {
  
  @JSImport("readline/promises", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Instances of the `readlinePromises.Interface` class are constructed using the`readlinePromises.createInterface()` method. Every instance is associated with a
    * single `input` `Readable` stream and a single `output` `Writable` stream.
    * The `output` stream is used to print prompts for user input that arrives on,
    * and is read from, the `input` stream.
    * @since v17.0.0
    */
  @JSImport("readline/promises", "Interface")
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
      * The `rl.question()` method displays the `query` by writing it to the `output`,
      * waits for user input to be provided on `input`, then invokes the `callback`function passing the provided input as the first argument.
      *
      * When called, `rl.question()` will resume the `input` stream if it has been
      * paused.
      *
      * If the `Interface` was created with `output` set to `null` or`undefined` the `query` is not written.
      *
      * If the question is called after `rl.close()`, it returns a rejected promise.
      *
      * Example usage:
      *
      * ```js
      * const answer = await rl.question('What is your favorite food? ');
      * console.log(`Oh, so your favorite food is ${answer}`);
      * ```
      *
      * Using an `AbortSignal` to cancel a question.
      *
      * ```js
      * const signal = AbortSignal.timeout(10_000);
      *
      * signal.addEventListener('abort', () => {
      *   console.log('The food question timed out');
      * }, { once: true });
      *
      * const answer = await rl.question('What is your favorite food? ', { signal });
      * console.log(`Oh, so your favorite food is ${answer}`);
      * ```
      * @since v17.0.0
      * @param query A statement or query to write to `output`, prepended to the prompt.
      * @return A promise that is fulfilled with the user's input in response to the `query`.
      */
    def question(query: String): js.Promise[String] = js.native
    def question(query: String, options: Abortable): js.Promise[String] = js.native
  }
  
  /**
    * @since v17.0.0
    */
  @JSImport("readline/promises", "Readline")
  @js.native
  open class Readline protected () extends StObject {
    /**
      * @param stream A TTY stream.
      */
    def this(stream: WritableStream) = this()
    def this(stream: WritableStream, options: AutoCommit) = this()
    
    /**
      * The `rl.clearLine()` method adds to the internal list of pending action an
      * action that clears current line of the associated `stream` in a specified
      * direction identified by `dir`.
      * Call `rl.commit()` to see the effect of this method, unless `autoCommit: true`was passed to the constructor.
      * @since v17.0.0
      * @return this
      */
    def clearLine(dir: Direction): this.type = js.native
    
    /**
      * The `rl.clearScreenDown()` method adds to the internal list of pending action an
      * action that clears the associated stream from the current position of the
      * cursor down.
      * Call `rl.commit()` to see the effect of this method, unless `autoCommit: true`was passed to the constructor.
      * @since v17.0.0
      * @return this
      */
    def clearScreenDown(): this.type = js.native
    
    /**
      * The `rl.commit()` method sends all the pending actions to the associated`stream` and clears the internal list of pending actions.
      * @since v17.0.0
      */
    def commit(): js.Promise[Unit] = js.native
    
    /**
      * The `rl.cursorTo()` method adds to the internal list of pending action an action
      * that moves cursor to the specified position in the associated `stream`.
      * Call `rl.commit()` to see the effect of this method, unless `autoCommit: true`was passed to the constructor.
      * @since v17.0.0
      * @return this
      */
    def cursorTo(x: Double): this.type = js.native
    def cursorTo(x: Double, y: Double): this.type = js.native
    
    /**
      * The `rl.moveCursor()` method adds to the internal list of pending action an
      * action that moves the cursor _relative_ to its current position in the
      * associated `stream`.
      * Call `rl.commit()` to see the effect of this method, unless `autoCommit: true`was passed to the constructor.
      * @since v17.0.0
      * @return this
      */
    def moveCursor(dx: Double, dy: Double): this.type = js.native
    
    /**
      * The `rl.rollback` methods clears the internal list of pending actions without
      * sending it to the associated `stream`.
      * @since v17.0.0
      * @return this
      */
    def rollback(): this.type = js.native
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
}
