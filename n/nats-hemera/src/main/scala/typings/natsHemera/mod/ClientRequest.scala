package typings.natsHemera.mod

import typings.natsHemera.anon.ExpectedMessages
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRequest extends js.Object {
  var error: Error
  var pattern: ClientPattern
  var payload: HemeraMessagePayload
  var transport: ExpectedMessages
}

object ClientRequest {
  @scala.inline
  def apply(error: Error, pattern: ClientPattern, payload: HemeraMessagePayload, transport: ExpectedMessages): ClientRequest = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRequest]
  }
}

