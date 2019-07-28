package typings.numjs.numjsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("numjs", "errors")
@js.native
object errorsNs extends js.Object {
  def ConfigError(): Error = js.native
  def ConfigError(message: String): Error = js.native
  def NotImplementedError(): Error = js.native
  def NotImplementedError(message: String): Error = js.native
  def ValueError(): Error = js.native
  def ValueError(message: String): Error = js.native
}

