package typings
package onionooLib.onionooMod.OnionooNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  @JSName("get")
  def get_bandwidth(endpoint: onionooLib.onionooLibStrings.bandwidth): gotLib.gotMod.gotNs.GotPromise[Bandwidth] = js.native
  @JSName("get")
  def get_bandwidth(endpoint: onionooLib.onionooLibStrings.bandwidth, query: QueryParameters): gotLib.gotMod.gotNs.GotPromise[Bandwidth] = js.native
  @JSName("get")
  def get_clients(endpoint: onionooLib.onionooLibStrings.clients): gotLib.gotMod.gotNs.GotPromise[Clients] = js.native
  @JSName("get")
  def get_clients(endpoint: onionooLib.onionooLibStrings.clients, query: QueryParameters): gotLib.gotMod.gotNs.GotPromise[Clients] = js.native
  @JSName("get")
  def get_details(endpoint: onionooLib.onionooLibStrings.details): gotLib.gotMod.gotNs.GotPromise[Details] = js.native
  @JSName("get")
  def get_details(endpoint: onionooLib.onionooLibStrings.details, query: QueryParameters): gotLib.gotMod.gotNs.GotPromise[Details] = js.native
  @JSName("get")
  def get_summary(endpoint: onionooLib.onionooLibStrings.summary): gotLib.gotMod.gotNs.GotPromise[Summary] = js.native
  @JSName("get")
  def get_summary(endpoint: onionooLib.onionooLibStrings.summary, query: QueryParameters): gotLib.gotMod.gotNs.GotPromise[Summary] = js.native
  @JSName("get")
  def get_uptime(endpoint: onionooLib.onionooLibStrings.uptime): gotLib.gotMod.gotNs.GotPromise[Uptime] = js.native
  @JSName("get")
  def get_uptime(endpoint: onionooLib.onionooLibStrings.uptime, query: QueryParameters): gotLib.gotMod.gotNs.GotPromise[Uptime] = js.native
  @JSName("get")
  def get_weights(endpoint: onionooLib.onionooLibStrings.weights): gotLib.gotMod.gotNs.GotPromise[Weights] = js.native
  @JSName("get")
  def get_weights(endpoint: onionooLib.onionooLibStrings.weights, query: QueryParameters): gotLib.gotMod.gotNs.GotPromise[Weights] = js.native
}

