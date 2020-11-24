package typings.node.assertMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("assert", "throws")
@js.native
object throws extends js.Object {
  
  def apply(block: js.Function0[_]): Unit = js.native
  def apply(block: js.Function0[_], error: AssertPredicate): Unit = js.native
  def apply(block: js.Function0[_], error: AssertPredicate, message: String): Unit = js.native
  def apply(block: js.Function0[_], error: AssertPredicate, message: Error): Unit = js.native
  def apply(block: js.Function0[_], message: String): Unit = js.native
  def apply(block: js.Function0[_], message: Error): Unit = js.native
}
