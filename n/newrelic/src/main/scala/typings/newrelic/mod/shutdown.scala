package typings.newrelic.mod

import typings.newrelic.AnonCollectPendingData
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("newrelic", "shutdown")
@js.native
object shutdown extends js.Object {
  def apply(): Unit = js.native
  def apply(cb: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  def apply(options: AnonCollectPendingData): Unit = js.native
  def apply(options: AnonCollectPendingData, cb: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
}

