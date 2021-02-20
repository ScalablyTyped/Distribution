package typings.officeJsPreview.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def apply(value: Double): js.UndefOr[typings.officeJsPreview.Office.EventType with Double] = js.native
  
  /* 0 */ val ActiveViewChanged: typings.officeJsPreview.Office.EventType.ActiveViewChanged with Double = js.native
  
  /* 1 */ val AppointmentTimeChanged: typings.officeJsPreview.Office.EventType.AppointmentTimeChanged with Double = js.native
  
  /* 2 */ val AttachmentsChanged: typings.officeJsPreview.Office.EventType.AttachmentsChanged with Double = js.native
  
  /* 3 */ val BindingDataChanged: typings.officeJsPreview.Office.EventType.BindingDataChanged with Double = js.native
  
  /* 4 */ val BindingSelectionChanged: typings.officeJsPreview.Office.EventType.BindingSelectionChanged with Double = js.native
  
  /* 5 */ val DialogEventReceived: typings.officeJsPreview.Office.EventType.DialogEventReceived with Double = js.native
  
  /* 6 */ val DialogMessageReceived: typings.officeJsPreview.Office.EventType.DialogMessageReceived with Double = js.native
  
  /* 7 */ val DialogParentMessageReceived: typings.officeJsPreview.Office.EventType.DialogParentMessageReceived with Double = js.native
  
  /* 8 */ val DocumentSelectionChanged: typings.officeJsPreview.Office.EventType.DocumentSelectionChanged with Double = js.native
  
  /* 9 */ val EnhancedLocationsChanged: typings.officeJsPreview.Office.EventType.EnhancedLocationsChanged with Double = js.native
  
  /* 10 */ val ItemChanged: typings.officeJsPreview.Office.EventType.ItemChanged with Double = js.native
  
  /* 11 */ val NodeDeleted: typings.officeJsPreview.Office.EventType.NodeDeleted with Double = js.native
  
  /* 12 */ val NodeInserted: typings.officeJsPreview.Office.EventType.NodeInserted with Double = js.native
  
  /* 13 */ val NodeReplaced: typings.officeJsPreview.Office.EventType.NodeReplaced with Double = js.native
  
  /* 14 */ val OfficeThemeChanged: typings.officeJsPreview.Office.EventType.OfficeThemeChanged with Double = js.native
  
  /* 15 */ val RecipientsChanged: typings.officeJsPreview.Office.EventType.RecipientsChanged with Double = js.native
  
  /* 16 */ val RecurrenceChanged: typings.officeJsPreview.Office.EventType.RecurrenceChanged with Double = js.native
  
  /* 17 */ val ResourceSelectionChanged: typings.officeJsPreview.Office.EventType.ResourceSelectionChanged with Double = js.native
  
  /* 18 */ val SettingsChanged: typings.officeJsPreview.Office.EventType.SettingsChanged with Double = js.native
  
  /* 19 */ val TaskSelectionChanged: typings.officeJsPreview.Office.EventType.TaskSelectionChanged with Double = js.native
  
  /* 20 */ val ViewSelectionChanged: typings.officeJsPreview.Office.EventType.ViewSelectionChanged with Double = js.native
}
