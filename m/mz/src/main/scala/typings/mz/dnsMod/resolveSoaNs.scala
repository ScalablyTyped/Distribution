package typings.mz.dnsMod

import typings.node.dnsMod.SoaRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/dns", "resolveSoa")
@js.native
object resolveSoaNs extends js.Object {
  def __promisify__(hostname: String): js.Promise[SoaRecord] = js.native
}

