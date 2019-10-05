package typings.onionoo.onionooMod.Onionoo

import typings.got.gotMod.GotPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoints extends js.Object {
  def bandwidth(): GotPromise[Bandwidth] = js.native
  def bandwidth(query: QueryParameters): GotPromise[Bandwidth] = js.native
  def clients(): GotPromise[Clients] = js.native
  def clients(query: QueryParameters): GotPromise[Clients] = js.native
  def details(): GotPromise[Details] = js.native
  def details(query: QueryParameters): GotPromise[Details] = js.native
  def summary(): GotPromise[Summary] = js.native
  def summary(query: QueryParameters): GotPromise[Summary] = js.native
  def uptime(): GotPromise[Uptime] = js.native
  def uptime(query: QueryParameters): GotPromise[Uptime] = js.native
  def weights(): GotPromise[Weights] = js.native
  def weights(query: QueryParameters): GotPromise[Weights] = js.native
}

