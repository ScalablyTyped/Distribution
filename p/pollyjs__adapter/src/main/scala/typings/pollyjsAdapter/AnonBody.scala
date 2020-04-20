package typings.pollyjsAdapter

import typings.pollyjsCore.mod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: String
  var headers: Headers
  var statusCode: Double
}

object AnonBody {
  @scala.inline
  def apply(body: String, headers: Headers, statusCode: Double): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

