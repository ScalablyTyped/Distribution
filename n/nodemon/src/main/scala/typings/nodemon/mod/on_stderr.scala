package typings.nodemon.mod

import typings.node.Buffer
import typings.nodemon.nodemonStrings.stderr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemon", "on")
@js.native
object on_stderr extends js.Object {
  def apply(event: stderr, listener: js.Function1[/* data */ Buffer, Unit]): js.Any = js.native
}

