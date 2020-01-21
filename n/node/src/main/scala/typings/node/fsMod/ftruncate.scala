package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs", "ftruncate")
@js.native
object ftruncate extends js.Object {
  /**
    * Asynchronous ftruncate(2) - Truncate a file to a specified length.
    * @param fd A file descriptor.
    */
  def apply(fd: Double, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, len: js.UndefOr[scala.Nothing], callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous ftruncate(2) - Truncate a file to a specified length.
    * @param fd A file descriptor.
    * @param len If not specified, defaults to `0`.
    */
  def apply(fd: Double, len: Double, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, len: Null, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous ftruncate(2) - Truncate a file to a specified length.
    * @param fd A file descriptor.
    * @param len If not specified, defaults to `0`.
    */
  @JSName("__promisify__")
  def promisify(fd: Double): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, len: Double): js.Promise[Unit] = js.native
}

