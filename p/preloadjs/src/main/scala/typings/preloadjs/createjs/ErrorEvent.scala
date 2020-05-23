package typings.preloadjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorEvent extends js.Object {
  // properties
  var data: js.Object
  var message: String
  var title: String
}

object ErrorEvent {
  @scala.inline
  def apply(data: js.Object, message: String, title: String): ErrorEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
}

