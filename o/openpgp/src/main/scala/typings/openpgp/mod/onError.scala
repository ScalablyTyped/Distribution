package typings.openpgp.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "onError")
@js.native
object onError extends js.Object {
  def apply(message: String, error: Error): Unit = js.native
}

