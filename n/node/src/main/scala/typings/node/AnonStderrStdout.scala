package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStderrStdout extends js.Object {
  var stderr: Buffer
  var stdout: Buffer
}

object AnonStderrStdout {
  @scala.inline
  def apply(stderr: Buffer, stdout: Buffer): AnonStderrStdout = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStderrStdout]
  }
}

