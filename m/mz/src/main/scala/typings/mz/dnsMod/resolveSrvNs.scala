package typings.mz.dnsMod

import typings.node.dnsMod.SrvRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/dns", "resolveSrv")
@js.native
object resolveSrvNs extends js.Object {
  def __promisify__(hostname: String): js.Promise[js.Array[SrvRecord]] = js.native
}

