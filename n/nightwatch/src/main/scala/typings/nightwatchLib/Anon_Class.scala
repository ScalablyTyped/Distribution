package typings
package nightwatchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Class extends js.Object {
  var `class`: java.lang.String
  var message: java.lang.String
  var screen: java.lang.String
  var stackTrace: js.Array[Anon_ClassName]
}

object Anon_Class {
  @scala.inline
  def apply(
    `class`: java.lang.String,
    message: java.lang.String,
    screen: java.lang.String,
    stackTrace: js.Array[Anon_ClassName]
  ): Anon_Class = {
    val __obj = js.Dynamic.literal(message = message, screen = screen, stackTrace = stackTrace)
    __obj.updateDynamic("class")(`class`)
    __obj.asInstanceOf[Anon_Class]
  }
}

