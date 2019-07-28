package typings.mz.dnsMod

import typings.node.dnsMod.MxRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/dns", "resolveMx")
@js.native
object resolveMxNs extends js.Object {
  def __promisify__(hostname: String): js.Promise[js.Array[MxRecord]] = js.native
}

