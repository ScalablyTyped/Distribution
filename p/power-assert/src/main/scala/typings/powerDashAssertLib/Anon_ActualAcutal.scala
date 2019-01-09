package typings
package powerDashAssertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ActualAcutal extends js.Object {
  var AssertionError: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[/* options */ Anon_Actual], 
    powerDashAssertLib.powerDashAssertMod.assertNs.AssertionError
  ] = js.native
  @JSName("doesNotThrow")
  var doesNotThrow_Original: Anon_Block = js.native
  @JSName("throws")
  var throws_Original: Anon_Block = js.native
  def customize(options: powerDashAssertLib.powerDashAssertMod.assertNs.Options): /* import warning: ImportType.apply Failed type conversion: typeof assert */ js.Any = js.native
  def deepEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def doesNotThrow(block: js.Function): scala.Unit = js.native
  def doesNotThrow(block: js.Function, error: js.Function): scala.Unit = js.native
  def doesNotThrow(block: js.Function, error: js.Function1[/* err */ js.Any, scala.Boolean]): scala.Unit = js.native
  def doesNotThrow(
    block: js.Function,
    error: js.Function1[/* err */ js.Any, scala.Boolean],
    message: java.lang.String
  ): scala.Unit = js.native
  def doesNotThrow(block: js.Function, error: js.Function, message: java.lang.String): scala.Unit = js.native
  def doesNotThrow(block: js.Function, error: stdLib.RegExp): scala.Unit = js.native
  def doesNotThrow(block: js.Function, error: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  def doesNotThrow(block: js.Function, message: java.lang.String): scala.Unit = js.native
  def equal(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def fail(): scala.Unit = js.native
  def fail(actual: js.Any): scala.Unit = js.native
  def fail(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String, operator: java.lang.String): scala.Unit = js.native
  def ifError(value: js.Any): scala.Unit = js.native
  def notDeepEqual(acutal: js.Any, expected: js.Any): scala.Unit = js.native
  def notDeepEqual(acutal: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def ok(value: js.Any): scala.Unit = js.native
  def ok(value: js.Any, message: java.lang.String): scala.Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def throws(block: js.Function): scala.Unit = js.native
  def throws(block: js.Function, error: js.Function): scala.Unit = js.native
  def throws(block: js.Function, error: js.Function1[/* err */ js.Any, scala.Boolean]): scala.Unit = js.native
  def throws(
    block: js.Function,
    error: js.Function1[/* err */ js.Any, scala.Boolean],
    message: java.lang.String
  ): scala.Unit = js.native
  def throws(block: js.Function, error: js.Function, message: java.lang.String): scala.Unit = js.native
  def throws(block: js.Function, error: stdLib.RegExp): scala.Unit = js.native
  def throws(block: js.Function, error: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  def throws(block: js.Function, message: java.lang.String): scala.Unit = js.native
}

