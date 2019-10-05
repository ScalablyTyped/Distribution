package typings.node.readlineMod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readline", "createInterface")
@js.native
object createInterface extends js.Object {
  def apply(input: ReadableStream): Interface = js.native
  def apply(input: ReadableStream, output: WritableStream): Interface = js.native
  def apply(input: ReadableStream, output: WritableStream, completer: AsyncCompleter): Interface = js.native
  def apply(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean): Interface = js.native
  def apply(input: ReadableStream, output: WritableStream, completer: Completer): Interface = js.native
  def apply(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): Interface = js.native
  def apply(options: ReadLineOptions): Interface = js.native
}

