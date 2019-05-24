package typings
package pingLib.pingMod

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
  def probe(
    addr: java.lang.String,
    cb: js.Function2[/* isAlive */ scala.Boolean, /* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def probe(
    addr: java.lang.String,
    cb: js.Function2[/* isAlive */ scala.Boolean, /* error */ js.Any, scala.Unit],
    config: pingLib.pingMod.PingConfig
  ): scala.Unit = js.native
}

