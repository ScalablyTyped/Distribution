package typings.officeJsPreview.global.Office

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
  * **`BindingDataChanged` and `BindingSelectionChanged` hosts**: Excel, Word.
  *
  */
@JSGlobal("Office.EventType")
@js.native
object EventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.officeJsPreview.Office.EventType & Double] = js.native
  
  /* 0 */ val ActiveViewChanged: typings.officeJsPreview.Office.EventType.ActiveViewChanged & Double = js.native
  
  /* 1 */ val AppointmentTimeChanged: typings.officeJsPreview.Office.EventType.AppointmentTimeChanged & Double = js.native
  
  /* 2 */ val AttachmentsChanged: typings.officeJsPreview.Office.EventType.AttachmentsChanged & Double = js.native
  
  /* 3 */ val BindingDataChanged: typings.officeJsPreview.Office.EventType.BindingDataChanged & Double = js.native
  
  /* 4 */ val BindingSelectionChanged: typings.officeJsPreview.Office.EventType.BindingSelectionChanged & Double = js.native
  
  /* 5 */ val DialogEventReceived: typings.officeJsPreview.Office.EventType.DialogEventReceived & Double = js.native
  
  /* 6 */ val DialogMessageReceived: typings.officeJsPreview.Office.EventType.DialogMessageReceived & Double = js.native
  
  /* 7 */ val DialogParentMessageReceived: typings.officeJsPreview.Office.EventType.DialogParentMessageReceived & Double = js.native
  
  /* 8 */ val DocumentSelectionChanged: typings.officeJsPreview.Office.EventType.DocumentSelectionChanged & Double = js.native
  
  /* 9 */ val EnhancedLocationsChanged: typings.officeJsPreview.Office.EventType.EnhancedLocationsChanged & Double = js.native
  
  /* 10 */ val InfobarClicked: typings.officeJsPreview.Office.EventType.InfobarClicked & Double = js.native
  
  /* 11 */ val ItemChanged: typings.officeJsPreview.Office.EventType.ItemChanged & Double = js.native
  
  /* 12 */ val NodeDeleted: typings.officeJsPreview.Office.EventType.NodeDeleted & Double = js.native
  
  /* 13 */ val NodeInserted: typings.officeJsPreview.Office.EventType.NodeInserted & Double = js.native
  
  /* 14 */ val NodeReplaced: typings.officeJsPreview.Office.EventType.NodeReplaced & Double = js.native
  
  /* 15 */ val OfficeThemeChanged: typings.officeJsPreview.Office.EventType.OfficeThemeChanged & Double = js.native
  
  /* 16 */ val RecipientsChanged: typings.officeJsPreview.Office.EventType.RecipientsChanged & Double = js.native
  
  /* 17 */ val RecurrenceChanged: typings.officeJsPreview.Office.EventType.RecurrenceChanged & Double = js.native
  
  /* 18 */ val ResourceSelectionChanged: typings.officeJsPreview.Office.EventType.ResourceSelectionChanged & Double = js.native
  
  /* 19 */ val SettingsChanged: typings.officeJsPreview.Office.EventType.SettingsChanged & Double = js.native
  
  /* 20 */ val TaskSelectionChanged: typings.officeJsPreview.Office.EventType.TaskSelectionChanged & Double = js.native
  
  /* 21 */ val ViewSelectionChanged: typings.officeJsPreview.Office.EventType.ViewSelectionChanged & Double = js.native
}
