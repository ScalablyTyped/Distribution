package typings.nightwatch.mod

import typings.nightwatch.anon.AwaitableNightwatchAPINigBrowserName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchNodeAssertions extends StObject {
  
  def deepEqual(actual: Any, expected: Any): AwaitableNightwatchAPINigBrowserName = js.native
  def deepEqual(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def deepEqual(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  
  def deepStrictEqual(actual: Any, expected: Any): AwaitableNightwatchAPINigBrowserName = js.native
  def deepStrictEqual(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def deepStrictEqual(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  
  def doesNotMatch(value: String, regExp: js.RegExp): AwaitableNightwatchAPINigBrowserName = js.native
  def doesNotMatch(value: String, regExp: js.RegExp, message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def doesNotMatch(value: String, regExp: js.RegExp, message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  
  def doesNotReject(block: js.Function0[js.Promise[Any]]): AwaitableNightwatchAPINigBrowserName = js.native
  def doesNotReject(block: js.Function0[js.Promise[Any]], message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def doesNotReject(block: js.Function0[js.Promise[Any]], message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  def doesNotReject(block: js.Promise[Any]): AwaitableNightwatchAPINigBrowserName = js.native
  def doesNotReject(block: js.Promise[Any], message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def doesNotReject(block: js.Promise[Any], message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  
  def doesNotThrow(block: js.Function0[Any]): AwaitableNightwatchAPINigBrowserName = js.native
  def doesNotThrow(block: js.Function0[Any], message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def doesNotThrow(block: js.Function0[Any], message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  
  def equal(actual: Any, expected: Any): AwaitableNightwatchAPINigBrowserName = js.native
  def equal(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def equal(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  
  // The following definitions are taken from @types/assert
  def fail(): AwaitableNightwatchAPINigBrowserName = js.native
  def fail(actual: Any, expected: Any): AwaitableNightwatchAPINigBrowserName = js.native
  def fail(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def fail(actual: Any, expected: Any, message: String, operator: String): AwaitableNightwatchAPINigBrowserName = js.native
  def fail(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  def fail(actual: Any, expected: Any, message: js.Error, operator: String): AwaitableNightwatchAPINigBrowserName = js.native
  def fail(actual: Any, expected: Any, message: Unit, operator: String): AwaitableNightwatchAPINigBrowserName = js.native
  def fail(message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def fail(message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  
  def ifError(value: Any): AwaitableNightwatchAPINigBrowserName = js.native
  
  def `match`(value: String, regExp: js.RegExp): AwaitableNightwatchAPINigBrowserName = js.native
  def `match`(value: String, regExp: js.RegExp, message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def `match`(value: String, regExp: js.RegExp, message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  
  def notDeepEqual(actual: Any, expected: Any): AwaitableNightwatchAPINigBrowserName = js.native
  def notDeepEqual(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def notDeepEqual(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  
  def notDeepStrictEqual(actual: Any, expected: Any): AwaitableNightwatchAPINigBrowserName = js.native
  def notDeepStrictEqual(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def notDeepStrictEqual(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  
  def notEqual(actual: Any, expected: Any): AwaitableNightwatchAPINigBrowserName = js.native
  def notEqual(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def notEqual(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  
  def notStrictEqual(actual: Any, expected: Any): AwaitableNightwatchAPINigBrowserName = js.native
  def notStrictEqual(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def notStrictEqual(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  
  def ok(value: Any): AwaitableNightwatchAPINigBrowserName = js.native
  def ok(value: Any, message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def ok(value: Any, message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  
  def rejects(block: js.Function0[js.Promise[Any]]): AwaitableNightwatchAPINigBrowserName = js.native
  def rejects(block: js.Function0[js.Promise[Any]], message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def rejects(block: js.Function0[js.Promise[Any]], message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  def rejects(block: js.Promise[Any]): AwaitableNightwatchAPINigBrowserName = js.native
  def rejects(block: js.Promise[Any], message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def rejects(block: js.Promise[Any], message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  
  def strictEqual(actual: Any, expected: Any): AwaitableNightwatchAPINigBrowserName = js.native
  def strictEqual(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def strictEqual(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
  
  def throws(block: js.Function0[Any]): AwaitableNightwatchAPINigBrowserName = js.native
  def throws(block: js.Function0[Any], message: String): AwaitableNightwatchAPINigBrowserName = js.native
  def throws(block: js.Function0[Any], message: js.Error): AwaitableNightwatchAPINigBrowserName = js.native
}
