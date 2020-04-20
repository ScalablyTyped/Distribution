package typings.monacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLineEnding extends js.Object {
  var lineEnding: String
  var preserveBOM: Boolean
}

object AnonLineEnding {
  @scala.inline
  def apply(lineEnding: String, preserveBOM: Boolean): AnonLineEnding = {
    val __obj = js.Dynamic.literal(lineEnding = lineEnding.asInstanceOf[js.Any], preserveBOM = preserveBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineEnding]
  }
}

