package typings.mz.readlineMod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.readlineMod.AsyncCompleter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  protected def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter) = this()
  protected def this(input: ReadableStream, output: WritableStream, completer: typings.node.readlineMod.Completer) = this()
  protected def this(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean) = this()
  protected def this(
    input: ReadableStream,
    output: WritableStream,
    completer: typings.node.readlineMod.Completer,
    terminal: Boolean
  ) = this()
}

