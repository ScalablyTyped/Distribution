package typings.ncp.ncpMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ncp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ncp(source: String, destination: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def ncp(
    source: String,
    destination: String,
    options: Options,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
}

