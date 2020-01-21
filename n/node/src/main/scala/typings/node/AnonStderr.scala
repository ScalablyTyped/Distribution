package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStderr extends js.Object {
  var stderr: java.lang.String
  var stdout: java.lang.String
}

object AnonStderr {
  @scala.inline
  def apply(stderr: java.lang.String, stdout: java.lang.String): AnonStderr = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStderr]
  }
}

