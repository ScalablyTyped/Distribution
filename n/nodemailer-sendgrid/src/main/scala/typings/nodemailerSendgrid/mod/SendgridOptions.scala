package typings.nodemailerSendgrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendgridOptions extends js.Object {
  var apiKey: String
}

object SendgridOptions {
  @scala.inline
  def apply(apiKey: String): SendgridOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendgridOptions]
  }
}

