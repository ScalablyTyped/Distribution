package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerResponse extends js.Object {
  var error: js.Any
  var payload: js.Any
}

object ServerResponse {
  @scala.inline
  def apply(error: js.Any, payload: js.Any): ServerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[ServerResponse]
  }
}

