package typings
package onionooLib.onionooMod.OnionooNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoints extends js.Object {
  def bandwidth(): gotLib.gotMod.GotPromise[Bandwidth] = js.native
  def bandwidth(query: QueryParameters): gotLib.gotMod.GotPromise[Bandwidth] = js.native
  def clients(): gotLib.gotMod.GotPromise[Clients] = js.native
  def clients(query: QueryParameters): gotLib.gotMod.GotPromise[Clients] = js.native
  def details(): gotLib.gotMod.GotPromise[Details] = js.native
  def details(query: QueryParameters): gotLib.gotMod.GotPromise[Details] = js.native
  def summary(): gotLib.gotMod.GotPromise[Summary] = js.native
  def summary(query: QueryParameters): gotLib.gotMod.GotPromise[Summary] = js.native
  def uptime(): gotLib.gotMod.GotPromise[Uptime] = js.native
  def uptime(query: QueryParameters): gotLib.gotMod.GotPromise[Uptime] = js.native
  def weights(): gotLib.gotMod.GotPromise[Weights] = js.native
  def weights(query: QueryParameters): gotLib.gotMod.GotPromise[Weights] = js.native
}

