package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ActualAssertionError extends js.Object {
  var AssertionError: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[/* options */ Anon_Actual], 
    nodeLib.assertMod.internalNs.AssertionError
  ] = js.native
  /** @deprecated since v9.9.0 - use deepStrictEqual() instead. */
  def deepEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: Error): scala.Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: Error): scala.Unit = js.native
  def doesNotReject(block: js.Function): js.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Function, error: js.Function): js.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Function, error: js.Function, message: java.lang.String): js.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Function, error: js.Function, message: Error): js.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Function, error: stdLib.RegExp): js.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Function, error: stdLib.RegExp, message: java.lang.String): js.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Function, error: stdLib.RegExp, message: Error): js.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Function, message: java.lang.String): js.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Function, message: Error): js.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Promise[_]): js.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: js.Function): js.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: js.Function, message: java.lang.String): js.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: js.Function, message: Error): js.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: stdLib.RegExp): js.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: stdLib.RegExp, message: java.lang.String): js.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Promise[_], error: stdLib.RegExp, message: Error): js.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Promise[_], message: java.lang.String): js.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Promise[_], message: Error): js.Promise[scala.Unit] = js.native
  def doesNotThrow(block: js.Function): scala.Unit = js.native
  def doesNotThrow(block: js.Function, error: js.Function): scala.Unit = js.native
  def doesNotThrow(block: js.Function, error: js.Function, message: java.lang.String): scala.Unit = js.native
  def doesNotThrow(block: js.Function, error: js.Function, message: Error): scala.Unit = js.native
  def doesNotThrow(block: js.Function, error: stdLib.RegExp): scala.Unit = js.native
  def doesNotThrow(block: js.Function, error: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  def doesNotThrow(block: js.Function, error: stdLib.RegExp, message: Error): scala.Unit = js.native
  def doesNotThrow(block: js.Function, message: java.lang.String): scala.Unit = js.native
  def doesNotThrow(block: js.Function, message: Error): scala.Unit = js.native
  /** @deprecated since v9.9.0 - use strictEqual() instead. */
  def equal(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: Error): scala.Unit = js.native
  def fail(): scala.Nothing = js.native
  /** @deprecated since v10.0.0 - use fail([message]) or other assert functions instead. */
  def fail(actual: js.Any, expected: js.Any): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String, operator: java.lang.String): scala.Nothing = js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: java.lang.String,
    operator: java.lang.String,
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: Error): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: Error, operator: java.lang.String): scala.Nothing = js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: Error,
    operator: java.lang.String,
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  def fail(message: java.lang.String): scala.Nothing = js.native
  def fail(message: Error): scala.Nothing = js.native
  def ifError(value: js.Any): scala.Unit = js.native
  /** @deprecated since v9.9.0 - use notDeepStrictEqual() instead. */
  def notDeepEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: Error): scala.Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: Error): scala.Unit = js.native
  /** @deprecated since v9.9.0 - use notStrictEqual() instead. */
  def notEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: Error): scala.Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: Error): scala.Unit = js.native
  def ok(value: js.Any): scala.Unit = js.native
  def ok(value: js.Any, message: java.lang.String): scala.Unit = js.native
  def ok(value: js.Any, message: Error): scala.Unit = js.native
  def rejects(block: js.Function): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: js.Function): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: js.Function, message: java.lang.String): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: js.Function, message: Error): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: js.Object): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: js.Object, message: java.lang.String): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: js.Object, message: Error): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: Error, message: java.lang.String): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: Error, message: Error): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: stdLib.RegExp): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: stdLib.RegExp, message: java.lang.String): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: stdLib.RegExp, message: Error): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, message: java.lang.String): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, message: Error): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Promise[_]): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Promise[_], error: js.Function): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Promise[_], error: js.Function, message: java.lang.String): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Promise[_], error: js.Function, message: Error): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Promise[_], error: js.Object): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Promise[_], error: js.Object, message: java.lang.String): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Promise[_], error: js.Object, message: Error): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Promise[_], error: Error, message: java.lang.String): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Promise[_], error: Error, message: Error): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Promise[_], error: stdLib.RegExp): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Promise[_], error: stdLib.RegExp, message: java.lang.String): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Promise[_], error: stdLib.RegExp, message: Error): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Promise[_], message: java.lang.String): js.Promise[scala.Unit] = js.native
  def rejects(block: js.Promise[_], message: Error): js.Promise[scala.Unit] = js.native
  def strictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: Error): scala.Unit = js.native
  def throws(block: js.Function): scala.Unit = js.native
  def throws(block: js.Function, error: js.Function): scala.Unit = js.native
  def throws(block: js.Function, error: js.Function, message: java.lang.String): scala.Unit = js.native
  def throws(block: js.Function, error: js.Function, message: Error): scala.Unit = js.native
  def throws(block: js.Function, error: js.Object): scala.Unit = js.native
  def throws(block: js.Function, error: js.Object, message: java.lang.String): scala.Unit = js.native
  def throws(block: js.Function, error: js.Object, message: Error): scala.Unit = js.native
  def throws(block: js.Function, error: Error, message: java.lang.String): scala.Unit = js.native
  def throws(block: js.Function, error: Error, message: Error): scala.Unit = js.native
  def throws(block: js.Function, error: stdLib.RegExp): scala.Unit = js.native
  def throws(block: js.Function, error: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  def throws(block: js.Function, error: stdLib.RegExp, message: Error): scala.Unit = js.native
  def throws(block: js.Function, message: java.lang.String): scala.Unit = js.native
  def throws(block: js.Function, message: Error): scala.Unit = js.native
}

