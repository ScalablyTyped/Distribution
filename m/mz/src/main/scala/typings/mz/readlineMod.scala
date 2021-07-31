package typings.mz

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.readlineMod.CompleterResult
import typings.node.readlineMod.Direction
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readlineMod {
  
  @JSImport("mz/readline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mz/readline", "Interface")
  @js.native
  class Interface protected ()
    extends typings.node.readlineMod.Interface {
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
    protected def this(options: typings.node.readlineMod.ReadLineOptions) = this()
    protected def this(input: ReadableStream, output: WritableStream) = this()
    protected def this(input: ReadableStream, output: Unit, completer: typings.node.readlineMod.AsyncCompleter) = this()
    protected def this(input: ReadableStream, output: Unit, completer: typings.node.readlineMod.Completer) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: typings.node.readlineMod.AsyncCompleter) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: typings.node.readlineMod.Completer) = this()
    protected def this(input: ReadableStream, output: Unit, completer: Unit, terminal: Boolean) = this()
    protected def this(
      input: ReadableStream,
      output: Unit,
      completer: typings.node.readlineMod.AsyncCompleter,
      terminal: Boolean
    ) = this()
    protected def this(
      input: ReadableStream,
      output: Unit,
      completer: typings.node.readlineMod.Completer,
      terminal: Boolean
    ) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: Unit, terminal: Boolean) = this()
    protected def this(
      input: ReadableStream,
      output: WritableStream,
      completer: typings.node.readlineMod.AsyncCompleter,
      terminal: Boolean
    ) = this()
    protected def this(
      input: ReadableStream,
      output: WritableStream,
      completer: typings.node.readlineMod.Completer,
      terminal: Boolean
    ) = this()
    
    def question(query: String): js.Promise[String] = js.native
  }
  
  /**
    * Clears the current line of this WriteStream in a direction identified by `dir`.
    */
  @scala.inline
  def clearLine(stream: WritableStream, dir: Direction): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")(stream.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def clearLine(stream: WritableStream, dir: Direction, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")(stream.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Clears this `WriteStream` from the current cursor down.
    */
  @scala.inline
  def clearScreenDown(stream: WritableStream): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clearScreenDown")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def clearScreenDown(stream: WritableStream, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("clearScreenDown")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def createInterface(input: ReadableStream): Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any]).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: Unit, completer: Unit, terminal: Boolean): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: Unit, completer: Completer): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: Unit, completer: Completer, terminal: Boolean): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: WritableStream): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: WritableStream, completer: Unit, terminal: Boolean): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): Interface = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], completer.asInstanceOf[js.Any], terminal.asInstanceOf[js.Any])).asInstanceOf[Interface]
  @scala.inline
  def createInterface(options: ReadLineOptions): Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(options.asInstanceOf[js.Any]).asInstanceOf[Interface]
  
  /**
    * Moves this WriteStream's cursor to the specified position.
    */
  @scala.inline
  def cursorTo(stream: WritableStream, x: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def cursorTo(stream: WritableStream, x: Double, y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def cursorTo(stream: WritableStream, x: Double, y: Double, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def cursorTo(stream: WritableStream, x: Double, y: Unit, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(stream.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def emitKeypressEvents(stream: ReadableStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emitKeypressEvents")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def emitKeypressEvents(stream: ReadableStream, readlineInterface: typings.node.readlineMod.Interface): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emitKeypressEvents")(stream.asInstanceOf[js.Any], readlineInterface.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Moves this WriteStream's cursor relative to its current position.
    */
  @scala.inline
  def moveCursor(stream: WritableStream, dx: Double, dy: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("moveCursor")(stream.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def moveCursor(stream: WritableStream, dx: Double, dy: Double, callback: js.Function0[Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("moveCursor")(stream.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type AsyncCompleter = (js.Function2[
    /* line */ String, 
    /* callback */ js.Function2[/* err */ js.UndefOr[Null | Error], /* result */ js.UndefOr[CompleterResult], Unit], 
    Unit
  ]) | (js.Function1[/* line */ String, js.Promise[CompleterResult]])
  
  type Completer = AsyncCompleter | typings.node.readlineMod.Completer
  
  type ReadLine = Interface
  
  trait ReadLineOptions
    extends StObject
       with typings.node.readlineMod.ReadLineOptions
  object ReadLineOptions {
    
    @scala.inline
    def apply(input: ReadableStream): ReadLineOptions = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadLineOptions]
    }
  }
}
