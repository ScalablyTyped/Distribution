package typings.nats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats", "connect")
@js.native
object connect extends js.Object {
  
  def apply(): Client = js.native
  def apply(opts: ClientOpts): Client = js.native
  def apply(url: js.UndefOr[scala.Nothing], opts: ClientOpts): Client = js.native
  def apply(url: String): Client = js.native
  def apply(url: String, opts: ClientOpts): Client = js.native
  def apply(url: Double): Client = js.native
  def apply(url: Double, opts: ClientOpts): Client = js.native
}
