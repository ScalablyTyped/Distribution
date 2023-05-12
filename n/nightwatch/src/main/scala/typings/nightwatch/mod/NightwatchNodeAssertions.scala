package typings.nightwatch.mod

import typings.nightwatch.anon.AwaitableNightwatchAPINigBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchNodeAssertions extends StObject {
  
  def deepEqual(actual: Any, expected: Any): AwaitableNightwatchAPINigBack = js.native
  def deepEqual(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBack = js.native
  def deepEqual(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBack = js.native
  
  def deepStrictEqual(actual: Any, expected: Any): AwaitableNightwatchAPINigBack = js.native
  def deepStrictEqual(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBack = js.native
  def deepStrictEqual(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBack = js.native
  
  def doesNotMatch(value: String, regExp: js.RegExp): AwaitableNightwatchAPINigBack = js.native
  def doesNotMatch(value: String, regExp: js.RegExp, message: String): AwaitableNightwatchAPINigBack = js.native
  def doesNotMatch(value: String, regExp: js.RegExp, message: js.Error): AwaitableNightwatchAPINigBack = js.native
  
  def doesNotReject(block: js.Function0[js.Promise[Any]]): AwaitableNightwatchAPINigBack = js.native
  def doesNotReject(block: js.Function0[js.Promise[Any]], message: String): AwaitableNightwatchAPINigBack = js.native
  def doesNotReject(block: js.Function0[js.Promise[Any]], message: js.Error): AwaitableNightwatchAPINigBack = js.native
  def doesNotReject(block: js.Promise[Any]): AwaitableNightwatchAPINigBack = js.native
  def doesNotReject(block: js.Promise[Any], message: String): AwaitableNightwatchAPINigBack = js.native
  def doesNotReject(block: js.Promise[Any], message: js.Error): AwaitableNightwatchAPINigBack = js.native
  
  def doesNotThrow(block: js.Function0[Any]): AwaitableNightwatchAPINigBack = js.native
  def doesNotThrow(block: js.Function0[Any], message: String): AwaitableNightwatchAPINigBack = js.native
  def doesNotThrow(block: js.Function0[Any], message: js.Error): AwaitableNightwatchAPINigBack = js.native
  
  def equal(actual: Any, expected: Any): AwaitableNightwatchAPINigBack = js.native
  def equal(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBack = js.native
  def equal(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBack = js.native
  
  // The following definitions are taken from @types/assert
  def fail(): AwaitableNightwatchAPINigBack = js.native
  def fail(actual: Any, expected: Any): AwaitableNightwatchAPINigBack = js.native
  def fail(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBack = js.native
  def fail(actual: Any, expected: Any, message: String, operator: String): AwaitableNightwatchAPINigBack = js.native
  def fail(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBack = js.native
  def fail(actual: Any, expected: Any, message: js.Error, operator: String): AwaitableNightwatchAPINigBack = js.native
  def fail(actual: Any, expected: Any, message: Unit, operator: String): AwaitableNightwatchAPINigBack = js.native
  def fail(message: String): AwaitableNightwatchAPINigBack = js.native
  def fail(message: js.Error): AwaitableNightwatchAPINigBack = js.native
  
  def ifError(value: Any): AwaitableNightwatchAPINigBack = js.native
  
  def `match`(value: String, regExp: js.RegExp): AwaitableNightwatchAPINigBack = js.native
  def `match`(value: String, regExp: js.RegExp, message: String): AwaitableNightwatchAPINigBack = js.native
  def `match`(value: String, regExp: js.RegExp, message: js.Error): AwaitableNightwatchAPINigBack = js.native
  
  def notDeepEqual(actual: Any, expected: Any): AwaitableNightwatchAPINigBack = js.native
  def notDeepEqual(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBack = js.native
  def notDeepEqual(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBack = js.native
  
  def notDeepStrictEqual(actual: Any, expected: Any): AwaitableNightwatchAPINigBack = js.native
  def notDeepStrictEqual(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBack = js.native
  def notDeepStrictEqual(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBack = js.native
  
  def notEqual(actual: Any, expected: Any): AwaitableNightwatchAPINigBack = js.native
  def notEqual(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBack = js.native
  def notEqual(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBack = js.native
  
  def notStrictEqual(actual: Any, expected: Any): AwaitableNightwatchAPINigBack = js.native
  def notStrictEqual(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBack = js.native
  def notStrictEqual(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBack = js.native
  
  def ok(value: Any): AwaitableNightwatchAPINigBack = js.native
  def ok(value: Any, message: String): AwaitableNightwatchAPINigBack = js.native
  def ok(value: Any, message: js.Error): AwaitableNightwatchAPINigBack = js.native
  
  def rejects(block: js.Function0[js.Promise[Any]]): AwaitableNightwatchAPINigBack = js.native
  def rejects(block: js.Function0[js.Promise[Any]], message: String): AwaitableNightwatchAPINigBack = js.native
  def rejects(block: js.Function0[js.Promise[Any]], message: js.Error): AwaitableNightwatchAPINigBack = js.native
  def rejects(block: js.Promise[Any]): AwaitableNightwatchAPINigBack = js.native
  def rejects(block: js.Promise[Any], message: String): AwaitableNightwatchAPINigBack = js.native
  def rejects(block: js.Promise[Any], message: js.Error): AwaitableNightwatchAPINigBack = js.native
  
  def strictEqual(actual: Any, expected: Any): AwaitableNightwatchAPINigBack = js.native
  def strictEqual(actual: Any, expected: Any, message: String): AwaitableNightwatchAPINigBack = js.native
  def strictEqual(actual: Any, expected: Any, message: js.Error): AwaitableNightwatchAPINigBack = js.native
  
  def throws(block: js.Function0[Any]): AwaitableNightwatchAPINigBack = js.native
  def throws(block: js.Function0[Any], message: String): AwaitableNightwatchAPINigBack = js.native
  def throws(block: js.Function0[Any], message: js.Error): AwaitableNightwatchAPINigBack = js.native
}
