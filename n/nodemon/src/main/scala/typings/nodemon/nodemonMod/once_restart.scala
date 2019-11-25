package typings.nodemon.nodemonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemon", "once")
@js.native
object once_restart extends js.Object {
  def apply(
    event: typings.nodemon.nodemonStrings.restart,
    listener: js.Function1[/* files */ js.UndefOr[js.Array[String]], Unit]
  ): js.Any = js.native
}

