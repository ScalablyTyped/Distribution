package typings
package nodeDashSsdpLib.nodeDashSsdpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends SsdpOptions {
  /** Bind sockets to each discovered interface explicitly instead of relying on the system. Might help with issues with multiple NICs. */
  var explicitSocketBind: js.UndefOr[scala.Boolean] = js.undefined
  /** List of interfaces to explicitly bind. By default, bind to all available interfaces. */
  var interfaces: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	 * When true socket.bind() will reuse the address, even if another process has already bound a socket on it.
  	 * @default true
  	 */
  var reuseAddr: js.UndefOr[scala.Boolean] = js.undefined
}

