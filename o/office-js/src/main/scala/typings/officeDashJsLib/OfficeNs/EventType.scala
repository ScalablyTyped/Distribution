package typings
package officeDashJsLib.OfficeNs

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
  sealed trait ActiveViewChanged
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Triggers when any date or time of the selected appointment or series is changed in Outlook.
    * 
    * [Api set: Mailbox 1.7]
    */
  @js.native
  sealed trait AppointmentTimeChanged
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Triggers when an attachment is added to or removed from an item.
    * 
    * [Api set: Mailbox Preview]
    * 
    * @beta
    */
  @js.native
  sealed trait AttachmentsChanged
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Occurs when data within the binding is changed. 
    * To add an event handler for the BindingDataChanged event of a binding, use the addHandlerAsync method of the Binding object. 
    * The event handler receives an argument of type {@link Office.BindingDataChangedEventArgs}.
    * 
    * @remarks 
    * **Hosts**: Excel, Word
    */
  @js.native
  sealed trait BindingDataChanged
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Occurs when the selection is changed within the binding. To add an event handler for the BindingSelectionChanged event of a binding, use 
    * the addHandlerAsync method of the Binding object. The event handler receives an argument of type {@link Office.BindingSelectionChangedEventArgs}.
    * 
    * @remarks 
    * **Hosts**: Excel, Word 
    */
  @js.native
  sealed trait BindingSelectionChanged
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Triggers when Dialog has an event, such as dialog closed or dialog navigation failed.
    */
  @js.native
  sealed trait DialogEventReceived
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Triggers when Dialog sends a message via MessageParent.
    */
  @js.native
  sealed trait DialogMessageReceived
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Triggers when a document-level selection happens.
    * 
    * @remarks 
    * **Hosts**: Excel, Word
    */
  @js.native
  sealed trait DocumentSelectionChanged
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Triggers when the appointment location is changed in Outlook.
    * 
    * [Api set: Mailbox Preview]
    */
  @js.native
  sealed trait EnhancedLocationsChanged
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Triggers when a different Outlook item is selected for viewing while the task pane is pinned.
    * 
    * [Api set: Mailbox 1.5]
    */
  @js.native
  sealed trait ItemChanged
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Triggers when a customXmlPart node is deleted.
    */
  @js.native
  sealed trait NodeDeleted
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Triggers when a customXmlPart node is inserted.
    */
  @js.native
  sealed trait NodeInserted
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Triggers when a customXmlPart node is replaced.
    */
  @js.native
  sealed trait NodeReplaced
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Triggers when the OfficeTheme is changed in Outlook.
    * 
    * [Api set: Mailbox Preview]
    * 
    * @beta
    */
  @js.native
  sealed trait OfficeThemeChanged
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Triggers when the recipient list of the selected item or the appointment location is changed in Outlook.
    * 
    * [Api set: Mailbox 1.7]
    */
  @js.native
  sealed trait RecipientsChanged
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Triggers when the recurrence pattern of the selected series is changed in Outlook.
    * 
    * [Api set: Mailbox 1.7]
    */
  @js.native
  sealed trait RecurrenceChanged
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Triggers when a Resource selection happens in Project.
    */
  @js.native
  sealed trait ResourceSelectionChanged
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * A Settings.settingsChanged event was raised.
    * 
    * @remarks 
    * **Hosts**: Excel, PowerPoint, Word
    */
  @js.native
  sealed trait SettingsChanged
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Triggers when a Task selection happens in Project.
    */
  @js.native
  sealed trait TaskSelectionChanged
    extends officeDashJsLib.OfficeNs.EventType
  
  /**
    * Triggers when a View selection happens in Project.
    */
  @js.native
  sealed trait ViewSelectionChanged
    extends officeDashJsLib.OfficeNs.EventType
  
  /* 0 */ val ActiveViewChanged: ActiveViewChanged with scala.Double = js.native
  /* 1 */ val AppointmentTimeChanged: AppointmentTimeChanged with scala.Double = js.native
  /* 2 */ val AttachmentsChanged: AttachmentsChanged with scala.Double = js.native
  /* 3 */ val BindingDataChanged: BindingDataChanged with scala.Double = js.native
  /* 4 */ val BindingSelectionChanged: BindingSelectionChanged with scala.Double = js.native
  /* 6 */ val DialogEventReceived: DialogEventReceived with scala.Double = js.native
  /* 5 */ val DialogMessageReceived: DialogMessageReceived with scala.Double = js.native
  /* 7 */ val DocumentSelectionChanged: DocumentSelectionChanged with scala.Double = js.native
  /* 9 */ val EnhancedLocationsChanged: EnhancedLocationsChanged with scala.Double = js.native
  /* 8 */ val ItemChanged: ItemChanged with scala.Double = js.native
  /* 10 */ val NodeDeleted: NodeDeleted with scala.Double = js.native
  /* 11 */ val NodeInserted: NodeInserted with scala.Double = js.native
  /* 12 */ val NodeReplaced: NodeReplaced with scala.Double = js.native
  /* 13 */ val OfficeThemeChanged: OfficeThemeChanged with scala.Double = js.native
  /* 14 */ val RecipientsChanged: RecipientsChanged with scala.Double = js.native
  /* 15 */ val RecurrenceChanged: RecurrenceChanged with scala.Double = js.native
  /* 16 */ val ResourceSelectionChanged: ResourceSelectionChanged with scala.Double = js.native
  /* 17 */ val SettingsChanged: SettingsChanged with scala.Double = js.native
  /* 18 */ val TaskSelectionChanged: TaskSelectionChanged with scala.Double = js.native
  /* 19 */ val ViewSelectionChanged: ViewSelectionChanged with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsLib.OfficeNs.EventType with scala.Double] = js.native
}

