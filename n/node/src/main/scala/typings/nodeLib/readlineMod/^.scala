package typings
package nodeLib.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readline", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearLine(stream: nodeLib.NodeJSNs.WritableStream, dir: scala.Double): scala.Unit = js.native
  def clearScreenDown(stream: nodeLib.NodeJSNs.WritableStream): scala.Unit = js.native
  def createInterface(input: nodeLib.NodeJSNs.ReadableStream): nodeLib.readlineMod.Interface = js.native
  def createInterface(input: nodeLib.NodeJSNs.ReadableStream, output: nodeLib.NodeJSNs.WritableStream): nodeLib.readlineMod.Interface = js.native
  def createInterface(
    input: nodeLib.NodeJSNs.ReadableStream,
    output: nodeLib.NodeJSNs.WritableStream,
    completer: nodeLib.readlineMod.AsyncCompleter
  ): nodeLib.readlineMod.Interface = js.native
  def createInterface(
    input: nodeLib.NodeJSNs.ReadableStream,
    output: nodeLib.NodeJSNs.WritableStream,
    completer: nodeLib.readlineMod.AsyncCompleter,
    terminal: scala.Boolean
  ): nodeLib.readlineMod.Interface = js.native
  def createInterface(
    input: nodeLib.NodeJSNs.ReadableStream,
    output: nodeLib.NodeJSNs.WritableStream,
    completer: nodeLib.readlineMod.Completer
  ): nodeLib.readlineMod.Interface = js.native
  def createInterface(
    input: nodeLib.NodeJSNs.ReadableStream,
    output: nodeLib.NodeJSNs.WritableStream,
    completer: nodeLib.readlineMod.Completer,
    terminal: scala.Boolean
  ): nodeLib.readlineMod.Interface = js.native
  def createInterface(options: nodeLib.readlineMod.ReadLineOptions): nodeLib.readlineMod.Interface = js.native
  def cursorTo(stream: nodeLib.NodeJSNs.WritableStream, x: scala.Double): scala.Unit = js.native
  def cursorTo(stream: nodeLib.NodeJSNs.WritableStream, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def emitKeypressEvents(stream: nodeLib.NodeJSNs.ReadableStream): scala.Unit = js.native
  def emitKeypressEvents(stream: nodeLib.NodeJSNs.ReadableStream, interface: nodeLib.readlineMod.Interface): scala.Unit = js.native
  def moveCursor(stream: nodeLib.NodeJSNs.WritableStream, dx: java.lang.String, dy: java.lang.String): scala.Unit = js.native
  def moveCursor(stream: nodeLib.NodeJSNs.WritableStream, dx: java.lang.String, dy: scala.Double): scala.Unit = js.native
  def moveCursor(stream: nodeLib.NodeJSNs.WritableStream, dx: scala.Double, dy: java.lang.String): scala.Unit = js.native
  def moveCursor(stream: nodeLib.NodeJSNs.WritableStream, dx: scala.Double, dy: scala.Double): scala.Unit = js.native
}

