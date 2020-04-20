package typings.openfin.externalProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExitCode extends js.Object {
  var exitCode: Double
  var topic: String
  var uuid: String
}

object ExitCode {
  @scala.inline
  def apply(exitCode: Double, topic: String, uuid: String): ExitCode = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitCode]
  }
}

