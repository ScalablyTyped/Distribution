package typings
package powerDashAssertLib.powerDashAssertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("power-assert", "throws")
@js.native
object throws extends js.Object {
  def apply(block: js.Function): scala.Unit = js.native
  def apply(block: js.Function, error: js.Function): scala.Unit = js.native
  def apply(block: js.Function, error: js.Function1[/* err */ js.Any, scala.Boolean]): scala.Unit = js.native
  def apply(
    block: js.Function,
    error: js.Function1[/* err */ js.Any, scala.Boolean],
    message: java.lang.String
  ): scala.Unit = js.native
  def apply(block: js.Function, error: js.Function, message: java.lang.String): scala.Unit = js.native
  def apply(block: js.Function, error: stdLib.RegExp): scala.Unit = js.native
  def apply(block: js.Function, error: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  def apply(block: js.Function, message: java.lang.String): scala.Unit = js.native
}

