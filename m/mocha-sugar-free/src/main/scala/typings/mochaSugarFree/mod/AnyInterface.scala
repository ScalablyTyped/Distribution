package typings.mochaSugarFree.mod

import typings.mocha.mod.Suite_
import typings.mocha.mod.Test_
import typings.mochaSugarFree.anon.Optionsasyncfalseundefine
import typings.mochaSugarFree.anon.OptionsasynctruefnTestCas
import typings.mochaSugarFree.anon.OptionsfnHookFuncundefine
import typings.mochaSugarFree.anon.OptionsfnSuiteFuncundefin
import typings.mochaSugarFree.anon.OptionstitlestringfnSuite
import typings.mochaSugarFree.mochaSugarFreeStrings.bdd
import typings.mochaSugarFree.mochaSugarFreeStrings.qunit
import typings.mochaSugarFree.mochaSugarFreeStrings.tdd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mocha-sugar-free.mocha-sugar-free.Omit<mocha-sugar-free.mocha-sugar-free.BDD, 'detectedInterface'> & mocha-sugar-free.mocha-sugar-free.Omit<mocha-sugar-free.mocha-sugar-free.TDD, 'detectedInterface'> & mocha-sugar-free.mocha-sugar-free.Omit<mocha-sugar-free.mocha-sugar-free.QUnit, 'detectedInterface'> & mocha-sugar-free.mocha-sugar-free.BaseInterface */
@js.native
trait AnyInterface extends js.Object {
  
