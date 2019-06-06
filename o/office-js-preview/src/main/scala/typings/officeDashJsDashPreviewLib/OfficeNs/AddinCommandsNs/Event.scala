package typings
package officeDashJsDashPreviewLib.OfficeNs.AddinCommandsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The event object is passed as a parameter to add-in functions invoked by UI-less command buttons. The object allows the add-in to identify 
  * which button was clicked and to signal the host that it has completed its processing.
  * 
  * @remarks
  * See {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/add-in-commands-requirement-sets | Add-in commands requirement sets} for more support information.
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: Restricted
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait Event extends js.Object {
  /**
    * Information about the control that triggered calling this function.
    * 
    * @remarks
    * 
    * This property is only supported in Outlook in {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/outlook-api-requirement-sets | requirement set} Mailbox 1.3 and later.
    */
  var source: Source = js.native
  /**
    * Indicates that the add-in has completed processing that was triggered by an add-in command button or event handler.
    * 
    * This method must be called at the end of a function which was invoked by an add-in command defined with an Action element with an 
    * xsi:type attribute set to ExecuteFunction. Calling this method signals the host client that the function is complete and that it can 
    * clean up any state involved with invoking the function. For example, if the user closes Outlook before this method is called, Outlook 
    * will warn that a function is still executing.
    * 
    * This method must be called in an event handler added via Office.context.mailbox.addHandlerAsync after completing processing of the event.
    * 
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: Restricted
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * Mailbox 1.3 does not have the `options` parameter while Mailbox Preview does have support for `options` parameter.
    * 
    * @param options Optional. An object that specifies behavior options for when the event is completed.
    */
  def completed(): scala.Unit = js.native
  def completed(options: EventCompletedOptions): scala.Unit = js.native
}

