package typings.node.assertMod

import typings.node.anon.Actual
import typings.node.nodeStrings.ERR_ASSERTION
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("assert", "AssertionError")
@js.native
class AssertionError () extends Error {
  def this(options: Actual) = this()
  
  var actual: js.Any = js.native
  
  var code: ERR_ASSERTION = js.native
  
  var expected: js.Any = js.native
  
  var generatedMessage: Boolean = js.native
  
  var operator: String = js.native
}
