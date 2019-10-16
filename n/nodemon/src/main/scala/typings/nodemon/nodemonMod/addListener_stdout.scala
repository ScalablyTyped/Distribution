package typings.nodemon.nodemonMod

import typings.node.Buffer
import typings.nodemon.nodemonStrings.stdout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemon", "addListener")
@js.native
object addListener_stdout extends js.Object {
  def apply(event: stdout, listener: js.Function1[/* data */ Buffer, Unit]): js.Any = js.native
}

