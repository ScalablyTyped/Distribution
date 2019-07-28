package typings.microsoftDashAjax.SysNs.WebFormsNs

import typings.microsoftDashAjax.SysNs.EventArgs
import typings.microsoftDashAjax.SysNs.NetNs.WebRequest
import typings.microsoftDashAjax.SysNs.NetNs.WebRequestExecutor
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used by the initializeRequest event of the PageRequestManager class to pass argument information to event handlers.
  * This class contains private members that support the client-script infrastructure and are not intended to be used directly from your code. Names of private members begin with an underscore ( _ ).
  * @see {@link http://msdn.microsoft.com/en-us/library/bb311030(v=vs.100).aspx}
  */
@JSGlobal("Sys.WebForms.InitializeRequestEventArgs")
@js.native
class InitializeRequestEventArgs protected () extends EventArgs {
  //#region Constructors
  /**
    * Initializes a new instance of the EndRequestEventArgs class.
    * @param request
    *           A Sys.Net.WebRequest object that represents the Web request for the EventArgs object.
    * @param datapostBackElementItems
    *           The postback element that initiated the asynchronous postback.
    * @param updatePanelsToUpdate
    *           (Optional) A list of UniqueID values for UpdatePanel controls that are being requested to update their rendering by the client. Server-side processing might update additional UpdatePanel controls.
    */
  def this(request: WebRequest, postBackElement: js.Any, updatePanelsToUpdate: js.Array[java.lang.String]) = this()
  //#endregion
  //#region Properties
  /**
    * Gets the postback element that initiated the asynchronous postback.
    * @return An HTML DOM element.
    */
  def get_postBackElement(): HTMLElement = js.native
  /**
    * Gets the request object that represents the current postback.
    * @return A request object that is represented by the Sys.Net.WebRequestExecutor class.
    */
  def get_request(): WebRequestExecutor = js.native
  /**
    * Gets or sets a list of UniqueID values for UpdatePanel controls that should re-render their content, as requested by the client.
    * The returned array can be modified by a client event handler to add or remove UpdatePanel controls that should re-render their content dynamically. Server processing can also modify the array.
    * @return An array of UniqueID values for UpdatePanel controls.
    */
  def get_updatePanelsToUpdate(): js.Array[java.lang.String] = js.native
}

