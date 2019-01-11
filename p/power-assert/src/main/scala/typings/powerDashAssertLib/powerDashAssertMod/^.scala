package typings
package powerDashAssertLib.powerDashAssertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("power-assert", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var doesNotThrow: powerDashAssertLib.Anon_Block = js.native
  val strict: (js.Function2[/* value */ js.Any, /* message */ js.UndefOr[java.lang.String], scala.Unit]) with powerDashAssertLib.Anon_ActualAcutal = js.native
  var throws: powerDashAssertLib.Anon_Block = js.native
  def apply(value: js.Any): scala.Unit = js.native
  def apply(value: js.Any, message: java.lang.String): scala.Unit = js.native
  def customize(options: powerDashAssertLib.powerDashAssertMod.assertNs.Options): (js.Function2[/* value */ js.Any, /* message */ js.UndefOr[java.lang.String], scala.Unit]) with powerDashAssertLib.Anon_ActualAcutal = js.native
  def deepEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
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
}

