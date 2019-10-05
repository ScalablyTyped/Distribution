package typings.node.fsMod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs", "fchown")
@js.native
object fchown extends js.Object {
  /**
    * Asynchronous fchown(2) - Change ownership of a file.
    * @param fd A file descriptor.
    */
  def apply(
    fd: Double,
    uid: Double,
    gid: Double,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Asynchronous fchown(2) - Change ownership of a file.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: Double, uid: Double, gid: Double): js.Promise[Unit] = js.native
}

