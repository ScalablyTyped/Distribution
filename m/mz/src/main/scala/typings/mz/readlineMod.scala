package typings.mz

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.readlineMod.CompleterResult
import typings.node.readlineMod.Direction
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readlineMod {
  
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
    protected def this(
      input: ReadableStream,
      output: js.UndefOr[scala.Nothing],
      completer: typings.node.readlineMod.AsyncCompleter
    ) = this()
    protected def this(
      input: ReadableStream,
      output: js.UndefOr[scala.Nothing],
      completer: typings.node.readlineMod.Completer
    ) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: typings.node.readlineMod.AsyncCompleter) = this()
    protected def this(input: ReadableStream, output: WritableStream, completer: typings.node.readlineMod.Completer) = this()
    protected def this(
      input: ReadableStream,
      output: js.UndefOr[scala.Nothing],
      completer: js.UndefOr[scala.Nothing],
      terminal: Boolean
    ) = this()
    protected def this(
      input: ReadableStream,
      output: js.UndefOr[scala.Nothing],
      completer: typings.node.readlineMod.AsyncCompleter,
      terminal: Boolean
    ) = this()
    protected def this(
      input: ReadableStream,
      output: js.UndefOr[scala.Nothing],
      completer: typings.node.readlineMod.Completer,
      terminal: Boolean
    ) = this()
    protected def this(
      input: ReadableStream,
      output: WritableStream,
      completer: js.UndefOr[scala.Nothing],
      terminal: Boolean
    ) = this()
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
  @JSImport("mz/readline", "clearLine")
  @js.native
  def clearLine(stream: WritableStream, dir: Direction): Boolean = js.native
  @JSImport("mz/readline", "clearLine")
  @js.native
  def clearLine(stream: WritableStream, dir: Direction, callback: js.Function0[Unit]): Boolean = js.native
  
  /**
    * Clears this `WriteStream` from the current cursor down.
    */
  @JSImport("mz/readline", "clearScreenDown")
  @js.native
  def clearScreenDown(stream: WritableStream): Boolean = js.native
  @JSImport("mz/readline", "clearScreenDown")
  @js.native
  def clearScreenDown(stream: WritableStream, callback: js.Function0[Unit]): Boolean = js.native
  
  @JSImport("mz/readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream): Interface = js.native
  @JSImport("mz/readline", "createInterface")
  @js.native
  def createInterface(
    input: ReadableStream,
    output: js.UndefOr[scala.Nothing],
    completer: js.UndefOr[Completer],
    terminal: Boolean
  ): Interface = js.native
  @JSImport("mz/readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: Completer): Interface = js.native
  @JSImport("mz/readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: WritableStream): Interface = js.native
  @JSImport("mz/readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: js.UndefOr[Completer], terminal: Boolean): Interface = js.native
  @JSImport("mz/readline", "createInterface")
  @js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer): Interface = js.native
  @JSImport("mz/readline", "createInterface")
  @js.native
  def createInterface(options: ReadLineOptions): Interface = js.native
  
  /**
    * Moves this WriteStream's cursor to the specified position.
    */
  @JSImport("mz/readline", "cursorTo")
  @js.native
  def cursorTo(stream: WritableStream, x: Double): Boolean = js.native
  @JSImport("mz/readline", "cursorTo")
  @js.native
  def cursorTo(stream: WritableStream, x: Double, y: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Boolean = js.native
  @JSImport("mz/readline", "cursorTo")
  @js.native
  def cursorTo(stream: WritableStream, x: Double, y: Double): Boolean = js.native
  @JSImport("mz/readline", "cursorTo")
  @js.native
  def cursorTo(stream: WritableStream, x: Double, y: Double, callback: js.Function0[Unit]): Boolean = js.native
  
  @JSImport("mz/readline", "emitKeypressEvents")
  @js.native
  def emitKeypressEvents(stream: ReadableStream): Unit = js.native
  @JSImport("mz/readline", "emitKeypressEvents")
  @js.native
  def emitKeypressEvents(stream: ReadableStream, readlineInterface: typings.node.readlineMod.Interface): Unit = js.native
  
  /**
    * Moves this WriteStream's cursor relative to its current position.
    */
  @JSImport("mz/readline", "moveCursor")
  @js.native
  def moveCursor(stream: WritableStream, dx: Double, dy: Double): Boolean = js.native
  @JSImport("mz/readline", "moveCursor")
  @js.native
  def moveCursor(stream: WritableStream, dx: Double, dy: Double, callback: js.Function0[Unit]): Boolean = js.native
  
  type AsyncCompleter = (js.Function2[
    /* line */ String, 
    /* callback */ js.Function2[/* err */ js.UndefOr[Null | Error], /* result */ js.UndefOr[CompleterResult], Unit], 
    Unit
  ]) | (js.Function1[/* line */ String, js.Promise[CompleterResult]])
  
  type Completer = AsyncCompleter | typings.node.readlineMod.Completer
  
  type ReadLine = Interface
  
  @js.native
  trait ReadLineOptions
    extends typings.node.readlineMod.ReadLineOptions
  object ReadLineOptions {
    
    @scala.inline
    def apply(input: ReadableStream): ReadLineOptions = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadLineOptions]
    }
  }
}
