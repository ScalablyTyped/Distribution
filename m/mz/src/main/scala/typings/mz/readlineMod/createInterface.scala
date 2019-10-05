package typings.mz.readlineMod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.readlineMod.AsyncCompleter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/readline", "createInterface")
@js.native
object createInterface extends js.Object {
  def apply(input: ReadableStream): ReadLine = js.native
  def apply(input: ReadableStream, output: WritableStream): ReadLine = js.native
  def apply(input: ReadableStream, output: WritableStream, completer: Completer): ReadLine = js.native
  def apply(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): ReadLine = js.native
  def apply(input: ReadableStream, output: WritableStream, completer: AsyncCompleter): typings.node.readlineMod.Interface = js.native
  def apply(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean): typings.node.readlineMod.Interface = js.native
  def apply(input: ReadableStream, output: WritableStream, completer: typings.node.readlineMod.Completer): typings.node.readlineMod.Interface = js.native
  def apply(
    input: ReadableStream,
    output: WritableStream,
    completer: typings.node.readlineMod.Completer,
    terminal: Boolean
  ): typings.node.readlineMod.Interface = js.native
  def apply(options: ReadLineOptions): ReadLine = js.native
  def apply(options: typings.node.readlineMod.ReadLineOptions): typings.node.readlineMod.Interface = js.native
}

