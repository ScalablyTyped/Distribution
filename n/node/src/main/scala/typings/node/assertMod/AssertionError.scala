package typings.node.assertMod

import typings.node.Anon_Actual
import typings.node.Error
import typings.node.nodeStrings.ERR_ASSERTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("assert", "AssertionError")
@js.native
class AssertionError () extends Error {
  def this(options: Anon_Actual) = this()
  var actual: js.Any = js.native
  var code: ERR_ASSERTION = js.native
  var expected: js.Any = js.native
  var generatedMessage: Boolean = js.native
  var message: java.lang.String = js.native
  var name: java.lang.String = js.native
  var operator: java.lang.String = js.native
}

