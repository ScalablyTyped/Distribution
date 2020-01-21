package typings.nodemon.mod

import typings.node.Buffer
import typings.nodemon.nodemonStrings.stdout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemon", "on")
@js.native
object on_stdout extends js.Object {
  def apply(event: stdout, listener: js.Function1[/* data */ Buffer, Unit]): js.Any = js.native
}

