package typings.mz.readlineMod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/readline", "createInterface")
@js.native
object createInterface extends js.Object {
  def apply(input: ReadableStream): Interface = js.native
  def apply(
    input: ReadableStream,
    output: js.UndefOr[scala.Nothing],
    completer: js.UndefOr[Completer],
    terminal: Boolean
  ): Interface = js.native
  def apply(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: Completer): Interface = js.native
  def apply(input: ReadableStream, output: WritableStream): Interface = js.native
  def apply(input: ReadableStream, output: WritableStream, completer: js.UndefOr[Completer], terminal: Boolean): Interface = js.native
  def apply(input: ReadableStream, output: WritableStream, completer: Completer): Interface = js.native
  def apply(options: ReadLineOptions): Interface = js.native
}

