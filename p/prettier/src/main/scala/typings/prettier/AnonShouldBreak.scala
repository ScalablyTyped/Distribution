package typings.prettier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShouldBreak extends js.Object {
  var shouldBreak: Boolean
}

object AnonShouldBreak {
  @scala.inline
  def apply(shouldBreak: Boolean): AnonShouldBreak = {
    val __obj = js.Dynamic.literal(shouldBreak = shouldBreak.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonShouldBreak]
  }
}

