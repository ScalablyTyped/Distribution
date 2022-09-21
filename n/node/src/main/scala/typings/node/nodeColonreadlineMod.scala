package typings.node

import typings.node.anon.AutoCommit
import typings.node.readlineMod.AsyncCompleter
import typings.node.readlineMod.Completer
import typings.node.readlineMod.ReadLineOptions
import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonreadlineMod {
  
  @JSImport("node:readline/promises", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node:readline/promises", "Interface")
  @js.native
  open class Interface protected () extends StObject {
    /**
      * NOTE: According to the documentation:
      *
      * > Instances of the `readline.Interface` class are constructed using the
      * > `readline.createInterface()` method.
      *
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
      */
    /* protected */ def this(input: ReadableStream[Any]) = this()
    /**
      * NOTE: According to the documentation:
      *
      * > Instances of the `readline.Interface` class are constructed using the
      * > `readline.createInterface()` method.
      *
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
      */
    /* protected */ def this(options: ReadLineOptions) = this()
    /* protected */ def this(input: ReadableStream[Any], output: WritableStream[Any]) = this()
    /* protected */ def this(input: ReadableStream[Any], output: Unit, completer: AsyncCompleter) = this()
    /* protected */ def this(input: ReadableStream[Any], output: Unit, completer: Completer) = this()
    /* protected */ def this(input: ReadableStream[Any], output: WritableStream[Any], completer: AsyncCompleter) = this()
    /* protected */ def this(input: ReadableStream[Any], output: WritableStream[Any], completer: Completer) = this()
    /* protected */ def this(input: ReadableStream[Any], output: Unit, completer: Unit, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream[Any], output: Unit, completer: AsyncCompleter, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream[Any], output: Unit, completer: Completer, terminal: Boolean) = this()
    /* protected */ def this(input: ReadableStream[Any], output: WritableStream[Any], completer: Unit, terminal: Boolean) = this()
    /* protected */ def this(
      input: ReadableStream[Any],
      output: WritableStream[Any],
      completer: AsyncCompleter,
      terminal: Boolean
    ) = this()
    /* protected */ def this(input: ReadableStream[Any], output: WritableStream[Any], completer: Completer, terminal: Boolean) = this()
  }
  
  @JSImport("node:readline/promises", "Readline")
  @js.native
  open class Readline protected ()
    extends typings.node.readlinePromisesMod.Readline {
    /**
      * @param stream A TTY stream.
      */
    def this(stream: WritableStream[Any]) = this()
    def this(stream: WritableStream[Any], options: AutoCommit) = this()
  }
  
  /**
    * The `readlinePromises.createInterface()` method creates a new `readlinePromises.Interface` instance.
    *
    * ```js
    * const readlinePromises = require('node:readline/promises');
    * const rl = readlinePromises.createInterface({
    *   input: process.stdin,
    *   output: process.stdout
    * });
    * ```
    *
    * Once the `readlinePromises.Interface` instance is created, the most common case is to listen for the `'line'` event:
    *
    * ```js
    * rl.on('line', (line) => {
    *   console.log(`Received: ${line}`);
    * });
    * ```
    *
    * If `terminal` is `true` for this instance then the `output` stream will get the best compatibility if it defines an `output.columns` property,
    * and emits a `'resize'` event on the `output`, if or when the columns ever change (`process.stdout` does this automatically when it is a TTY).
    *
    * ## Use of the `completer` function
    *
    * The `completer` function takes the current line entered by the user as an argument, and returns an `Array` with 2 entries:
    *
    * - An Array with matching entries for the completion.
    * - The substring that was used for the matching.
    *
    * For instance: `[[substr1, substr2, ...], originalsubstring]`.
    *
    * ```js
    * function completer(line) {
    *   const completions = '.help .error .exit .quit .q'.split(' ');
    *   const hits = completions.filter((c) => c.startsWith(line));
    *   // Show all completions if none found
    *   return [hits.length ? hits : completions, line];
    * }
    * ```
    *
    * The `completer` function can also returns a `Promise`, or be asynchronous:
    *
    * ```js
    * async function completer(linePartial) {
    *   await someAsyncWork();
    *   return [['123'], linePartial];
    * }
    * ```
    */
  inline def createInterface(input: ReadableStream[Any]): typings.node.readlinePromisesMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any]).asInstanceOf[typings.node.readlinePromisesMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: Unit, completer: Unit, terminal: Boolean): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: Unit, completer: AsyncCompleter): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: Unit, completer: AsyncCompleter, terminal: Boolean): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: Unit, completer: Completer): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: Unit, completer: Completer, terminal: Boolean): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: WritableStream[Any]): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: WritableStream[Any], completer: Unit, terminal: Boolean): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: WritableStream[Any], completer: AsyncCompleter): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
  inline def createInterface(
    input: ReadableStream[Any],
    output: WritableStream[Any],
    completer: AsyncCompleter,
    terminal: Boolean
  ): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: WritableStream[Any], completer: Completer): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
  inline def createInterface(input: ReadableStream[Any], output: WritableStream[Any], completer: Completer, terminal: Boolean): typings.node.readlinePromisesMod.Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[typings.node.readlinePromisesMod.Interface]
  inline def createInterface(options: ReadLineOptions): typings.node.readlinePromisesMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(options.asInstanceOf[js.Any]).asInstanceOf[typings.node.readlinePromisesMod.Interface]
}
