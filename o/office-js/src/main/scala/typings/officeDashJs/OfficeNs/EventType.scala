package typings.officeDashJs.OfficeNs

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
    * **Hosts**: PowerPoint
    */
  @js.native
  sealed trait ActiveViewChanged extends EventType
  
  /**
    * Triggers when any date or time of the selected appointment or series is changed in Outlook. Supported with task pane only.
    * 
    * [Api set: Mailbox 1.7]
    */
  @js.native
  sealed trait AppointmentTimeChanged extends EventType
  
  /**
    * Occurs when data within the binding is changed. 
    * To add an event handler for the BindingDataChanged event of a binding, use the addHandlerAsync method of the Binding object. 
    * The event handler receives an argument of type {@link Office.BindingDataChangedEventArgs}.
    * 
    * @remarks 
    * **Hosts**: Excel, Word
    */
  @js.native
  sealed trait BindingDataChanged extends EventType
  
  /**
    * Occurs when the selection is changed within the binding. To add an event handler for the BindingSelectionChanged event of a binding, use 
    * the addHandlerAsync method of the Binding object. The event handler receives an argument of type {@link Office.BindingSelectionChangedEventArgs}.
    * 
    * @remarks 
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
    * **Hosts**: Excel, Word
    */
  @js.native
  sealed trait DocumentSelectionChanged extends EventType
  
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
    * [Api set: Mailbox 1.7]
    */
  @js.native
  sealed trait RecipientsChanged extends EventType
  
  /**
    * Triggers when the recurrence pattern of the selected series is changed in Outlook. Supported with task pane only.
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
  
  /* 0 */ val ActiveViewChanged: typings.officeDashJs.OfficeNs.EventType.ActiveViewChanged with Double = js.native
  /* 1 */ val AppointmentTimeChanged: typings.officeDashJs.OfficeNs.EventType.AppointmentTimeChanged with Double = js.native
  /* 2 */ val BindingDataChanged: typings.officeDashJs.OfficeNs.EventType.BindingDataChanged with Double = js.native
  /* 3 */ val BindingSelectionChanged: typings.officeDashJs.OfficeNs.EventType.BindingSelectionChanged with Double = js.native
  /* 5 */ val DialogEventReceived: typings.officeDashJs.OfficeNs.EventType.DialogEventReceived with Double = js.native
  /* 4 */ val DialogMessageReceived: typings.officeDashJs.OfficeNs.EventType.DialogMessageReceived with Double = js.native
  /* 6 */ val DocumentSelectionChanged: typings.officeDashJs.OfficeNs.EventType.DocumentSelectionChanged with Double = js.native
  /* 7 */ val ItemChanged: typings.officeDashJs.OfficeNs.EventType.ItemChanged with Double = js.native
  /* 8 */ val NodeDeleted: typings.officeDashJs.OfficeNs.EventType.NodeDeleted with Double = js.native
  /* 9 */ val NodeInserted: typings.officeDashJs.OfficeNs.EventType.NodeInserted with Double = js.native
  /* 10 */ val NodeReplaced: typings.officeDashJs.OfficeNs.EventType.NodeReplaced with Double = js.native
  /* 11 */ val RecipientsChanged: typings.officeDashJs.OfficeNs.EventType.RecipientsChanged with Double = js.native
  /* 12 */ val RecurrenceChanged: typings.officeDashJs.OfficeNs.EventType.RecurrenceChanged with Double = js.native
  /* 13 */ val ResourceSelectionChanged: typings.officeDashJs.OfficeNs.EventType.ResourceSelectionChanged with Double = js.native
  /* 14 */ val SettingsChanged: typings.officeDashJs.OfficeNs.EventType.SettingsChanged with Double = js.native
  /* 15 */ val TaskSelectionChanged: typings.officeDashJs.OfficeNs.EventType.TaskSelectionChanged with Double = js.native
  /* 16 */ val ViewSelectionChanged: typings.officeDashJs.OfficeNs.EventType.ViewSelectionChanged with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
}

