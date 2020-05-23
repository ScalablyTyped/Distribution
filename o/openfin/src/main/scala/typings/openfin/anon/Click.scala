package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Click extends js.Object {
  var click: String
  var close: String
  var error: String
  var message: String
  var show: String
}

object Click {
  @scala.inline
  def apply(click: String, close: String, error: String, message: String, show: String): Click = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Click]
  }
}

