package typings.officeJsPreview.Office.AddinCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Event` object is passed as a parameter to add-in functions invoked by UI-less command buttons. The object allows the add-in to identify
  * which button was clicked and to signal the host that it has completed its processing.
  *
  * @remarks
  *
  * See {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/add-in-commands-requirement-sets | Add-in commands requirement sets} for more support information.
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level (Outlook)}**: Restricted
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@js.native
trait Event extends js.Object {
  /**
    * Information about the control that triggered calling this function.
    *
    * @remarks
    *
    * This property is supported in Outlook only in {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/outlook-api-requirement-sets | requirement set} Mailbox 1.3 and later.
    */
  var source: Source = js.native
  /**
    * Indicates that the add-in has completed processing and will automatically be closed.
    *
    * This method must be called at the end of a function which was invoked by the following.
    *
    * - A UI-less button (i.e., an add-in command defined with an `Action` element where the `xsi:type` attribute is set to `ExecuteFunction`)
    *
    * - An {@link https://docs.microsoft.com/office/dev/add-ins/reference/manifest/event | event} defined in the
    * {@link https://docs.microsoft.com/office/dev/add-ins/reference/manifest/extensionpoint#events | Events extension point},
    * e.g., an `ItemSend` event
    *
    * [Api set: Mailbox 1.3]
    *
    * @remarks
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `Restricted`
    *
    * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * **Note**: The `options` parameter was introduced in Mailbox 1.8.
    *
    * @param options Optional. An object that specifies behavior options for when the event is completed.
    */
  def completed(): Unit = js.native
  def completed(options: EventCompletedOptions): Unit = js.native
}

