package typings.node.assertMod

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("assert", "doesNotThrow")
@js.native
object doesNotThrow extends js.Object {
  
  def apply(block: js.Function0[_]): Unit = js.native
  def apply(block: js.Function0[_], error: js.Function): Unit = js.native
  def apply(block: js.Function0[_], error: js.Function, message: String): Unit = js.native
  def apply(block: js.Function0[_], error: js.Function, message: Error): Unit = js.native
  def apply(block: js.Function0[_], error: RegExp): Unit = js.native
  def apply(block: js.Function0[_], error: RegExp, message: String): Unit = js.native
  def apply(block: js.Function0[_], error: RegExp, message: Error): Unit = js.native
  def apply(block: js.Function0[_], message: String): Unit = js.native
  def apply(block: js.Function0[_], message: Error): Unit = js.native
}
