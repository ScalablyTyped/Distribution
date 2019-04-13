package typings
package nodeLib.assertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("assert", "AssertionError")
@js.native
class AssertionError ()
  extends nodeLib.Error {
  def this(options: nodeLib.Anon_Actual) = this()
  var actual: js.Any = js.native
  var code: nodeLib.nodeLibStrings.ERR_ASSERTION = js.native
  var expected: js.Any = js.native
  var generatedMessage: scala.Boolean = js.native
  var message: java.lang.String = js.native
  var name: java.lang.String = js.native
  var operator: java.lang.String = js.native
}

