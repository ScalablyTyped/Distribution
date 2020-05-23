package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stdout extends js.Object {
  var stderr: typings.node.Buffer
  var stdout: typings.node.Buffer
}

object Stdout {
  @scala.inline
  def apply(stderr: typings.node.Buffer, stdout: typings.node.Buffer): Stdout = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stdout]
  }
}

