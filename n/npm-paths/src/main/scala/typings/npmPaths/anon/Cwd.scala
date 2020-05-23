package typings.npmPaths.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cwd extends js.Object {
  var cwd: String
}

object Cwd {
  @scala.inline
  def apply(cwd: String): Cwd = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cwd]
  }
}

