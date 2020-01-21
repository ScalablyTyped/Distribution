package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchAssertionsError extends js.Object {
  var message: String
  var name: String
  var showDiff: Boolean
  var stack: String
}

object NightwatchAssertionsError {
  @scala.inline
  def apply(message: String, name: String, showDiff: Boolean, stack: String): NightwatchAssertionsError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], showDiff = showDiff.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NightwatchAssertionsError]
  }
}

