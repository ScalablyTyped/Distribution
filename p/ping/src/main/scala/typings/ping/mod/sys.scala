package typings.ping.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ping", "sys")
@js.native
object sys extends js.Object {
  /**
    * Performs a system ping utility.
    *
    * @param addr Hostname or IP address
    * @param cb Response callback.
    *   First argument is successful response boolean.
    *   Second argument is any error, `null` if no error.
    * @param config Optional configuration
    */
  def probe(addr: String, cb: js.Function2[/* isAlive */ Boolean, /* error */ js.Any, Unit]): Unit = js.native
  def probe(
    addr: String,
    cb: js.Function2[/* isAlive */ Boolean, /* error */ js.Any, Unit],
    config: PingConfig
  ): Unit = js.native
}

