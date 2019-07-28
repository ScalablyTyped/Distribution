package typings.postmanDashCollection

import typings.node.Buffer
import typings.postmanDashCollection.postmanDashCollectionMod.HeaderDefinition
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: String | Buffer | Uint8Array
  var elapsedTime: Double
  var headers: js.UndefOr[js.Array[HeaderDefinition]] = js.undefined
  var statusCode: Double
  var statusMessage: js.UndefOr[String] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(
    body: String | Buffer | Uint8Array,
    elapsedTime: Double,
    statusCode: Double,
    headers: js.Array[HeaderDefinition] = null,
    statusMessage: String = null
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], elapsedTime = elapsedTime, statusCode = statusCode)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    __obj.asInstanceOf[Anon_Body]
  }
}

