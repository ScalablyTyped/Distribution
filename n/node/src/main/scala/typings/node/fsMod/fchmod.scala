package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "fchmod")
@js.native
object fchmod extends js.Object {
  def apply(fd: Double, mode: Mode, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous fchmod(2) - Change permissions of a file.
    * @param fd A file descriptor.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  @JSName("__promisify__")
  def promisify(fd: Double, mode: Mode): js.Promise[Unit] = js.native
}

