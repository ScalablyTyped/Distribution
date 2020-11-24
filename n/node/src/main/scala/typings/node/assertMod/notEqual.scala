package typings.node.assertMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("assert", "notEqual")
@js.native
object notEqual extends js.Object {
  
  /** @deprecated since v9.9.0 - use notStrictEqual() instead. */
  def apply(actual: js.Any, expected: js.Any): Unit = js.native
  def apply(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def apply(actual: js.Any, expected: js.Any, message: Error): Unit = js.native
}
