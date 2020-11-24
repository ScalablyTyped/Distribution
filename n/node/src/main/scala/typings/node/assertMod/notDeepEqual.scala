package typings.node.assertMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("assert", "notDeepEqual")
@js.native
object notDeepEqual extends js.Object {
  
  /** @deprecated since v9.9.0 - use notDeepStrictEqual() instead. */
  def apply(actual: js.Any, expected: js.Any): Unit = js.native
  def apply(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def apply(actual: js.Any, expected: js.Any, message: Error): Unit = js.native
}
