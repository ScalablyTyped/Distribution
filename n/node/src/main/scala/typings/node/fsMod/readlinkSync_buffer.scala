package typings.node.fsMod

import typings.node.Buffer
import typings.node.nodeStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "readlinkSync")
@js.native
object readlinkSync_buffer extends js.Object {
  def apply(path: PathLike, options: buffer): Buffer = js.native
}

