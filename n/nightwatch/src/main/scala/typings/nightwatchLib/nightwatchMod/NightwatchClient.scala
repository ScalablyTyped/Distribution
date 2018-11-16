package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchClient extends js.Object {
  var api: NightwatchAPI = js.native
  @JSName("assertion")
  var assertion_Original: NightwatchAssert = js.native
  def assertion(passed: scala.Boolean): scala.Unit = js.native
  def assertion(passed: scala.Boolean, receivedValue: js.Any): scala.Unit = js.native
  def assertion(passed: scala.Boolean, receivedValue: js.Any, expectedValue: js.Any): scala.Unit = js.native
  def assertion(passed: scala.Boolean, receivedValue: js.Any, expectedValue: js.Any, message: java.lang.String): scala.Unit = js.native
  def assertion(
    passed: scala.Boolean,
    receivedValue: js.Any,
    expectedValue: js.Any,
    message: java.lang.String,
    abortOnFailure: scala.Boolean
  ): scala.Unit = js.native
  def assertion(
    passed: scala.Boolean,
    receivedValue: js.Any,
    expectedValue: js.Any,
    message: java.lang.String,
    abortOnFailure: scala.Boolean,
    originalStackTrace: java.lang.String
  ): scala.Unit = js.native
}

