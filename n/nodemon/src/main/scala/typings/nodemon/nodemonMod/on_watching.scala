package typings.nodemon.nodemonMod

import typings.nodemon.nodemonStrings.watching
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemon", "on")
@js.native
object on_watching extends js.Object {
  def apply(event: watching, listener: js.Function1[/* file */ String, Unit]): js.Any = js.native
}

