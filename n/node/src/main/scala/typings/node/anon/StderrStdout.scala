package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StderrStdout extends js.Object {
  var stderr: String | typings.node.Buffer
  var stdout: String | typings.node.Buffer
}

object StderrStdout {
  @scala.inline
  def apply(stderr: String | typings.node.Buffer, stdout: String | typings.node.Buffer): StderrStdout = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[StderrStdout]
  }
}

