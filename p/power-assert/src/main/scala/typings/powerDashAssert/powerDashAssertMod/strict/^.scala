package typings.powerDashAssert.powerDashAssertMod.strict

import org.scalablytyped.runtime.Instantiable1
import typings.powerDashAssert.Anon_Actual
import typings.powerDashAssert.Fn_Block
import typings.powerDashAssert.powerDashAssertMod.Options
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("power-assert", "strict")
@js.native
object ^ extends js.Object {
  var AssertionError: Instantiable1[
    js.UndefOr[/* options */ Anon_Actual], 
    typings.powerDashAssert.powerDashAssertMod.AssertionError
  ] = js.native
  @JSName("doesNotThrow")
  var doesNotThrow_Original: Fn_Block = js.native
  @JSName("throws")
  var throws_Original: Fn_Block = js.native
  def apply(value: js.Any): Unit = js.native
  def apply(value: js.Any, message: String): Unit = js.native
  def customize(options: Options): /* import warning: importer.ImportType#apply Failed type conversion: typeof assert */ js.Any = js.native
  def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def doesNotThrow(block: js.Function): Unit = js.native
  def doesNotThrow(block: js.Function, error: js.Function): Unit = js.native
  def doesNotThrow(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  def doesNotThrow(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  def doesNotThrow(block: js.Function, error: js.Function, message: String): Unit = js.native
  def doesNotThrow(block: js.Function, error: RegExp): Unit = js.native
  def doesNotThrow(block: js.Function, error: RegExp, message: String): Unit = js.native
  def doesNotThrow(block: js.Function, message: String): Unit = js.native
  def equal(actual: js.Any, expected: js.Any): Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def fail(): scala.Nothing = js.native
  def fail(actual: js.Any): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: String): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: String, operator: String): scala.Nothing = js.native
  def ifError(value: js.Any): Unit = js.native
  def notDeepEqual(acutal: js.Any, expected: js.Any): Unit = js.native
  def notDeepEqual(acutal: js.Any, expected: js.Any, message: String): Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def ok(value: js.Any): Unit = js.native
  def ok(value: js.Any, message: String): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def throws(block: js.Function): Unit = js.native
  def throws(block: js.Function, error: js.Function): Unit = js.native
  def throws(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  def throws(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  def throws(block: js.Function, error: js.Function, message: String): Unit = js.native
  def throws(block: js.Function, error: RegExp): Unit = js.native
  def throws(block: js.Function, error: RegExp, message: String): Unit = js.native
  def throws(block: js.Function, message: String): Unit = js.native
}

