package typings
package phantomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  var file: java.lang.String
  var function: java.lang.String
  var line: java.lang.String
}

object Anon_File {
  @scala.inline
  def apply(file: java.lang.String, function: java.lang.String, line: java.lang.String): Anon_File = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("function")(function)
    __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[Anon_File]
  }
}

