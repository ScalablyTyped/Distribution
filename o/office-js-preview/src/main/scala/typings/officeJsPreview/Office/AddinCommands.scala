package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AddinCommands {
  
  /**
    * The `Event` object is passed as a parameter to add-in functions invoked by function command buttons. The object allows the add-in to identify
    * which button was clicked and to signal the host that it has completed its processing.
    *
    * @remarks
    *
    * See {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/add-in-commands-requirement-sets | Add-in commands requirement sets} for more support information.
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level (Outlook)}**: `Restricted`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @js.native
  trait Event extends StObject {
    
    /**
      * Indicates that the add-in has completed processing and will automatically be closed.
      *
      * This method must be called at the end of a function which was invoked by the following:
      *
      * - A function command button (that is, an add-in command defined with an `Action` element, where the `xsi:type` attribute is set to `ExecuteFunction`).
      *
      * - An event defined in the {@link https://learn.microsoft.com/javascript/api/manifest/extensionpoint#launchevent | LaunchEvent extension point}.
      * For example, an `OnMessageSend` event. 
      * 
      * - An {@link https://learn.microsoft.com/javascript/api/manifest/event | event} defined in the
      * {@link https://learn.microsoft.com/javascript/api/manifest/extensionpoint#events | Events extension point}. For example, an `ItemSend` event.
      *
      * @remarks
      *
      * [Api set: Mailbox 1.3]
      * 
      * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `Restricted`
      *
      * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
      *
      * **Note**: The `options` parameter was introduced in Mailbox 1.8.
      *
      * @param options Optional. An object that specifies behavior options for when the event is completed.
      */
    def completed(): Unit = js.native
    def completed(options: EventCompletedOptions): Unit = js.native
    
    /**
      * Information about the control that triggered calling this function.
      *
      * @remarks
      *
      * This property is supported in Outlook only in {@link https://learn.microsoft.com/javascript/api/requirement-sets/outlook/outlook-api-requirement-sets | requirement set} Mailbox 1.3 and later.
      */
    var source: Source = js.native
  }
  
  /**
    * Specifies the behavior for when the event is completed.
    */
  trait EventCompletedOptions extends StObject {
    
    /**
      * When the {@link https://learn.microsoft.com/javascript/api/office/office.addincommands.event#office-office-addincommands-event-completed-member(1) | completed method}
      * is used to signal completion of an event handler, this value indicates if the handled event should continue execution or be canceled.
      * For example, an add-in that handles the `OnMessageSend` or `OnAppointmentSend` event can set `allowEvent` to `false` to cancel the
      * sending of an item. For a complete sample, see the
      * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/smart-alerts-onmessagesend-walkthrough | Smart Alerts walkthrough}.
      * 
      * @remarks
      *
      * [Api set: Mailbox 1.8]
      * 
      * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level (Outlook)}**: `Restricted`
      *
      * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
      */
    var allowEvent: Boolean
    
    /**
      * When the {@link https://learn.microsoft.com/javascript/api/office/office.addincommands.event#office-office-addincommands-event-completed-member(1) | completed method}
      * is used to signal completion of an event handler and if the `allowEvent` option is set to `false`, this value sets the error message
      * that will be displayed to the user. For an example, see the  
      * {@link https://learn.microsoft.com/office/dev/add-ins/outlook/smart-alerts-onmessagesend-walkthrough | Smart Alerts walkthrough}.
      *
      * @remarks
      * 
      * [Api set: Mailbox 1.12]
      * 
      * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level (Outlook)}**: `Restricted`
      *
      * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
      */
    var errorMessage: js.UndefOr[String] = js.undefined
  }
  object EventCompletedOptions {
    
    inline def apply(allowEvent: Boolean): EventCompletedOptions = {
      val __obj = js.Dynamic.literal(allowEvent = allowEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventCompletedOptions]
    }
    
    extension [Self <: EventCompletedOptions](x: Self) {
      
      inline def setAllowEvent(value: Boolean): Self = StObject.set(x, "allowEvent", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    }
  }
  
  /**
    * Encapsulates source data for add-in events.
    */
  trait Source extends StObject {
    
    /**
      * The ID of the control that triggered calling this function. The ID comes from the manifest.
      */
    var id: String
  }
  object Source {
    
    inline def apply(id: String): Source = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
