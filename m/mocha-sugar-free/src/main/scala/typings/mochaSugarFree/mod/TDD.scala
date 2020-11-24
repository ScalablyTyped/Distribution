package typings.mochaSugarFree.mod

import typings.mocha.mod.Suite_
import typings.mocha.mod.Test_
import typings.mochaSugarFree.anon.Optionsasyncfalseundefine
import typings.mochaSugarFree.anon.OptionsasynctruefnTestCas
import typings.mochaSugarFree.anon.OptionsfnHookFuncundefine
import typings.mochaSugarFree.anon.OptionsfnSuiteFuncundefin
import typings.mochaSugarFree.anon.OptionstitlestringfnSuite
import typings.mochaSugarFree.mochaSugarFreeStrings.tdd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TDD extends BaseInterface {
  
  @JSName("detectedInterface")
  var detectedInterface_TDD: tdd = js.native
  
  /**
    * [tdd]
    *
    * Execute before each test case.
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  def setup(): Unit = js.native
  def setup(fn: HookFunc): Unit = js.native
  /**
    * [tdd]
    *
    * Execute before each test case.
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  def setup(options: OptionsfnHookFuncundefine): Unit = js.native
  def setup(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
  /**
    * [tdd]
    *
    * Execute before each test case.
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  @JSName("setup")
  var setup_Original: HookFunction = js.native
  
  // tslint:disable-next-line: unified-signatures
  /**
    * [tdd, qunit]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    */
  def suite(options: OptionstitlestringfnSuite): Suite_ = js.native
  def suite(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
  /**
    * [tdd, qunit]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    */
  def suite(title: String): Suite_ = js.native
  def suite(title: String, fn: SuiteFunc): Suite_ = js.native
  def suite(title: String, options: js.UndefOr[scala.Nothing], fn: SuiteFunc): Suite_ = js.native
  def suite(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
  def suite(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
  
  /**
    * [tdd]
    *
    * Execute before running tests.
    *
    * @see https://mochajs.org/api/global.html#before
    */
  def suiteSetup(): Unit = js.native
  def suiteSetup(fn: HookFunc): Unit = js.native
  /**
    * [tdd]
    *
    * Execute before running tests.
    *
    * @see https://mochajs.org/api/global.html#before
    */
  def suiteSetup(options: OptionsfnHookFuncundefine): Unit = js.native
  def suiteSetup(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
  /**
    * [tdd]
    *
    * Execute before running tests.
    *
    * @see https://mochajs.org/api/global.html#before
    */
  @JSName("suiteSetup")
  var suiteSetup_Original: HookFunction = js.native
  
  /**
    * [tdd]
    *
    * Execute after running tests.
    *
    * @see https://mochajs.org/api/global.html#after
    */
  def suiteTeardown(): Unit = js.native
  def suiteTeardown(fn: HookFunc): Unit = js.native
  /**
    * [tdd]
    *
    * Execute after running tests.
    *
    * @see https://mochajs.org/api/global.html#after
    */
  def suiteTeardown(options: OptionsfnHookFuncundefine): Unit = js.native
  def suiteTeardown(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
  /**
    * [tdd]
    *
    * Execute after running tests.
    *
    * @see https://mochajs.org/api/global.html#after
    */
  @JSName("suiteTeardown")
  var suiteTeardown_Original: HookFunction = js.native
  
  /**
    * [tdd, qunit]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    */
  @JSName("suite")
  var suite_Original: SuiteFunction = js.native
  
  /**
    * [tdd]
    *
    * Execute after each test case.
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  def teardown(): Unit = js.native
  def teardown(fn: HookFunc): Unit = js.native
  /**
    * [tdd]
    *
    * Execute after each test case.
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  def teardown(options: OptionsfnHookFuncundefine): Unit = js.native
  def teardown(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
  /**
    * [tdd]
    *
    * Execute after each test case.
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  @JSName("teardown")
  var teardown_Original: HookFunction = js.native
  
  /**
    * [tdd, qunit]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def test(fn: TestCase): Test_ = js.native
  // tslint:disable-next-line: unified-signatures
  /**
    * [tdd, qunit]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def test(options: Optionsasyncfalseundefine): Test_ = js.native
  def test(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  /**
    * [tdd, qunit]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def test(options: OptionsasynctruefnTestCas): Test_ = js.native
  def test(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  /**
    * [tdd, qunit]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def test(title: String): Test_ = js.native
  def test(title: String, fn: TestCase): Test_ = js.native
  /**
    * [tdd, qunit]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def test(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
  def test(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
  /**
    * [tdd, qunit]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def test(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
  def test(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  /**
    * [tdd, qunit]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  @JSName("test")
  var test_Original: TestFunction = js.native
}
