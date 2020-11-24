package typings.powerAssert.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("power-assert", "throws")
@js.native
object throws extends js.Object {
  
  def apply(block: js.Function): Unit = js.native
  def apply(block: js.Function, error: js.Function): Unit = js.native
  def apply(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  def apply(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  def apply(block: js.Function, error: js.Function, message: String): Unit = js.native
  def apply(block: js.Function, error: RegExp): Unit = js.native
  def apply(block: js.Function, error: RegExp, message: String): Unit = js.native
  def apply(block: js.Function, message: String): Unit = js.native
}
