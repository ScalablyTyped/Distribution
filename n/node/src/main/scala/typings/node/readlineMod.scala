package typings.node

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.eventsMod.EventEmitter
import typings.node.nodeStrings.SIGCONT
import typings.node.nodeStrings.SIGINT
import typings.node.nodeStrings.SIGTSTP
import typings.node.nodeStrings.close
import typings.node.nodeStrings.pause
import typings.node.nodeStrings.resume
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readlineMod {
  
  @JSImport("readline", "Interface")
  @js.native
  class Interface protected () extends EventEmitter {
    /**
      * NOTE: According to the documentation:
      *
      * > Instances of the `readline.Interface` class are constructed using the
      * > `readline.createInterface()` method.
      *
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
      */
    protected def this(input: ReadableStream) = this()
    /**
      * NOTE: According to the documentation:
      *
      * > Instances of the `readline.Interface` class are constructed using the
      * > `readline.createInterface()` method.
      *
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
      */
    protected def this(options: ReadLineOptions) = this()
    protected def this(input: ReadableStream, output: WritableStream) = this()
    protected def this(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: AsyncCompleter) = this()
    protected def this(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: Completer) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: Completer) = this()
    protected def this(
      input: ReadableStream,
      output: js.UndefOr[scala.Nothing],
      completer: js.UndefOr[scala.Nothing],
      terminal: Boolean
    ) = this()
    protected def this(
      input: ReadableStream,
      output: js.UndefOr[scala.Nothing],
      completer: AsyncCompleter,
      terminal: Boolean
    ) = this()
    protected def this(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: Completer, terminal: Boolean) = this()
    protected def this(
      input: ReadableStream,
      output: WritableStream,
      completer: js.UndefOr[scala.Nothing],
      terminal: Boolean
    ) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean) = this()
    
    @JSName("addListener")
    def addListener_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_line(event: typings.node.nodeStrings.line, listener: js.Function1[/* input */ java.lang.String, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def close(): Unit = js.native
    
    /** The current cursor position in the input line */
    val cursor: Double = js.native
    
    @JSName("emit")
    def emit_SIGCONT(event: SIGCONT): Boolean = js.native
    @JSName("emit")
    def emit_SIGINT(event: SIGINT): Boolean = js.native
    @JSName("emit")
    def emit_SIGTSTP(event: SIGTSTP): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_line(event: typings.node.nodeStrings.line, input: java.lang.String): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    
    /**
      * Returns the real position of the cursor in relation to the input
      * prompt + string.  Long input (wrapping) strings, as well as multiple
      * line prompts are included in the calculations.
      */
    def getCursorPos(): CursorPos = js.native
    
    // Need direct access to line/cursor data, for use in external processes
    // see: https://github.com/nodejs/node/issues/30347
    /** The current input data */
    val line: java.lang.String = js.native
    
    @JSName("on")
    def on_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_line(event: typings.node.nodeStrings.line, listener: js.Function1[/* input */ java.lang.String, Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_line(event: typings.node.nodeStrings.line, listener: js.Function1[/* input */ java.lang.String, Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def pause(): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_line(event: typings.node.nodeStrings.line, listener: js.Function1[/* input */ java.lang.String, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_SIGCONT(event: SIGCONT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_SIGINT(event: SIGINT, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_SIGTSTP(event: SIGTSTP, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_line(event: typings.node.nodeStrings.line, listener: js.Function1[/* input */ java.lang.String, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def prompt(): Unit = js.native
    def prompt(preserveCursor: Boolean): Unit = js.native
    
    def question(query: java.lang.String, callback: js.Function1[/* answer */ java.lang.String, Unit]): Unit = js.native
    
    def resume(): this.type = js.native
    
    def setPrompt(prompt: java.lang.String): Unit = js.native
    
    val terminal: Boolean = js.native
    
    def write(data: java.lang.String): Unit = js.native
    def write(data: java.lang.String, key: Key): Unit = js.native
    def write(data: Buffer): Unit = js.native
    def write(data: Buffer, key: Key): Unit = js.native
  }
  
  /**
    * Clears the current line of this WriteStream in a direction identified by `dir`.
    */
  @JSImport("readline", "clearLine")
  @js.native
  def clearLine(stream: WritableStream, dir: Direction): Boolean = js.native
  @JSImport("readline", "clearLine")
  @js.native
  def clearLine(stream: WritableStream, dir: Direction, callback: js.Function0[Unit]): Boolean = js.native
  
  /**
    * Clears this `WriteStream` from the current cursor down.
    */
  @JSImport("readline", "clearScreenDown")
  @js.native
  def clearScreenDown(stream: WritableStream): Boolean = js.native
  @JSImport("readline", "clearScreenDown")
  @js.native
  def clearScreenDown(stream: WritableStream, callback: js.Function0[Unit]): Boolean = js.native
  
  @JSImport("readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream): Interface = js.native
  @JSImport("readline", "createInterface")
  @js.native
  def createInterface(
    input: ReadableStream,
    output: js.UndefOr[scala.Nothing],
    completer: js.UndefOr[scala.Nothing],
    terminal: Boolean
  ): Interface = js.native
  @JSImport("readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: AsyncCompleter): Interface = js.native
  @JSImport("readline", "createInterface")
  @js.native
  def createInterface(
    input: ReadableStream,
    output: js.UndefOr[scala.Nothing],
    completer: AsyncCompleter,
    terminal: Boolean
  ): Interface = js.native
  @JSImport("readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: Completer): Interface = js.native
  @JSImport("readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: Completer, terminal: Boolean): Interface = js.native
  @JSImport("readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: WritableStream): Interface = js.native
  @JSImport("readline", "createInterface")
  @js.native
  def createInterface(
    input: ReadableStream,
    output: WritableStream,
    completer: js.UndefOr[scala.Nothing],
    terminal: Boolean
  ): Interface = js.native
  @JSImport("readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter): Interface = js.native
  @JSImport("readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean): Interface = js.native
  @JSImport("readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer): Interface = js.native
  @JSImport("readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): Interface = js.native
  @JSImport("readline", "createInterface")
  @js.native
  def createInterface(options: ReadLineOptions): Interface = js.native
  
  /**
    * Moves this WriteStream's cursor to the specified position.
    */
  @JSImport("readline", "cursorTo")
  @js.native
  def cursorTo(stream: WritableStream, x: Double): Boolean = js.native
  @JSImport("readline", "cursorTo")
  @js.native
  def cursorTo(stream: WritableStream, x: Double, y: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Boolean = js.native
  @JSImport("readline", "cursorTo")
  @js.native
  def cursorTo(stream: WritableStream, x: Double, y: Double): Boolean = js.native
  @JSImport("readline", "cursorTo")
  @js.native
  def cursorTo(stream: WritableStream, x: Double, y: Double, callback: js.Function0[Unit]): Boolean = js.native
  
  @JSImport("readline", "emitKeypressEvents")
  @js.native
  def emitKeypressEvents(stream: ReadableStream): Unit = js.native
  @JSImport("readline", "emitKeypressEvents")
  @js.native
  def emitKeypressEvents(stream: ReadableStream, readlineInterface: Interface): Unit = js.native
  
  /**
    * Moves this WriteStream's cursor relative to its current position.
    */
  @JSImport("readline", "moveCursor")
  @js.native
  def moveCursor(stream: WritableStream, dx: Double, dy: Double): Boolean = js.native
  @JSImport("readline", "moveCursor")
  @js.native
  def moveCursor(stream: WritableStream, dx: Double, dy: Double, callback: js.Function0[Unit]): Boolean = js.native
  
  type AsyncCompleter = js.Function2[
    /* line */ java.lang.String, 
    /* callback */ js.Function2[/* err */ js.UndefOr[Null | Error], /* result */ js.UndefOr[CompleterResult], Unit], 
    js.Any
  ]
  
  // type forwarded for backwards compatiblity
  type Completer = js.Function1[/* line */ java.lang.String, CompleterResult]
  
  type CompleterResult = js.Tuple2[js.Array[java.lang.String], java.lang.String]
  
  @js.native
  trait CursorPos extends StObject {
    
    var cols: Double = js.native
    
    var rows: Double = js.native
  }
  object CursorPos {
    
    @scala.inline
    def apply(cols: Double, rows: Double): CursorPos = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[CursorPos]
    }
    
    @scala.inline
    implicit class CursorPosMutableBuilder[Self <: CursorPos] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.nodeNumbers.`-1`
    - typings.node.nodeNumbers.`0`
    - typings.node.nodeNumbers.`1`
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def `-1`: typings.node.nodeNumbers.`-1` = -1.asInstanceOf[typings.node.nodeNumbers.`-1`]
    
    @scala.inline
    def `0`: typings.node.nodeNumbers.`0` = 0.asInstanceOf[typings.node.nodeNumbers.`0`]
    
    @scala.inline
    def `1`: typings.node.nodeNumbers.`1` = 1.asInstanceOf[typings.node.nodeNumbers.`1`]
  }
  
  @js.native
  trait Key extends StObject {
    
    var ctrl: js.UndefOr[Boolean] = js.native
    
    var meta: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[java.lang.String] = js.native
    
    var sequence: js.UndefOr[java.lang.String] = js.native
    
    var shift: js.UndefOr[Boolean] = js.native
  }
  object Key {
    
    @scala.inline
    def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtrl(value: Boolean): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrlUndefined: Self = StObject.set(x, "ctrl", js.undefined)
      
      @scala.inline
      def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSequence(value: java.lang.String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
      
      @scala.inline
      def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    }
  }
  
  type ReadLine = Interface
  
  @js.native
  trait ReadLineOptions extends StObject {
    
    var completer: js.UndefOr[Completer | AsyncCompleter] = js.native
    
    var crlfDelay: js.UndefOr[Double] = js.native
    
    var escapeCodeTimeout: js.UndefOr[Double] = js.native
    
    var historySize: js.UndefOr[Double] = js.native
    
    var input: ReadableStream = js.native
    
    var output: js.UndefOr[WritableStream] = js.native
    
    var prompt: js.UndefOr[java.lang.String] = js.native
    
    var removeHistoryDuplicates: js.UndefOr[Boolean] = js.native
    
    var tabSize: js.UndefOr[Double] = js.native
    
    var terminal: js.UndefOr[Boolean] = js.native
  }
  object ReadLineOptions {
    
    @scala.inline
    def apply(input: ReadableStream): ReadLineOptions = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadLineOptions]
    }
    
    @scala.inline
    implicit class ReadLineOptionsMutableBuilder[Self <: ReadLineOptions] (val x: Self) extends AnyVal {
      
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
      def setCrlfDelay(value: Double): Self = StObject.set(x, "crlfDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrlfDelayUndefined: Self = StObject.set(x, "crlfDelay", js.undefined)
      
      @scala.inline
      def setEscapeCodeTimeout(value: Double): Self = StObject.set(x, "escapeCodeTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeCodeTimeoutUndefined: Self = StObject.set(x, "escapeCodeTimeout", js.undefined)
      
      @scala.inline
      def setHistorySize(value: Double): Self = StObject.set(x, "historySize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistorySizeUndefined: Self = StObject.set(x, "historySize", js.undefined)
      
      @scala.inline
      def setInput(value: ReadableStream): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: WritableStream): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setPrompt(value: java.lang.String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setRemoveHistoryDuplicates(value: Boolean): Self = StObject.set(x, "removeHistoryDuplicates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveHistoryDuplicatesUndefined: Self = StObject.set(x, "removeHistoryDuplicates", js.undefined)
      
      @scala.inline
      def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
      
      @scala.inline
      def setTerminal(value: Boolean): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
    }
  }
}
