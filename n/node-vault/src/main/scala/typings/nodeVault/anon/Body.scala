package typings.nodeVault.anon

import typings.nodeVault.mod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: js.Any
  var request: Option
  var statusCode: Double
}

object Body {
  @scala.inline
  def apply(body: js.Any, request: Option, statusCode: Double): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

