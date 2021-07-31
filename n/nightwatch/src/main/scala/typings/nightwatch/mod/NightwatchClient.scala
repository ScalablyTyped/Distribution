package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchClient extends StObject {
  
  var api: NightwatchAPI
  
  def assertion(passed: Boolean): Unit
  def assertion(passed: Boolean, receivedValue: js.Any): Unit
  def assertion(passed: Boolean, receivedValue: js.Any, expectedValue: js.Any): Unit
  def assertion(passed: Boolean, receivedValue: js.Any, expectedValue: js.Any, message: String): Unit
  def assertion(
    passed: Boolean,
    receivedValue: js.Any,
    expectedValue: js.Any,
    message: String,
    abortOnFailure: Boolean
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: js.Any,
    expectedValue: js.Any,
    message: String,
    abortOnFailure: Boolean,
    originalStackTrace: String
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: js.Any,
    expectedValue: js.Any,
    message: String,
    abortOnFailure: Unit,
    originalStackTrace: String
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: js.Any,
    expectedValue: js.Any,
    message: Unit,
    abortOnFailure: Boolean
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: js.Any,
    expectedValue: js.Any,
    message: Unit,
    abortOnFailure: Boolean,
    originalStackTrace: String
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: js.Any,
    expectedValue: js.Any,
    message: Unit,
    abortOnFailure: Unit,
    originalStackTrace: String
  ): Unit
  def assertion(passed: Boolean, receivedValue: js.Any, expectedValue: Unit, message: String): Unit
  def assertion(
    passed: Boolean,
    receivedValue: js.Any,
    expectedValue: Unit,
    message: String,
    abortOnFailure: Boolean
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: js.Any,
    expectedValue: Unit,
    message: String,
    abortOnFailure: Boolean,
    originalStackTrace: String
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: js.Any,
    expectedValue: Unit,
    message: String,
    abortOnFailure: Unit,
    originalStackTrace: String
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: js.Any,
    expectedValue: Unit,
    message: Unit,
    abortOnFailure: Boolean
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: js.Any,
    expectedValue: Unit,
    message: Unit,
    abortOnFailure: Boolean,
    originalStackTrace: String
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: js.Any,
    expectedValue: Unit,
    message: Unit,
    abortOnFailure: Unit,
    originalStackTrace: String
  ): Unit
  def assertion(passed: Boolean, receivedValue: Unit, expectedValue: js.Any): Unit
  def assertion(passed: Boolean, receivedValue: Unit, expectedValue: js.Any, message: String): Unit
  def assertion(
    passed: Boolean,
    receivedValue: Unit,
    expectedValue: js.Any,
    message: String,
    abortOnFailure: Boolean
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: Unit,
    expectedValue: js.Any,
    message: String,
    abortOnFailure: Boolean,
    originalStackTrace: String
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: Unit,
    expectedValue: js.Any,
    message: String,
    abortOnFailure: Unit,
    originalStackTrace: String
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: Unit,
    expectedValue: js.Any,
    message: Unit,
    abortOnFailure: Boolean
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: Unit,
    expectedValue: js.Any,
    message: Unit,
    abortOnFailure: Boolean,
    originalStackTrace: String
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: Unit,
    expectedValue: js.Any,
    message: Unit,
    abortOnFailure: Unit,
    originalStackTrace: String
  ): Unit
  def assertion(passed: Boolean, receivedValue: Unit, expectedValue: Unit, message: String): Unit
  def assertion(
    passed: Boolean,
    receivedValue: Unit,
    expectedValue: Unit,
    message: String,
    abortOnFailure: Boolean
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: Unit,
    expectedValue: Unit,
    message: String,
    abortOnFailure: Boolean,
    originalStackTrace: String
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: Unit,
    expectedValue: Unit,
    message: String,
    abortOnFailure: Unit,
    originalStackTrace: String
  ): Unit
  def assertion(passed: Boolean, receivedValue: Unit, expectedValue: Unit, message: Unit, abortOnFailure: Boolean): Unit
  def assertion(
    passed: Boolean,
    receivedValue: Unit,
    expectedValue: Unit,
    message: Unit,
    abortOnFailure: Boolean,
    originalStackTrace: String
  ): Unit
  def assertion(
    passed: Boolean,
    receivedValue: Unit,
    expectedValue: Unit,
    message: Unit,
    abortOnFailure: Unit,
    originalStackTrace: String
  ): Unit
  @JSName("assertion")
  var assertion_Original: NightwatchAssert
}
object NightwatchClient {
  
  @scala.inline
  def apply(
    api: NightwatchAPI,
    assertion: (/* passed */ Boolean, /* receivedValue */ js.UndefOr[js.Any], /* expectedValue */ js.UndefOr[js.Any], /* message */ js.UndefOr[String], /* abortOnFailure */ js.UndefOr[Boolean], /* originalStackTrace */ js.UndefOr[String]) => Unit
  ): NightwatchClient = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], assertion = js.Any.fromFunction6(assertion))
    __obj.asInstanceOf[NightwatchClient]
  }
  
  @scala.inline
  implicit class NightwatchClientMutableBuilder[Self <: NightwatchClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi(value: NightwatchAPI): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertion(
      value: (/* passed */ Boolean, /* receivedValue */ js.UndefOr[js.Any], /* expectedValue */ js.UndefOr[js.Any], /* message */ js.UndefOr[String], /* abortOnFailure */ js.UndefOr[Boolean], /* originalStackTrace */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "assertion", js.Any.fromFunction6(value))
  }
}
