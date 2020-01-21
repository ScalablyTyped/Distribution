package typings.phantom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFile extends js.Object {
  var file: String
  var function: String
  var line: String
}

object AnonFile {
  @scala.inline
  def apply(file: String, function: String, line: String): AnonFile = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFile]
  }
}

