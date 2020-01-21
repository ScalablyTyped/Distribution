package typings.nodemon.mod

import typings.nodemon.nodemonStrings.log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemon", "on")
@js.native
object on_log extends js.Object {
  def apply(event: log, listener: js.Function1[/* msg */ LogMessage, Unit]): js.Any = js.native
}

