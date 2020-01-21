package typings.npmPaths

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCwd extends js.Object {
  var cwd: String
}

object AnonCwd {
  @scala.inline
  def apply(cwd: String): AnonCwd = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCwd]
  }
}

