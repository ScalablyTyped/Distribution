package typings.natsDashHemera.natsDashHemeraMod

import typings.natsDashHemera.Anon_ExpectedMessages
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRequest extends js.Object {
  var error: Error
  var pattern: ClientPattern
  var payload: HemeraMessagePayload
  var transport: Anon_ExpectedMessages
}

object ClientRequest {
  @scala.inline
  def apply(
    error: Error,
    pattern: ClientPattern,
    payload: HemeraMessagePayload,
    transport: Anon_ExpectedMessages
  ): ClientRequest = {
    val __obj = js.Dynamic.literal(error = error, pattern = pattern, payload = payload, transport = transport)
  
    __obj.asInstanceOf[ClientRequest]
  }
}

