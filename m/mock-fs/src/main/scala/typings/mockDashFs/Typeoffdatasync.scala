package typings.mockDashFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoffdatasync extends js.Object {
  /**
    * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: Double): js.Promise[Unit]
}

object Typeoffdatasync {
  @scala.inline
  def apply(__promisify__ : Double => js.Promise[Unit]): Typeoffdatasync = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[Typeoffdatasync]
  }
}

