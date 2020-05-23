package typings.nightwatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassName extends js.Object {
  var className: String
  var fileName: String
  var lineNumber: Double
  var methodName: String
}

object ClassName {
  @scala.inline
  def apply(className: String, fileName: String, lineNumber: Double, methodName: String): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
}

