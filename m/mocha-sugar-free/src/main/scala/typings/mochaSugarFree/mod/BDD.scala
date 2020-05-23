package typings.mochaSugarFree.mod

import typings.mocha.mod.Suite_
import typings.mocha.mod.Test_
import typings.mochaSugarFree.anon.OptionsasyncfalsefnTestCa
import typings.mochaSugarFree.anon.OptionsasynctruefnTestCas
import typings.mochaSugarFree.anon.OptionsfnHookFunc
import typings.mochaSugarFree.anon.OptionsfnSuiteFunc
import typings.mochaSugarFree.anon.OptionstitlestringfnSuite
import typings.mochaSugarFree.mochaSugarFreeStrings.bdd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BDD extends BaseInterface {
  /**
    * [bdd]
    *
    * Execute after each test case.
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  @JSName("afterEach")
  var afterEach_Original: HookFunction = js.native
  /**
    * [bdd]
    *
    * Execute after running tests.
    *
    * @see https://mochajs.org/api/global.html#after
    */
  @JSName("after")
  var after_Original: HookFunction = js.native
  /**
    * [bdd]
    *
    * Execute before each test case.
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  @JSName("beforeEach")
  var beforeEach_Original: HookFunction = js.native
  /**
    * [bdd]
    *
    * Execute before running tests.
    *
    * @see https://mochajs.org/api/global.html#before
    */
  @JSName("before")
  var before_Original: HookFunction = js.native
  /**
    * [bdd]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    */
  @JSName("context")
  var context_Original: SuiteFunction = js.native
  /**
    * [bdd]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    */
  @JSName("describe")
  var describe_Original: SuiteFunction = js.native
  @JSName("detectedInterface")
  var detectedInterface_BDD: bdd = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  @JSName("it")
  var it_Original: TestFunction = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  @JSName("specify")
  var specify_Original: TestFunction = js.native
  /**
    * [bdd]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    *
    * Indicates this suite should not be executed.
    */
  @JSName("xcontext")
  var xcontext_Original: PendingSuiteFunction = js.native
  /**
    * [bdd]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    *
    * Indicates this suite should not be executed.
    */
  @JSName("xdescribe")
  var xdescribe_Original: PendingSuiteFunction = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    *
    * Indicates this test should not be executed.
    */
  @JSName("xit")
  var xit_Original: PendingTestFunction = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    *
    * Indicates this test should not be executed.
    */
  @JSName("xspecify")
  var xspecify_Original: PendingTestFunction = js.native
  /**
    * [bdd]
    *
    * Execute after running tests.
    *
    * @see https://mochajs.org/api/global.html#after
    */
  def after(): Unit = js.native
  def after(fn: HookFunc): Unit = js.native
  /**
    * [bdd]
    *
    * Execute after running tests.
    *
    * @see https://mochajs.org/api/global.html#after
    */
  def after(options: OptionsfnHookFunc): Unit = js.native
  def after(options: OptionsfnHookFunc, fn: HookFunc): Unit = js.native
  /**
    * [bdd]
    *
    * Execute after each test case.
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  def afterEach(): Unit = js.native
  def afterEach(fn: HookFunc): Unit = js.native
  /**
    * [bdd]
    *
    * Execute after each test case.
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  def afterEach(options: OptionsfnHookFunc): Unit = js.native
  def afterEach(options: OptionsfnHookFunc, fn: HookFunc): Unit = js.native
  /**
    * [bdd]
    *
    * Execute before running tests.
    *
    * @see https://mochajs.org/api/global.html#before
    */
  def before(): Unit = js.native
  def before(fn: HookFunc): Unit = js.native
  /**
    * [bdd]
    *
    * Execute before running tests.
    *
    * @see https://mochajs.org/api/global.html#before
    */
  def before(options: OptionsfnHookFunc): Unit = js.native
  def before(options: OptionsfnHookFunc, fn: HookFunc): Unit = js.native
  /**
    * [bdd]
    *
    * Execute before each test case.
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  def beforeEach(): Unit = js.native
  def beforeEach(fn: HookFunc): Unit = js.native
  /**
    * [bdd]
    *
    * Execute before each test case.
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  def beforeEach(options: OptionsfnHookFunc): Unit = js.native
  def beforeEach(options: OptionsfnHookFunc, fn: HookFunc): Unit = js.native
  // tslint:disable-next-line: unified-signatures
  /**
    * [bdd]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    */
  def context(options: OptionstitlestringfnSuite): Suite_ = js.native
  def context(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
  /**
    * [bdd]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    */
  def context(title: String): Suite_ = js.native
  def context(title: String, fn: SuiteFunc): Suite_ = js.native
  def context(title: String, options: OptionsfnSuiteFunc): Suite_ = js.native
  def context(title: String, options: OptionsfnSuiteFunc, fn: SuiteFunc): Suite_ = js.native
  // tslint:disable-next-line: unified-signatures
  /**
    * [bdd]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    */
  def describe(options: OptionstitlestringfnSuite): Suite_ = js.native
  def describe(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
  /**
    * [bdd]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    */
  def describe(title: String): Suite_ = js.native
  def describe(title: String, fn: SuiteFunc): Suite_ = js.native
  def describe(title: String, options: OptionsfnSuiteFunc): Suite_ = js.native
  def describe(title: String, options: OptionsfnSuiteFunc, fn: SuiteFunc): Suite_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def it(fn: TestCase): Test_ = js.native
  // tslint:disable-next-line: unified-signatures
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def it(options: OptionsasyncfalsefnTestCa): Test_ = js.native
  def it(options: OptionsasyncfalsefnTestCa, fn: TestCase): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def it(options: OptionsasynctruefnTestCas): Test_ = js.native
  def it(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def it(title: String): Test_ = js.native
  def it(title: String, fn: TestCase): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def it(title: String, options: OptionsasyncfalsefnTestCa): Test_ = js.native
  def it(title: String, options: OptionsasyncfalsefnTestCa, fn: TestCase): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def it(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
  def it(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def specify(fn: TestCase): Test_ = js.native
  // tslint:disable-next-line: unified-signatures
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def specify(options: OptionsasyncfalsefnTestCa): Test_ = js.native
  def specify(options: OptionsasyncfalsefnTestCa, fn: TestCase): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def specify(options: OptionsasynctruefnTestCas): Test_ = js.native
  def specify(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def specify(title: String): Test_ = js.native
  def specify(title: String, fn: TestCase): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def specify(title: String, options: OptionsasyncfalsefnTestCa): Test_ = js.native
  def specify(title: String, options: OptionsasyncfalsefnTestCa, fn: TestCase): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  def specify(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
  def specify(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  // tslint:disable-next-line: unified-signatures
  /**
    * [bdd]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    *
    * Indicates this suite should not be executed.
    */
  def xcontext(options: OptionstitlestringfnSuite): Suite_ | Unit = js.native
  def xcontext(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit = js.native
  /**
    * [bdd]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    *
    * Indicates this suite should not be executed.
    */
  def xcontext(title: String): Suite_ | Unit = js.native
  def xcontext(title: String, fn: SuiteFunc): Suite_ | Unit = js.native
  def xcontext(title: String, options: OptionsfnSuiteFunc): Suite_ | Unit = js.native
  def xcontext(title: String, options: OptionsfnSuiteFunc, fn: SuiteFunc): Suite_ | Unit = js.native
  // tslint:disable-next-line: unified-signatures
  /**
    * [bdd]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    *
    * Indicates this suite should not be executed.
    */
  def xdescribe(options: OptionstitlestringfnSuite): Suite_ | Unit = js.native
  def xdescribe(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit = js.native
  /**
    * [bdd]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    *
    * Indicates this suite should not be executed.
    */
  def xdescribe(title: String): Suite_ | Unit = js.native
  def xdescribe(title: String, fn: SuiteFunc): Suite_ | Unit = js.native
  def xdescribe(title: String, options: OptionsfnSuiteFunc): Suite_ | Unit = js.native
  def xdescribe(title: String, options: OptionsfnSuiteFunc, fn: SuiteFunc): Suite_ | Unit = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    *
    * Indicates this test should not be executed.
    */
  def xit(fn: TestCase): Test_ = js.native
  // tslint:disable-next-line: unified-signatures
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    *
    * Indicates this test should not be executed.
    */
  def xit(options: OptionsasyncfalsefnTestCa): Test_ = js.native
  def xit(options: OptionsasyncfalsefnTestCa, fn: TestCase): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    *
    * Indicates this test should not be executed.
    */
  def xit(options: OptionsasynctruefnTestCas): Test_ = js.native
  def xit(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    *
    * Indicates this test should not be executed.
    */
  def xit(title: String): Test_ = js.native
  def xit(title: String, fn: TestCase): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    *
    * Indicates this test should not be executed.
    */
  def xit(title: String, options: OptionsasyncfalsefnTestCa): Test_ = js.native
  def xit(title: String, options: OptionsasyncfalsefnTestCa, fn: TestCase): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    *
    * Indicates this test should not be executed.
    */
  def xit(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
  def xit(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    *
    * Indicates this test should not be executed.
    */
  def xspecify(fn: TestCase): Test_ = js.native
  // tslint:disable-next-line: unified-signatures
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    *
    * Indicates this test should not be executed.
    */
  def xspecify(options: OptionsasyncfalsefnTestCa): Test_ = js.native
  def xspecify(options: OptionsasyncfalsefnTestCa, fn: TestCase): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    *
    * Indicates this test should not be executed.
    */
  def xspecify(options: OptionsasynctruefnTestCas): Test_ = js.native
  def xspecify(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    *
    * Indicates this test should not be executed.
    */
  def xspecify(title: String): Test_ = js.native
  def xspecify(title: String, fn: TestCase): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    *
    * Indicates this test should not be executed.
    */
  def xspecify(title: String, options: OptionsasyncfalsefnTestCa): Test_ = js.native
  def xspecify(title: String, options: OptionsasyncfalsefnTestCa, fn: TestCase): Test_ = js.native
  /**
    * [bdd]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    *
    * Indicates this test should not be executed.
    */
  def xspecify(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
  def xspecify(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
}

