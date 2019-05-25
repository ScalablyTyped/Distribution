package typings
package olLib.pointerPointerEventHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerEventHandler
  extends olLib.eventsTargetMod.default {
  def cancel(data: org.scalablytyped.runtime.StringDictionary[js.Any], event: stdLib.Event): scala.Unit = js.native
  def cloneEvent(event: stdLib.Event, inEvent: stdLib.Event): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def cloneEvent(event: stdLib.Event, inEvent: stdLib.Touch): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def down(data: org.scalablytyped.runtime.StringDictionary[js.Any], event: stdLib.Event): scala.Unit = js.native
  def enter(data: org.scalablytyped.runtime.StringDictionary[js.Any], event: stdLib.Event): scala.Unit = js.native
  def enterOver(data: org.scalablytyped.runtime.StringDictionary[js.Any], event: stdLib.Event): scala.Unit = js.native
  def fireEvent(
    inType: java.lang.String,
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    event: stdLib.Event
  ): scala.Unit = js.native
  def fireNativeEvent(event: stdLib.Event): scala.Unit = js.native
  def leave(data: org.scalablytyped.runtime.StringDictionary[js.Any], event: stdLib.Event): scala.Unit = js.native
  def leaveOut(data: org.scalablytyped.runtime.StringDictionary[js.Any], event: stdLib.Event): scala.Unit = js.native
  def makeEvent(
    inType: java.lang.String,
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    event: stdLib.Event
  ): olLib.pointerPointerEventMod.default = js.native
  def move(data: org.scalablytyped.runtime.StringDictionary[js.Any], event: stdLib.Event): scala.Unit = js.native
  def out(data: org.scalablytyped.runtime.StringDictionary[js.Any], event: stdLib.Event): scala.Unit = js.native
  def over(data: org.scalablytyped.runtime.StringDictionary[js.Any], event: stdLib.Event): scala.Unit = js.native
  def registerSource(name: java.lang.String, source: olLib.pointerEventSourceMod.default): scala.Unit = js.native
  def registerSources(): scala.Unit = js.native
  def up(data: org.scalablytyped.runtime.StringDictionary[js.Any], event: stdLib.Event): scala.Unit = js.native
  def wrapMouseEvent(eventType: java.lang.String, event: stdLib.Event): olLib.pointerPointerEventMod.default = js.native
}

