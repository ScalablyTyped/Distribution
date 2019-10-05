package typings.mz.mzMod.fs

import typings.mz.mzStrings.buffer
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz", "fs.readlinkSync")
@js.native
object readlinkSync_buffer extends js.Object {
  def apply(path: PathLike, options: buffer): Buffer = js.native
}

