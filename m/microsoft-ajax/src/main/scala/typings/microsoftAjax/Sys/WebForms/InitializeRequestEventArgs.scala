package typings.microsoftAjax.Sys.WebForms

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used by the initializeRequest event of the PageRequestManager class to pass argument information to event handlers.
  * This class contains private members that support the client-script infrastructure and are not intended to be used directly from your code. Names of private members begin with an underscore ( _ ).
  * @see {@link http://msdn.microsoft.com/en-us/library/bb311030(v=vs.100).aspx}
  */
trait InitializeRequestEventArgs extends EventArgs {
  //#endregion
  //#region Properties
  /**
    * Gets the postback element that initiated the asynchronous postback.
    * @return An HTML DOM element.
    */
  def get_postBackElement(): HTMLElement
  /**
    * Gets the request object that represents the current postback.
    * @return A request object that is represented by the Sys.Net.WebRequestExecutor class.
    */
  def get_request(): WebRequestExecutor
  /**
    * Gets or sets a list of UniqueID values for UpdatePanel controls that should re-render their content, as requested by the client.
    * The returned array can be modified by a client event handler to add or remove UpdatePanel controls that should re-render their content dynamically. Server processing can also modify the array.
    * @return An array of UniqueID values for UpdatePanel controls.
    */
  def get_updatePanelsToUpdate(): js.Array[String]
}

object InitializeRequestEventArgs {
  @scala.inline
  def apply(
    Empty: EventArgs,
    get_postBackElement: () => HTMLElement,
    get_request: () => WebRequestExecutor,
    get_updatePanelsToUpdate: () => js.Array[String]
  ): InitializeRequestEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_postBackElement = js.Any.fromFunction0(get_postBackElement), get_request = js.Any.fromFunction0(get_request), get_updatePanelsToUpdate = js.Any.fromFunction0(get_updatePanelsToUpdate))
    __obj.asInstanceOf[InitializeRequestEventArgs]
  }
}

