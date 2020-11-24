package typings.mocha.Mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Variables added to the global scope by Mocha when run in the CLI.
  */
@js.native
trait MochaGlobals extends js.Object {
  
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  def after(fn: AsyncFunc): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  def after(fn: Func): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  def after(name: String): Unit = js.native
  def after(name: String, fn: AsyncFunc): Unit = js.native
  def after(name: String, fn: Func): Unit = js.native
  
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  def afterEach(fn: AsyncFunc): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  def afterEach(fn: Func): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  def afterEach(name: String): Unit = js.native
  def afterEach(name: String, fn: AsyncFunc): Unit = js.native
  def afterEach(name: String, fn: Func): Unit = js.native
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  @JSName("afterEach")
  var afterEach_Original: HookFunction = js.native
  
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  @JSName("after")
  var after_Original: HookFunction = js.native
  
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  def before(fn: AsyncFunc): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  def before(fn: Func): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  def before(name: String): Unit = js.native
  def before(name: String, fn: AsyncFunc): Unit = js.native
  def before(name: String, fn: Func): Unit = js.native
  
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  def beforeEach(fn: AsyncFunc): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  def beforeEach(fn: Func): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  def beforeEach(name: String): Unit = js.native
  def beforeEach(name: String, fn: AsyncFunc): Unit = js.native
  def beforeEach(name: String, fn: Func): Unit = js.native
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  @JSName("beforeEach")
  var beforeEach_Original: HookFunction = js.native
  
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  @JSName("before")
  var before_Original: HookFunction = js.native
  
  /**
    * [qunit] Describe a "suite" with the given `title`.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def context(title: String): Suite = js.native
  /**
    * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
    * nested suites.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def context(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite = js.native
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSName("context")
  var context_Original: SuiteFunction = js.native
  
  /**
    * [qunit] Describe a "suite" with the given `title`.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def describe(title: String): Suite = js.native
  /**
    * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
    * nested suites.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def describe(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite = js.native
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSName("describe")
  var describe_Original: SuiteFunction = js.native
  
  /**
    * Describe a specification or test-case with the given callback `fn` acting as a thunk.
    * The name of the function is used as the name of the test.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def it(fn: AsyncFunc): Test = js.native
  /**
    * Describe a specification or test-case with the given callback `fn` acting as a thunk.
    * The name of the function is used as the name of the test.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def it(fn: Func): Test = js.native
  /**
    * Describe a specification or test-case with the given `title` and callback `fn` acting
    * as a thunk.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def it(title: String): Test = js.native
  def it(title: String, fn: AsyncFunc): Test = js.native
  def it(title: String, fn: Func): Test = js.native
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSName("it")
  var it_Original: TestFunction = js.native
  
  def run(): Unit = js.native
  @JSName("run")
  var run_Original: js.Function0[Unit] = js.native
  
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  def setup(fn: AsyncFunc): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  def setup(fn: Func): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  def setup(name: String): Unit = js.native
  def setup(name: String, fn: AsyncFunc): Unit = js.native
  def setup(name: String, fn: Func): Unit = js.native
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  @JSName("setup")
  var setup_Original: HookFunction = js.native
  
  /**
    * Describe a specification or test-case with the given callback `fn` acting as a thunk.
    * The name of the function is used as the name of the test.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def specify(fn: AsyncFunc): Test = js.native
  /**
    * Describe a specification or test-case with the given callback `fn` acting as a thunk.
    * The name of the function is used as the name of the test.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def specify(fn: Func): Test = js.native
  /**
    * Describe a specification or test-case with the given `title` and callback `fn` acting
    * as a thunk.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def specify(title: String): Test = js.native
  def specify(title: String, fn: AsyncFunc): Test = js.native
  def specify(title: String, fn: Func): Test = js.native
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSName("specify")
  var specify_Original: TestFunction = js.native
  
  /**
    * [qunit] Describe a "suite" with the given `title`.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def suite(title: String): Suite = js.native
  /**
    * [bdd, tdd] Describe a "suite" with the given `title` and callback `fn` containing
    * nested suites.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def suite(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite = js.native
  
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  def suiteSetup(fn: AsyncFunc): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  def suiteSetup(fn: Func): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  def suiteSetup(name: String): Unit = js.native
  def suiteSetup(name: String, fn: AsyncFunc): Unit = js.native
  def suiteSetup(name: String, fn: Func): Unit = js.native
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  @JSName("suiteSetup")
  var suiteSetup_Original: HookFunction = js.native
  
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  def suiteTeardown(fn: AsyncFunc): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  def suiteTeardown(fn: Func): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  def suiteTeardown(name: String): Unit = js.native
  def suiteTeardown(name: String, fn: AsyncFunc): Unit = js.native
  def suiteTeardown(name: String, fn: Func): Unit = js.native
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  @JSName("suiteTeardown")
  var suiteTeardown_Original: HookFunction = js.native
  
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSName("suite")
  var suite_Original: SuiteFunction = js.native
  
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  def teardown(fn: AsyncFunc): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  def teardown(fn: Func): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  def teardown(name: String): Unit = js.native
  def teardown(name: String, fn: AsyncFunc): Unit = js.native
  def teardown(name: String, fn: Func): Unit = js.native
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  @JSName("teardown")
  var teardown_Original: HookFunction = js.native
  
  /**
    * Describe a specification or test-case with the given callback `fn` acting as a thunk.
    * The name of the function is used as the name of the test.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def test(fn: AsyncFunc): Test = js.native
  /**
    * Describe a specification or test-case with the given callback `fn` acting as a thunk.
    * The name of the function is used as the name of the test.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def test(fn: Func): Test = js.native
  /**
    * Describe a specification or test-case with the given `title` and callback `fn` acting
    * as a thunk.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def test(title: String): Test = js.native
  def test(title: String, fn: AsyncFunc): Test = js.native
  def test(title: String, fn: Func): Test = js.native
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSName("test")
  var test_Original: TestFunction = js.native
  
  /**
    * Pending suite.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def xcontext(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite | Unit = js.native
  /**
    * Pending suite.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSName("xcontext")
  var xcontext_Original: PendingSuiteFunction = js.native
  
  /**
    * Pending suite.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def xdescribe(title: String, fn: js.ThisFunction0[/* this */ Suite, Unit]): Suite | Unit = js.native
  /**
    * Pending suite.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSName("xdescribe")
  var xdescribe_Original: PendingSuiteFunction = js.native
  
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
    * acting as a thunk. The name of the function is used as the name of the test. Indicates
    * this test should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def xit(fn: AsyncFunc): Test = js.native
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
    * acting as a thunk. The name of the function is used as the name of the test. Indicates
    * this test should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def xit(fn: Func): Test = js.native
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given `title` and
    * callback `fn` acting as a thunk. Indicates this test should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def xit(title: String): Test = js.native
  def xit(title: String, fn: AsyncFunc): Test = js.native
  def xit(title: String, fn: Func): Test = js.native
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSName("xit")
  var xit_Original: PendingTestFunction = js.native
  
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
    * acting as a thunk. The name of the function is used as the name of the test. Indicates
    * this test should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def xspecify(fn: AsyncFunc): Test = js.native
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
    * acting as a thunk. The name of the function is used as the name of the test. Indicates
    * this test should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def xspecify(fn: Func): Test = js.native
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given `title` and
    * callback `fn` acting as a thunk. Indicates this test should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def xspecify(title: String): Test = js.native
  def xspecify(title: String, fn: AsyncFunc): Test = js.native
  def xspecify(title: String, fn: Func): Test = js.native
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSName("xspecify")
  var xspecify_Original: PendingTestFunction = js.native
}
