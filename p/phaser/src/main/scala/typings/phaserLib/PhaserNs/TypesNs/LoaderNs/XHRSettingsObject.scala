package typings
package phaserLib.PhaserNs.TypesNs.LoaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XHRSettingsObject extends js.Object {
  /**
    * Should the XHR request use async or not?
    */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var header: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var headerValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Provide a custom mime-type to use instead of the default.
    */
  var overrideMimeType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional password for the XHR request.
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var requestedWith: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The response type of the XHR request, i.e. `blob`, `text`, etc.
    */
  var responseType: stdLib.XMLHttpRequestResponseType
  /**
    * Optional XHR timeout value.
    */
  var timeout: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * Optional username for the XHR request.
    */
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object XHRSettingsObject {
  @scala.inline
  def apply(
    responseType: stdLib.XMLHttpRequestResponseType,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    header: java.lang.String = null,
    headerValue: java.lang.String = null,
    overrideMimeType: java.lang.String = null,
    password: java.lang.String = null,
    requestedWith: java.lang.String = null,
    timeout: js.UndefOr[phaserLib.integer] = js.undefined,
    user: java.lang.String = null
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

