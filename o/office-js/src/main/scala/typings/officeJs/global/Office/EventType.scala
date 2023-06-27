package typings.officeJs.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  * **`BindingDataChanged` and `BindingSelectionChanged` applications**: Excel, Word.
  *
  */
@JSGlobal("Office.EventType")
@js.native
object EventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJs.Office.EventType & Double] = js.native
  
  /* 0 */ val ActiveViewChanged: typings.officeJs.Office.EventType.ActiveViewChanged & Double = js.native
  
  /* 1 */ val AppointmentTimeChanged: typings.officeJs.Office.EventType.AppointmentTimeChanged & Double = js.native
  
  /* 2 */ val AttachmentsChanged: typings.officeJs.Office.EventType.AttachmentsChanged & Double = js.native
  
  /* 3 */ val BindingDataChanged: typings.officeJs.Office.EventType.BindingDataChanged & Double = js.native
  
  /* 4 */ val BindingSelectionChanged: typings.officeJs.Office.EventType.BindingSelectionChanged & Double = js.native
  
  /* 5 */ val DialogEventReceived: typings.officeJs.Office.EventType.DialogEventReceived & Double = js.native
  
  /* 6 */ val DialogMessageReceived: typings.officeJs.Office.EventType.DialogMessageReceived & Double = js.native
  
  /* 7 */ val DialogParentMessageReceived: typings.officeJs.Office.EventType.DialogParentMessageReceived & Double = js.native
  
  /* 8 */ val DocumentSelectionChanged: typings.officeJs.Office.EventType.DocumentSelectionChanged & Double = js.native
  
  /* 9 */ val EnhancedLocationsChanged: typings.officeJs.Office.EventType.EnhancedLocationsChanged & Double = js.native
  
  /* 10 */ val InfobarClicked: typings.officeJs.Office.EventType.InfobarClicked & Double = js.native
  
  /* 11 */ val ItemChanged: typings.officeJs.Office.EventType.ItemChanged & Double = js.native
  
  /* 12 */ val NodeDeleted: typings.officeJs.Office.EventType.NodeDeleted & Double = js.native
  
  /* 13 */ val NodeInserted: typings.officeJs.Office.EventType.NodeInserted & Double = js.native
  
  /* 14 */ val NodeReplaced: typings.officeJs.Office.EventType.NodeReplaced & Double = js.native
  
  /* 15 */ val RecipientsChanged: typings.officeJs.Office.EventType.RecipientsChanged & Double = js.native
  
  /* 16 */ val RecurrenceChanged: typings.officeJs.Office.EventType.RecurrenceChanged & Double = js.native
  
  /* 17 */ val ResourceSelectionChanged: typings.officeJs.Office.EventType.ResourceSelectionChanged & Double = js.native
  
  /* 18 */ val SelectedItemsChanged: typings.officeJs.Office.EventType.SelectedItemsChanged & Double = js.native
  
  /* 19 */ val SensitivityLabelChanged: typings.officeJs.Office.EventType.SensitivityLabelChanged & Double = js.native
  
  /* 20 */ val SettingsChanged: typings.officeJs.Office.EventType.SettingsChanged & Double = js.native
  
  /* 21 */ val TaskSelectionChanged: typings.officeJs.Office.EventType.TaskSelectionChanged & Double = js.native
  
  /* 22 */ val ViewSelectionChanged: typings.officeJs.Office.EventType.ViewSelectionChanged & Double = js.native
}
