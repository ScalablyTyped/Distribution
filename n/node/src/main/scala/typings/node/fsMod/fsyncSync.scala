package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "fsyncSync")
@js.native
object fsyncSync extends js.Object {
  /**
    * Synchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
    * @param fd A file descriptor.
    */
  def apply(fd: Double): Unit = js.native
}

