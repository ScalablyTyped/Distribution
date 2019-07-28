package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs", "ftruncate")
@js.native
object ftruncateNs extends js.Object {
  /**
    * Asynchronous ftruncate(2) - Truncate a file to a specified length.
    * @param fd A file descriptor.
    * @param len If not specified, defaults to `0`.
    */
  def __promisify__(fd: Double): js.Promise[Unit] = js.native
  def __promisify__(fd: Double, len: Double): js.Promise[Unit] = js.native
}

