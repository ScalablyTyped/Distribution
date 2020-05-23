package typings.pollyjsAdapter.anon

import typings.pollyjsCore.mod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: String
  var headers: Headers
  var statusCode: Double
}

object Body {
  @scala.inline
  def apply(body: String, headers: Headers, statusCode: Double): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

