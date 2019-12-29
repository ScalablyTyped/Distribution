package typings.node.dnsMod

import typings.node.Anon_Hostname
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dns", "lookupService")
@js.native
object lookupService extends js.Object {
  def apply(
    address: String,
    port: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* hostname */ String, /* service */ String, Unit]
  ): Unit = js.native
  def __promisify__(address: String, port: Double): js.Promise[Anon_Hostname] = js.native
}

