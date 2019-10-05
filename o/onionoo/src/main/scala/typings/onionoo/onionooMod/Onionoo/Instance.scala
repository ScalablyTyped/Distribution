package typings.onionoo.onionooMod.Onionoo

import typings.got.gotMod.GotPromise
import typings.onionoo.onionooStrings.bandwidth
import typings.onionoo.onionooStrings.clients
import typings.onionoo.onionooStrings.details
import typings.onionoo.onionooStrings.summary
import typings.onionoo.onionooStrings.uptime
import typings.onionoo.onionooStrings.weights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  @JSName("get")
  def get_bandwidth(endpoint: bandwidth): GotPromise[Bandwidth] = js.native
  @JSName("get")
  def get_bandwidth(endpoint: bandwidth, query: QueryParameters): GotPromise[Bandwidth] = js.native
  @JSName("get")
  def get_clients(endpoint: clients): GotPromise[Clients] = js.native
  @JSName("get")
  def get_clients(endpoint: clients, query: QueryParameters): GotPromise[Clients] = js.native
  @JSName("get")
  def get_details(endpoint: details): GotPromise[Details] = js.native
  @JSName("get")
  def get_details(endpoint: details, query: QueryParameters): GotPromise[Details] = js.native
  @JSName("get")
  def get_summary(endpoint: summary): GotPromise[Summary] = js.native
  @JSName("get")
  def get_summary(endpoint: summary, query: QueryParameters): GotPromise[Summary] = js.native
  @JSName("get")
  def get_uptime(endpoint: uptime): GotPromise[Uptime] = js.native
  @JSName("get")
  def get_uptime(endpoint: uptime, query: QueryParameters): GotPromise[Uptime] = js.native
  @JSName("get")
  def get_weights(endpoint: weights): GotPromise[Weights] = js.native
  @JSName("get")
  def get_weights(endpoint: weights, query: QueryParameters): GotPromise[Weights] = js.native
}

