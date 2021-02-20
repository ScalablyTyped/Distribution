package typings.node

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.WritableStream
import typings.node.consoleMod.global.Console_
import typings.node.consoleMod.global.NodeJS.ConsoleConstructor
import typings.node.consoleMod.global.NodeJS.ConsoleConstructorOptions
import typings.node.nodeStrings.auto
import typings.node.utilMod.InspectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleMod extends Shortcut {
  
  @JSImport("console", JSImport.Namespace)
  @js.native
  val ^ : Console_ = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("console", "Console")
  @js.native
  class Console protected () extends Console_ {
    def this(options: ConsoleConstructorOptions) = this()
    def this(stdout: WritableStream) = this()
    def this(stdout: WritableStream, stderr: WritableStream) = this()
    def this(stdout: WritableStream, stderr: js.UndefOr[scala.Nothing], ignoreErrors: Boolean) = this()
    def this(stdout: WritableStream, stderr: WritableStream, ignoreErrors: Boolean) = this()
  }
  
  object global {
    
    object console extends Shortcut {
      
      @JSGlobal("console")
      @js.native
      val ^ : Console_ = js.native
      
      /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
      @JSGlobal("console.Console")
      @js.native
      class ConsoleCls protected () extends Console_ {
        def this(options: ConsoleConstructorOptions) = this()
        def this(stdout: WritableStream) = this()
        def this(stdout: WritableStream, stderr: WritableStream) = this()
        def this(stdout: WritableStream, stderr: js.UndefOr[scala.Nothing], ignoreErrors: Boolean) = this()
        def this(stdout: WritableStream, stderr: WritableStream, ignoreErrors: Boolean) = this()
      }
      
      type _To = Console_
      
      /* This means you don't have to write `^`, but can instead just say `console.foo` */
      override def _to: Console_ = ^
    }
    
    // This needs to be global to avoid TS2403 in case lib.dom.d.ts is present in the same build
    @js.native
    trait Console_ extends StObject {
      
      var Console: ConsoleConstructor = js.native
      
      def assert(value: js.Any, message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
      /**
        * A simple assertion test that verifies whether `value` is truthy.
        * If it is not, an `AssertionError` is thrown.
        * If provided, the error `message` is formatted using `util.format()` and used as the error message.
        */
      def assert(value: js.Any, message: java.lang.String, optionalParams: js.Any*): Unit = js.native
      
      /**
        * When `stdout` is a TTY, calling `console.clear()` will attempt to clear the TTY.
        * When `stdout` is not a TTY, this method does nothing.
        */
      def clear(): Unit = js.native
      
      /**
        * Maintains an internal counter specific to `label` and outputs to `stdout` the number of times `console.count()` has been called with the given `label`.
        */
      def count(): Unit = js.native
      def count(label: java.lang.String): Unit = js.native
      
      /**
        * Resets the internal counter specific to `label`.
        */
      def countReset(): Unit = js.native
      def countReset(label: java.lang.String): Unit = js.native
      
      def debug(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
      /**
        * The `console.debug()` function is an alias for {@link console.log()}.
        */
      def debug(message: js.Any, optionalParams: js.Any*): Unit = js.native
      
      /**
        * Uses {@link util.inspect()} on `obj` and prints the resulting string to `stdout`.
        * This function bypasses any custom `inspect()` function defined on `obj`.
        */
      def dir(obj: js.Any): Unit = js.native
      def dir(obj: js.Any, options: InspectOptions): Unit = js.native
      
      /**
        * This method calls {@link console.log()} passing it the arguments received. Please note that this method does not produce any XML formatting
        */
      def dirxml(data: js.Any*): Unit = js.native
      
      def error(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
      /**
        * Prints to `stderr` with newline.
        */
      def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
      
      /**
        * Increases indentation of subsequent lines by two spaces.
        * If one or more `label`s are provided, those are printed first without the additional indentation.
        */
      def group(label: js.Any*): Unit = js.native
      
      /**
        * The `console.groupCollapsed()` function is an alias for {@link console.group()}.
        */
      def groupCollapsed(label: js.Any*): Unit = js.native
      
      /**
        * Decreases indentation of subsequent lines by two spaces.
        */
      def groupEnd(): Unit = js.native
      
      def info(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
      /**
        * The {@link console.info()} function is an alias for {@link console.log()}.
        */
      def info(message: js.Any, optionalParams: js.Any*): Unit = js.native
      
      def log(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
      /**
        * Prints to `stdout` with newline.
        */
      def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
      
      // --- Inspector mode only ---
      /**
        * This method does not display anything unless used in the inspector.
        *  Starts a JavaScript CPU profile with an optional label.
        */
      def profile(): Unit = js.native
      def profile(label: java.lang.String): Unit = js.native
      
      /**
        * This method does not display anything unless used in the inspector.
        *  Stops the current JavaScript CPU profiling session if one has been started and prints the report to the Profiles panel of the inspector.
        */
      def profileEnd(): Unit = js.native
      def profileEnd(label: java.lang.String): Unit = js.native
      
      /**
        * This method does not display anything unless used in the inspector.
        *  Prints to `stdout` the array `array` formatted as a table.
        */
      def table(tabularData: js.Any): Unit = js.native
      def table(tabularData: js.Any, properties: js.Array[java.lang.String]): Unit = js.native
      
      /**
        * Starts a timer that can be used to compute the duration of an operation. Timers are identified by a unique `label`.
        */
      def time(): Unit = js.native
      def time(label: java.lang.String): Unit = js.native
      
      /**
        * Stops a timer that was previously started by calling {@link console.time()} and prints the result to `stdout`.
        */
      def timeEnd(): Unit = js.native
      def timeEnd(label: java.lang.String): Unit = js.native
      
      def timeLog(label: js.UndefOr[scala.Nothing], data: js.Any*): Unit = js.native
      /**
        * For a timer that was previously started by calling {@link console.time()}, prints the elapsed time and other `data` arguments to `stdout`.
        */
      def timeLog(label: java.lang.String, data: js.Any*): Unit = js.native
      
      /**
        * This method does not display anything unless used in the inspector.
        *  Adds an event with the label `label` to the Timeline panel of the inspector.
        */
      def timeStamp(): Unit = js.native
      def timeStamp(label: java.lang.String): Unit = js.native
      
      def trace(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
      /**
        * Prints to `stderr` the string 'Trace :', followed by the {@link util.format()} formatted message and stack trace to the current position in the code.
        */
      def trace(message: js.Any, optionalParams: js.Any*): Unit = js.native
      
      def warn(message: js.UndefOr[scala.Nothing], optionalParams: js.Any*): Unit = js.native
      /**
        * The {@link console.warn()} function is an alias for {@link console.error()}.
        */
      def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
    }
    
    object NodeJS {
      
      @js.native
      trait ConsoleConstructor
        extends Instantiable1[
                  (/* options */ ConsoleConstructorOptions) | (/* stdout */ WritableStream), 
                  Console_
                ]
           with Instantiable2[/* stdout */ WritableStream, /* stderr */ WritableStream, Console_]
           with Instantiable3[
                  /* stdout */ WritableStream, 
                  js.UndefOr[/* stderr */ WritableStream], 
                  /* ignoreErrors */ Boolean, 
                  Console_
                ]
      
      @js.native
      trait ConsoleConstructorOptions extends StObject {
        
        var colorMode: js.UndefOr[Boolean | auto] = js.native
        
        var ignoreErrors: js.UndefOr[Boolean] = js.native
        
        var inspectOptions: js.UndefOr[typings.node.NodeJS.InspectOptions] = js.native
        
        var stderr: js.UndefOr[WritableStream] = js.native
        
        var stdout: WritableStream = js.native
      }
      object ConsoleConstructorOptions {
        
        @scala.inline
        def apply(stdout: WritableStream): ConsoleConstructorOptions = {
          val __obj = js.Dynamic.literal(stdout = stdout.asInstanceOf[js.Any])
          __obj.asInstanceOf[ConsoleConstructorOptions]
        }
        
        @scala.inline
        implicit class ConsoleConstructorOptionsMutableBuilder[Self <: ConsoleConstructorOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setColorMode(value: Boolean | auto): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setColorModeUndefined: Self = StObject.set(x, "colorMode", js.undefined)
          
          @scala.inline
          def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
          
          @scala.inline
          def setInspectOptions(value: typings.node.NodeJS.InspectOptions): Self = StObject.set(x, "inspectOptions", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInspectOptionsUndefined: Self = StObject.set(x, "inspectOptions", js.undefined)
          
          @scala.inline
          def setStderr(value: WritableStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
          
          @scala.inline
          def setStdout(value: WritableStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait Global extends StObject {
        
        var console: Console_ = js.native
      }
      object Global {
        
        @scala.inline
        def apply(console: Console_): Global = {
          val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any])
          __obj.asInstanceOf[Global]
        }
        
        @scala.inline
        implicit class GlobalMutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setConsole(value: Console_): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
        }
      }
    }
  }
  
  type _To = Console_
  
  /* This means you don't have to write `^`, but can instead just say `consoleMod.foo` */
  override def _to: Console_ = ^
}
