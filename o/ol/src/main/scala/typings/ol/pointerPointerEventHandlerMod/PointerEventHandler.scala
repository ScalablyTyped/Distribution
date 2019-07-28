package typings.ol.pointerPointerEventHandlerMod

import typings.std.Event
import typings.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerEventHandler
  extends typings.ol.eventsTargetMod.default {
  def cancel(data: js.Any, event: Event): Unit = js.native
  def cloneEvent(event: Event, inEvent: Event): js.Any = js.native
  def cloneEvent(event: Event, inEvent: Touch): js.Any = js.native
  def down(data: js.Any, event: Event): Unit = js.native
  def enter(data: js.Any, event: Event): Unit = js.native
  def enterOver(data: js.Any, event: Event): Unit = js.native
  def fireEvent(inType: String, data: js.Any, event: Event): Unit = js.native
  def fireNativeEvent(event: Event): Unit = js.native
  def leave(data: js.Any, event: Event): Unit = js.native
  def leaveOut(data: js.Any, event: Event): Unit = js.native
  def makeEvent(inType: String, data: js.Any, event: Event): typings.ol.pointerPointerEventMod.default = js.native
  def move(data: js.Any, event: Event): Unit = js.native
  def out(data: js.Any, event: Event): Unit = js.native
  def over(data: js.Any, event: Event): Unit = js.native
  def registerSource(name: String, source: typings.ol.pointerEventSourceMod.default): Unit = js.native
  def registerSources(): Unit = js.native
  def up(data: js.Any, event: Event): Unit = js.native
  def wrapMouseEvent(eventType: String, event: Event): typings.ol.pointerPointerEventMod.default = js.native
}