  def after(): Unit = js.native
  def after(fn: HookFunc): Unit = js.native
  def after(options: OptionsfnHookFuncundefine): Unit = js.native
  def after(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
  
  def afterEach(): Unit = js.native
  def afterEach(fn: HookFunc): Unit = js.native
  def afterEach(options: OptionsfnHookFuncundefine): Unit = js.native
  def afterEach(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
  @JSName("afterEach")
  var afterEach_Original: HookFunction = js.native
  
  @JSName("after")
  var after_Original: HookFunction = js.native
  
  def before(): Unit = js.native
  def before(fn: HookFunc): Unit = js.native
  def before(options: OptionsfnHookFuncundefine): Unit = js.native
  def before(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
  
  def beforeEach(): Unit = js.native
  def beforeEach(fn: HookFunc): Unit = js.native
  def beforeEach(options: OptionsfnHookFuncundefine): Unit = js.native
  def beforeEach(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
  @JSName("beforeEach")
  var beforeEach_Original: HookFunction = js.native
  
  @JSName("before")
  var before_Original: HookFunction = js.native
  
  // tslint:disable-next-line: unified-signatures
  def context(options: OptionstitlestringfnSuite): Suite_ = js.native
  def context(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
  def context(title: String): Suite_ = js.native
  def context(title: String, fn: SuiteFunc): Suite_ = js.native
  def context(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ = js.native
  def context(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
  def context(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
  @JSName("context")
  var context_Original: SuiteFunction = js.native
  
  // tslint:disable-next-line: unified-signatures
  def describe(options: OptionstitlestringfnSuite): Suite_ = js.native
  def describe(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
  def describe(title: String): Suite_ = js.native
  def describe(title: String, fn: SuiteFunc): Suite_ = js.native
  def describe(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ = js.native
  def describe(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
  def describe(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
  @JSName("describe")
  var describe_Original: SuiteFunction = js.native
  
  /**
    * The detected Mocha interface.
    *
    * @default "bdd"
    */
  var detectedInterface: bdd | tdd | qunit = js.native
  
  def it(fn: TestCase): Test_ = js.native
  // tslint:disable-next-line: unified-signatures
  def it(options: Optionsasyncfalseundefine): Test_ = js.native
  def it(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  def it(options: OptionsasynctruefnTestCas): Test_ = js.native
  def it(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  def it(title: String): Test_ = js.native
  def it(title: String, fn: TestCase): Test_ = js.native
  def it(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
  def it(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  def it(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
  def it(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  @JSName("it")
  var it_Original: TestFunction = js.native
  
  def run(): Unit = js.native
  @JSName("run")
  var run_Original: js.Function0[Unit] = js.native
  
  def setup(): Unit = js.native
  def setup(fn: HookFunc): Unit = js.native
  def setup(options: OptionsfnHookFuncundefine): Unit = js.native
  def setup(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
  @JSName("setup")
  var setup_Original: HookFunction = js.native
  
  def specify(fn: TestCase): Test_ = js.native
  // tslint:disable-next-line: unified-signatures
  def specify(options: Optionsasyncfalseundefine): Test_ = js.native
  def specify(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  def specify(options: OptionsasynctruefnTestCas): Test_ = js.native
  def specify(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  def specify(title: String): Test_ = js.native
  def specify(title: String, fn: TestCase): Test_ = js.native
  def specify(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
  def specify(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  def specify(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
  def specify(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  @JSName("specify")
  var specify_Original: TestFunction = js.native
  
  // tslint:disable-next-line: unified-signatures
  def suite(options: OptionstitlestringfnSuite): Suite_ = js.native
  def suite(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
  def suite(title: String): Suite_ = js.native
  def suite(title: String, fn: SuiteFunc): Suite_ = js.native
  def suite(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ = js.native
  def suite(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
  def suite(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
  
  def suiteSetup(): Unit = js.native
  def suiteSetup(fn: HookFunc): Unit = js.native
  def suiteSetup(options: OptionsfnHookFuncundefine): Unit = js.native
  def suiteSetup(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
  @JSName("suiteSetup")
  var suiteSetup_Original: HookFunction = js.native
  
  def suiteTeardown(): Unit = js.native
  def suiteTeardown(fn: HookFunc): Unit = js.native
  def suiteTeardown(options: OptionsfnHookFuncundefine): Unit = js.native
  def suiteTeardown(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
  @JSName("suiteTeardown")
  var suiteTeardown_Original: HookFunction = js.native
  
  @JSName("suite")
  var suite_Original: SuiteFunction = js.native
  
  def teardown(): Unit = js.native
  def teardown(fn: HookFunc): Unit = js.native
  def teardown(options: OptionsfnHookFuncundefine): Unit = js.native
  def teardown(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
  @JSName("teardown")
  var teardown_Original: HookFunction = js.native
  
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
  @JSName("test")
  var test_Original: TestFunction = js.native
  
  // tslint:disable-next-line: unified-signatures
  def xcontext(options: OptionstitlestringfnSuite): Suite_ | Unit = js.native
  def xcontext(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit = js.native
  def xcontext(title: String): Suite_ | Unit = js.native
  def xcontext(title: String, fn: SuiteFunc): Suite_ | Unit = js.native
  def xcontext(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ | Unit = js.native
  def xcontext(title: String, options: OptionsfnSuiteFuncundefin): Suite_ | Unit = js.native
  def xcontext(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ | Unit = js.native
  @JSName("xcontext")
  var xcontext_Original: PendingSuiteFunction = js.native
  
  // tslint:disable-next-line: unified-signatures
  def xdescribe(options: OptionstitlestringfnSuite): Suite_ | Unit = js.native
  def xdescribe(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit = js.native
  def xdescribe(title: String): Suite_ | Unit = js.native
  def xdescribe(title: String, fn: SuiteFunc): Suite_ | Unit = js.native
  def xdescribe(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ | Unit = js.native
  def xdescribe(title: String, options: OptionsfnSuiteFuncundefin): Suite_ | Unit = js.native
  def xdescribe(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ | Unit = js.native
  @JSName("xdescribe")
  var xdescribe_Original: PendingSuiteFunction = js.native
  
  def xit(fn: TestCase): Test_ = js.native
  // tslint:disable-next-line: unified-signatures
  def xit(options: Optionsasyncfalseundefine): Test_ = js.native
  def xit(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  def xit(options: OptionsasynctruefnTestCas): Test_ = js.native
  def xit(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  def xit(title: String): Test_ = js.native
  def xit(title: String, fn: TestCase): Test_ = js.native
  def xit(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
  def xit(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  def xit(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
  def xit(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  @JSName("xit")
  var xit_Original: PendingTestFunction = js.native
  
  def xspecify(fn: TestCase): Test_ = js.native
  // tslint:disable-next-line: unified-signatures
  def xspecify(options: Optionsasyncfalseundefine): Test_ = js.native
  def xspecify(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  def xspecify(options: OptionsasynctruefnTestCas): Test_ = js.native
  def xspecify(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  def xspecify(title: String): Test_ = js.native
  def xspecify(title: String, fn: TestCase): Test_ = js.native
  def xspecify(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
  def xspecify(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  def xspecify(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
  def xspecify(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  @JSName("xspecify")
  var xspecify_Original: PendingTestFunction = js.native
}
