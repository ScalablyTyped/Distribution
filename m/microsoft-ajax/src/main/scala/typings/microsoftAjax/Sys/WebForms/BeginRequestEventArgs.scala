package typings.microsoftAjax.Sys.WebForms

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.Net.WebRequest
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used by the beginRequest event of the PageRequestManager class to pass argument information to event handlers.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb384003(v=vs.100).aspx}
  */
@js.native
trait BeginRequestEventArgs extends EventArgs {
  
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
  def get_updatePanelsToUpdate(): js.Array[String] = js.native
}
object BeginRequestEventArgs {
  
  @scala.inline
  def apply(
    Empty: EventArgs,
    get_postBackElement: () => HTMLElement,
    get_request: () => WebRequest,
    get_updatePanelsToUpdate: () => js.Array[String]
  ): BeginRequestEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_postBackElement = js.Any.fromFunction0(get_postBackElement), get_request = js.Any.fromFunction0(get_request), get_updatePanelsToUpdate = js.Any.fromFunction0(get_updatePanelsToUpdate))
    __obj.asInstanceOf[BeginRequestEventArgs]
  }
  
  @scala.inline
  implicit class BeginRequestEventArgsOps[Self <: BeginRequestEventArgs] (val x: Self) extends AnyVal {
    
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
    def setGet_request(value: () => WebRequest): Self = this.set("get_request", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_updatePanelsToUpdate(value: () => js.Array[String]): Self = this.set("get_updatePanelsToUpdate", js.Any.fromFunction0(value))
  }
}
