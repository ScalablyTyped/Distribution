package typings
package nodeLib.assertMod.internalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AssertionError
  extends nodeLib.Error {
  var actual: js.Any
  var code: nodeLib.nodeLibStrings.ERR_ASSERTION
  var expected: js.Any
  var generatedMessage: scala.Boolean
  var message: java.lang.String
  var name: java.lang.String
  var operator: java.lang.String
}

