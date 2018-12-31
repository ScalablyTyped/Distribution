package typings
package microsoftDashAjaxLib.SysNs.NetNs

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
@JSGlobal("Sys.Net.NetworkRequestEventArgs")
@js.native
class NetworkRequestEventArgs protected () extends js.Object {
  //#region Constructors
  /**
    * Initializes a new instance of the Sys.Net.NetworkRequestEventArgs. class.
    * @param value
    *      The current WebRequest instance.
    */
  def this(value: WebRequest) = this()
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

