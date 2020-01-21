package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs", "fchmod")
@js.native
object fchmod extends js.Object {
  /**
    * Asynchronous fchmod(2) - Change permissions of a file.
    * @param fd A file descriptor.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def apply(fd: Double, mode: String, callback: NoParamCallback): Unit = js.native
  def apply(fd: Double, mode: Double, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous fchmod(2) - Change permissions of a file.
    * @param fd A file descriptor.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  @JSName("__promisify__")
  def promisify(fd: Double, mode: String): js.Promise[Unit] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, mode: Double): js.Promise[Unit] = js.native
}

