package typings.ora

import typings.cliSpinners.mod.SpinnerName
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Elegant terminal spinner.
  	@param options - If a string is provided, it is treated as a shortcut for `options.text`.
  	@example
  	```
  	import ora = require('ora');
  	const spinner = ora('Loading unicorns').start();
  	setTimeout(() => {
  		spinner.color = 'yellow';
  		spinner.text = 'Loading rainbows';
  	}, 1000);
  	```
  	*/
  @JSImport("ora", JSImport.Namespace)
  @js.native
  def apply(): Ora = js.native
  @JSImport("ora", JSImport.Namespace)
  @js.native
  def apply(options: String): Ora = js.native
  @JSImport("ora", JSImport.Namespace)
  @js.native
  def apply(options: Options): Ora = js.native
  
  /**
  	Starts a spinner for a promise. The spinner is stopped with `.succeed()` if the promise fulfills or with `.fail()` if it rejects.
  	@param action - The promise to start the spinner for.
  	@param options - If a string is provided, it is treated as a shortcut for `options.text`.
  	@returns The spinner instance.
  	*/
  @JSImport("ora", "promise")
  @js.native
  def promise(action: js.Thenable[_]): Ora = js.native
  @JSImport("ora", "promise")
  @js.native
  def promise(action: js.Thenable[_], options: String): Ora = js.native
  @JSImport("ora", "promise")
  @js.native
  def promise(action: js.Thenable[_], options: Options): Ora = js.native
  
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
    
    @scala.inline
    def black: typings.ora.oraStrings.black = "black".asInstanceOf[typings.ora.oraStrings.black]
    
    @scala.inline
    def blue: typings.ora.oraStrings.blue = "blue".asInstanceOf[typings.ora.oraStrings.blue]
    
    @scala.inline
    def cyan: typings.ora.oraStrings.cyan = "cyan".asInstanceOf[typings.ora.oraStrings.cyan]
    
    @scala.inline
    def gray: typings.ora.oraStrings.gray = "gray".asInstanceOf[typings.ora.oraStrings.gray]
    
    @scala.inline
    def green: typings.ora.oraStrings.green = "green".asInstanceOf[typings.ora.oraStrings.green]
    
    @scala.inline
    def magenta: typings.ora.oraStrings.magenta = "magenta".asInstanceOf[typings.ora.oraStrings.magenta]
    
    @scala.inline
    def red: typings.ora.oraStrings.red = "red".asInstanceOf[typings.ora.oraStrings.red]
    
    @scala.inline
    def white: typings.ora.oraStrings.white = "white".asInstanceOf[typings.ora.oraStrings.white]
    
    @scala.inline
    def yellow: typings.ora.oraStrings.yellow = "yellow".asInstanceOf[typings.ora.oraStrings.yellow]
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Color of the spinner.
    		@default 'cyan'
    		*/
    val color: js.UndefOr[Color] = js.native
    
    /**
    		Discard stdin input (except Ctrl+C) while running if it's TTY. This prevents the spinner from twitching on input, outputting broken lines on `Enter` key presses, and prevents buffering of input while the spinner is running.
    		This has no effect on Windows as there's no good way to implement discarding stdin properly there.
    		@default true
    		*/
    val discardStdin: js.UndefOr[Boolean] = js.native
    
    /**
    		Set to `false` to stop Ora from hiding the cursor.
    		@default true
    		*/
    val hideCursor: js.UndefOr[Boolean] = js.native
    
    /**
    		Indent the spinner with the given number of spaces.
    		@default 0
    		*/
    val indent: js.UndefOr[Double] = js.native
    
    /**
    		Interval between each frame.
    		Spinners provide their own recommended interval, so you don't really need to specify this.
    		Default: Provided by the spinner or `100`.
    		*/
    val interval: js.UndefOr[Double] = js.native
    
    /**
    		Force enable/disable the spinner. If not specified, the spinner will be enabled if the `stream` is being run inside a TTY context (not spawned or piped) and/or not in a CI environment.
    		Note that `{isEnabled: false}` doesn't mean it won't output anything. It just means it won't output the spinner, colors, and other ansi escape codes. It will still log text.
    		*/
    val isEnabled: js.UndefOr[Boolean] = js.native
    
    /**
    		Disable the spinner and all log text. All output is suppressed and `isEnabled` will be considered `false`.
    		@default false
    		*/
    val isSilent: js.UndefOr[Boolean] = js.native
    
    /**
    		Text or a function that returns text to display before the spinner. No prefix text will be displayed if set to an empty string.
    		*/
    val prefixText: js.UndefOr[String | PrefixTextGenerator] = js.native
    
    /**
    		Name of one of the provided spinners. See [`example.js`](https://github.com/BendingBender/ora/blob/master/example.js) in this repo if you want to test out different spinners. On Windows, it will always use the line spinner as the Windows command-line doesn't have proper Unicode support.
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
    val spinner: js.UndefOr[SpinnerName | Spinner] = js.native
    
    /**
    		Stream to write the output.
    		You could for example set this to `process.stdout` instead.
    		@default process.stderr
    		*/
    val stream: js.UndefOr[WritableStream] = js.native
    
    /**
    		Text to display after the spinner.
    		*/
    val text: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDiscardStdin(value: Boolean): Self = StObject.set(x, "discardStdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscardStdinUndefined: Self = StObject.set(x, "discardStdin", js.undefined)
      
      @scala.inline
      def setHideCursor(value: Boolean): Self = StObject.set(x, "hideCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideCursorUndefined: Self = StObject.set(x, "hideCursor", js.undefined)
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      @scala.inline
      def setIsSilent(value: Boolean): Self = StObject.set(x, "isSilent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSilentUndefined: Self = StObject.set(x, "isSilent", js.undefined)
      
      @scala.inline
      def setPrefixText(value: String | PrefixTextGenerator): Self = StObject.set(x, "prefixText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixTextFunction0(value: () => String): Self = StObject.set(x, "prefixText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrefixTextUndefined: Self = StObject.set(x, "prefixText", js.undefined)
      
      @scala.inline
      def setSpinner(value: SpinnerName | Spinner): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
      
      @scala.inline
      def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait Ora extends StObject {
    
    /**
    		Clear the spinner.
    		@returns The spinner instance.
    		*/
    def clear(): Ora = js.native
    
    /**
    		Change the spinner color.
    		*/
    var color: Color = js.native
    
    /**
    		Stop the spinner, change it to a red `✖` and persist the current text, or `text` if provided.
    		@param text - Will persist text if provided.
    		@returns The spinner instance.
    		*/
    def fail(): Ora = js.native
    def fail(text: String): Ora = js.native
    
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
    def info(): Ora = js.native
    def info(text: String): Ora = js.native
    
    /**
    		A boolean of whether the instance is currently spinning.
    		*/
    val isSpinning: Boolean = js.native
    
    /**
    		Change the text or function that returns text before the spinner. No prefix text will be displayed if set to an empty string.
    		*/
    var prefixText: String | PrefixTextGenerator = js.native
    
    /**
    		Manually render a new frame.
    		@returns The spinner instance.
    		*/
    def render(): Ora = js.native
    
    /**
    		Change the spinner.
    		*/
    var spinner: SpinnerName | Spinner = js.native
    
    /**
    		Start the spinner.
    		@param text - Set the current text.
    		@returns The spinner instance.
    		*/
    def start(): Ora = js.native
    def start(text: String): Ora = js.native
    
    /**
    		Stop and clear the spinner.
    		@returns The spinner instance.
    		*/
    def stop(): Ora = js.native
    
    /**
    		Stop the spinner and change the symbol or text.
    		@returns The spinner instance.
    		*/
    def stopAndPersist(): Ora = js.native
    def stopAndPersist(options: PersistOptions): Ora = js.native
    
    /**
    		Stop the spinner, change it to a green `✔` and persist the current text, or `text` if provided.
    		@param text - Will persist text if provided.
    		@returns The spinner instance.
    		*/
    def succeed(): Ora = js.native
    def succeed(text: String): Ora = js.native
    
    /**
    		Change the text after the spinner.
    		*/
    var text: String = js.native
    
    /**
    		Stop the spinner, change it to a yellow `⚠` and persist the current text, or `text` if provided.
    		@param text - Will persist text if provided.
    		@returns The spinner instance.
    		*/
    def warn(): Ora = js.native
    def warn(text: String): Ora = js.native
  }
  
  @js.native
  trait PersistOptions extends StObject {
    
    /**
    		Text or a function that returns text to be persisted before the symbol. No prefix text will be displayed if set to an empty string.
    		Default: Current `prefixText`.
    		*/
    val prefixText: js.UndefOr[String | PrefixTextGenerator] = js.native
    
    /**
    		Symbol to replace the spinner with.
    		@default ' '
    		*/
    val symbol: js.UndefOr[String] = js.native
    
    /**
    		Text to be persisted after the symbol.
    		Default: Current `text`.
    		*/
    val text: js.UndefOr[String] = js.native
  }
  object PersistOptions {
    
    @scala.inline
    def apply(): PersistOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PersistOptions]
    }
    
    @scala.inline
    implicit class PersistOptionsMutableBuilder[Self <: PersistOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefixText(value: String | PrefixTextGenerator): Self = StObject.set(x, "prefixText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixTextFunction0(value: () => String): Self = StObject.set(x, "prefixText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrefixTextUndefined: Self = StObject.set(x, "prefixText", js.undefined)
      
      @scala.inline
      def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type PrefixTextGenerator = js.Function0[String]
  
  @js.native
  trait Spinner extends StObject {
    
    val frames: js.Array[String] = js.native
    
    val interval: js.UndefOr[Double] = js.native
  }
  object Spinner {
    
    @scala.inline
    def apply(frames: js.Array[String]): Spinner = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spinner]
    }
    
    @scala.inline
    implicit class SpinnerMutableBuilder[Self <: Spinner] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrames(value: js.Array[String]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesVarargs(value: String*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    }
  }
}
