package typings.postmanCollection

import typings.node.Buffer
import typings.postmanCollection.mod.HeaderDefinition
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: String | Buffer | Uint8Array
  var elapsedTime: Double
  var headers: js.UndefOr[js.Array[HeaderDefinition]] = js.undefined
  var statusCode: Double
  var statusMessage: js.UndefOr[String] = js.undefined
}

object AnonBody {
  @scala.inline
  def apply(
    body: String | Buffer | Uint8Array,
    elapsedTime: Double,
    statusCode: Double,
    headers: js.Array[HeaderDefinition] = null,
    statusMessage: String = null
  ): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

