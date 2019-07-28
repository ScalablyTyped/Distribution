package typings.mz.dnsMod

import typings.node.dnsMod.NaptrRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/dns", "resolveNaptr")
@js.native
object resolveNaptrNs extends js.Object {
  def __promisify__(hostname: String): js.Promise[js.Array[NaptrRecord]] = js.native
}

