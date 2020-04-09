package typings.node.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os", "version")
@js.native
object version extends js.Object {
  /**
    * Returns a string identifying the kernel version.
    * On POSIX systems, the operating system release is determined by calling
    * [uname(3)][]. On Windows, `pRtlGetVersion` is used, and if it is not available,
    * `GetVersionExW()` will be used. See
    * https://en.wikipedia.org/wiki/Uname#Examples for more information.
    */
  def apply(): String = js.native
}

