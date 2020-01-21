package typings.nightwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClass extends js.Object {
  var `class`: String
  var message: String
  var screen: String
  var stackTrace: js.Array[AnonClassName]
}

object AnonClass {
  @scala.inline
  def apply(`class`: String, message: String, screen: String, stackTrace: js.Array[AnonClassName]): AnonClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClass]
  }
}

