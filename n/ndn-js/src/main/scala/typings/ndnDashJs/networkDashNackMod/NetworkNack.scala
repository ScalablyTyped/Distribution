package typings.ndnDashJs.networkDashNackMod

import typings.ndnDashJs.networkDashNackMod.NetworkNackNs.Reason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/network-nack", "NetworkNack")
@js.native
class NetworkNack () extends js.Object {
  def getOtherReasonCode(): Double = js.native
  def getReason(): Reason = js.native
}

