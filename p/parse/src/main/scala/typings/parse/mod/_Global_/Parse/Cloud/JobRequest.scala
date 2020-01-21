package typings.parse.mod._Global_.Parse.Cloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobRequest extends js.Object {
  var params: js.Any
  def message(response: js.Any): Unit
}

object JobRequest {
  @scala.inline
  def apply(message: js.Any => Unit, params: js.Any): JobRequest = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction1(message), params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobRequest]
  }
}

