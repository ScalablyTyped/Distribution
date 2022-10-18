package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends StObject
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
  
  /**
    * A Document.ActiveViewChanged event was raised in PowerPoint.
    *
    * @remarks
    *
    * **Applications**: PowerPoint
    */
  @js.native
  sealed trait ActiveViewChanged
    extends StObject
       with EventType
  
  /**
    * Occurs when any date or time of the selected appointment or series is changed in Outlook.
    * **Important**: This event can only be handled in a task pane. It isn't supported in function commands.
    *
    * To add an event handler for the `AppointmentTimeChanged` event, use the `addHandlerAsync` method of the `Item` object.
    * The event handler receives an argument of type
    * {@link https://learn.microsoft.com/javascript/api/outlook/office.appointmenttimechangedeventargs?view=outlook-js-1.7 | Office.AppointmentTimeChangedEventArgs}.
    *
    * [Api set: Mailbox 1.7]
    */
  @js.native
  sealed trait AppointmentTimeChanged
    extends StObject
       with EventType
  
  /**
    * Occurs when an attachment is added to or removed from an item. **Important**: This event can only be handled in a task pane. It isn't supported in function commands.
    *
    * To add an event handler for the `AttachmentsChanged` event, use the `addHandlerAsync` method of the `Item` object.
    * The event handler receives an argument of type
    * {@link https://learn.microsoft.com/javascript/api/outlook/office.attachmentschangedeventargs?view=outlook-js-1.8 | Office.AttachmentsChangedEventArgs}.
    *
    * [Api set: Mailbox 1.8]
    */
  @js.native
  sealed trait AttachmentsChanged
    extends StObject
       with EventType
  
  /**
    * Occurs when data within the binding is changed.
    * To add an event handler for the BindingDataChanged event of a binding, use the addHandlerAsync method of the Binding object.
    * The event handler receives an argument of type {@link Office.BindingDataChangedEventArgs}.
    *
    * @remarks
    *
    * **Applications**: Excel, Word
    */
  @js.native
  sealed trait BindingDataChanged
    extends StObject
       with EventType
  
  /**
    * Occurs when the selection is changed within the binding. To add an event handler for the BindingSelectionChanged event of a binding, use
    * the addHandlerAsync method of the Binding object. The event handler receives an argument of type {@link Office.BindingSelectionChangedEventArgs}.
    *
    * @remarks
    *
    * **Applications**: Excel, Word
    */
  @js.native
  sealed trait BindingSelectionChanged
    extends StObject
       with EventType
  
  /**
    * Triggers when Dialog has an event, such as dialog closed or dialog navigation failed.
    */
  @js.native
  sealed trait DialogEventReceived
    extends StObject
       with EventType
  
  /**
    * Triggers when a dialog sends a message via `messageParent`.
    */
  @js.native
  sealed trait DialogMessageReceived
    extends StObject
       with EventType
  
  /**
    * Triggers when a host page sends a message to a child dialog box with `messageChild`.
    */
  @js.native
  sealed trait DialogParentMessageReceived
    extends StObject
       with EventType
  
  /**
    * Triggers when a document-level selection happens.
    *
    * @remarks
    *
    * **Applications**: Excel, Word
    */
  @js.native
  sealed trait DocumentSelectionChanged
    extends StObject
       with EventType
  
  /**
    * Occurs when the appointment location is changed in Outlook. **Important**: This event can only be handled in a task pane. It isn't supported in function commands.
    *
    * To add an event handler for the `EnhancedLocationsChanged` event, use the `addHandlerAsync` method of the `Item` object.
    * The event handler receives an argument of type
    * {@link https://learn.microsoft.com/javascript/api/outlook/office.enhancedlocationschangedeventargs?view=outlook-js-1.8 | Office.EnhancedLocationsChangedEventArgs}.
    *
    * [Api set: Mailbox 1.8]
    */
  @js.native
  sealed trait EnhancedLocationsChanged
    extends StObject
       with EventType
  
  /**
    * Occurs in Outlook when an action is selected on a notification message with a defined
    * {@link https://learn.microsoft.com/javascript/api/outlook/office.notificationmessagedetails#actions | custom action}.
    * Currently, "Dismiss" is the only supported action that fires this event.
    *
    * **Important**: This event can only be handled in a task pane. It isn't supported in function commands.
    *
    * To add an event handler for the `InfobarClicked` event, use the `addHandlerAsync` method of the `Item` object.
    * The event handler receives an argument of type
    * {@link https://learn.microsoft.com/javascript/api/outlook/office.infobarclickedeventargs?view=outlook-js-1.10 | Office.InfobarClickedEventArgs}.
    *
    * [Api set: Mailbox 1.10]
    */
  @js.native
  sealed trait InfobarClicked
    extends StObject
       with EventType
  
  /**
    * Occurs when a different Outlook item is selected for viewing while the task pane is pinned.
    * **Important**: This event can only be handled in a task pane. It isn't supported in function commands.
    *
    * To add an event handler for the `ItemChanged` event, use the `addHandlerAsync` method of the `Mailbox` object.
    *
    * [Api set: Mailbox 1.5]
    */
  @js.native
  sealed trait ItemChanged
    extends StObject
       with EventType
  
  /**
    * Triggers when a customXmlPart node is deleted.
    */
  @js.native
  sealed trait NodeDeleted
    extends StObject
       with EventType
  
  /**
    * Triggers when a customXmlPart node is inserted.
    */
  @js.native
  sealed trait NodeInserted
    extends StObject
       with EventType
  
  /**
    * Triggers when a customXmlPart node is replaced.
    */
  @js.native
  sealed trait NodeReplaced
    extends StObject
       with EventType
  
  /**
    * Occurs when the OfficeTheme is changed in Outlook. **Important**: This event can only be handled in a task pane. It isn't supported in function commands.
    *
    * To add an event handler for the `OfficeThemeChanged` event, use the `addHandlerAsync` method of the `Mailbox` object.
    * The event handler receives an argument of type
    * {@link https://learn.microsoft.com/javascript/api/outlook/office.officethemechangedeventargs?view=outlook-js-preview | Office.OfficeThemeChangedEventArgs}.
    *
    * [Api set: Mailbox preview]
    *
    * @beta
    */
  @js.native
  sealed trait OfficeThemeChanged
    extends StObject
       with EventType
  
  /**
    * Occurs when the recipient list of the selected item or the appointment location is changed in Outlook.
    * **Important**: This event can only be handled in a task pane. It isn't supported in function commands.
    *
    * To add an event handler for the `RecipientsChanged` event, use the `addHandlerAsync` method of the `Item` object.
    * The event handler receives an argument of type
    * {@link https://learn.microsoft.com/javascript/api/outlook/office.recipientschangedeventargs?view=outlook-js-1.7 | Office.RecipientsChangedEventArgs}.
    *
    * [Api set: Mailbox 1.7]
    */
  @js.native
  sealed trait RecipientsChanged
    extends StObject
       with EventType
  
  /**
    * Occurs when the recurrence pattern of the selected series is changed in Outlook.
    * **Important**: This event can only be handled in a task pane. It isn't supported in function commands.
    *
    * To add an event handler for the `RecurrenceChanged` event, use the `addHandlerAsync` method of the `Item` object.
    * The event handler receives an argument of type
    * {@link https://learn.microsoft.com/javascript/api/outlook/office.recurrencechangedeventargs?view=outlook-js-1.7 | Office.RecurrenceChangedEventArgs}.
    *
    * [Api set: Mailbox 1.7]
    */
  @js.native
  sealed trait RecurrenceChanged
    extends StObject
       with EventType
  
  /**
    * Triggers when a Resource selection happens in Project.
    */
  @js.native
  sealed trait ResourceSelectionChanged
    extends StObject
       with EventType
  
  /**
    * Occurs in Outlook when one or more messages are selected or deselected.
    * **Important**: This event can only be handled in a task pane. It isn't supported in function commands.
    * 
    * To add an event handler for the `SelectedItemsChanged` event, use the `addHandlerAsync` method of the `Mailbox` object.
    * 
    * [Api set: Mailbox preview]
    */
  @js.native
  sealed trait SelectedItemsChanged
    extends StObject
       with EventType
  
  /**
    * A Settings.settingsChanged event was raised.
    *
    * @remarks
    *
    * **Applications**: Excel, PowerPoint, Word
    */
  @js.native
  sealed trait SettingsChanged
    extends StObject
       with EventType
  
  /**
    * Triggers when a Task selection happens in Project.
    */
  @js.native
  sealed trait TaskSelectionChanged
    extends StObject
       with EventType
  
  /**
    * Triggers when a View selection happens in Project.
    */
  @js.native
  sealed trait ViewSelectionChanged
    extends StObject
       with EventType
}
