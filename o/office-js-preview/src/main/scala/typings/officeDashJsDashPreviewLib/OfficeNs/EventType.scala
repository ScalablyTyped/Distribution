package typings
package officeDashJsDashPreviewLib.OfficeNs

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
  * **`BindingDataChanged` and `BindingSelectionChanged` hosts**: Access, Excel, Word.
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
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Triggers when any date or time of the selected appointment or series is changed in Outlook.
    * 
    * [Api set: Mailbox 1.7]
    */
  @js.native
  sealed trait AppointmentTimeChanged
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Triggers when an attachment is added to or removed from an item.
    * 
    * [Api set: Mailbox Preview]
    * 
    * @beta
    */
  @js.native
  sealed trait AttachmentsChanged
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Occurs when data within the binding is changed. 
    * To add an event handler for the BindingDataChanged event of a binding, use the addHandlerAsync method of the Binding object. 
    * The event handler receives an argument of type {@link Office.BindingDataChangedEventArgs}.
    * 
    * @remarks 
    * **Hosts**: Access, Excel, Word
    */
  @js.native
  sealed trait BindingDataChanged
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Occurs when the selection is changed within the binding. To add an event handler for the BindingSelectionChanged event of a binding, use 
    * the addHandlerAsync method of the Binding object. The event handler receives an argument of type {@link Office.BindingSelectionChangedEventArgs}.
    * 
    * @remarks 
    * **Hosts**: Access, Excel, Word 
    */
  @js.native
  sealed trait BindingSelectionChanged
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Triggers when Dialog has an event, such as dialog closed or dialog navigation failed.
    */
  @js.native
  sealed trait DialogEventReceived
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Triggers when Dialog sends a message via MessageParent.
    */
  @js.native
  sealed trait DialogMessageReceived
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Triggers when a document-level selection happens.
    * 
    * @remarks 
    * **Hosts**: Excel, Word
    */
  @js.native
  sealed trait DocumentSelectionChanged
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Triggers when the appointment location is changed in Outlook.
    * 
    * [Api set: Mailbox Preview]
    */
  @js.native
  sealed trait EnhancedLocationsChanged
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Triggers when a different Outlook item is selected for viewing while the task pane is pinned.
    * 
    * [Api set: Mailbox 1.5]
    */
  @js.native
  sealed trait ItemChanged
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Triggers when a customXmlPart node is deleted.
    */
  @js.native
  sealed trait NodeDeleted
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Triggers when a customXmlPart node is inserted.
    */
  @js.native
  sealed trait NodeInserted
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Triggers when a customXmlPart node is replaced.
    */
  @js.native
  sealed trait NodeReplaced
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Triggers when the OfficeTheme is changed in Outlook.
    * 
    * [Api set: Mailbox Preview]
    * 
    * @beta
    */
  @js.native
  sealed trait OfficeThemeChanged
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Triggers when the recipient list of the selected item or the appointment location is changed in Outlook.
    * 
    * [Api set: Mailbox 1.7]
    */
  @js.native
  sealed trait RecipientsChanged
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Triggers when the recurrence pattern of the selected series is changed in Outlook.
    * 
    * [Api set: Mailbox 1.7]
    */
  @js.native
  sealed trait RecurrenceChanged
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Triggers when a Resource selection happens in Project.
    */
  @js.native
  sealed trait ResourceSelectionChanged
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * A Settings.settingsChanged event was raised.
    * 
    * @remarks 
    * **Hosts**: Access, Excel, PowerPoint, Word
    */
  @js.native
  sealed trait SettingsChanged
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Triggers when a Task selection happens in Project.
    */
  @js.native
  sealed trait TaskSelectionChanged
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  /**
    * Triggers when a View selection happens in Project.
    */
  @js.native
  sealed trait ViewSelectionChanged
    extends officeDashJsDashPreviewLib.OfficeNs.EventType
  
  val ActiveViewChanged: ActiveViewChanged with java.lang.String = js.native
  val AppointmentTimeChanged: AppointmentTimeChanged with java.lang.String = js.native
  val AttachmentsChanged: AttachmentsChanged with java.lang.String = js.native
  val BindingDataChanged: BindingDataChanged with java.lang.String = js.native
  val BindingSelectionChanged: BindingSelectionChanged with java.lang.String = js.native
  val DialogEventReceived: DialogEventReceived with java.lang.String = js.native
  val DialogMessageReceived: DialogMessageReceived with java.lang.String = js.native
  val DocumentSelectionChanged: DocumentSelectionChanged with java.lang.String = js.native
  val EnhancedLocationsChanged: EnhancedLocationsChanged with java.lang.String = js.native
  val ItemChanged: ItemChanged with java.lang.String = js.native
  val NodeDeleted: NodeDeleted with java.lang.String = js.native
  val NodeInserted: NodeInserted with java.lang.String = js.native
  val NodeReplaced: NodeReplaced with java.lang.String = js.native
  val OfficeThemeChanged: OfficeThemeChanged with java.lang.String = js.native
  val RecipientsChanged: RecipientsChanged with java.lang.String = js.native
  val RecurrenceChanged: RecurrenceChanged with java.lang.String = js.native
  val ResourceSelectionChanged: ResourceSelectionChanged with java.lang.String = js.native
  val SettingsChanged: SettingsChanged with java.lang.String = js.native
  val TaskSelectionChanged: TaskSelectionChanged with java.lang.String = js.native
  val ViewSelectionChanged: ViewSelectionChanged with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.EventType with java.lang.String] = js.native
}

