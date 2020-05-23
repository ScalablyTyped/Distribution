package typings.officeJs.global.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the kind of event that was raised. Returned by the `type` property of an `*EventArgs` object.
  * 
  * Add-ins for Project support the `Office.EventType.ResourceSelectionChanged`, `Office.EventType.TaskSelectionChanged`, and 
  * `Office.EventType.ViewSelectionChanged` event types.
  * 
  * Only task pane add-ins for Outlook support Mailbox API set event types.
  * 
  * @remarks
  * 
  * **`BindingDataChanged` and `BindingSelectionChanged` hosts**: Excel, Word.
  * 
  */
@JSGlobal("Office.EventType")
@js.native
object EventType extends js.Object {
  /* 0 */ val ActiveViewChanged: typings.officeJs.Office.EventType.ActiveViewChanged with Double = js.native
  /* 1 */ val AppointmentTimeChanged: typings.officeJs.Office.EventType.AppointmentTimeChanged with Double = js.native
  /* 2 */ val AttachmentsChanged: typings.officeJs.Office.EventType.AttachmentsChanged with Double = js.native
  /* 3 */ val BindingDataChanged: typings.officeJs.Office.EventType.BindingDataChanged with Double = js.native
  /* 4 */ val BindingSelectionChanged: typings.officeJs.Office.EventType.BindingSelectionChanged with Double = js.native
  /* 5 */ val DialogEventReceived: typings.officeJs.Office.EventType.DialogEventReceived with Double = js.native
  /* 6 */ val DialogMessageReceived: typings.officeJs.Office.EventType.DialogMessageReceived with Double = js.native
  /* 7 */ val DocumentSelectionChanged: typings.officeJs.Office.EventType.DocumentSelectionChanged with Double = js.native
  /* 8 */ val EnhancedLocationsChanged: typings.officeJs.Office.EventType.EnhancedLocationsChanged with Double = js.native
  /* 9 */ val ItemChanged: typings.officeJs.Office.EventType.ItemChanged with Double = js.native
  /* 10 */ val NodeDeleted: typings.officeJs.Office.EventType.NodeDeleted with Double = js.native
  /* 11 */ val NodeInserted: typings.officeJs.Office.EventType.NodeInserted with Double = js.native
  /* 12 */ val NodeReplaced: typings.officeJs.Office.EventType.NodeReplaced with Double = js.native
  /* 13 */ val RecipientsChanged: typings.officeJs.Office.EventType.RecipientsChanged with Double = js.native
  /* 14 */ val RecurrenceChanged: typings.officeJs.Office.EventType.RecurrenceChanged with Double = js.native
  /* 15 */ val ResourceSelectionChanged: typings.officeJs.Office.EventType.ResourceSelectionChanged with Double = js.native
  /* 16 */ val SettingsChanged: typings.officeJs.Office.EventType.SettingsChanged with Double = js.native
  /* 17 */ val TaskSelectionChanged: typings.officeJs.Office.EventType.TaskSelectionChanged with Double = js.native
  /* 18 */ val ViewSelectionChanged: typings.officeJs.Office.EventType.ViewSelectionChanged with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.EventType with Double] = js.native
}

