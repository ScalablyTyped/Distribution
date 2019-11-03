package typings.officeDashJsDashPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

/**
  * Specifies the kind of event that was raised. Returned by the `type` property of an *EventArgs object.
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
  /**
    * A Document.ActiveViewChanged event was raised.
    * 
    * @remarks 
    * 
    * **Hosts**: PowerPoint
    */
  @js.native
  sealed trait ActiveViewChanged extends EventType
  
  /**
    * Triggers when any date or time of the selected appointment or series is changed in Outlook. Supported with task pane only.
    * 
    * The event handler receives an argument of type `Office.AppointmentTimeChangedEventArgs`.
    * 
    * [Api set: Mailbox 1.7]
    */
  @js.native
  sealed trait AppointmentTimeChanged extends EventType
  
  /**
    * Triggers when an attachment is added to or removed from an item. Supported with task pane only.
    * 
    * The event handler receives an argument of type `Office.AttachmentsChangedEventArgs`.
    * 
    * [Api set: Mailbox 1.8]
    */
  @js.native
  sealed trait AttachmentsChanged extends EventType
  
  /**
    * Occurs when data within the binding is changed. 
    * To add an event handler for the BindingDataChanged event of a binding, use the addHandlerAsync method of the Binding object. 
    * The event handler receives an argument of type {@link Office.BindingDataChangedEventArgs}.
    * 
    * @remarks 
    * 
    * **Hosts**: Excel, Word
    */
  @js.native
  sealed trait BindingDataChanged extends EventType
  
  /**
    * Occurs when the selection is changed within the binding. To add an event handler for the BindingSelectionChanged event of a binding, use 
    * the addHandlerAsync method of the Binding object. The event handler receives an argument of type {@link Office.BindingSelectionChangedEventArgs}.
    * 
    * @remarks 
    * 
    * **Hosts**: Excel, Word 
    */
  @js.native
  sealed trait BindingSelectionChanged extends EventType
  
  /**
    * Triggers when Dialog has an event, such as dialog closed or dialog navigation failed.
    */
  @js.native
  sealed trait DialogEventReceived extends EventType
  
  /**
    * Triggers when Dialog sends a message via MessageParent.
    */
  @js.native
  sealed trait DialogMessageReceived extends EventType
  
  /**
    * Triggers when a document-level selection happens.
    * 
    * @remarks 
    * 
    * **Hosts**: Excel, Word
    */
  @js.native
  sealed trait DocumentSelectionChanged extends EventType
  
  /**
    * Triggers when the appointment location is changed in Outlook. Supported with task pane only.
    * 
    * The event handler receives an argument of type `Office.EnhancedLocationsChangedEventArgs`.
    * 
    * [Api set: Mailbox 1.8]
    */
  @js.native
  sealed trait EnhancedLocationsChanged extends EventType
  
  /**
    * Triggers when a different Outlook item is selected for viewing while the task pane is pinned. Supported with task pane only.
    * 
    * [Api set: Mailbox 1.5]
    */
  @js.native
  sealed trait ItemChanged extends EventType
  
  /**
    * Triggers when a customXmlPart node is deleted.
    */
  @js.native
  sealed trait NodeDeleted extends EventType
  
  /**
    * Triggers when a customXmlPart node is inserted.
    */
  @js.native
  sealed trait NodeInserted extends EventType
  
  /**
    * Triggers when a customXmlPart node is replaced.
    */
  @js.native
  sealed trait NodeReplaced extends EventType
  
  /**
    * Triggers when the OfficeTheme is changed in Outlook. Supported with task pane only.
    * 
    * The event handler receives an argument of type `Office.OfficeThemeChangedEventArgs`.
    * 
    * [Api set: Mailbox Preview]
    * 
    * @beta
    */
  @js.native
  sealed trait OfficeThemeChanged extends EventType
  
  /**
    * Triggers when the recipient list of the selected item or the appointment location is changed in Outlook. Supported with task pane only.
    * 
    * The event handler receives an argument of type `Office.RecipientsChangedEventArgs`.
    * 
    * [Api set: Mailbox 1.7]
    */
  @js.native
  sealed trait RecipientsChanged extends EventType
  
  /**
    * Triggers when the recurrence pattern of the selected series is changed in Outlook. Supported with task pane only.
    * 
    * The event handler receives an argument of type `Office.RecurrenceChangedEventArgs`.
    * 
    * [Api set: Mailbox 1.7]
    */
  @js.native
  sealed trait RecurrenceChanged extends EventType
  
  /**
    * Triggers when a Resource selection happens in Project.
    */
  @js.native
  sealed trait ResourceSelectionChanged extends EventType
  
  /**
    * A Settings.settingsChanged event was raised.
    * 
    * @remarks 
    * 
    * **Hosts**: Excel, PowerPoint, Word
    */
  @js.native
  sealed trait SettingsChanged extends EventType
  
  /**
    * Triggers when a Task selection happens in Project.
    */
  @js.native
  sealed trait TaskSelectionChanged extends EventType
  
  /**
    * Triggers when a View selection happens in Project.
    */
  @js.native
  sealed trait ViewSelectionChanged extends EventType
  
  /* 0 */ val ActiveViewChanged: typings.officeDashJsDashPreview.Office.EventType.ActiveViewChanged with Double = js.native
  /* 1 */ val AppointmentTimeChanged: typings.officeDashJsDashPreview.Office.EventType.AppointmentTimeChanged with Double = js.native
  /* 2 */ val AttachmentsChanged: typings.officeDashJsDashPreview.Office.EventType.AttachmentsChanged with Double = js.native
  /* 3 */ val BindingDataChanged: typings.officeDashJsDashPreview.Office.EventType.BindingDataChanged with Double = js.native
  /* 4 */ val BindingSelectionChanged: typings.officeDashJsDashPreview.Office.EventType.BindingSelectionChanged with Double = js.native
  /* 5 */ val DialogEventReceived: typings.officeDashJsDashPreview.Office.EventType.DialogEventReceived with Double = js.native
  /* 6 */ val DialogMessageReceived: typings.officeDashJsDashPreview.Office.EventType.DialogMessageReceived with Double = js.native
  /* 7 */ val DocumentSelectionChanged: typings.officeDashJsDashPreview.Office.EventType.DocumentSelectionChanged with Double = js.native
  /* 8 */ val EnhancedLocationsChanged: typings.officeDashJsDashPreview.Office.EventType.EnhancedLocationsChanged with Double = js.native
  /* 9 */ val ItemChanged: typings.officeDashJsDashPreview.Office.EventType.ItemChanged with Double = js.native
  /* 10 */ val NodeDeleted: typings.officeDashJsDashPreview.Office.EventType.NodeDeleted with Double = js.native
  /* 11 */ val NodeInserted: typings.officeDashJsDashPreview.Office.EventType.NodeInserted with Double = js.native
  /* 12 */ val NodeReplaced: typings.officeDashJsDashPreview.Office.EventType.NodeReplaced with Double = js.native
  /* 13 */ val OfficeThemeChanged: typings.officeDashJsDashPreview.Office.EventType.OfficeThemeChanged with Double = js.native
  /* 14 */ val RecipientsChanged: typings.officeDashJsDashPreview.Office.EventType.RecipientsChanged with Double = js.native
  /* 15 */ val RecurrenceChanged: typings.officeDashJsDashPreview.Office.EventType.RecurrenceChanged with Double = js.native
  /* 16 */ val ResourceSelectionChanged: typings.officeDashJsDashPreview.Office.EventType.ResourceSelectionChanged with Double = js.native
  /* 17 */ val SettingsChanged: typings.officeDashJsDashPreview.Office.EventType.SettingsChanged with Double = js.native
  /* 18 */ val TaskSelectionChanged: typings.officeDashJsDashPreview.Office.EventType.TaskSelectionChanged with Double = js.native
  /* 19 */ val ViewSelectionChanged: typings.officeDashJsDashPreview.Office.EventType.ViewSelectionChanged with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
}

