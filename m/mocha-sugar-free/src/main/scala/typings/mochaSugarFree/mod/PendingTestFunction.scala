package typings.mochaSugarFree.mod

import typings.mocha.mod.Test_
import typings.mochaSugarFree.OptionsasyncfalsefnTestCa
import typings.mochaSugarFree.OptionsasynctruefnTestCas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * [bdd, tdd, qunit]
	 *
	 * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
	 *
	 * The name of the function is used as the name of the test if `title` is not supplied.
	 *
	 * Indicates this test should not be executed.
	 */
@js.native
trait PendingTestFunction extends js.Object {
  def apply(fn: TestCase): Test_ = js.native
  // tslint:disable-next-line: unified-signatures
  def apply(options: OptionsasyncfalsefnTestCa): Test_ = js.native
  def apply(options: OptionsasyncfalsefnTestCa, fn: TestCase): Test_ = js.native
  def apply(options: OptionsasynctruefnTestCas): Test_ = js.native
  def apply(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  def apply(title: String): Test_ = js.native
  def apply(title: String, fn: TestCase): Test_ = js.native
  def apply(title: String, options: OptionsasyncfalsefnTestCa): Test_ = js.native
  def apply(title: String, options: OptionsasyncfalsefnTestCa, fn: TestCase): Test_ = js.native
  def apply(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
  def apply(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
}

