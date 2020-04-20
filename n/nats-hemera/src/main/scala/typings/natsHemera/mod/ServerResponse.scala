package typings.natsHemera.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerResponse extends js.Object {
  var error: Error
  var payload: HemeraMessagePayload
}

object ServerResponse {
  @scala.inline
  def apply(error: Error, payload: HemeraMessagePayload): ServerResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerResponse]
  }
}

