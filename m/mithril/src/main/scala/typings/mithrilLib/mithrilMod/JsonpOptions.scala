package typings
package mithrilLib.mithrilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonpOptions extends js.Object {
  /** If false, redraws mounted components upon completion of the request. If true, it does not. */
  var background: js.UndefOr[scala.Boolean] = js.undefined
  /** The name of the querystring parameter name that specifies the callback name. */
  var callbackKey: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the function that will be called as the callback. */
  var callbackName: js.UndefOr[java.lang.String] = js.undefined
  /** The data to be interpolated into the URL and serialized into the querystring. */
  var data: js.UndefOr[js.Any] = js.undefined
  /** A constructor to be applied to each object in the response. */
  var `type`: js.UndefOr[org.scalablytyped.runtime.Instantiable1[/* o */ js.Any, js.Any]] = js.undefined
}

object JsonpOptions {
  @scala.inline
  def apply(
    background: js.UndefOr[scala.Boolean] = js.undefined,
    callbackKey: java.lang.String = null,
    callbackName: java.lang.String = null,
    data: js.Any = null,
    `type`: org.scalablytyped.runtime.Instantiable1[/* o */ js.Any, js.Any] = null
  ): JsonpOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background)
    if (callbackKey != null) __obj.updateDynamic("callbackKey")(callbackKey)
    if (callbackName != null) __obj.updateDynamic("callbackName")(callbackName)
    if (data != null) __obj.updateDynamic("data")(data)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JsonpOptions]
  }
}

