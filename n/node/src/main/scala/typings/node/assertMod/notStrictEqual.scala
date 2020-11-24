package typings.node.assertMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("assert", "notStrictEqual")
@js.native
object notStrictEqual extends js.Object {
  
  def apply(actual: js.Any, expected: js.Any): Unit = js.native
  def apply(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def apply(actual: js.Any, expected: js.Any, message: Error): Unit = js.native
}
