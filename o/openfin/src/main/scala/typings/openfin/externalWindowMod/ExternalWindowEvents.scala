package typings.openfin.externalWindowMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.windowMod.WindowBeginBoundsChangingEvent
import typings.openfin.windowMod.WindowBoundsChange
import typings.openfin.windowMod.WindowEndBoundsChangingEvent
import typings.openfin.windowMod.WindowGroupChanged
import typings.openfin.windowMod.WindowHiddenEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/externalWindow.ExternalWindowEventMapping<string, string> ]: openfin.openfin/_v2/api/events/externalWindow.ExternalWindowEventMapping<'external-window', Type>[Type]} */
@js.native
trait ExternalWindowEvents extends js.Object {
  var `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[String, String] = js.native
  var blurred: WindowEvent[String, String] = js.native
  var `bounds-changed`: WindowBoundsChange[String, String] = js.native
  var `bounds-changing`: WindowBoundsChange[String, String] = js.native
  var closed: WindowEvent[String, String] = js.native
  var closing: WindowEvent[String, String] = js.native
  var `disabled-movement-bounds-changed`: WindowBoundsChange[String, String] = js.native
  var `disabled-movement-bounds-changing`: WindowBoundsChange[String, String] = js.native
  var `end-user-bounds-changing`: WindowEndBoundsChangingEvent[String, String] = js.native
  var focused: WindowEvent[String, String] = js.native
  var `group-changed`: WindowGroupChanged[String, String] = js.native
  var hidden: WindowHiddenEvent[String, String] = js.native
  var listenerRemoved: String = js.native
  var maximized: WindowEvent[String, String] = js.native
  var minimized: WindowEvent[String, String] = js.native
  var newListener: String = js.native
  var restored: WindowEvent[String, String] = js.native
  var shown: WindowEvent[String, String] = js.native
  var `user-movement-disabled`: WindowEvent[String, String] = js.native
  var `user-movement-enabled`: WindowEvent[String, String] = js.native
}

object ExternalWindowEvents {
  @scala.inline
  def apply(
    `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[String, String],
    blurred: WindowEvent[String, String],
    `bounds-changed`: WindowBoundsChange[String, String],
    `bounds-changing`: WindowBoundsChange[String, String],
    closed: WindowEvent[String, String],
    closing: WindowEvent[String, String],
    `disabled-movement-bounds-changed`: WindowBoundsChange[String, String],
    `disabled-movement-bounds-changing`: WindowBoundsChange[String, String],
    `end-user-bounds-changing`: WindowEndBoundsChangingEvent[String, String],
    focused: WindowEvent[String, String],
    `group-changed`: WindowGroupChanged[String, String],
    hidden: WindowHiddenEvent[String, String],
    listenerRemoved: String,
    maximized: WindowEvent[String, String],
    minimized: WindowEvent[String, String],
    newListener: String,
    restored: WindowEvent[String, String],
    shown: WindowEvent[String, String],
    `user-movement-disabled`: WindowEvent[String, String],
    `user-movement-enabled`: WindowEvent[String, String]
  ): ExternalWindowEvents = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], maximized = maximized.asInstanceOf[js.Any], minimized = minimized.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
    __obj.updateDynamic("begin-user-bounds-changing")(`begin-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("bounds-changed")(`bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("bounds-changing")(`bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("disabled-movement-bounds-changed")(`disabled-movement-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("disabled-movement-bounds-changing")(`disabled-movement-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("end-user-bounds-changing")(`end-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("group-changed")(`group-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-movement-disabled")(`user-movement-disabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-movement-enabled")(`user-movement-enabled`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalWindowEvents]
  }
  @scala.inline
  implicit class ExternalWindowEventsOps[Self <: ExternalWindowEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setBegin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[String, String]): Self = this.set("begin-user-bounds-changing", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlurred(value: WindowEvent[String, String]): Self = this.set("blurred", value.asInstanceOf[js.Any])
    @scala.inline
    def `setBounds-changed`(value: WindowBoundsChange[String, String]): Self = this.set("bounds-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setBounds-changing`(value: WindowBoundsChange[String, String]): Self = this.set("bounds-changing", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosed(value: WindowEvent[String, String]): Self = this.set("closed", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosing(value: WindowEvent[String, String]): Self = this.set("closing", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDisabled-movement-bounds-changed`(value: WindowBoundsChange[String, String]): Self = this.set("disabled-movement-bounds-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDisabled-movement-bounds-changing`(value: WindowBoundsChange[String, String]): Self = this.set("disabled-movement-bounds-changing", value.asInstanceOf[js.Any])
    @scala.inline
    def `setEnd-user-bounds-changing`(value: WindowEndBoundsChangingEvent[String, String]): Self = this.set("end-user-bounds-changing", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocused(value: WindowEvent[String, String]): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def `setGroup-changed`(value: WindowGroupChanged[String, String]): Self = this.set("group-changed", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidden(value: WindowHiddenEvent[String, String]): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setListenerRemoved(value: String): Self = this.set("listenerRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximized(value: WindowEvent[String, String]): Self = this.set("maximized", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimized(value: WindowEvent[String, String]): Self = this.set("minimized", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewListener(value: String): Self = this.set("newListener", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestored(value: WindowEvent[String, String]): Self = this.set("restored", value.asInstanceOf[js.Any])
    @scala.inline
    def setShown(value: WindowEvent[String, String]): Self = this.set("shown", value.asInstanceOf[js.Any])
    @scala.inline
    def `setUser-movement-disabled`(value: WindowEvent[String, String]): Self = this.set("user-movement-disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def `setUser-movement-enabled`(value: WindowEvent[String, String]): Self = this.set("user-movement-enabled", value.asInstanceOf[js.Any])
  }
  
}

