package typings.mu2.mu2Mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mu2", "compile")
@js.native
object compile extends js.Object {
  def apply(filename: String, callback: js.Function2[/* err */ Error, /* parsed */ IParsed, Unit]): Unit = js.native
}

