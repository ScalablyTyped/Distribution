package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchAssertionsError extends js.Object {
  var message: java.lang.String
  var name: java.lang.String
  var showDiff: scala.Boolean
  var stack: java.lang.String
}

object NightwatchAssertionsError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    showDiff: scala.Boolean,
    stack: java.lang.String
  ): NightwatchAssertionsError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("showDiff")(showDiff)
    __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[NightwatchAssertionsError]
  }
}

