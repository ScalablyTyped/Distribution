package typings.noble.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("noble", "startScanning")
@js.native
object startScanning extends js.Object {
  def apply(): Unit = js.native
  def apply(callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  def apply(serviceUUIDs: js.Array[String]): Unit = js.native
  def apply(serviceUUIDs: js.Array[String], allowDuplicates: Boolean): Unit = js.native
  def apply(
    serviceUUIDs: js.Array[String],
    allowDuplicates: Boolean,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def apply(serviceUUIDs: js.Array[String], callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
}

