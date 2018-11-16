package typings
package numjsLib.numjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("numjs", "errors")
@js.native
object errorsNs extends js.Object {
  def ConfigError(): stdLib.Error = js.native
  def ConfigError(message: java.lang.String): stdLib.Error = js.native
  def NotImplementedError(): stdLib.Error = js.native
  def NotImplementedError(message: java.lang.String): stdLib.Error = js.native
  def ValueError(): stdLib.Error = js.native
  def ValueError(message: java.lang.String): stdLib.Error = js.native
}

