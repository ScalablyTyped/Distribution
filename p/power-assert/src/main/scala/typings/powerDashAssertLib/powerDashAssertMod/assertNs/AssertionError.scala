package typings
package powerDashAssertLib.powerDashAssertMod.assertNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AssertionError
  extends stdLib.Error {
  var actual: js.Any
  var expected: js.Any
  var generatedMessage: scala.Boolean
  var operator: java.lang.String
}

