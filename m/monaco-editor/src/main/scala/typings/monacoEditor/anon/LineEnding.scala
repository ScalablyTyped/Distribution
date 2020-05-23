package typings.monacoEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineEnding extends js.Object {
  var lineEnding: String
  var preserveBOM: Boolean
}

object LineEnding {
  @scala.inline
  def apply(lineEnding: String, preserveBOM: Boolean): LineEnding = {
    val __obj = js.Dynamic.literal(lineEnding = lineEnding.asInstanceOf[js.Any], preserveBOM = preserveBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineEnding]
  }
}

