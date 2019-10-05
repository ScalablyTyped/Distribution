package typings.nodeDashPersist.nodeDashPersistMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-persist", "removeItem")
@js.native
object removeItem extends js.Object {
  def apply(key: String): Promise[_] = js.native
  def apply(key: String, callback: js.Function1[/* err */ js.Any, _]): Promise[_] = js.native
}

