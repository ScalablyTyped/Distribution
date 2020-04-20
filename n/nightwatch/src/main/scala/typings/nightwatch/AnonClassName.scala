package typings.nightwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName extends js.Object {
  var className: String
  var fileName: String
  var lineNumber: Double
  var methodName: String
}

object AnonClassName {
  @scala.inline
  def apply(className: String, fileName: String, lineNumber: Double, methodName: String): AnonClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassName]
  }
}

