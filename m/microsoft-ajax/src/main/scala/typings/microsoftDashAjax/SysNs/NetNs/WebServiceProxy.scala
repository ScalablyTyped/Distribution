package typings.microsoftDashAjax.SysNs.NetNs

import typings.microsoftDashAjax.SysNs.EventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generated Proxy Classes
  * Enables your application to call Web services asynchronously by using ECMAScript (JavaScript).
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310823(v=vs.100).aspx}
  */
@JSGlobal("Sys.Net.WebServiceProxy")
@js.native
class WebServiceProxy () extends js.Object

/* static members */
@JSGlobal("Sys.Net.WebServiceProxy")
@js.native
object WebServiceProxy extends js.Object {
  def invoke(
    servicePath: java.lang.String,
    methodName: java.lang.String,
    useGet: js.UndefOr[Boolean],
    params: js.UndefOr[js.Any],
    onSuccess: js.UndefOr[js.Function2[/* result */ java.lang.String, /* eventArgs */ EventArgs, Unit]],
    onFailure: js.UndefOr[js.Function1[/* error */ WebServiceError, Unit]],
    userContext: js.UndefOr[js.Any],
    timeout: js.UndefOr[Double],
    enableJsonp: js.UndefOr[Boolean],
    jsonpCallbackParameter: js.UndefOr[java.lang.String]
  ): WebRequest = js.native
}

