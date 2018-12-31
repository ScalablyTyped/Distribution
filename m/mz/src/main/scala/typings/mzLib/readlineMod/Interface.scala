package typings
package mzLib.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/readline", "Interface")
@js.native
class Interface protected ()
  extends nodeLib.readlineMod.Interface {
  /**
    * NOTE: According to the documentation:
    *
    * > Instances of the `readline.Interface` class are constructed using the
    * > `readline.createInterface()` method.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
    */
  protected def this(input: nodeLib.NodeJSNs.ReadableStream) = this()
  /**
    * NOTE: According to the documentation:
    *
    * > Instances of the `readline.Interface` class are constructed using the
    * > `readline.createInterface()` method.
    *
    * @see https://nodejs.org/dist/latest-v10.x/docs/api/readline.html#readline_class_interface
    */
  protected def this(options: nodeLib.readlineMod.ReadLineOptions) = this()
  protected def this(input: nodeLib.NodeJSNs.ReadableStream, output: nodeLib.NodeJSNs.WritableStream) = this()
  protected def this(input: nodeLib.NodeJSNs.ReadableStream, output: nodeLib.NodeJSNs.WritableStream, completer: nodeLib.readlineMod.AsyncCompleter) = this()
  protected def this(input: nodeLib.NodeJSNs.ReadableStream, output: nodeLib.NodeJSNs.WritableStream, completer: nodeLib.readlineMod.Completer) = this()
  protected def this(input: nodeLib.NodeJSNs.ReadableStream, output: nodeLib.NodeJSNs.WritableStream, completer: nodeLib.readlineMod.AsyncCompleter, terminal: scala.Boolean) = this()
  protected def this(input: nodeLib.NodeJSNs.ReadableStream, output: nodeLib.NodeJSNs.WritableStream, completer: nodeLib.readlineMod.Completer, terminal: scala.Boolean) = this()
}

