package typings.microsoftAjax.Sys.WebForms

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.Net.WebRequestExecutor
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used by the initializeRequest event of the PageRequestManager class to pass argument information to event handlers.
  * This class contains private members that support the client-script infrastructure and are not intended to be used directly from your code. Names of private members begin with an underscore ( _ ).
  * @see {@link http://msdn.microsoft.com/en-us/library/bb311030(v=vs.100).aspx}
  */
@js.native
trait InitializeRequestEventArgs extends EventArgs {
  
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
  def get_updatePanelsToUpdate(): js.Array[String] = js.native
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
  
  @scala.inline
  implicit class InitializeRequestEventArgsOps[Self <: InitializeRequestEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet_postBackElement(value: () => HTMLElement): Self = this.set("get_postBackElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_request(value: () => WebRequestExecutor): Self = this.set("get_request", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_updatePanelsToUpdate(value: () => js.Array[String]): Self = this.set("get_updatePanelsToUpdate", js.Any.fromFunction0(value))
  }
}
