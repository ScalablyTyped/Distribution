package typings.microsoftDashAjax.SysNs.WebFormsNs

import typings.microsoftDashAjax.SysNs.EventArgs
import typings.microsoftDashAjax.SysNs.NetNs.WebRequest
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used by the beginRequest event of the PageRequestManager class to pass argument information to event handlers.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb384003(v=vs.100).aspx}
  */
@JSGlobal("Sys.WebForms.BeginRequestEventArgs")
@js.native
class BeginRequestEventArgs protected () extends EventArgs {
  //#region Constructors
  /**
    * Initializes a new instance of the BeginRequestEventArgs class.
    * @param request
    *           A Sys.Net.WebRequest representing the web request for the EventArgs.
    * @param postBackElement
    *           The postback element that initiated the async postback.
    * @param updatePanelsToUpdate
    *           (Optional) A list of UniqueIDs for UpdatePanel controls that are requested to update their rendering by the client. Server-side processing may update additional UpdatePanels.
    */
  def this(request: WebRequest, postBackElement: js.Any, updatePanelsToUpdate: js.Array[java.lang.String]) = this()
  //#endregion
  //#region Properties
  /**
    * Gets the postback element that initiated the asynchronous postback. This property is read-only.
    * @readonly
    * @return An HTML DOM element.
    */
  def get_postBackElement(): HTMLElement = js.native
  /**
    * Gets the request object that represents the current postback.
    * @return An instance of the Sys.Net.WebRequest class.
    */
  def get_request(): WebRequest = js.native
  /**
    * Gets a list of UniqueID values for UpdatePanel controls that should re-render their content, as requested by the client.
    * Server-side processing might update additional UpdatePanel controls.
    * @return An array of UniqueID values for UpdatePanel controls.
    */
  def get_updatePanelsToUpdate(): js.Array[java.lang.String] = js.native
}

