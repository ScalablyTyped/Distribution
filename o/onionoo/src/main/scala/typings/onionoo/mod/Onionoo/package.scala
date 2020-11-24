package typings.onionoo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Onionoo {
  
  type Bandwidth = typings.onionoo.mod.Onionoo.Response[
    typings.onionoo.mod.Onionoo.NodeBandwidth, 
    typings.onionoo.mod.Onionoo.NodeBandwidth
  ]
  
  type Clients = typings.onionoo.mod.Onionoo.Response[js.UndefOr[scala.Nothing], typings.onionoo.mod.Onionoo.BridgeClients]
  
  type Details = typings.onionoo.mod.Onionoo.Response[typings.onionoo.mod.Onionoo.Relay, typings.onionoo.mod.Onionoo.Bridge]
  
  type Summary = typings.onionoo.mod.Onionoo.Response[
    typings.onionoo.mod.Onionoo.RelaySummary, 
    typings.onionoo.mod.Onionoo.BridgeSummary
  ]
  
  type Uptime = typings.onionoo.mod.Onionoo.Response[typings.onionoo.mod.Onionoo.RelayUptime, typings.onionoo.mod.Onionoo.BridgeUptime]
  
  type Weights = typings.onionoo.mod.Onionoo.Response[typings.onionoo.mod.Onionoo.RelayWeights, js.UndefOr[scala.Nothing]]
}
