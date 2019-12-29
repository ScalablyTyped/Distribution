package typings.node.fsMod

import typings.node.Buffer
import typings.node.nodeStrings.buffer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "watch")
@js.native
object watch_buffer extends js.Object {
  def apply(filename: PathLike, options: buffer_): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: buffer_,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
}

