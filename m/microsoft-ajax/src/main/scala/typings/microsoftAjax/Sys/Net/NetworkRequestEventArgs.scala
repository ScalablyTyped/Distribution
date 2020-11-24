package typings.microsoftAjax.Sys.Net

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a Web request that is ready to be sent to the current Sys.Net.WebRequestExecutor instance.
  * This class represents the type for the second parameter of the callback function added by the add_invokingRequest method.
  * The callback function is called before the Web request is routed to the current instance of the WebRequestExecutor class.
  *
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397488(v=vs.100).aspx}
  */
@js.native
trait NetworkRequestEventArgs extends js.Object {
  
  //#endregion
  //#region Methods
  //#endregion
  //#region Properties
  /**
    * Gets the Web request to be routed to the current Sys.Net.WebRequestExecutor instance.
    * Use this property to inspect the contents of a Web request before it is routed to the current instance of the Sys.Net.WebRequestExecutor class.
    * You can access the Web request instance from the handler that is called before the request is routed.
    * This event handler is added by using the add_invokingRequest method.
    * @return
    *      The WebRequest.
    */
  def get_webRequest(): WebRequest = js.native
}
object NetworkRequestEventArgs {
  
  @scala.inline
  def apply(get_webRequest: () => WebRequest): NetworkRequestEventArgs = {
    val __obj = js.Dynamic.literal(get_webRequest = js.Any.fromFunction0(get_webRequest))
    __obj.asInstanceOf[NetworkRequestEventArgs]
  }
  
  @scala.inline
  implicit class NetworkRequestEventArgsOps[Self <: NetworkRequestEventArgs] (val x: Self) extends AnyVal {
    
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
    def setGet_webRequest(value: () => WebRequest): Self = this.set("get_webRequest", js.Any.fromFunction0(value))
  }
}
