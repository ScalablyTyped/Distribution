package typings
package pingLib.pingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ping", "promise")
@js.native
object promise extends js.Object {
  /**
    * Performs a system ping utility.
    *
    * @param addr Hostname or IP address
    * @param config Optional configuration
    */
  def probe(addr: java.lang.String): js.Promise[pingLib.pingMod.PingResponse] = js.native
  def probe(addr: java.lang.String, config: pingLib.pingMod.PingConfig): js.Promise[pingLib.pingMod.PingResponse] = js.native
}

