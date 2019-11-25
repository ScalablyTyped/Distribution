package typings.phantom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  var file: String
  var function: String
  var line: String
}

object Anon_File {
  @scala.inline
  def apply(file: String, function: String, line: String): Anon_File = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_File]
  }
}

