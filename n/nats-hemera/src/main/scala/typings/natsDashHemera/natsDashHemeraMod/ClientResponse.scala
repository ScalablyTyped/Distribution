package typings.natsDashHemera.natsDashHemeraMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientResponse extends js.Object {
  var error: Error
  var payload: HemeraMessagePayload
}

object ClientResponse {
  @scala.inline
  def apply(error: Error, payload: HemeraMessagePayload): ClientResponse = {
    val __obj = js.Dynamic.literal(error = error, payload = payload)
  
    __obj.asInstanceOf[ClientResponse]
  }
}

