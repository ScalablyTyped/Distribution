package typings.mz.readlineMod

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

