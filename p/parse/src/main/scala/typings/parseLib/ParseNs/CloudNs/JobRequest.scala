package typings
package parseLib.ParseNs.CloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobRequest extends js.Object {
  var params: js.Any
  def message(response: js.Any): scala.Unit
}

object JobRequest {
  @scala.inline
  def apply(message: js.Function1[js.Any, scala.Unit], params: js.Any): JobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[JobRequest]
  }
}

