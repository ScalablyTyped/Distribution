package typings.microsoftAjax.Sys.Net

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a Web request that is ready to be sent to the current Sys.Net.WebRequestExecutor instance.
  * This class represents the type for the second parameter of the callback function added by the add_invokingRequest method.
  * The callback function is called before the Web request is routed to the current instance of the WebRequestExecutor class.
  *
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397488(v=vs.100).aspx}
  */
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
  def get_webRequest(): WebRequest
}

object NetworkRequestEventArgs {
  @scala.inline
  def apply(get_webRequest: () => WebRequest): NetworkRequestEventArgs = {
    val __obj = js.Dynamic.literal(get_webRequest = js.Any.fromFunction0(get_webRequest))
    __obj.asInstanceOf[NetworkRequestEventArgs]
  }
}

