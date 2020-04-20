package typings.natsHemera.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerRequest extends js.Object {
  var error: Error
  var payload: HemeraMessagePayload
}

object ServerRequest {
  @scala.inline
  def apply(error: Error, payload: HemeraMessagePayload): ServerRequest = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerRequest]
  }
}

