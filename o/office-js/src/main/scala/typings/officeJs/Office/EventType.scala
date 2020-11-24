package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends js.Object
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
    * The event handler receives an argument of type
    * {@link https://docs.microsoft.com/javascript/api/outlook/office.appointmenttimechangedeventargs?view=outlook-js-1.7 | Office.AppointmentTimeChangedEventArgs}.
    * 
    * [Api set: Mailbox 1.7]
    */
  @js.native
  sealed trait AppointmentTimeChanged extends EventType
  
  /**
    * Triggers when an attachment is added to or removed from an item. Supported with task pane only.
    * 
    * The event handler receives an argument of type
    * {@link https://docs.microsoft.com/javascript/api/outlook/office.attachmentschangedeventargs?view=outlook-js-1.8 | Office.AttachmentsChangedEventArgs}.
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
    * Triggers when a dialog sends a message via `messageParent`.
    */
  @js.native
  sealed trait DialogMessageReceived extends EventType
  
  /**
    * Triggers when a host page sends a message to a child dialog box with `messageChild`.
    */
  @js.native
  sealed trait DialogParentMessageReceived extends EventType
  
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
    * The event handler receives an argument of type
    * {@link https://docs.microsoft.com/javascript/api/outlook/office.enhancedlocationschangedeventargs?view=outlook-js-1.8 | Office.EnhancedLocationsChangedEventArgs}.
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
    * Triggers when the recipient list of the selected item or the appointment location is changed in Outlook. Supported with task pane only.
    * 
    * The event handler receives an argument of type
    * {@link https://docs.microsoft.com/javascript/api/outlook/office.recipientschangedeventargs?view=outlook-js-1.7 | Office.RecipientsChangedEventArgs}.
    * 
    * [Api set: Mailbox 1.7]
    */
  @js.native
  sealed trait RecipientsChanged extends EventType
  
  /**
    * Triggers when the recurrence pattern of the selected series is changed in Outlook. Supported with task pane only.
    * 
    * The event handler receives an argument of type
    * {@link https://docs.microsoft.com/javascript/api/outlook/office.recurrencechangedeventargs?view=outlook-js-1.7 | Office.RecurrenceChangedEventArgs}.
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
}
