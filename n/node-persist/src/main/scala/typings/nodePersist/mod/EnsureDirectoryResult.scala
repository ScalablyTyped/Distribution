package typings.nodePersist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnsureDirectoryResult extends js.Object {
  var dir: String
}

object EnsureDirectoryResult {
  @scala.inline
  def apply(dir: String): EnsureDirectoryResult = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnsureDirectoryResult]
  }
}

