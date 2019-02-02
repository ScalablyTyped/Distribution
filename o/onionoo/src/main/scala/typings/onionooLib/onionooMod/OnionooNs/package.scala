package typings
package onionooLib.onionooMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OnionooNs {
  type Bandwidth = Response[NodeBandwidth, NodeBandwidth]
  type Clients = Response[js.UndefOr[scala.Nothing], BridgeClients]
  type Details = Response[Relay, Bridge]
  type Summary = Response[RelaySummary, BridgeSummary]
  type Uptime = Response[RelayUptime, BridgeUptime]
  type Weights = Response[RelayWeights, js.UndefOr[scala.Nothing]]
}
