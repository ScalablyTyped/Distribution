package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReplSetOptions
  extends SSLOptions
     with HighAvailabilityOptions {
  var connectWithNoPrimary: js.UndefOr[scala.Boolean] = js.undefined
  // The max staleness to secondary reads (values under 10 seconds cannot be guaranteed);
  var maxStalenessSeconds: js.UndefOr[scala.Double] = js.undefined
  // The name of the replicaset to connect to.
  var replicaSet: js.UndefOr[java.lang.String] = js.undefined
  // Default: 15 ; Range of servers to pick when using NEAREST (lowest ping ms + the latency fence, ex: range of 1 to (1 + 15) ms)
  var secondaryAcceptableLatencyMS: js.UndefOr[scala.Double] = js.undefined
  var socketOptions: js.UndefOr[SocketOptions] = js.undefined
}

