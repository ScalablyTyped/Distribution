package typings.postmanDashCollection.postmanDashCollectionMod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseDefinition extends PropertyDefinition {
  var body: js.UndefOr[String] = js.undefined
  var code: Double
  var cookie: js.UndefOr[js.Array[CookieDefinition]] = js.undefined
  var header: js.UndefOr[js.Array[HeaderDefinition]] = js.undefined
  var originalRequest: js.UndefOr[RequestDefinition] = js.undefined
  var responseTime: Double
  var stream: js.UndefOr[Buffer | Uint8Array] = js.undefined
}

object ResponseDefinition {
  @scala.inline
  def apply(
    code: Double,
    responseTime: Double,
    body: String = null,
    cookie: js.Array[CookieDefinition] = null,
    description: String | DescriptionDefinition = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    header: js.Array[HeaderDefinition] = null,
    id: String = null,
    name: String = null,
    originalRequest: RequestDefinition = null,
    stream: Buffer | Uint8Array = null
  ): ResponseDefinition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], responseTime = responseTime.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalRequest != null) __obj.updateDynamic("originalRequest")(originalRequest.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseDefinition]
  }
}

