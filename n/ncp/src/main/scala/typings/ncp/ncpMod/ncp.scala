package typings.ncp.ncpMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ncp", "ncp")
@js.native
object ncp extends js.Object {
  def apply(source: String, destination: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(
    source: String,
    destination: String,
    options: Options,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
}

