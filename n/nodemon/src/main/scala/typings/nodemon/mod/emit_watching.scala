package typings.nodemon.mod

import typings.nodemon.nodemonStrings.watching
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemon", "emit")
@js.native
object emit_watching extends js.Object {
  def apply(event: watching, listener: js.Function1[/* file */ String, Unit]): Boolean = js.native
}

