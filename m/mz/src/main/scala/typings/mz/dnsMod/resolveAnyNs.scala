package typings.mz.dnsMod

import typings.node.dnsMod.AnyRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/dns", "resolveAny")
@js.native
object resolveAnyNs extends js.Object {
  def __promisify__(hostname: String): js.Promise[js.Array[AnyRecord]] = js.native
}

