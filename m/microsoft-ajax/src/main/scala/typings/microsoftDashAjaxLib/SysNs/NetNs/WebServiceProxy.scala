package typings
package microsoftDashAjaxLib.SysNs.NetNs

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

/**
  * Generated Proxy Classes
  * Enables your application to call Web services asynchronously by using ECMAScript (JavaScript).
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310823(v=vs.100).aspx}
  */
@JSGlobal("Sys.Net.WebServiceProxy")
@js.native
object WebServiceProxy extends js.Object {
  def invoke(
    servicePath: java.lang.String,
    methodName: java.lang.String,
    useGet: js.UndefOr[scala.Boolean],
    params: js.UndefOr[js.Any],
    onSuccess: js.UndefOr[
      js.Function2[
        /* result */ java.lang.String, 
        /* eventArgs */ microsoftDashAjaxLib.SysNs.EventArgs, 
        scala.Unit
      ]
    ],
    onFailure: js.UndefOr[
      js.Function1[/* error */ microsoftDashAjaxLib.SysNs.NetNs.WebServiceError, scala.Unit]
    ],
    userContext: js.UndefOr[js.Any],
    timeout: js.UndefOr[scala.Double],
    enableJsonp: js.UndefOr[scala.Boolean],
    jsonpCallbackParameter: js.UndefOr[java.lang.String]
  ): microsoftDashAjaxLib.SysNs.NetNs.WebRequest = js.native
}

