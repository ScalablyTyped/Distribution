package typings.natsDashHemera.natsDashHemeraMod

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
    val __obj = js.Dynamic.literal(error = error, payload = payload)
  
    __obj.asInstanceOf[ServerRequest]
  }
}

