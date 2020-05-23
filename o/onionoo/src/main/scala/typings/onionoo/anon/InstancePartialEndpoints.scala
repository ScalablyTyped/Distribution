package typings.onionoo.anon

import typings.got.mod.GotPromise
import typings.onionoo.mod.Onionoo.Bandwidth
import typings.onionoo.mod.Onionoo.Clients
import typings.onionoo.mod.Onionoo.Details
import typings.onionoo.mod.Onionoo.QueryParameters
import typings.onionoo.mod.Onionoo.Summary
import typings.onionoo.mod.Onionoo.Uptime
import typings.onionoo.mod.Onionoo.Weights
import typings.onionoo.onionooStrings.bandwidth
import typings.onionoo.onionooStrings.clients
import typings.onionoo.onionooStrings.details
import typings.onionoo.onionooStrings.summary
import typings.onionoo.onionooStrings.uptime
import typings.onionoo.onionooStrings.weights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined onionoo.onionoo.Onionoo.Instance & std.Partial<onionoo.onionoo.Onionoo.Endpoints> */
@js.native
trait InstancePartialEndpoints extends js.Object {
  var bandwidth: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Bandwidth]]] = js.native
  var clients: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Clients]]] = js.native
  var details: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Details]]] = js.native
  var summary: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Summary]]] = js.native
  var uptime: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Uptime]]] = js.native
  var weights: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Weights]]] = js.native
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

