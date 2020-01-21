package typings.ping.mod

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
  def probe(addr: String): js.Promise[PingResponse] = js.native
  def probe(addr: String, config: PingConfig): js.Promise[PingResponse] = js.native
}

