package typings.prettier.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShouldBreak extends js.Object {
  var shouldBreak: Boolean
}

object ShouldBreak {
  @scala.inline
  def apply(shouldBreak: Boolean): ShouldBreak = {
    val __obj = js.Dynamic.literal(shouldBreak = shouldBreak.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldBreak]
  }
}

