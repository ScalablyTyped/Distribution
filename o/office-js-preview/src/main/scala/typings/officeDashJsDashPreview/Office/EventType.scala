package typings.officeDashJsDashPreview.Office

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
  /* 0 */ @js.native
  object ActiveViewChanged extends TopLevel[ActiveViewChanged with Double]
  
  /* 1 */ @js.native
  object AppointmentTimeChanged extends TopLevel[AppointmentTimeChanged with Double]
  
  /* 2 */ @js.native
  object AttachmentsChanged extends TopLevel[AttachmentsChanged with Double]
  
  /* 3 */ @js.native
  object BindingDataChanged extends TopLevel[BindingDataChanged with Double]
  
  /* 4 */ @js.native
  object BindingSelectionChanged extends TopLevel[BindingSelectionChanged with Double]
  
  /* 5 */ @js.native
  object DialogEventReceived extends TopLevel[DialogEventReceived with Double]
  
  /* 6 */ @js.native
  object DialogMessageReceived extends TopLevel[DialogMessageReceived with Double]
  
  /* 7 */ @js.native
  object DocumentSelectionChanged extends TopLevel[DocumentSelectionChanged with Double]
  
  /* 8 */ @js.native
  object EnhancedLocationsChanged extends TopLevel[EnhancedLocationsChanged with Double]
  
  /* 9 */ @js.native
  object ItemChanged extends TopLevel[ItemChanged with Double]
  
  /* 10 */ @js.native
  object NodeDeleted extends TopLevel[NodeDeleted with Double]
  
  /* 11 */ @js.native
  object NodeInserted extends TopLevel[NodeInserted with Double]
  
  /* 12 */ @js.native
  object NodeReplaced extends TopLevel[NodeReplaced with Double]
  
  /* 13 */ @js.native
  object OfficeThemeChanged extends TopLevel[OfficeThemeChanged with Double]
  
  /* 14 */ @js.native
  object RecipientsChanged extends TopLevel[RecipientsChanged with Double]
  
  /* 15 */ @js.native
  object RecurrenceChanged extends TopLevel[RecurrenceChanged with Double]
  
  /* 16 */ @js.native
  object ResourceSelectionChanged extends TopLevel[ResourceSelectionChanged with Double]
  
  /* 17 */ @js.native
  object SettingsChanged extends TopLevel[SettingsChanged with Double]
  
  /* 18 */ @js.native
  object TaskSelectionChanged extends TopLevel[TaskSelectionChanged with Double]
  
  /* 19 */ @js.native
  object ViewSelectionChanged extends TopLevel[ViewSelectionChanged with Double]
  
}

