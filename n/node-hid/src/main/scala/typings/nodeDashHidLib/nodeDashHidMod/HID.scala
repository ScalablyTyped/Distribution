package typings
package nodeDashHidLib.nodeDashHidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-hid", "HID")
@js.native
class HID protected () extends js.Object {
  def this(path: java.lang.String) = this()
  def this(vid: scala.Double, pid: scala.Double) = this()
  def close(): scala.Unit = js.native
  def getFeatureReport(report_id: scala.Double, report_length: scala.Double): js.Array[scala.Double] = js.native
  def on(event: java.lang.String, handler: js.Function1[/* value */ js.Any, scala.Unit]): scala.Unit = js.native
  def once(event: java.lang.String, handler: js.Function1[/* value */ js.Any, scala.Unit]): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def read(callback: js.Function2[/* err */ js.Any, /* data */ js.Array[scala.Double], scala.Unit]): scala.Unit = js.native
  def readSync(): js.Array[scala.Double] = js.native
  def readTimeout(time_out: scala.Double): js.Array[scala.Double] = js.native
  def removeAllListeners(event: java.lang.String): scala.Unit = js.native
  def removeListener(event: java.lang.String, handler: js.Function1[/* value */ js.Any, scala.Unit]): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def sendFeatureReport(data: js.Array[scala.Double]): scala.Double = js.native
  def setNonBlocking(no_block: scala.Boolean): scala.Unit = js.native
  def write(values: js.Array[scala.Double]): scala.Double = js.native
}

