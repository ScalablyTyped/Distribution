package typings.pleaseUpgradeNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var exitCode: Double
  def message(version: String): String
}

object Options {
  @scala.inline
  def apply(exitCode: Double, message: String => String): Options = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], message = js.Any.fromFunction1(message))
  
    __obj.asInstanceOf[Options]
  }
}

