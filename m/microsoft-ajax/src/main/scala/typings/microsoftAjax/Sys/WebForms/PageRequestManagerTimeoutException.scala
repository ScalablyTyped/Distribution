package typings.microsoftAjax.Sys.WebForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Raised when the request times out.
  * A partial-page update is initiated by a client request (an asynchronous postback) to the server. The server processes the request and returns a response to the client.
  * If the browser does not receive a response in a specified time, the Sys.WebForms.PageRequestManagerTimeoutException is raised.
  * To change the interval that elapses before asynchronous postbacks time out, set the AsyncPostBackTimeout property of the ScriptManager control.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397466(v=vs.100).aspx}
  */
trait PageRequestManagerTimeoutException extends js.Object

