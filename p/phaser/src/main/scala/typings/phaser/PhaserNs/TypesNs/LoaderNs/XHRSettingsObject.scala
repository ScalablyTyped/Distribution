package typings.phaser.PhaserNs.TypesNs.LoaderNs

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
}

object XHRSettingsObject {
  @scala.inline
  def apply(
    responseType: XMLHttpRequestResponseType,
    async: js.UndefOr[Boolean] = js.undefined,
    header: String = null,
    headerValue: String = null,
    overrideMimeType: String = null,
    password: String = null,
    requestedWith: String = null,
    timeout: js.UndefOr[integer] = js.undefined,
    user: String = null
  ): XHRSettingsObject = {
    val __obj = js.Dynamic.literal(responseType = responseType)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (header != null) __obj.updateDynamic("header")(header)
    if (headerValue != null) __obj.updateDynamic("headerValue")(headerValue)
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(overrideMimeType)
    if (password != null) __obj.updateDynamic("password")(password)
    if (requestedWith != null) __obj.updateDynamic("requestedWith")(requestedWith)
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[XHRSettingsObject]
  }
}

