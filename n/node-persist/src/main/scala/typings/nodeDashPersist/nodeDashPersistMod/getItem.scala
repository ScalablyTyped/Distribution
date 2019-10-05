package typings.nodeDashPersist.nodeDashPersistMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-persist", "getItem")
@js.native
object getItem extends js.Object {
  def apply(key: String): Promise[_] = js.native
  def apply(key: String, callback: js.Function2[/* err */ js.Any, /* value */ js.Any, _]): Promise[_] = js.native
}

