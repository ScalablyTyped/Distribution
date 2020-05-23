package typings.phaser.Phaser.Types.Loader

import typings.phaser.integer
import typings.std.XMLHttpRequestResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XHRSettingsObject extends js.Object {
  /**
    * Should the XHR request use async or not?
    */
  var async: js.UndefOr[Boolean] = js.undefined
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var header: js.UndefOr[String] = js.undefined
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var headerValue: js.UndefOr[String] = js.undefined
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var headers: js.UndefOr[js.Object] = js.undefined
  /**
    * Provide a custom mime-type to use instead of the default.
    */
  var overrideMimeType: js.UndefOr[String] = js.undefined
  /**
    * Optional password for the XHR request.
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var requestedWith: js.UndefOr[String] = js.undefined
  /**
    * The response type of the XHR request, i.e. `blob`, `text`, etc.
    */
  var responseType: XMLHttpRequestResponseType
  /**
    * Optional XHR timeout value.
    */
  var timeout: js.UndefOr[integer] = js.undefined
  /**
    * Optional username for the XHR request.
    */
  var user: js.UndefOr[String] = js.undefined
  /**
    * The withCredentials property indicates whether or not cross-site Access-Control requests should be made using credentials such as cookies, authorization headers or TLS client certificates. Setting withCredentials has no effect on same-site requests.
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object XHRSettingsObject {
  @scala.inline
  def apply(
    responseType: XMLHttpRequestResponseType,
    async: js.UndefOr[Boolean] = js.undefined,
    header: String = null,
    headerValue: String = null,
    headers: js.Object = null,
    overrideMimeType: String = null,
    password: String = null,
    requestedWith: String = null,
    timeout: js.UndefOr[integer] = js.undefined,
    user: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): XHRSettingsObject = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerValue != null) __obj.updateDynamic("headerValue")(headerValue.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(overrideMimeType.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (requestedWith != null) __obj.updateDynamic("requestedWith")(requestedWith.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[XHRSettingsObject]
  }
}

