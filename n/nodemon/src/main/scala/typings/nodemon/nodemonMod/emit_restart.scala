package typings.nodemon.nodemonMod

import typings.nodemon.nodemonStrings.restart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemon", "emit")
@js.native
object emit_restart extends js.Object {
  def apply(event: restart): Boolean = js.native
  def apply(event: restart, files: js.Array[String]): Boolean = js.native
}

