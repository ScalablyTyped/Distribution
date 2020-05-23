package typings.mochaSugarFree.mod

import typings.mocha.mod.Suite_
import typings.mocha.mod.Test_
import typings.mochaSugarFree.anon.OptionsasyncfalsefnTestCa
import typings.mochaSugarFree.anon.OptionsasynctruefnTestCas
import typings.mochaSugarFree.anon.OptionsfnSuiteFunc
import typings.mochaSugarFree.anon.OptionstitlestringfnSuite
import typings.mochaSugarFree.mochaSugarFreeStrings.qunit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QUnit extends BaseInterface {
  @JSName("detectedInterface")
  var detectedInterface_QUnit: qunit = js.native
  @JSName("suite")
  var suite_Original: SuiteFunction = js.native
  @JSName("test")
  var test_Original: TestFunction = js.native
  // tslint:disable-next-line: unified-signatures
  def suite(options: OptionstitlestringfnSuite): Suite_ = js.native
  def suite(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
  def suite(title: String): Suite_ = js.native
  def suite(title: String, fn: SuiteFunc): Suite_ = js.native
  def suite(title: String, options: OptionsfnSuiteFunc): Suite_ = js.native
  def suite(title: String, options: OptionsfnSuiteFunc, fn: SuiteFunc): Suite_ = js.native
  def test(fn: TestCase): Test_ = js.native
  // tslint:disable-next-line: unified-signatures
  def test(options: OptionsasyncfalsefnTestCa): Test_ = js.native
  def test(options: OptionsasyncfalsefnTestCa, fn: TestCase): Test_ = js.native
  def test(options: OptionsasynctruefnTestCas): Test_ = js.native
  def test(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  def test(title: String): Test_ = js.native
  def test(title: String, fn: TestCase): Test_ = js.native
  def test(title: String, options: OptionsasyncfalsefnTestCa): Test_ = js.native
  def test(title: String, options: OptionsasyncfalsefnTestCa, fn: TestCase): Test_ = js.native
  def test(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
  def test(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
}

