package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StderrStdout extends js.Object {
  var stderr: Buffer
  var stdout: Buffer
}

object Anon_StderrStdout {
  @scala.inline
  def apply(stderr: Buffer, stdout: Buffer): Anon_StderrStdout = {
    val __obj = js.Dynamic.literal(stderr = stderr, stdout = stdout)
  
    __obj.asInstanceOf[Anon_StderrStdout]
  }
}

