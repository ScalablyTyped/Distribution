package typings.node

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.WritableStream
import typings.node.nodeColonconsoleMod.global.console.ConsoleConstructor
import typings.node.utilMod.InspectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonconsoleMod {
  
  object global {
    
    /**
      * The `console` module provides a simple debugging console that is similar to the
      * JavaScript console mechanism provided by web browsers.
      *
      * The module exports two specific components:
      *
      * * A `Console` class with methods such as `console.log()`, `console.error()` and`console.warn()` that can be used to write to any Node.js stream.
      * * A global `console` instance configured to write to `process.stdout` and `process.stderr`. The global `console` can be used without calling`require('console')`.
      *
      * _**Warning**_: The global console object's methods are neither consistently
      * synchronous like the browser APIs they resemble, nor are they consistently
      * asynchronous like all other Node.js streams. See the `note on process I/O` for
      * more information.
      *
      * Example using the global `console`:
      *
      * ```js
      * console.log('hello world');
      * // Prints: hello world, to stdout
      * console.log('hello %s', 'world');
      * // Prints: hello world, to stdout
      * console.error(new Error('Whoops, something bad happened'));
      * // Prints error message and stack trace to stderr:
      * //   Error: Whoops, something bad happened
      * //     at [eval]:5:15
      * //     at Script.runInThisContext (node:vm:132:18)
      * //     at Object.runInThisContext (node:vm:309:38)
      * //     at node:internal/process/execution:77:19
      * //     at [eval]-wrapper:6:22
      * //     at evalScript (node:internal/process/execution:76:60)
      * //     at node:internal/main/eval_string:23:3
      *
      * const name = 'Will Robinson';
      * console.warn(`Danger ${name}! Danger!`);
      * // Prints: Danger Will Robinson! Danger!, to stderr
      * ```
      *
      * Example using the `Console` class:
      *
      * ```js
      * const out = getStreamSomehow();
      * const err = getStreamSomehow();
      * const myConsole = new console.Console(out, err);
      *
      * myConsole.log('hello world');
      * // Prints: hello world, to out
      * myConsole.log('hello %s', 'world');
      * // Prints: hello world, to out
      * myConsole.error(new Error('Whoops, something bad happened'));
      * // Prints: [Error: Whoops, something bad happened], to err
      *
      * const name = 'Will Robinson';
      * myConsole.warn(`Danger ${name}! Danger!`);
      * // Prints: Danger Will Robinson! Danger!, to err
      * ```
      * @see [source](https://github.com/nodejs/node/blob/v16.4.2/lib/console.js)
      */
    object console extends Shortcut {
      
      @JSGlobal("console")
      @js.native
      val ^ : Console_ = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("console.Console")
      @js.native
      open class Console protected ()
        extends StObject
           with Console_ {
        def this(options: ConsoleConstructorOptions) = this()
        def this(stdout: WritableStream) = this()
        def this(stdout: WritableStream, stderr: WritableStream) = this()
        def this(stdout: WritableStream, stderr: Unit, ignoreErrors: Boolean) = this()
        def this(stdout: WritableStream, stderr: WritableStream, ignoreErrors: Boolean) = this()
      }
      
      @js.native
      trait ConsoleConstructor
        extends StObject
           with Instantiable1[
                  (/* options */ ConsoleConstructorOptions) | (/* stdout */ WritableStream), 
                  Console_
                ]
           with Instantiable2[/* stdout */ WritableStream, /* stderr */ WritableStream, Console_]
           with Instantiable3[
                  /* stdout */ WritableStream, 
                  (/* stderr */ Unit) | (/* stderr */ WritableStream), 
                  /* ignoreErrors */ Boolean, 
                  Console_
                ]
      
      trait ConsoleConstructorOptions extends StObject {
        
        var colorMode: js.UndefOr[Boolean | "auto"] = js.undefined
        
        /**
          * Set group indentation
          * @default 2
          */
        var groupIndentation: js.UndefOr[Double] = js.undefined
        
        var ignoreErrors: js.UndefOr[Boolean] = js.undefined
        
        var inspectOptions: js.UndefOr[InspectOptions] = js.undefined
        
        var stderr: js.UndefOr[WritableStream] = js.undefined
        
        var stdout: WritableStream
      }
      object ConsoleConstructorOptions {
        
        inline def apply(stdout: WritableStream): ConsoleConstructorOptions = {
          val __obj = js.Dynamic.literal(stdout = stdout.asInstanceOf[js.Any])
          __obj.asInstanceOf[ConsoleConstructorOptions]
        }
        
        extension [Self <: ConsoleConstructorOptions](x: Self) {
          
          inline def setColorMode(value: Boolean | "auto"): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
          
          inline def setColorModeUndefined: Self = StObject.set(x, "colorMode", js.undefined)
          
          inline def setGroupIndentation(value: Double): Self = StObject.set(x, "groupIndentation", value.asInstanceOf[js.Any])
          
          inline def setGroupIndentationUndefined: Self = StObject.set(x, "groupIndentation", js.undefined)
          
          inline def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
          
          inline def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
          
          inline def setInspectOptions(value: InspectOptions): Self = StObject.set(x, "inspectOptions", value.asInstanceOf[js.Any])
          
          inline def setInspectOptionsUndefined: Self = StObject.set(x, "inspectOptions", js.undefined)
          
          inline def setStderr(value: WritableStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
          
          inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
          
          inline def setStdout(value: WritableStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
        }
      }
      
      type _To = Console_
      
      /* This means you don't have to write `^`, but can instead just say `console.foo` */
      override def _to: Console_ = ^
    }
    
    // This needs to be global to avoid TS2403 in case lib.dom.d.ts is present in the same build
    @js.native
    trait Console_ extends StObject {
      
      var Console: ConsoleConstructor = js.native
      
      /**
        * `console.assert()` writes a message if `value` is [falsy](https://developer.mozilla.org/en-US/docs/Glossary/Falsy) or omitted. It only
        * writes a message and does not otherwise affect execution. The output always
        * starts with `"Assertion failed"`. If provided, `message` is formatted using `util.format()`.
        *
        * If `value` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy), nothing happens.
        *
        * ```js
        * console.assert(true, 'does nothing');
        *
        * console.assert(false, 'Whoops %s work', 'didn\'t');
        * // Assertion failed: Whoops didn't work
        *
        * console.assert();
        * // Assertion failed
        * ```
        * @since v0.1.101
        * @param value The value tested for being truthy.
        * @param message All arguments besides `value` are used as error message.
        */
      def assert(value: Any, message: String, optionalParams: Any*): Unit = js.native
      def assert(value: Any, message: Unit, optionalParams: Any*): Unit = js.native
      
      /**
        * When `stdout` is a TTY, calling `console.clear()` will attempt to clear the
        * TTY. When `stdout` is not a TTY, this method does nothing.
        *
        * The specific operation of `console.clear()` can vary across operating systems
        * and terminal types. For most Linux operating systems, `console.clear()`operates similarly to the `clear` shell command. On Windows, `console.clear()`will clear only the output in the
        * current terminal viewport for the Node.js
        * binary.
        * @since v8.3.0
        */
      def clear(): Unit = js.native
      
      /**
        * Maintains an internal counter specific to `label` and outputs to `stdout` the
        * number of times `console.count()` has been called with the given `label`.
        *
        * ```js
        * > console.count()
        * default: 1
        * undefined
        * > console.count('default')
        * default: 2
        * undefined
        * > console.count('abc')
        * abc: 1
        * undefined
        * > console.count('xyz')
        * xyz: 1
        * undefined
        * > console.count('abc')
        * abc: 2
        * undefined
        * > console.count()
        * default: 3
        * undefined
        * >
        * ```
        * @since v8.3.0
        * @param label The display label for the counter.
        */
      def count(): Unit = js.native
      def count(label: String): Unit = js.native
      
      /**
        * Resets the internal counter specific to `label`.
        *
        * ```js
        * > console.count('abc');
        * abc: 1
        * undefined
        * > console.countReset('abc');
        * undefined
        * > console.count('abc');
        * abc: 1
        * undefined
        * >
        * ```
        * @since v8.3.0
        * @param label The display label for the counter.
        */
      def countReset(): Unit = js.native
      def countReset(label: String): Unit = js.native
      
      /**
        * The `console.debug()` function is an alias for {@link log}.
        * @since v8.0.0
        */
      def debug(message: Any, optionalParams: Any*): Unit = js.native
      def debug(message: Unit, optionalParams: Any*): Unit = js.native
      
      /**
        * Uses `util.inspect()` on `obj` and prints the resulting string to `stdout`.
        * This function bypasses any custom `inspect()` function defined on `obj`.
        * @since v0.1.101
        */
      def dir(obj: Any): Unit = js.native
      def dir(obj: Any, options: InspectOptions): Unit = js.native
      
      /**
        * This method calls `console.log()` passing it the arguments received.
        * This method does not produce any XML formatting.
        * @since v8.0.0
        */
      def dirxml(data: Any*): Unit = js.native
      
      /**
        * Prints to `stderr` with newline. Multiple arguments can be passed, with the
        * first used as the primary message and all additional used as substitution
        * values similar to [`printf(3)`](http://man7.org/linux/man-pages/man3/printf.3.html) (the arguments are all passed to `util.format()`).
        *
        * ```js
        * const code = 5;
        * console.error('error #%d', code);
        * // Prints: error #5, to stderr
        * console.error('error', code);
        * // Prints: error 5, to stderr
        * ```
        *
        * If formatting elements (e.g. `%d`) are not found in the first string then `util.inspect()` is called on each argument and the resulting string
        * values are concatenated. See `util.format()` for more information.
        * @since v0.1.100
        */
      def error(message: Any, optionalParams: Any*): Unit = js.native
      def error(message: Unit, optionalParams: Any*): Unit = js.native
      
      /**
        * Increases indentation of subsequent lines by spaces for `groupIndentation`length.
        *
        * If one or more `label`s are provided, those are printed first without the
        * additional indentation.
        * @since v8.5.0
        */
      def group(label: Any*): Unit = js.native
      
      /**
        * An alias for {@link group}.
        * @since v8.5.0
        */
      def groupCollapsed(label: Any*): Unit = js.native
      
      /**
        * Decreases indentation of subsequent lines by spaces for `groupIndentation`length.
        * @since v8.5.0
        */
      def groupEnd(): Unit = js.native
      
      /**
        * The `console.info()` function is an alias for {@link log}.
        * @since v0.1.100
        */
      def info(message: Any, optionalParams: Any*): Unit = js.native
      def info(message: Unit, optionalParams: Any*): Unit = js.native
      
      /**
        * Prints to `stdout` with newline. Multiple arguments can be passed, with the
        * first used as the primary message and all additional used as substitution
        * values similar to [`printf(3)`](http://man7.org/linux/man-pages/man3/printf.3.html) (the arguments are all passed to `util.format()`).
        *
        * ```js
        * const count = 5;
        * console.log('count: %d', count);
        * // Prints: count: 5, to stdout
        * console.log('count:', count);
        * // Prints: count: 5, to stdout
        * ```
        *
        * See `util.format()` for more information.
        * @since v0.1.100
        */
      def log(message: Any, optionalParams: Any*): Unit = js.native
      def log(message: Unit, optionalParams: Any*): Unit = js.native
      
      // --- Inspector mode only ---
      /**
        * This method does not display anything unless used in the inspector.
        *  Starts a JavaScript CPU profile with an optional label.
        */
      def profile(): Unit = js.native
      def profile(label: String): Unit = js.native
      
      /**
        * This method does not display anything unless used in the inspector.
        *  Stops the current JavaScript CPU profiling session if one has been started and prints the report to the Profiles panel of the inspector.
        */
      def profileEnd(): Unit = js.native
      def profileEnd(label: String): Unit = js.native
      
      /**
        * Try to construct a table with the columns of the properties of `tabularData`(or use `properties`) and rows of `tabularData` and log it. Falls back to just
        * logging the argument if it can’t be parsed as tabular.
        *
        * ```js
        * // These can't be parsed as tabular data
        * console.table(Symbol());
        * // Symbol()
        *
        * console.table(undefined);
        * // undefined
        *
        * console.table([{ a: 1, b: 'Y' }, { a: 'Z', b: 2 }]);
        * // ┌─────────┬─────┬─────┐
        * // │ (index) │  a  │  b  │
        * // ├─────────┼─────┼─────┤
        * // │    0    │  1  │ 'Y' │
        * // │    1    │ 'Z' │  2  │
        * // └─────────┴─────┴─────┘
        *
        * console.table([{ a: 1, b: 'Y' }, { a: 'Z', b: 2 }], ['a']);
        * // ┌─────────┬─────┐
        * // │ (index) │  a  │
        * // ├─────────┼─────┤
        * // │    0    │  1  │
        * // │    1    │ 'Z' │
        * // └─────────┴─────┘
        * ```
        * @since v10.0.0
        * @param properties Alternate properties for constructing the table.
        */
      def table(tabularData: Any): Unit = js.native
      def table(tabularData: Any, properties: js.Array[String]): Unit = js.native
      
      /**
        * Starts a timer that can be used to compute the duration of an operation. Timers
        * are identified by a unique `label`. Use the same `label` when calling {@link timeEnd} to stop the timer and output the elapsed time in
        * suitable time units to `stdout`. For example, if the elapsed
        * time is 3869ms, `console.timeEnd()` displays "3.869s".
        * @since v0.1.104
        */
      def time(): Unit = js.native
      def time(label: String): Unit = js.native
      
      /**
        * Stops a timer that was previously started by calling {@link time} and
        * prints the result to `stdout`:
        *
        * ```js
        * console.time('100-elements');
        * for (let i = 0; i < 100; i++) {}
        * console.timeEnd('100-elements');
        * // prints 100-elements: 225.438ms
        * ```
        * @since v0.1.104
        */
      def timeEnd(): Unit = js.native
      def timeEnd(label: String): Unit = js.native
      
      /**
        * For a timer that was previously started by calling {@link time}, prints
        * the elapsed time and other `data` arguments to `stdout`:
        *
        * ```js
        * console.time('process');
        * const value = expensiveProcess1(); // Returns 42
        * console.timeLog('process', value);
        * // Prints "process: 365.227ms 42".
        * doExpensiveProcess2(value);
        * console.timeEnd('process');
        * ```
        * @since v10.7.0
        */
      def timeLog(label: String, data: Any*): Unit = js.native
      def timeLog(label: Unit, data: Any*): Unit = js.native
      
      /**
        * This method does not display anything unless used in the inspector.
        *  Adds an event with the label `label` to the Timeline panel of the inspector.
        */
      def timeStamp(): Unit = js.native
      def timeStamp(label: String): Unit = js.native
      
      /**
        * Prints to `stderr` the string `'Trace: '`, followed by the `util.format()` formatted message and stack trace to the current position in the code.
        *
        * ```js
        * console.trace('Show me');
        * // Prints: (stack trace will vary based on where trace is called)
        * //  Trace: Show me
        * //    at repl:2:9
        * //    at REPLServer.defaultEval (repl.js:248:27)
        * //    at bound (domain.js:287:14)
        * //    at REPLServer.runBound [as eval] (domain.js:300:12)
        * //    at REPLServer.<anonymous> (repl.js:412:12)
        * //    at emitOne (events.js:82:20)
        * //    at REPLServer.emit (events.js:169:7)
        * //    at REPLServer.Interface._onLine (readline.js:210:10)
        * //    at REPLServer.Interface._line (readline.js:549:8)
        * //    at REPLServer.Interface._ttyWrite (readline.js:826:14)
        * ```
        * @since v0.1.104
        */
      def trace(message: Any, optionalParams: Any*): Unit = js.native
      def trace(message: Unit, optionalParams: Any*): Unit = js.native
      
      /**
        * The `console.warn()` function is an alias for {@link error}.
        * @since v0.1.100
        */
      def warn(message: Any, optionalParams: Any*): Unit = js.native
      def warn(message: Unit, optionalParams: Any*): Unit = js.native
    }
  }
}
