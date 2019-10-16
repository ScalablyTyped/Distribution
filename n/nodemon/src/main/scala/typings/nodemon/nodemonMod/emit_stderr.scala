package typings.nodemon.nodemonMod

import typings.node.Buffer
import typings.nodemon.nodemonStrings.stderr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemon", "emit")
@js.native
object emit_stderr extends js.Object {
  def apply(event: stderr, data: Buffer): Boolean = js.native
}

