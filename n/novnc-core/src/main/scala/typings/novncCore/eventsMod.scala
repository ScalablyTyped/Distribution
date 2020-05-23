package typings.novncCore

import typings.std.Element
import typings.std.Event
import typings.std.Touch
import typings.std.TouchList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("novnc-core/lib/util/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  def getPointerEvent(event: Event): TouchList | js.Array[Touch] = js.native
  def releaseCapture(): Unit = js.native
  def setCapture(el: Element): Unit = js.native
  def stopEvent(event: Event): Unit = js.native
}

