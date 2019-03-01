package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseDefinition extends PropertyDefinition {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var code: scala.Double
  var cookie: js.UndefOr[js.Array[CookieDefinition]] = js.undefined
  var header: js.UndefOr[js.Array[HeaderDefinition]] = js.undefined
  var originalRequest: js.UndefOr[RequestDefinition] = js.undefined
  var responseTime: scala.Double
  var stream: js.UndefOr[nodeLib.Buffer | stdLib.Uint8Array] = js.undefined
}

object ResponseDefinition {
  @scala.inline
  def apply(
    code: scala.Double,
    responseTime: scala.Double,
    body: java.lang.String = null,
    cookie: js.Array[CookieDefinition] = null,
    description: java.lang.String | DescriptionDefinition = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    header: js.Array[HeaderDefinition] = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    originalRequest: RequestDefinition = null,
    stream: nodeLib.Buffer | stdLib.Uint8Array = null
  ): ResponseDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("responseTime")(responseTime)
    if (body != null) __obj.updateDynamic("body")(body)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (header != null) __obj.updateDynamic("header")(header)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (originalRequest != null) __obj.updateDynamic("originalRequest")(originalRequest)
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseDefinition]
  }
}

