package typings.node.fsMod

import typings.node.Buffer
import typings.node.nodeStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "watch")
@js.native
object watch_buffer extends js.Object {
  def apply(filename: PathLike, options: buffer): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: buffer,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
}

