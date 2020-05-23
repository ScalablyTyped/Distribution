package typings.nodeForge.mod.tls

import typings.nodeForge.anon.CaStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "tls.createConnection")
@js.native
object createConnection extends js.Object {
  def apply(options: CaStore): Connection = js.native
}

