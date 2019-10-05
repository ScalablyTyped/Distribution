package typings.nodeDashPersist.nodeDashPersistMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-persist", "setItem")
@js.native
object setItem extends js.Object {
  def apply(key: String, value: js.Any): Promise[_] = js.native
  def apply(key: String, value: js.Any, callback: js.Function1[/* err */ js.Any, _]): Promise[_] = js.native
}

