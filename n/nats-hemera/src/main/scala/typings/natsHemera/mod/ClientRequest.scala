package typings.natsHemera.mod

import typings.natsHemera.AnonExpectedMessages
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRequest extends js.Object {
  var error: Error
  var pattern: ClientPattern
  var payload: HemeraMessagePayload
  var transport: AnonExpectedMessages
}

object ClientRequest {
  @scala.inline
  def apply(
    error: Error,
    pattern: ClientPattern,
    payload: HemeraMessagePayload,
    transport: AnonExpectedMessages
  ): ClientRequest = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRequest]
  }
}

