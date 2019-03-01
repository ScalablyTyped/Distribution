package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerRequest extends js.Object {
  var error: js.Any
  var locals: js.Any
  var payload: js.Any
}

object ServerRequest {
  @scala.inline
  def apply(error: js.Any, locals: js.Any, payload: js.Any): ServerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("locals")(locals)
    __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[ServerRequest]
  }
}

