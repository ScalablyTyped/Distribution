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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readlineMod {
  
  @JSImport("readline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    /* protected */ def this(input: ReadableStream) = this()
    /**
      * NOTE: According to the documentation:
      *
      * > Instances of the `readline.Interface` class are constructed using the
      * > `readline.createInterface()` method.
      *
      * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
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
  inline def clearLine(stream: WritableStream, dir: Direction): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")(stream.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def clearLine(stream: WritableStream, dir: Direction, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")(stream.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Clears this `WriteStream` from the current cursor down.
    */
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
  
  /**
    * Moves this WriteStream's cursor to the specified position.
    */
  inline def cursorTo(stream: WritableStream, x: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cursorTo(stream: WritableStream, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cursorTo(stream: WritableStream, x: Double, y: Double, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cursorTo(stream: WritableStream, x: Double, y: Unit, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def emitKeypressEvents(stream: ReadableStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emitKeypressEvents")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def emitKeypressEvents(stream: ReadableStream, readlineInterface: Interface): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emitKeypressEvents")(stream.asInstanceOf[js.Any], readlineInterface.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Moves this WriteStream's cursor relative to its current position.
    */
  inline def moveCursor(stream: WritableStream, dx: Double, dy: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("moveCursor")(stream.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def moveCursor(stream: WritableStream, dx: Double, dy: Double, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("moveCursor")(stream.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type AsyncCompleter = js.Function2[
    /* line */ java.lang.String, 
    /* callback */ js.Function2[/* err */ js.UndefOr[Null | Error], /* result */ js.UndefOr[CompleterResult], Unit], 
    js.Any
  ]
  
  // type forwarded for backwards compatiblity
  type Completer = js.Function1[/* line */ java.lang.String, CompleterResult]
  
  type CompleterResult = js.Tuple2[js.Array[java.lang.String], java.lang.String]
  
  trait CursorPos extends StObject {
    
    var cols: Double
    
    var rows: Double
  }
  object CursorPos {
    
    inline def apply(cols: Double, rows: Double): CursorPos = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[CursorPos]
    }
    
    extension [Self <: CursorPos](x: Self) {
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.nodeNumbers.`-1`
    - typings.node.nodeNumbers.`0`
    - typings.node.nodeNumbers.`1`
  */
  trait Direction extends StObject
  object Direction {
    
    inline def `-1`: typings.node.nodeNumbers.`-1` = -1.asInstanceOf[typings.node.nodeNumbers.`-1`]
    
    inline def `0`: typings.node.nodeNumbers.`0` = 0.asInstanceOf[typings.node.nodeNumbers.`0`]
    
    inline def `1`: typings.node.nodeNumbers.`1` = 1.asInstanceOf[typings.node.nodeNumbers.`1`]
  }
  
  trait Key extends StObject {
    
    var ctrl: js.UndefOr[Boolean] = js.undefined
    
    var meta: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[java.lang.String] = js.undefined
    
    var sequence: js.UndefOr[java.lang.String] = js.undefined
    
    var shift: js.UndefOr[Boolean] = js.undefined
  }
  object Key {
    
    inline def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setCtrl(value: Boolean): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
      
      inline def setCtrlUndefined: Self = StObject.set(x, "ctrl", js.undefined)
      
      inline def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSequence(value: java.lang.String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
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
    
    var historySize: js.UndefOr[Double] = js.undefined
    
    var input: ReadableStream
    
    var output: js.UndefOr[WritableStream] = js.undefined
    
    var prompt: js.UndefOr[java.lang.String] = js.undefined
    
    var removeHistoryDuplicates: js.UndefOr[Boolean] = js.undefined
    
    var tabSize: js.UndefOr[Double] = js.undefined
    
    var terminal: js.UndefOr[Boolean] = js.undefined
  }
  object ReadLineOptions {
    
    inline def apply(input: ReadableStream): ReadLineOptions = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadLineOptions]
    }
    
    extension [Self <: ReadLineOptions](x: Self) {
      
      inline def setCompleter(value: Completer | AsyncCompleter): Self = StObject.set(x, "completer", value.asInstanceOf[js.Any])
      
      inline def setCompleterFunction1(value: /* line */ java.lang.String => CompleterResult): Self = StObject.set(x, "completer", js.Any.fromFunction1(value))
      
      inline def setCompleterFunction2(
        value: (/* line */ java.lang.String, /* callback */ js.Function2[/* err */ js.UndefOr[Null | Error], /* result */ js.UndefOr[CompleterResult], Unit]) => js.Any
      ): Self = StObject.set(x, "completer", js.Any.fromFunction2(value))
      
      inline def setCompleterUndefined: Self = StObject.set(x, "completer", js.undefined)
      
      inline def setCrlfDelay(value: Double): Self = StObject.set(x, "crlfDelay", value.asInstanceOf[js.Any])
      
      inline def setCrlfDelayUndefined: Self = StObject.set(x, "crlfDelay", js.undefined)
      
      inline def setEscapeCodeTimeout(value: Double): Self = StObject.set(x, "escapeCodeTimeout", value.asInstanceOf[js.Any])
      
      inline def setEscapeCodeTimeoutUndefined: Self = StObject.set(x, "escapeCodeTimeout", js.undefined)
      
      inline def setHistorySize(value: Double): Self = StObject.set(x, "historySize", value.asInstanceOf[js.Any])
      
      inline def setHistorySizeUndefined: Self = StObject.set(x, "historySize", js.undefined)
      
      inline def setInput(value: ReadableStream): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: WritableStream): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPrompt(value: java.lang.String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
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
