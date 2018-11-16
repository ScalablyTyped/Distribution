package typings
package novncDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("novnc-core/lib/util/events", JSImport.Namespace)
@js.native
object libUtilEventsMod extends js.Object {
  def getPointerEvent(event: stdLib.Event): stdLib.TouchList | js.Array[stdLib.Touch] = js.native
  def releaseCapture(): scala.Unit = js.native
  def setCapture(el: stdLib.Element): scala.Unit = js.native
  def stopEvent(event: stdLib.Event): scala.Unit = js.native
}

