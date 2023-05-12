package typings.ora

import typings.cliSpinners.mod.SpinnerName
import typings.node.NodeJS.WritableStream
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ora", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Ora = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Ora]
  inline def default(options: String): Ora = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Ora]
  inline def default(options: Options): Ora = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Ora]
  
  inline def oraPromise[T](action: js.Function1[/* spinner */ Ora, PromiseLike[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("oraPromise")(action.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def oraPromise[T](action: js.Function1[/* spinner */ Ora, PromiseLike[T]], options: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("oraPromise")(action.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def oraPromise[T](action: js.Function1[/* spinner */ Ora, PromiseLike[T]], options: PromiseOptions[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("oraPromise")(action.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def oraPromise[T](action: PromiseLike[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("oraPromise")(action.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def oraPromise[T](action: PromiseLike[T], options: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("oraPromise")(action.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def oraPromise[T](action: PromiseLike[T], options: PromiseOptions[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("oraPromise")(action.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ora.oraStrings.black
    - typings.ora.oraStrings.red
    - typings.ora.oraStrings.green
    - typings.ora.oraStrings.yellow
    - typings.ora.oraStrings.blue
    - typings.ora.oraStrings.magenta
    - typings.ora.oraStrings.cyan
    - typings.ora.oraStrings.white
    - typings.ora.oraStrings.gray
  */
  trait Color extends StObject
  object Color {
    
    inline def black: typings.ora.oraStrings.black = "black".asInstanceOf[typings.ora.oraStrings.black]
    
    inline def blue: typings.ora.oraStrings.blue = "blue".asInstanceOf[typings.ora.oraStrings.blue]
    
    inline def cyan: typings.ora.oraStrings.cyan = "cyan".asInstanceOf[typings.ora.oraStrings.cyan]
    
    inline def gray: typings.ora.oraStrings.gray = "gray".asInstanceOf[typings.ora.oraStrings.gray]
    
    inline def green: typings.ora.oraStrings.green = "green".asInstanceOf[typings.ora.oraStrings.green]
    
    inline def magenta: typings.ora.oraStrings.magenta = "magenta".asInstanceOf[typings.ora.oraStrings.magenta]
    
    inline def red: typings.ora.oraStrings.red = "red".asInstanceOf[typings.ora.oraStrings.red]
    
    inline def white: typings.ora.oraStrings.white = "white".asInstanceOf[typings.ora.oraStrings.white]
    
    inline def yellow: typings.ora.oraStrings.yellow = "yellow".asInstanceOf[typings.ora.oraStrings.yellow]
  }
  
  trait Options extends StObject {
    
    /**
    	The color of the spinner.
    	@default 'cyan'
    	*/
    val color: js.UndefOr[Color] = js.undefined
    
    /**
    	Discard stdin input (except Ctrl+C) while running if it's TTY. This prevents the spinner from twitching on input, outputting broken lines on `Enter` key presses, and prevents buffering of input while the spinner is running.
    	This has no effect on Windows as there's no good way to implement discarding stdin properly there.
    	@default true
    	*/
    val discardStdin: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Set to `false` to stop Ora from hiding the cursor.
    	@default true
    	*/
    val hideCursor: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Indent the spinner with the given number of spaces.
    	@default 0
    	*/
    val indent: js.UndefOr[Double] = js.undefined
    
    /**
    	Interval between each frame.
    	Spinners provide their own recommended interval, so you don't really need to specify this.
    	Default: Provided by the spinner or `100`.
    	*/
    val interval: js.UndefOr[Double] = js.undefined
    
    /**
    	Force enable/disable the spinner. If not specified, the spinner will be enabled if the `stream` is being run inside a TTY context (not spawned or piped) and/or not in a CI environment.
    	Note that `{isEnabled: false}` doesn't mean it won't output anything. It just means it won't output the spinner, colors, and other ansi escape codes. It will still log text.
    	*/
    val isEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Disable the spinner and all log text. All output is suppressed and `isEnabled` will be considered `false`.
    	@default false
    	*/
    val isSilent: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Text or a function that returns text to display before the spinner. No prefix text will be displayed if set to an empty string.
    	*/
    val prefixText: js.UndefOr[String | PrefixTextGenerator] = js.undefined
    
    /**
    	Name of one of the provided spinners. See [`example.js`](https://github.com/BendingBender/ora/blob/main/example.js) in this repo if you want to test out different spinners. On Windows, it will always use the line spinner as the Windows command-line doesn't have proper Unicode support.
    	@default 'dots'
    	Or an object like:
    	@example
    	```
    	{
    		interval: 80, // Optional
    		frames: ['-', '+', '-']
    	}
    	```
    	*/
    val spinner: js.UndefOr[SpinnerName | Spinner] = js.undefined
    
    /**
    	Stream to write the output.
    	You could for example set this to `process.stdout` instead.
    	@default process.stderr
    	*/
    val stream: js.UndefOr[WritableStream] = js.undefined
    
    /**
    	Text or a function that returns text to display after the spinner text. No suffix text will be displayed if set to an empty string.
    	*/
    val suffixText: js.UndefOr[String | SuffixTextGenerator] = js.undefined
    
    /**
    	Text to display after the spinner.
    	*/
    val text: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDiscardStdin(value: Boolean): Self = StObject.set(x, "discardStdin", value.asInstanceOf[js.Any])
      
      inline def setDiscardStdinUndefined: Self = StObject.set(x, "discardStdin", js.undefined)
      
      inline def setHideCursor(value: Boolean): Self = StObject.set(x, "hideCursor", value.asInstanceOf[js.Any])
      
      inline def setHideCursorUndefined: Self = StObject.set(x, "hideCursor", js.undefined)
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setIsSilent(value: Boolean): Self = StObject.set(x, "isSilent", value.asInstanceOf[js.Any])
      
      inline def setIsSilentUndefined: Self = StObject.set(x, "isSilent", js.undefined)
      
      inline def setPrefixText(value: String | PrefixTextGenerator): Self = StObject.set(x, "prefixText", value.asInstanceOf[js.Any])
      
      inline def setPrefixTextFunction0(value: () => String): Self = StObject.set(x, "prefixText", js.Any.fromFunction0(value))
      
      inline def setPrefixTextUndefined: Self = StObject.set(x, "prefixText", js.undefined)
      
      inline def setSpinner(value: SpinnerName | Spinner): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
      
      inline def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setSuffixText(value: String | SuffixTextGenerator): Self = StObject.set(x, "suffixText", value.asInstanceOf[js.Any])
      
      inline def setSuffixTextFunction0(value: () => String): Self = StObject.set(x, "suffixText", js.Any.fromFunction0(value))
      
      inline def setSuffixTextUndefined: Self = StObject.set(x, "suffixText", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait Ora extends StObject {
    
    /**
    	Clear the spinner.
    	@returns The spinner instance.
    	*/
    def clear(): this.type = js.native
    
    /**
    	Change the spinner color.
    	*/
    var color: Color = js.native
    
    /**
    	Stop the spinner, change it to a red `✖` and persist the current text, or `text` if provided.
    	@param text - Will persist text if provided.
    	@returns The spinner instance.
    	*/
    def fail(): this.type = js.native
    def fail(text: String): this.type = js.native
    
    /**
    	Get a new frame.
    	@returns The spinner instance text.
    	*/
    def frame(): String = js.native
    
    /**
    	Change the spinner indent.
    	*/
    var indent: Double = js.native
    
    /**
    	Stop the spinner, change it to a blue `ℹ` and persist the current text, or `text` if provided.
    	@param text - Will persist text if provided.
    	@returns The spinner instance.
    	*/
    def info(): this.type = js.native
    def info(text: String): this.type = js.native
    
    /**
    	The interval between each frame.
    	The interval is decided by the chosen spinner.
    	*/
    def interval: Double = js.native
    
    /**
    	A boolean of whether the instance is currently spinning.
    	*/
    def isSpinning: Boolean = js.native
    
    /**
    	Change the text or function that returns text before the spinner.
    	No prefix text will be displayed if set to an empty string.
    	*/
    var prefixText: String = js.native
    
    /**
    	Manually render a new frame.
    	@returns The spinner instance.
    	*/
    def render(): this.type = js.native
    
    /**
    	Get the spinner.
    	*/
    def spinner: Spinner = js.native
    /**
    	Set the spinner.
    	*/
    def spinner_=(spinner: SpinnerName | Spinner): Unit = js.native
    
    /**
    	Start the spinner.
    	@param text - Set the current text.
    	@returns The spinner instance.
    	*/
    def start(): this.type = js.native
    def start(text: String): this.type = js.native
    
    /**
    	Stop and clear the spinner.
    	@returns The spinner instance.
    	*/
    def stop(): this.type = js.native
    
    /**
    	Stop the spinner and change the symbol or text.
    	@returns The spinner instance.
    	*/
    def stopAndPersist(): this.type = js.native
    def stopAndPersist(options: PersistOptions): this.type = js.native
    
    /**
    	Stop the spinner, change it to a green `✔` and persist the current text, or `text` if provided.
    	@param text - Will persist text if provided.
    	@returns The spinner instance.
    	*/
    def succeed(): this.type = js.native
    def succeed(text: String): this.type = js.native
    
    /**
    	Change the text or function that returns text after the spinner text.
    	No suffix text will be displayed if set to an empty string.
    	*/
    var suffixText: String = js.native
    
    /**
    	Change the text after the spinner.
    	*/
    var text: String = js.native
    
    /**
    	Stop the spinner, change it to a yellow `⚠` and persist the current text, or `text` if provided.
    	@param text - Will persist text if provided.
    	@returns The spinner instance.
    	*/
    def warn(): this.type = js.native
    def warn(text: String): this.type = js.native
  }
  
  trait PersistOptions extends StObject {
    
    /**
    	Text or a function that returns text to be persisted before the symbol. No prefix text will be displayed if set to an empty string.
    	Default: Current `prefixText`.
    	*/
    val prefixText: js.UndefOr[String | PrefixTextGenerator] = js.undefined
    
    /**
    	Text or a function that returns text to be persisted after the text after the symbol. No suffix text will be displayed if set to an empty string.
    	Default: Current `suffixText`.
    	*/
    val suffixText: js.UndefOr[String | SuffixTextGenerator] = js.undefined
    
    /**
    	Symbol to replace the spinner with.
    	@default ' '
    	*/
    val symbol: js.UndefOr[String] = js.undefined
    
    /**
    	Text to be persisted after the symbol.
    	Default: Current `text`.
    	*/
    val text: js.UndefOr[String] = js.undefined
  }
  object PersistOptions {
    
    inline def apply(): PersistOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PersistOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersistOptions] (val x: Self) extends AnyVal {
      
      inline def setPrefixText(value: String | PrefixTextGenerator): Self = StObject.set(x, "prefixText", value.asInstanceOf[js.Any])
      
      inline def setPrefixTextFunction0(value: () => String): Self = StObject.set(x, "prefixText", js.Any.fromFunction0(value))
      
      inline def setPrefixTextUndefined: Self = StObject.set(x, "prefixText", js.undefined)
      
      inline def setSuffixText(value: String | SuffixTextGenerator): Self = StObject.set(x, "suffixText", value.asInstanceOf[js.Any])
      
      inline def setSuffixTextFunction0(value: () => String): Self = StObject.set(x, "suffixText", js.Any.fromFunction0(value))
      
      inline def setSuffixTextUndefined: Self = StObject.set(x, "suffixText", js.undefined)
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type PrefixTextGenerator = js.Function0[String]
  
  trait PromiseOptions[T]
    extends StObject
       with Options {
    
    /**
    	The new text of the spinner when the promise is rejected.
    	Keeps the existing text if `undefined`.
    	*/
    var failText: js.UndefOr[String | (js.Function1[/* error */ js.Error, String])] = js.undefined
    
    /**
    	The new text of the spinner when the promise is resolved.
    	Keeps the existing text if `undefined`.
    	*/
    var successText: js.UndefOr[String | (js.Function1[/* result */ T, String])] = js.undefined
  }
  object PromiseOptions {
    
    inline def apply[T](): PromiseOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromiseOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromiseOptions[?], T] (val x: Self & PromiseOptions[T]) extends AnyVal {
      
      inline def setFailText(value: String | (js.Function1[/* error */ js.Error, String])): Self = StObject.set(x, "failText", value.asInstanceOf[js.Any])
      
      inline def setFailTextFunction1(value: /* error */ js.Error => String): Self = StObject.set(x, "failText", js.Any.fromFunction1(value))
      
      inline def setFailTextUndefined: Self = StObject.set(x, "failText", js.undefined)
      
      inline def setSuccessText(value: String | (js.Function1[/* result */ T, String])): Self = StObject.set(x, "successText", value.asInstanceOf[js.Any])
      
      inline def setSuccessTextFunction1(value: /* result */ T => String): Self = StObject.set(x, "successText", js.Any.fromFunction1(value))
      
      inline def setSuccessTextUndefined: Self = StObject.set(x, "successText", js.undefined)
    }
  }
  
  trait Spinner extends StObject {
    
    val frames: js.Array[String]
    
    val interval: js.UndefOr[Double] = js.undefined
  }
  object Spinner {
    
    inline def apply(frames: js.Array[String]): Spinner = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spinner]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Spinner] (val x: Self) extends AnyVal {
      
      inline def setFrames(value: js.Array[String]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesVarargs(value: String*): Self = StObject.set(x, "frames", js.Array(value*))
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    }
  }
  
  type SuffixTextGenerator = js.Function0[String]
}
