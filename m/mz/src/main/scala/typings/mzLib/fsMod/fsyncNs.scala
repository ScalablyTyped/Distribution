package typings
package mzLib.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("mz/fs", "fsync")
@js.native
object fsyncNs extends js.Object {
  /**
           * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
           * @param fd A file descriptor.
           */
  def `__promisify__`(fd: scala.Double): js.Promise[scala.Unit] = js.native
}

