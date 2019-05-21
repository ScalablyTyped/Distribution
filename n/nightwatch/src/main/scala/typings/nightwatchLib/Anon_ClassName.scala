package typings
package nightwatchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: java.lang.String
  var fileName: java.lang.String
  var lineNumber: scala.Double
  var methodName: java.lang.String
}

object Anon_ClassName {
  @scala.inline
  def apply(
    className: java.lang.String,
    fileName: java.lang.String,
    lineNumber: scala.Double,
    methodName: java.lang.String
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal(className = className, fileName = fileName, lineNumber = lineNumber, methodName = methodName)
  
    __obj.asInstanceOf[Anon_ClassName]
  }
}

