package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStderrStdout extends js.Object {
  var stderr: java.lang.String | Buffer
  var stdout: java.lang.String | Buffer
}

object AnonStderrStdout {
  @scala.inline
  def apply(stderr: java.lang.String | Buffer, stdout: java.lang.String | Buffer): AnonStderrStdout = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStderrStdout]
  }
}

