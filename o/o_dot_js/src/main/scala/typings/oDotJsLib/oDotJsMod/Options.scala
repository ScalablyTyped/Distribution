package typings
package oDotJsLib.oDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var appending: js.UndefOr[java.lang.String] = js.undefined
  var autoFormat: js.UndefOr[scala.Boolean] = js.undefined
  var endpoint: java.lang.String
  var error: js.UndefOr[js.Function0[_]] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Array[oDotJsLib.Anon_Name]] = js.undefined
  var isAsync: js.UndefOr[scala.Boolean] = js.undefined
  var isCors: js.UndefOr[scala.Boolean] = js.undefined
  var isHashRoute: js.UndefOr[scala.Boolean] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var ready: js.UndefOr[js.Function0[_]] = js.undefined
  var start: js.UndefOr[js.Function0[_]] = js.undefined
  var strictMode: js.UndefOr[scala.Boolean] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    endpoint: java.lang.String,
    appending: java.lang.String = null,
    autoFormat: js.UndefOr[scala.Boolean] = js.undefined,
    error: () => _ = null,
    format: java.lang.String = null,
    headers: js.Array[oDotJsLib.Anon_Name] = null,
    isAsync: js.UndefOr[scala.Boolean] = js.undefined,
    isCors: js.UndefOr[scala.Boolean] = js.undefined,
    isHashRoute: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    ready: () => _ = null,
    start: () => _ = null,
    strictMode: js.UndefOr[scala.Boolean] = js.undefined,
    username: java.lang.String = null,
    version: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(endpoint = endpoint)
    if (appending != null) __obj.updateDynamic("appending")(appending)
    if (!js.isUndefined(autoFormat)) __obj.updateDynamic("autoFormat")(autoFormat)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction0(error))
    if (format != null) __obj.updateDynamic("format")(format)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(isAsync)) __obj.updateDynamic("isAsync")(isAsync)
    if (!js.isUndefined(isCors)) __obj.updateDynamic("isCors")(isCors)
    if (!js.isUndefined(isHashRoute)) __obj.updateDynamic("isHashRoute")(isHashRoute)
    if (password != null) __obj.updateDynamic("password")(password)
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction0(ready))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction0(start))
    if (!js.isUndefined(strictMode)) __obj.updateDynamic("strictMode")(strictMode)
    if (username != null) __obj.updateDynamic("username")(username)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

