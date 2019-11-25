package typings.natsDashHemera.natsDashHemeraMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HemeraMessagePayload extends js.Object {
  var error: Error | Null
  var meta: js.Any
  var request: Request$
  var result: js.Any
  var trace: Trace$
}

object HemeraMessagePayload {
  @scala.inline
  def apply(meta: js.Any, request: Request$, result: js.Any, trace: Trace$, error: Error = null): HemeraMessagePayload = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[HemeraMessagePayload]
  }
}

