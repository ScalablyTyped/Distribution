package typings.nodemon.nodemonMod

import typings.nodemon.nodemonStrings.log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemon", "addListener")
@js.native
object addListener_log extends js.Object {
  def apply(event: log, listener: js.Function1[/* msg */ LogMessage, Unit]): js.Any = js.native
}

