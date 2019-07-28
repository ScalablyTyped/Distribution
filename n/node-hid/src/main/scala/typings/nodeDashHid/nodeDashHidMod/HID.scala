package typings.nodeDashHid.nodeDashHidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-hid", "HID")
@js.native
class HID protected () extends js.Object {
  def this(path: String) = this()
  def this(vid: Double, pid: Double) = this()
  def close(): Unit = js.native
  def getFeatureReport(report_id: Double, report_length: Double): js.Array[Double] = js.native
  def on(event: String, handler: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  def once(event: String, handler: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  def pause(): Unit = js.native
  def read(callback: js.Function2[/* err */ js.Any, /* data */ js.Array[Double], Unit]): Unit = js.native
  def readSync(): js.Array[Double] = js.native
  def readTimeout(time_out: Double): js.Array[Double] = js.native
  def removeAllListeners(event: String): Unit = js.native
  def removeListener(event: String, handler: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  def resume(): Unit = js.native
  def sendFeatureReport(data: js.Array[Double]): Double = js.native
  def setNonBlocking(no_block: Boolean): Unit = js.native
  def write(values: js.Array[Double]): Double = js.native
}

