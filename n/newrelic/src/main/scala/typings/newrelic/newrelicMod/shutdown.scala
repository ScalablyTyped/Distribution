package typings.newrelic.newrelicMod

import typings.newrelic.Anon_CollectPendingData
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("newrelic", "shutdown")
@js.native
object shutdown extends js.Object {
  def apply(): Unit = js.native
  def apply(cb: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  def apply(options: Anon_CollectPendingData): Unit = js.native
  def apply(options: Anon_CollectPendingData, cb: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
}

