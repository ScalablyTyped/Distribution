package typings.naverDashWhale.whale.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockingResponse extends js.Object {
  /** Optional. Only used as a response to the onAuthRequired event. If set, the request is made using the supplied credentials. */
  var authCredentials: js.UndefOr[typings.chrome.chrome.webRequest.AuthCredentials] = js.undefined
  /** Optional. If true, the request is cancelled. Used in onBeforeRequest, this prevents the request from being sent. */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional.
    * Only used as a response to the onBeforeRequest and onHeadersReceived events. If set, the original request is prevented from being sent/completed and is instead redirected to the given URL. Redirections to non-HTTP schemes such as data: are allowed. Redirects initiated by a redirect action use the original request method for the redirect, with one exception: If the redirect is initiated at the onHeadersReceived stage, then the redirect will be issued using the GET method.
    */
  var redirectUrl: js.UndefOr[String] = js.undefined
  /**
    * Optional.
    * Only used as a response to the onBeforeSendHeaders event. If set, the request is made with these request headers instead.
    */
  var requestHeaders: js.UndefOr[js.Array[typings.chrome.chrome.webRequest.HttpHeader]] = js.undefined
  /**
    * Optional.
    * Only used as a response to the onHeadersReceived event. If set, the server is assumed to have responded with these response headers instead. Only return responseHeaders if you really want to modify the headers in order to limit the number of conflicts (only one extension may modify responseHeaders for each request).
    */
  var responseHeaders: js.UndefOr[js.Array[typings.chrome.chrome.webRequest.HttpHeader]] = js.undefined
}

object BlockingResponse {
  @scala.inline
  def apply(
    authCredentials: typings.chrome.chrome.webRequest.AuthCredentials = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    redirectUrl: String = null,
    requestHeaders: js.Array[typings.chrome.chrome.webRequest.HttpHeader] = null,
    responseHeaders: js.Array[typings.chrome.chrome.webRequest.HttpHeader] = null
  ): BlockingResponse = {
    val __obj = js.Dynamic.literal()
    if (authCredentials != null) __obj.updateDynamic("authCredentials")(authCredentials)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl)
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[BlockingResponse]
  }
}

