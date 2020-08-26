package typings.mochaSugarFree.mod

import typings.mocha.mod.Suite_
import typings.mocha.mod.Test_
import typings.mochaSugarFree.anon.Optionsasyncfalseundefine
import typings.mochaSugarFree.anon.OptionsasynctruefnTestCas
import typings.mochaSugarFree.anon.OptionsfnSuiteFuncundefin
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
  def suite(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ = js.native
  def suite(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
  def suite(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
  def test(fn: TestCase): Test_ = js.native
  // tslint:disable-next-line: unified-signatures
  def test(options: Optionsasyncfalseundefine): Test_ = js.native
  def test(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  def test(options: OptionsasynctruefnTestCas): Test_ = js.native
  def test(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  def test(title: String): Test_ = js.native
  def test(title: String, fn: TestCase): Test_ = js.native
  def test(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
  def test(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  def test(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
  def test(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
}

