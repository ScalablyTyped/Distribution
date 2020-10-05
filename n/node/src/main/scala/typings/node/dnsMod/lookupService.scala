package typings.node.dnsMod

import typings.node.NodeJS.ErrnoException
import typings.node.anon.Hostname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dns", "lookupService")
@js.native
object lookupService extends js.Object {
  def apply(
    address: String,
    port: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* hostname */ String, /* service */ String, Unit]
  ): Unit = js.native
  @JSName("__promisify__")
  def promisify(address: String, port: Double): js.Promise[Hostname] = js.native
}

