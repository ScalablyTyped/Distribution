package typings.mithril.mithrilMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonpOptions extends js.Object {
  /** If false, redraws mounted components upon completion of the request. If true, it does not. */
  var background: js.UndefOr[Boolean] = js.undefined
  /** The data to be serialized into the request body. */
  var body: js.UndefOr[js.Any] = js.undefined
  /** The name of the querystring parameter name that specifies the callback name. */
  var callbackKey: js.UndefOr[String] = js.undefined
  /** The name of the function that will be called as the callback. */
  var callbackName: js.UndefOr[String] = js.undefined
  /** The data to be interpolated into the URL and serialized into the querystring. */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /** A constructor to be applied to each object in the response. */
  var `type`: js.UndefOr[Instantiable1[/* o */ js.Any, js.Any]] = js.undefined
}

object JsonpOptions {
  @scala.inline
  def apply(
    background: js.UndefOr[Boolean] = js.undefined,
    body: js.Any = null,
    callbackKey: String = null,
    callbackName: String = null,
    params: StringDictionary[js.Any] = null,
    `type`: Instantiable1[/* o */ js.Any, js.Any] = null
  ): JsonpOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background)
    if (body != null) __obj.updateDynamic("body")(body)
    if (callbackKey != null) __obj.updateDynamic("callbackKey")(callbackKey)
    if (callbackName != null) __obj.updateDynamic("callbackName")(callbackName)
    if (params != null) __obj.updateDynamic("params")(params)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JsonpOptions]
  }
}

