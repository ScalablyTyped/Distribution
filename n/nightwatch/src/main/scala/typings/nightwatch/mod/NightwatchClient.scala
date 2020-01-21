package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchClient extends js.Object {
  var api: NightwatchAPI = js.native
  @JSName("assertion")
  var assertion_Original: NightwatchAssert = js.native
  def assertion(passed: Boolean): Unit = js.native
  def assertion(passed: Boolean, receivedValue: js.Any): Unit = js.native
  def assertion(passed: Boolean, receivedValue: js.Any, expectedValue: js.Any): Unit = js.native
  def assertion(passed: Boolean, receivedValue: js.Any, expectedValue: js.Any, message: String): Unit = js.native
  def assertion(
    passed: Boolean,
    receivedValue: js.Any,
    expectedValue: js.Any,
    message: String,
    abortOnFailure: Boolean
  ): Unit = js.native
  def assertion(
    passed: Boolean,
    receivedValue: js.Any,
    expectedValue: js.Any,
    message: String,
    abortOnFailure: Boolean,
    originalStackTrace: String
  ): Unit = js.native
}

