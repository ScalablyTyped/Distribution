package typings.nes.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRequestOptions extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var path: String
  var payload: js.UndefOr[js.Any] = js.undefined
}

object ClientRequestOptions {
  @scala.inline
  def apply(path: String, headers: js.Object = null, method: String = null, payload: js.Any = null): ClientRequestOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRequestOptions]
  }
}

