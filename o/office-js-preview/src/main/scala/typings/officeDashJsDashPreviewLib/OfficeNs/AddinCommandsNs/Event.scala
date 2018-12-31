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
  * 
  * <table><tr><td>Add-in type</td><td>Content, task pane, Outlook</td></tr>
  * 
  * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>Restricted</td></tr>
  *
  * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr></table>
  */
@js.native
trait Event extends js.Object {
  /**
    * Information about the control that triggered calling this function.
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this property is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this property.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                          </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
    *   <tr><td><strong> Outlook </strong></td><td> Y (Mailbox 1.3)            </td><td>                            </td><td>                 </td></tr>
    *  </table>
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
    * <table><tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>Restricted</td></tr>
    *
    * <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or read</td></tr></table>
    * 
    * **Support details**
    * 
    * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
    * An empty cell indicates that the Office host application doesn't support this method.
    * 
    * For more information about Office host application and server requirements, see 
    * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
    * 
    * *Supported hosts, by platform*
    *  <table>
    *   <tr><th>                             </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
    *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
    *   <tr><td><strong> Outlook    </strong></td><td> Y (Mailbox 1.3)            </td><td>                            </td><td>                 </td></tr>
    *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
    *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
    *  </table>
    * 
    * @param options Optional. An object literal that contains one or more of the following properties.
    *        allowEvent: A boolean value. When the completed method is used to signal completion of an event handler, 
    *                    this value indicates of the handled event should continue execution or be canceled. 
    *                    For example, an add-in that handles the ItemSend event can set allowEvent = false to cancel sending of the message.
    */
  def completed(): scala.Unit = js.native
  def completed(options: js.Any): scala.Unit = js.native
}

