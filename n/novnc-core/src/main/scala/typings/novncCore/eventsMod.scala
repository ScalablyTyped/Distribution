package typings.novncCore

import typings.std.Element
import typings.std.Event_
import typings.std.Touch
import typings.std.TouchList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("novnc-core/lib/util/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  def getPointerEvent(event: Event_): TouchList | js.Array[Touch] = js.native
  def releaseCapture(): Unit = js.native
  def setCapture(el: Element): Unit = js.native
  def stopEvent(event: Event_): Unit = js.native
}

