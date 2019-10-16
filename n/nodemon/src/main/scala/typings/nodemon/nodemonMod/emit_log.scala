package typings.nodemon.nodemonMod

import typings.nodemon.nodemonStrings.log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemon", "emit")
@js.native
object emit_log extends js.Object {
  def apply(event: log, msg: LogMessage): Boolean = js.native
}

