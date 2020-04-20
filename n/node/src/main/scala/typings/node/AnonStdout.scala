package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStdout extends js.Object {
  var stderr: Buffer
  var stdout: Buffer
}

object AnonStdout {
  @scala.inline
  def apply(stderr: Buffer, stdout: Buffer): AnonStdout = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStdout]
  }
}

