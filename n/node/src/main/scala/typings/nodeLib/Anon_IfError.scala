package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_IfError extends js.Object {
  var AssertionError: ScalablyTyped.runtime.Instantiable1[
    /* options */ js.UndefOr[/* options */ Anon_StackStartFn], 
    nodeLib.assertMod.internalNs.AssertionError
  ] = js.native
  /** @deprecated since v9.9.0 - use deepStrictEqual() instead. */
  def deepEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /** @deprecated since v9.9.0 - use deepStrictEqual() instead. */
  def deepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /** @deprecated since v9.9.0 - use deepStrictEqual() instead. */
  def deepEqual(actual: js.Any, expected: js.Any, message: Error): scala.Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: Error): scala.Unit = js.native
  def doesNotReject(block: js.Function): stdLib.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Function, error: js.Function): stdLib.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Function, error: js.Function, message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Function, error: js.Function, message: Error): stdLib.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Function, error: stdLib.RegExp): stdLib.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Function, error: stdLib.RegExp, message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Function, error: stdLib.RegExp, message: Error): stdLib.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Function, message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def doesNotReject(block: js.Function, message: Error): stdLib.Promise[scala.Unit] = js.native
  def doesNotReject(block: stdLib.Promise[_]): stdLib.Promise[scala.Unit] = js.native
  def doesNotReject(block: stdLib.Promise[_], error: js.Function): stdLib.Promise[scala.Unit] = js.native
  def doesNotReject(block: stdLib.Promise[_], error: js.Function, message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def doesNotReject(block: stdLib.Promise[_], error: js.Function, message: Error): stdLib.Promise[scala.Unit] = js.native
  def doesNotReject(block: stdLib.Promise[_], error: stdLib.RegExp): stdLib.Promise[scala.Unit] = js.native
  def doesNotReject(block: stdLib.Promise[_], error: stdLib.RegExp, message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def doesNotReject(block: stdLib.Promise[_], error: stdLib.RegExp, message: Error): stdLib.Promise[scala.Unit] = js.native
  def doesNotReject(block: stdLib.Promise[_], message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def doesNotReject(block: stdLib.Promise[_], message: Error): stdLib.Promise[scala.Unit] = js.native
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
  /** @deprecated since v9.9.0 - use strictEqual() instead. */
  def equal(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /** @deprecated since v9.9.0 - use strictEqual() instead. */
  def equal(actual: js.Any, expected: js.Any, message: Error): scala.Unit = js.native
  def fail(): scala.Nothing = js.native
  /** @deprecated since v10.0.0 - use fail([message]) or other assert functions instead. */
  def fail(actual: js.Any, expected: js.Any): scala.Nothing = js.native
  /** @deprecated since v10.0.0 - use fail([message]) or other assert functions instead. */
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Nothing = js.native
  /** @deprecated since v10.0.0 - use fail([message]) or other assert functions instead. */
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String, operator: java.lang.String): scala.Nothing = js.native
  /** @deprecated since v10.0.0 - use fail([message]) or other assert functions instead. */
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: java.lang.String,
    operator: java.lang.String,
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  /** @deprecated since v10.0.0 - use fail([message]) or other assert functions instead. */
  def fail(actual: js.Any, expected: js.Any, message: Error): scala.Nothing = js.native
  /** @deprecated since v10.0.0 - use fail([message]) or other assert functions instead. */
  def fail(actual: js.Any, expected: js.Any, message: Error, operator: java.lang.String): scala.Nothing = js.native
  /** @deprecated since v10.0.0 - use fail([message]) or other assert functions instead. */
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
  /** @deprecated since v9.9.0 - use notDeepStrictEqual() instead. */
  def notDeepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /** @deprecated since v9.9.0 - use notDeepStrictEqual() instead. */
  def notDeepEqual(actual: js.Any, expected: js.Any, message: Error): scala.Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: Error): scala.Unit = js.native
  /** @deprecated since v9.9.0 - use notStrictEqual() instead. */
  def notEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /** @deprecated since v9.9.0 - use notStrictEqual() instead. */
  def notEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /** @deprecated since v9.9.0 - use notStrictEqual() instead. */
  def notEqual(actual: js.Any, expected: js.Any, message: Error): scala.Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: Error): scala.Unit = js.native
  def ok(value: js.Any): scala.Unit = js.native
  def ok(value: js.Any, message: java.lang.String): scala.Unit = js.native
  def ok(value: js.Any, message: Error): scala.Unit = js.native
  def rejects(block: js.Function): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: js.Function): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: js.Function, message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: js.Function, message: Error): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: js.Object): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: js.Object, message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: js.Object, message: Error): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: Error, message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: Error, message: Error): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: stdLib.RegExp): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: stdLib.RegExp, message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, error: stdLib.RegExp, message: Error): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: js.Function, message: Error): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: stdLib.Promise[_]): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: stdLib.Promise[_], error: js.Function): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: stdLib.Promise[_], error: js.Function, message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: stdLib.Promise[_], error: js.Function, message: Error): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: stdLib.Promise[_], error: js.Object): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: stdLib.Promise[_], error: js.Object, message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: stdLib.Promise[_], error: js.Object, message: Error): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: stdLib.Promise[_], error: Error, message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: stdLib.Promise[_], error: Error, message: Error): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: stdLib.Promise[_], error: stdLib.RegExp): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: stdLib.Promise[_], error: stdLib.RegExp, message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: stdLib.Promise[_], error: stdLib.RegExp, message: Error): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: stdLib.Promise[_], message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def rejects(block: stdLib.Promise[_], message: Error): stdLib.Promise[scala.Unit] = js.native
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

