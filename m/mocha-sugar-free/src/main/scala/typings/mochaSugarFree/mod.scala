package typings.mochaSugarFree

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.mocha.mod.Suite_
import typings.mocha.mod.Test_
import typings.mochaSugarFree.anon.Optionsasyncfalseundefine
import typings.mochaSugarFree.anon.OptionsasynctruefnTestCas
import typings.mochaSugarFree.anon.OptionsfnHookFuncundefine
import typings.mochaSugarFree.anon.OptionsfnSuiteFuncundefin
import typings.mochaSugarFree.anon.OptionstitlestringfnSuite
import typings.mochaSugarFree.mochaSugarFreeBooleans.`false`
import typings.mochaSugarFree.mochaSugarFreeBooleans.`true`
import typings.mochaSugarFree.mochaSugarFreeStrings.after
import typings.mochaSugarFree.mochaSugarFreeStrings.afterEach
import typings.mochaSugarFree.mochaSugarFreeStrings.bdd
import typings.mochaSugarFree.mochaSugarFreeStrings.before
import typings.mochaSugarFree.mochaSugarFreeStrings.beforeEach
import typings.mochaSugarFree.mochaSugarFreeStrings.qunit
import typings.mochaSugarFree.mochaSugarFreeStrings.tdd
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("mocha-sugar-free", JSImport.Namespace)
  @js.native
  val ^ : AnyInterface = js.native
  
  /* Inlined mocha-sugar-free.mocha-sugar-free.Omit<mocha-sugar-free.mocha-sugar-free.BDD, 'detectedInterface'> & mocha-sugar-free.mocha-sugar-free.Omit<mocha-sugar-free.mocha-sugar-free.TDD, 'detectedInterface'> & mocha-sugar-free.mocha-sugar-free.Omit<mocha-sugar-free.mocha-sugar-free.QUnit, 'detectedInterface'> & mocha-sugar-free.mocha-sugar-free.BaseInterface */
  trait AnyInterface extends StObject {
    
    def after(): Unit
    def after(fn: HookFunc): Unit
    def after(options: OptionsfnHookFuncundefine): Unit
    def after(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit
    
    def afterEach(): Unit
    def afterEach(fn: HookFunc): Unit
    def afterEach(options: OptionsfnHookFuncundefine): Unit
    def afterEach(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit
    @JSName("afterEach")
    var afterEach_Original: HookFunction
    
    @JSName("after")
    var after_Original: HookFunction
    
    def before(): Unit
    def before(fn: HookFunc): Unit
    def before(options: OptionsfnHookFuncundefine): Unit
    def before(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit
    
    def beforeEach(): Unit
    def beforeEach(fn: HookFunc): Unit
    def beforeEach(options: OptionsfnHookFuncundefine): Unit
    def beforeEach(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit
    @JSName("beforeEach")
    var beforeEach_Original: HookFunction
    
    @JSName("before")
    var before_Original: HookFunction
    
    // tslint:disable-next-line: unified-signatures
    def context(options: OptionstitlestringfnSuite): Suite_
    def context(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_
    def context(title: String): Suite_
    def context(title: String, fn: SuiteFunc): Suite_
    def context(title: String, options: Unit, fn: SuiteFunc): Suite_
    def context(title: String, options: OptionsfnSuiteFuncundefin): Suite_
    def context(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_
    @JSName("context")
    var context_Original: SuiteFunction
    
    // tslint:disable-next-line: unified-signatures
    def describe(options: OptionstitlestringfnSuite): Suite_
    def describe(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_
    def describe(title: String): Suite_
    def describe(title: String, fn: SuiteFunc): Suite_
    def describe(title: String, options: Unit, fn: SuiteFunc): Suite_
    def describe(title: String, options: OptionsfnSuiteFuncundefin): Suite_
    def describe(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_
    @JSName("describe")
    var describe_Original: SuiteFunction
    
    /**
      * The detected Mocha interface.
      *
      * @default "bdd"
      */
    var detectedInterface: bdd | tdd | qunit
    
    def it(fn: TestCase): Test_
    // tslint:disable-next-line: unified-signatures
    def it(options: Optionsasyncfalseundefine): Test_
    def it(options: Optionsasyncfalseundefine, fn: TestCase): Test_
    def it(options: OptionsasynctruefnTestCas): Test_
    def it(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    def it(title: String): Test_
    def it(title: String, fn: TestCase): Test_
    def it(title: String, options: Optionsasyncfalseundefine): Test_
    def it(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_
    def it(title: String, options: OptionsasynctruefnTestCas): Test_
    def it(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    @JSName("it")
    var it_Original: TestFunction
    
    def run(): Unit
    @JSName("run")
    var run_Original: js.Function0[Unit]
    
    def setup(): Unit
    def setup(fn: HookFunc): Unit
    def setup(options: OptionsfnHookFuncundefine): Unit
    def setup(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit
    @JSName("setup")
    var setup_Original: HookFunction
    
    def specify(fn: TestCase): Test_
    // tslint:disable-next-line: unified-signatures
    def specify(options: Optionsasyncfalseundefine): Test_
    def specify(options: Optionsasyncfalseundefine, fn: TestCase): Test_
    def specify(options: OptionsasynctruefnTestCas): Test_
    def specify(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    def specify(title: String): Test_
    def specify(title: String, fn: TestCase): Test_
    def specify(title: String, options: Optionsasyncfalseundefine): Test_
    def specify(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_
    def specify(title: String, options: OptionsasynctruefnTestCas): Test_
    def specify(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    @JSName("specify")
    var specify_Original: TestFunction
    
    // tslint:disable-next-line: unified-signatures
    def suite(options: OptionstitlestringfnSuite): Suite_
    def suite(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_
    def suite(title: String): Suite_
    def suite(title: String, fn: SuiteFunc): Suite_
    def suite(title: String, options: Unit, fn: SuiteFunc): Suite_
    def suite(title: String, options: OptionsfnSuiteFuncundefin): Suite_
    def suite(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_
    
    def suiteSetup(): Unit
    def suiteSetup(fn: HookFunc): Unit
    def suiteSetup(options: OptionsfnHookFuncundefine): Unit
    def suiteSetup(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit
    @JSName("suiteSetup")
    var suiteSetup_Original: HookFunction
    
    def suiteTeardown(): Unit
    def suiteTeardown(fn: HookFunc): Unit
    def suiteTeardown(options: OptionsfnHookFuncundefine): Unit
    def suiteTeardown(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit
    @JSName("suiteTeardown")
    var suiteTeardown_Original: HookFunction
    
    @JSName("suite")
    var suite_Original: SuiteFunction
    
    def teardown(): Unit
    def teardown(fn: HookFunc): Unit
    def teardown(options: OptionsfnHookFuncundefine): Unit
    def teardown(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit
    @JSName("teardown")
    var teardown_Original: HookFunction
    
    def test(fn: TestCase): Test_
    // tslint:disable-next-line: unified-signatures
    def test(options: Optionsasyncfalseundefine): Test_
    def test(options: Optionsasyncfalseundefine, fn: TestCase): Test_
    def test(options: OptionsasynctruefnTestCas): Test_
    def test(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    def test(title: String): Test_
    def test(title: String, fn: TestCase): Test_
    def test(title: String, options: Optionsasyncfalseundefine): Test_
    def test(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_
    def test(title: String, options: OptionsasynctruefnTestCas): Test_
    def test(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    @JSName("test")
    var test_Original: TestFunction
    
    // tslint:disable-next-line: unified-signatures
    def xcontext(options: OptionstitlestringfnSuite): Suite_ | Unit
    def xcontext(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit
    def xcontext(title: String): Suite_ | Unit
    def xcontext(title: String, fn: SuiteFunc): Suite_ | Unit
    def xcontext(title: String, options: Unit, fn: SuiteFunc): Suite_ | Unit
    def xcontext(title: String, options: OptionsfnSuiteFuncundefin): Suite_ | Unit
    def xcontext(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ | Unit
    @JSName("xcontext")
    var xcontext_Original: PendingSuiteFunction
    
    // tslint:disable-next-line: unified-signatures
    def xdescribe(options: OptionstitlestringfnSuite): Suite_ | Unit
    def xdescribe(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit
    def xdescribe(title: String): Suite_ | Unit
    def xdescribe(title: String, fn: SuiteFunc): Suite_ | Unit
    def xdescribe(title: String, options: Unit, fn: SuiteFunc): Suite_ | Unit
    def xdescribe(title: String, options: OptionsfnSuiteFuncundefin): Suite_ | Unit
    def xdescribe(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ | Unit
    @JSName("xdescribe")
    var xdescribe_Original: PendingSuiteFunction
    
    def xit(fn: TestCase): Test_
    // tslint:disable-next-line: unified-signatures
    def xit(options: Optionsasyncfalseundefine): Test_
    def xit(options: Optionsasyncfalseundefine, fn: TestCase): Test_
    def xit(options: OptionsasynctruefnTestCas): Test_
    def xit(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    def xit(title: String): Test_
    def xit(title: String, fn: TestCase): Test_
    def xit(title: String, options: Optionsasyncfalseundefine): Test_
    def xit(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_
    def xit(title: String, options: OptionsasynctruefnTestCas): Test_
    def xit(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    @JSName("xit")
    var xit_Original: PendingTestFunction
    
    def xspecify(fn: TestCase): Test_
    // tslint:disable-next-line: unified-signatures
    def xspecify(options: Optionsasyncfalseundefine): Test_
    def xspecify(options: Optionsasyncfalseundefine, fn: TestCase): Test_
    def xspecify(options: OptionsasynctruefnTestCas): Test_
    def xspecify(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    def xspecify(title: String): Test_
    def xspecify(title: String, fn: TestCase): Test_
    def xspecify(title: String, options: Optionsasyncfalseundefine): Test_
    def xspecify(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_
    def xspecify(title: String, options: OptionsasynctruefnTestCas): Test_
    def xspecify(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    @JSName("xspecify")
    var xspecify_Original: PendingTestFunction
  }
  object AnyInterface {
    
    inline def apply(
      after: HookFunction,
      afterEach: HookFunction,
      before: HookFunction,
      beforeEach: HookFunction,
      context: SuiteFunction,
      describe: SuiteFunction,
      detectedInterface: bdd | tdd | qunit,
      it: TestFunction,
      run: () => Unit,
      setup: HookFunction,
      specify: TestFunction,
      suite: SuiteFunction,
      suiteSetup: HookFunction,
      suiteTeardown: HookFunction,
      teardown: HookFunction,
      test: TestFunction,
      xcontext: PendingSuiteFunction,
      xdescribe: PendingSuiteFunction,
      xit: PendingTestFunction,
      xspecify: PendingTestFunction
    ): AnyInterface = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], afterEach = afterEach.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], beforeEach = beforeEach.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], describe = describe.asInstanceOf[js.Any], detectedInterface = detectedInterface.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), setup = setup.asInstanceOf[js.Any], specify = specify.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any], suiteSetup = suiteSetup.asInstanceOf[js.Any], suiteTeardown = suiteTeardown.asInstanceOf[js.Any], teardown = teardown.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], xcontext = xcontext.asInstanceOf[js.Any], xdescribe = xdescribe.asInstanceOf[js.Any], xit = xit.asInstanceOf[js.Any], xspecify = xspecify.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnyInterface]
    }
    
    extension [Self <: AnyInterface](x: Self) {
      
      inline def setAfter(value: HookFunction): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterEach(value: HookFunction): Self = StObject.set(x, "afterEach", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: HookFunction): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeEach(value: HookFunction): Self = StObject.set(x, "beforeEach", value.asInstanceOf[js.Any])
      
      inline def setContext(value: SuiteFunction): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDescribe(value: SuiteFunction): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      inline def setDetectedInterface(value: bdd | tdd | qunit): Self = StObject.set(x, "detectedInterface", value.asInstanceOf[js.Any])
      
      inline def setIt(value: TestFunction): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
      
      inline def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      inline def setSetup(value: HookFunction): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
      
      inline def setSpecify(value: TestFunction): Self = StObject.set(x, "specify", value.asInstanceOf[js.Any])
      
      inline def setSuite(value: SuiteFunction): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
      
      inline def setSuiteSetup(value: HookFunction): Self = StObject.set(x, "suiteSetup", value.asInstanceOf[js.Any])
      
      inline def setSuiteTeardown(value: HookFunction): Self = StObject.set(x, "suiteTeardown", value.asInstanceOf[js.Any])
      
      inline def setTeardown(value: HookFunction): Self = StObject.set(x, "teardown", value.asInstanceOf[js.Any])
      
      inline def setTest(value: TestFunction): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setXcontext(value: PendingSuiteFunction): Self = StObject.set(x, "xcontext", value.asInstanceOf[js.Any])
      
      inline def setXdescribe(value: PendingSuiteFunction): Self = StObject.set(x, "xdescribe", value.asInstanceOf[js.Any])
      
      inline def setXit(value: PendingTestFunction): Self = StObject.set(x, "xit", value.asInstanceOf[js.Any])
      
      inline def setXspecify(value: PendingTestFunction): Self = StObject.set(x, "xspecify", value.asInstanceOf[js.Any])
    }
  }
  
  trait BDD
    extends StObject
       with BaseInterface {
    
    /**
      * [bdd]
      *
      * Execute after running tests.
      *
      * @see https://mochajs.org/api/global.html#after
      */
    def after(): Unit
    def after(fn: HookFunc): Unit
    /**
      * [bdd]
      *
      * Execute after running tests.
      *
      * @see https://mochajs.org/api/global.html#after
      */
    def after(options: OptionsfnHookFuncundefine): Unit
    def after(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit
    
    /**
      * [bdd]
      *
      * Execute after each test case.
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    def afterEach(): Unit
    def afterEach(fn: HookFunc): Unit
    /**
      * [bdd]
      *
      * Execute after each test case.
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    def afterEach(options: OptionsfnHookFuncundefine): Unit
    def afterEach(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit
    /**
      * [bdd]
      *
      * Execute after each test case.
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    @JSName("afterEach")
    var afterEach_Original: HookFunction
    
    /**
      * [bdd]
      *
      * Execute after running tests.
      *
      * @see https://mochajs.org/api/global.html#after
      */
    @JSName("after")
    var after_Original: HookFunction
    
    /**
      * [bdd]
      *
      * Execute before running tests.
      *
      * @see https://mochajs.org/api/global.html#before
      */
    def before(): Unit
    def before(fn: HookFunc): Unit
    /**
      * [bdd]
      *
      * Execute before running tests.
      *
      * @see https://mochajs.org/api/global.html#before
      */
    def before(options: OptionsfnHookFuncundefine): Unit
    def before(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit
    
    /**
      * [bdd]
      *
      * Execute before each test case.
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    def beforeEach(): Unit
    def beforeEach(fn: HookFunc): Unit
    /**
      * [bdd]
      *
      * Execute before each test case.
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    def beforeEach(options: OptionsfnHookFuncundefine): Unit
    def beforeEach(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit
    /**
      * [bdd]
      *
      * Execute before each test case.
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    @JSName("beforeEach")
    var beforeEach_Original: HookFunction
    
    /**
      * [bdd]
      *
      * Execute before running tests.
      *
      * @see https://mochajs.org/api/global.html#before
      */
    @JSName("before")
    var before_Original: HookFunction
    
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    def context(options: OptionstitlestringfnSuite): Suite_
    def context(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    def context(title: String): Suite_
    def context(title: String, fn: SuiteFunc): Suite_
    def context(title: String, options: Unit, fn: SuiteFunc): Suite_
    def context(title: String, options: OptionsfnSuiteFuncundefin): Suite_
    def context(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    @JSName("context")
    var context_Original: SuiteFunction
    
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    def describe(options: OptionstitlestringfnSuite): Suite_
    def describe(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    def describe(title: String): Suite_
    def describe(title: String, fn: SuiteFunc): Suite_
    def describe(title: String, options: Unit, fn: SuiteFunc): Suite_
    def describe(title: String, options: OptionsfnSuiteFuncundefin): Suite_
    def describe(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    @JSName("describe")
    var describe_Original: SuiteFunction
    
    @JSName("detectedInterface")
    var detectedInterface_BDD: bdd
    
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def it(fn: TestCase): Test_
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def it(options: Optionsasyncfalseundefine): Test_
    def it(options: Optionsasyncfalseundefine, fn: TestCase): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def it(options: OptionsasynctruefnTestCas): Test_
    def it(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def it(title: String): Test_
    def it(title: String, fn: TestCase): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def it(title: String, options: Optionsasyncfalseundefine): Test_
    def it(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def it(title: String, options: OptionsasynctruefnTestCas): Test_
    def it(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    @JSName("it")
    var it_Original: TestFunction
    
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def specify(fn: TestCase): Test_
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def specify(options: Optionsasyncfalseundefine): Test_
    def specify(options: Optionsasyncfalseundefine, fn: TestCase): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def specify(options: OptionsasynctruefnTestCas): Test_
    def specify(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def specify(title: String): Test_
    def specify(title: String, fn: TestCase): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def specify(title: String, options: Optionsasyncfalseundefine): Test_
    def specify(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def specify(title: String, options: OptionsasynctruefnTestCas): Test_
    def specify(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    @JSName("specify")
    var specify_Original: TestFunction
    
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      *
      * Indicates this suite should not be executed.
      */
    def xcontext(options: OptionstitlestringfnSuite): Suite_ | Unit
    def xcontext(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      *
      * Indicates this suite should not be executed.
      */
    def xcontext(title: String): Suite_ | Unit
    def xcontext(title: String, fn: SuiteFunc): Suite_ | Unit
    def xcontext(title: String, options: Unit, fn: SuiteFunc): Suite_ | Unit
    def xcontext(title: String, options: OptionsfnSuiteFuncundefin): Suite_ | Unit
    def xcontext(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ | Unit
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      *
      * Indicates this suite should not be executed.
      */
    @JSName("xcontext")
    var xcontext_Original: PendingSuiteFunction
    
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      *
      * Indicates this suite should not be executed.
      */
    def xdescribe(options: OptionstitlestringfnSuite): Suite_ | Unit
    def xdescribe(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      *
      * Indicates this suite should not be executed.
      */
    def xdescribe(title: String): Suite_ | Unit
    def xdescribe(title: String, fn: SuiteFunc): Suite_ | Unit
    def xdescribe(title: String, options: Unit, fn: SuiteFunc): Suite_ | Unit
    def xdescribe(title: String, options: OptionsfnSuiteFuncundefin): Suite_ | Unit
    def xdescribe(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ | Unit
    /**
      * [bdd]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      *
      * Indicates this suite should not be executed.
      */
    @JSName("xdescribe")
    var xdescribe_Original: PendingSuiteFunction
    
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xit(fn: TestCase): Test_
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
    def xit(options: Optionsasyncfalseundefine): Test_
    def xit(options: Optionsasyncfalseundefine, fn: TestCase): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xit(options: OptionsasynctruefnTestCas): Test_
    def xit(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xit(title: String): Test_
    def xit(title: String, fn: TestCase): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xit(title: String, options: Optionsasyncfalseundefine): Test_
    def xit(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xit(title: String, options: OptionsasynctruefnTestCas): Test_
    def xit(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
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
    var xit_Original: PendingTestFunction
    
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xspecify(fn: TestCase): Test_
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
    def xspecify(options: Optionsasyncfalseundefine): Test_
    def xspecify(options: Optionsasyncfalseundefine, fn: TestCase): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xspecify(options: OptionsasynctruefnTestCas): Test_
    def xspecify(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xspecify(title: String): Test_
    def xspecify(title: String, fn: TestCase): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xspecify(title: String, options: Optionsasyncfalseundefine): Test_
    def xspecify(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_
    /**
      * [bdd]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      *
      * Indicates this test should not be executed.
      */
    def xspecify(title: String, options: OptionsasynctruefnTestCas): Test_
    def xspecify(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
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
    var xspecify_Original: PendingTestFunction
  }
  object BDD {
    
    inline def apply(
      after: HookFunction,
      afterEach: HookFunction,
      before: HookFunction,
      beforeEach: HookFunction,
      context: SuiteFunction,
      describe: SuiteFunction,
      it: TestFunction,
      run: () => Unit,
      specify: TestFunction,
      xcontext: PendingSuiteFunction,
      xdescribe: PendingSuiteFunction,
      xit: PendingTestFunction,
      xspecify: PendingTestFunction
    ): BDD = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], afterEach = afterEach.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], beforeEach = beforeEach.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], describe = describe.asInstanceOf[js.Any], detectedInterface = "bdd", it = it.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), specify = specify.asInstanceOf[js.Any], xcontext = xcontext.asInstanceOf[js.Any], xdescribe = xdescribe.asInstanceOf[js.Any], xit = xit.asInstanceOf[js.Any], xspecify = xspecify.asInstanceOf[js.Any])
      __obj.asInstanceOf[BDD]
    }
    
    extension [Self <: BDD](x: Self) {
      
      inline def setAfter(value: HookFunction): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterEach(value: HookFunction): Self = StObject.set(x, "afterEach", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: HookFunction): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeEach(value: HookFunction): Self = StObject.set(x, "beforeEach", value.asInstanceOf[js.Any])
      
      inline def setContext(value: SuiteFunction): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDescribe(value: SuiteFunction): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      inline def setDetectedInterface(value: bdd): Self = StObject.set(x, "detectedInterface", value.asInstanceOf[js.Any])
      
      inline def setIt(value: TestFunction): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
      
      inline def setSpecify(value: TestFunction): Self = StObject.set(x, "specify", value.asInstanceOf[js.Any])
      
      inline def setXcontext(value: PendingSuiteFunction): Self = StObject.set(x, "xcontext", value.asInstanceOf[js.Any])
      
      inline def setXdescribe(value: PendingSuiteFunction): Self = StObject.set(x, "xdescribe", value.asInstanceOf[js.Any])
      
      inline def setXit(value: PendingTestFunction): Self = StObject.set(x, "xit", value.asInstanceOf[js.Any])
      
      inline def setXspecify(value: PendingTestFunction): Self = StObject.set(x, "xspecify", value.asInstanceOf[js.Any])
    }
  }
  
  // #region Test functions
  trait BaseInterface extends StObject {
    
    /**
      * The detected Mocha interface.
      *
      * @default "bdd"
      */
    var detectedInterface: bdd | tdd | qunit
    
    /**
      * Triggers root suite execution.
      *
      * - _Only available if flag `--delay` is passed to Mocha._
      *
      * @see https://mochajs.org/api/global.html#runWithSuite
      */
    def run(): Unit
  }
  object BaseInterface {
    
    inline def apply(detectedInterface: bdd | tdd | qunit, run: () => Unit): BaseInterface = {
      val __obj = js.Dynamic.literal(detectedInterface = detectedInterface.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
      __obj.asInstanceOf[BaseInterface]
    }
    
    extension [Self <: BaseInterface](x: Self) {
      
      inline def setDetectedInterface(value: bdd | tdd | qunit): Self = StObject.set(x, "detectedInterface", value.asInstanceOf[js.Any])
      
      inline def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * [bdd, tdd, qunit]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    *
    * Indicates this suite should be executed exclusively.
    */
  @js.native
  trait ExclusiveSuiteFunction extends StObject {
    
    // tslint:disable-next-line: unified-signatures
    def apply(options: OptionstitlestringfnSuite): Suite_ = js.native
    def apply(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
    def apply(title: String): Suite_ = js.native
    def apply(title: String, fn: SuiteFunc): Suite_ = js.native
    def apply(title: String, options: Unit, fn: SuiteFunc): Suite_ = js.native
    def apply(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
    def apply(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
  }
  
  /**
    * [bdd, tdd, qunit]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    *
    * Indicates this test should be executed exclusively.
    */
  @js.native
  trait ExclusiveTestFunction extends StObject {
    
    def apply(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    def apply(options: Optionsasyncfalseundefine): Test_ = js.native
    def apply(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def apply(options: OptionsasynctruefnTestCas): Test_ = js.native
    def apply(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    def apply(title: String): Test_ = js.native
    def apply(title: String, fn: TestCase): Test_ = js.native
    def apply(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def apply(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def apply(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def apply(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  }
  
  trait HookContext extends StObject {
    
    var hook: before | after | beforeEach | afterEach
    
    var isHook: `true`
    
    var isSuite: `false`
    
    var isTest: `false`
  }
  object HookContext {
    
    inline def apply(hook: before | after | beforeEach | afterEach): HookContext = {
      val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], isHook = true, isSuite = false, isTest = false)
      __obj.asInstanceOf[HookContext]
    }
    
    extension [Self <: HookContext](x: Self) {
      
      inline def setHook(value: before | after | beforeEach | afterEach): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
      
      inline def setIsHook(value: `true`): Self = StObject.set(x, "isHook", value.asInstanceOf[js.Any])
      
      inline def setIsSuite(value: `false`): Self = StObject.set(x, "isSuite", value.asInstanceOf[js.Any])
      
      inline def setIsTest(value: `false`): Self = StObject.set(x, "isTest", value.asInstanceOf[js.Any])
    }
  }
  
  type HookFunc = js.ThisFunction1[/* this */ Unit, /* context */ HookContext, Unit]
  
  // #endregion
  // #region Test function types
  /**
    * [bdd, tdd]
    *
    * Describe a "hook" to execute the given callback `fn`.
    *
    * The name of the function is used as the name of the hook.
    */
  @js.native
  trait HookFunction extends StObject {
    
    def apply(): Unit = js.native
    def apply(fn: HookFunc): Unit = js.native
    def apply(options: OptionsfnHookFuncundefine): Unit = js.native
    def apply(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit = js.native
  }
  
  /** Construct a type with the properties of T except for those in type K. */
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  trait Options
    extends StObject
       with /* option */ StringDictionary[js.Any] {
    
    /**
      * Whether the context should contain a `done` callback.
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set whether timeouts are enabled.
      */
    var enableTimeouts: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether failing to return a PromiseLike should fail the test.
      */
    var expectPromise: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The test function.
      */
    var fn: js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc] = js.undefined
    
    /**
      * Whether the test should be skipped unconditionally.
      */
    var skip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped in a browser environment.
      */
    var skipIfBrowser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped in a WebWorker.
      */
    var skipIfWebWorker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped outside a browser environment.
      */
    var skipUnlessBrowser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set test slowness threshold.
      */
    var slow: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Set test timeout.
      */
    var timeout: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The test title. Replaced by the title parameter if present.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setEnableTimeouts(value: Boolean): Self = StObject.set(x, "enableTimeouts", value.asInstanceOf[js.Any])
      
      inline def setEnableTimeoutsUndefined: Self = StObject.set(x, "enableTimeouts", js.undefined)
      
      inline def setExpectPromise(value: Boolean): Self = StObject.set(x, "expectPromise", value.asInstanceOf[js.Any])
      
      inline def setExpectPromiseUndefined: Self = StObject.set(x, "expectPromise", js.undefined)
      
      inline def setFn(value: TestCase | TestCaseWithDone | SuiteFunc | HookFunc): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipIfBrowser(value: Boolean): Self = StObject.set(x, "skipIfBrowser", value.asInstanceOf[js.Any])
      
      inline def setSkipIfBrowserUndefined: Self = StObject.set(x, "skipIfBrowser", js.undefined)
      
      inline def setSkipIfWebWorker(value: Boolean): Self = StObject.set(x, "skipIfWebWorker", value.asInstanceOf[js.Any])
      
      inline def setSkipIfWebWorkerUndefined: Self = StObject.set(x, "skipIfWebWorker", js.undefined)
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSkipUnlessBrowser(value: Boolean): Self = StObject.set(x, "skipUnlessBrowser", value.asInstanceOf[js.Any])
      
      inline def setSkipUnlessBrowserUndefined: Self = StObject.set(x, "skipUnlessBrowser", js.undefined)
      
      inline def setSlow(value: String | Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      inline def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
      
      inline def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /**
    * [bdd, tdd]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    *
    * Indicates this suite should not be executed.
    *
    * @returns [bdd] `Suite`
    * @returns [tdd] `void`
    */
  @js.native
  trait PendingSuiteFunction extends StObject {
    
    // tslint:disable-next-line: unified-signatures
    def apply(options: OptionstitlestringfnSuite): Suite_ | Unit = js.native
    def apply(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit = js.native
    def apply(title: String): Suite_ | Unit = js.native
    def apply(title: String, fn: SuiteFunc): Suite_ | Unit = js.native
    def apply(title: String, options: Unit, fn: SuiteFunc): Suite_ | Unit = js.native
    def apply(title: String, options: OptionsfnSuiteFuncundefin): Suite_ | Unit = js.native
    def apply(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ | Unit = js.native
  }
  
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
  trait PendingTestFunction extends StObject {
    
    def apply(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    def apply(options: Optionsasyncfalseundefine): Test_ = js.native
    def apply(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def apply(options: OptionsasynctruefnTestCas): Test_ = js.native
    def apply(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    def apply(title: String): Test_ = js.native
    def apply(title: String, fn: TestCase): Test_ = js.native
    def apply(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def apply(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def apply(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def apply(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
  }
  
  trait QUnit
    extends StObject
       with BaseInterface {
    
    @JSName("detectedInterface")
    var detectedInterface_QUnit: qunit
    
    // tslint:disable-next-line: unified-signatures
    def suite(options: OptionstitlestringfnSuite): Suite_
    def suite(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_
    def suite(title: String): Suite_
    def suite(title: String, fn: SuiteFunc): Suite_
    def suite(title: String, options: Unit, fn: SuiteFunc): Suite_
    def suite(title: String, options: OptionsfnSuiteFuncundefin): Suite_
    def suite(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_
    @JSName("suite")
    var suite_Original: SuiteFunction
    
    def test(fn: TestCase): Test_
    // tslint:disable-next-line: unified-signatures
    def test(options: Optionsasyncfalseundefine): Test_
    def test(options: Optionsasyncfalseundefine, fn: TestCase): Test_
    def test(options: OptionsasynctruefnTestCas): Test_
    def test(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    def test(title: String): Test_
    def test(title: String, fn: TestCase): Test_
    def test(title: String, options: Optionsasyncfalseundefine): Test_
    def test(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_
    def test(title: String, options: OptionsasynctruefnTestCas): Test_
    def test(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    @JSName("test")
    var test_Original: TestFunction
  }
  object QUnit {
    
    inline def apply(run: () => Unit, suite: SuiteFunction, test: TestFunction): QUnit = {
      val __obj = js.Dynamic.literal(detectedInterface = "qunit", run = js.Any.fromFunction0(run), suite = suite.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[QUnit]
    }
    
    extension [Self <: QUnit](x: Self) {
      
      inline def setDetectedInterface(value: qunit): Self = StObject.set(x, "detectedInterface", value.asInstanceOf[js.Any])
      
      inline def setSuite(value: SuiteFunction): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
      
      inline def setTest(value: TestFunction): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
  
  // #endregion
  // #region Test context
  trait SuiteContext extends StObject {
    
    var isHook: `false`
    
    var isSuite: `true`
    
    var isTest: `false`
  }
  object SuiteContext {
    
    inline def apply(): SuiteContext = {
      val __obj = js.Dynamic.literal(isHook = false, isSuite = true, isTest = false)
      __obj.asInstanceOf[SuiteContext]
    }
    
    extension [Self <: SuiteContext](x: Self) {
      
      inline def setIsHook(value: `false`): Self = StObject.set(x, "isHook", value.asInstanceOf[js.Any])
      
      inline def setIsSuite(value: `true`): Self = StObject.set(x, "isSuite", value.asInstanceOf[js.Any])
      
      inline def setIsTest(value: `false`): Self = StObject.set(x, "isTest", value.asInstanceOf[js.Any])
    }
  }
  
  type SuiteFunc = js.ThisFunction1[/* this */ Unit, /* context */ SuiteContext, Unit]
  
  /**
    * [bdd, tdd, qunit]
    *
    * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
    */
  @js.native
  trait SuiteFunction extends StObject {
    
    // tslint:disable-next-line: unified-signatures
    def apply(options: OptionstitlestringfnSuite): Suite_ = js.native
    def apply(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
    def apply(title: String): Suite_ = js.native
    def apply(title: String, fn: SuiteFunc): Suite_ = js.native
    def apply(title: String, options: Unit, fn: SuiteFunc): Suite_ = js.native
    def apply(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
    def apply(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
    
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this suite should be executed exclusively.
      */
    def only(options: OptionstitlestringfnSuite): Suite_ = js.native
    def only(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this suite should be executed exclusively.
      */
    def only(title: String): Suite_ = js.native
    def only(title: String, fn: SuiteFunc): Suite_ = js.native
    def only(title: String, options: Unit, fn: SuiteFunc): Suite_ = js.native
    def only(title: String, options: OptionsfnSuiteFuncundefin): Suite_ = js.native
    def only(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this suite should be executed exclusively.
      */
    @JSName("only")
    var only_Original: ExclusiveSuiteFunction = js.native
    
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd, tdd]
      *
      * Indicates this suite should not be executed.
      */
    def skip(options: OptionstitlestringfnSuite): Suite_ | Unit = js.native
    def skip(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_ | Unit = js.native
    /**
      * [bdd, tdd]
      *
      * Indicates this suite should not be executed.
      */
    def skip(title: String): Suite_ | Unit = js.native
    def skip(title: String, fn: SuiteFunc): Suite_ | Unit = js.native
    def skip(title: String, options: Unit, fn: SuiteFunc): Suite_ | Unit = js.native
    def skip(title: String, options: OptionsfnSuiteFuncundefin): Suite_ | Unit = js.native
    def skip(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_ | Unit = js.native
    /**
      * [bdd, tdd]
      *
      * Indicates this suite should not be executed.
      */
    @JSName("skip")
    var skip_Original: PendingSuiteFunction = js.native
  }
  
  trait TDD
    extends StObject
       with BaseInterface {
    
    @JSName("detectedInterface")
    var detectedInterface_TDD: tdd
    
    /**
      * [tdd]
      *
      * Execute before each test case.
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    def setup(): Unit
    def setup(fn: HookFunc): Unit
    /**
      * [tdd]
      *
      * Execute before each test case.
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    def setup(options: OptionsfnHookFuncundefine): Unit
    def setup(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit
    /**
      * [tdd]
      *
      * Execute before each test case.
      *
      * @see https://mochajs.org/api/global.html#beforeEach
      */
    @JSName("setup")
    var setup_Original: HookFunction
    
    // tslint:disable-next-line: unified-signatures
    /**
      * [tdd, qunit]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    def suite(options: OptionstitlestringfnSuite): Suite_
    def suite(options: OptionstitlestringfnSuite, fn: SuiteFunc): Suite_
    /**
      * [tdd, qunit]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    def suite(title: String): Suite_
    def suite(title: String, fn: SuiteFunc): Suite_
    def suite(title: String, options: Unit, fn: SuiteFunc): Suite_
    def suite(title: String, options: OptionsfnSuiteFuncundefin): Suite_
    def suite(title: String, options: OptionsfnSuiteFuncundefin, fn: SuiteFunc): Suite_
    
    /**
      * [tdd]
      *
      * Execute before running tests.
      *
      * @see https://mochajs.org/api/global.html#before
      */
    def suiteSetup(): Unit
    def suiteSetup(fn: HookFunc): Unit
    /**
      * [tdd]
      *
      * Execute before running tests.
      *
      * @see https://mochajs.org/api/global.html#before
      */
    def suiteSetup(options: OptionsfnHookFuncundefine): Unit
    def suiteSetup(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit
    /**
      * [tdd]
      *
      * Execute before running tests.
      *
      * @see https://mochajs.org/api/global.html#before
      */
    @JSName("suiteSetup")
    var suiteSetup_Original: HookFunction
    
    /**
      * [tdd]
      *
      * Execute after running tests.
      *
      * @see https://mochajs.org/api/global.html#after
      */
    def suiteTeardown(): Unit
    def suiteTeardown(fn: HookFunc): Unit
    /**
      * [tdd]
      *
      * Execute after running tests.
      *
      * @see https://mochajs.org/api/global.html#after
      */
    def suiteTeardown(options: OptionsfnHookFuncundefine): Unit
    def suiteTeardown(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit
    /**
      * [tdd]
      *
      * Execute after running tests.
      *
      * @see https://mochajs.org/api/global.html#after
      */
    @JSName("suiteTeardown")
    var suiteTeardown_Original: HookFunction
    
    /**
      * [tdd, qunit]
      *
      * Describe a "suite" with the given `title` and callback `fn` containing nested suites.
      */
    @JSName("suite")
    var suite_Original: SuiteFunction
    
    /**
      * [tdd]
      *
      * Execute after each test case.
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    def teardown(): Unit
    def teardown(fn: HookFunc): Unit
    /**
      * [tdd]
      *
      * Execute after each test case.
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    def teardown(options: OptionsfnHookFuncundefine): Unit
    def teardown(options: OptionsfnHookFuncundefine, fn: HookFunc): Unit
    /**
      * [tdd]
      *
      * Execute after each test case.
      *
      * @see https://mochajs.org/api/global.html#afterEach
      */
    @JSName("teardown")
    var teardown_Original: HookFunction
    
    /**
      * [tdd, qunit]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def test(fn: TestCase): Test_
    // tslint:disable-next-line: unified-signatures
    /**
      * [tdd, qunit]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def test(options: Optionsasyncfalseundefine): Test_
    def test(options: Optionsasyncfalseundefine, fn: TestCase): Test_
    /**
      * [tdd, qunit]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def test(options: OptionsasynctruefnTestCas): Test_
    def test(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    /**
      * [tdd, qunit]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def test(title: String): Test_
    def test(title: String, fn: TestCase): Test_
    /**
      * [tdd, qunit]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def test(title: String, options: Optionsasyncfalseundefine): Test_
    def test(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_
    /**
      * [tdd, qunit]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    def test(title: String, options: OptionsasynctruefnTestCas): Test_
    def test(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_
    /**
      * [tdd, qunit]
      *
      * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
      *
      * The name of the function is used as the name of the test if `title` is not supplied.
      */
    @JSName("test")
    var test_Original: TestFunction
  }
  object TDD {
    
    inline def apply(
      run: () => Unit,
      setup: HookFunction,
      suite: SuiteFunction,
      suiteSetup: HookFunction,
      suiteTeardown: HookFunction,
      teardown: HookFunction,
      test: TestFunction
    ): TDD = {
      val __obj = js.Dynamic.literal(detectedInterface = "tdd", run = js.Any.fromFunction0(run), setup = setup.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any], suiteSetup = suiteSetup.asInstanceOf[js.Any], suiteTeardown = suiteTeardown.asInstanceOf[js.Any], teardown = teardown.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[TDD]
    }
    
    extension [Self <: TDD](x: Self) {
      
      inline def setDetectedInterface(value: tdd): Self = StObject.set(x, "detectedInterface", value.asInstanceOf[js.Any])
      
      inline def setSetup(value: HookFunction): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
      
      inline def setSuite(value: SuiteFunction): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
      
      inline def setSuiteSetup(value: HookFunction): Self = StObject.set(x, "suiteSetup", value.asInstanceOf[js.Any])
      
      inline def setSuiteTeardown(value: HookFunction): Self = StObject.set(x, "suiteTeardown", value.asInstanceOf[js.Any])
      
      inline def setTeardown(value: HookFunction): Self = StObject.set(x, "teardown", value.asInstanceOf[js.Any])
      
      inline def setTest(value: TestFunction): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
  
  type TestCase = js.ThisFunction1[/* this */ Unit, /* context */ TestContext, Unit | js.Thenable[js.Any]]
  
  type TestCaseWithDone = js.ThisFunction1[/* this */ Unit, /* context */ TestContextWithDone, Unit]
  
  @js.native
  trait TestContext
    extends StObject
       with TestContextBase {
    
    /**
      * Mark a test as completed.
      */
    var done: Null = js.native
  }
  
  @js.native
  trait TestContextBase extends StObject {
    
    /**
      * Get whether timeouts are enabled.
      */
    def enableTimeouts(): Boolean = js.native
    /**
      * Set whether timeouts are enabled.
      */
    def enableTimeouts(enabled: Boolean): this.type = js.native
    
    var isHook: `false` = js.native
    
    var isSuite: `false` = js.native
    
    var isTest: `true` = js.native
    
    /**
      * Mark a test as skipped.
      */
    def skip(): scala.Nothing = js.native
    
    /**
      * Get test slowness threshold.
      */
    def slow(): Double = js.native
    /**
      * Set test slowness threshold.
      */
    def slow(ms: String): this.type = js.native
    def slow(ms: Double): this.type = js.native
    
    /**
      * Get test timeout.
      */
    def timeout(): Double = js.native
    /**
      * Set test timeout.
      */
    def timeout(ms: String): this.type = js.native
    def timeout(ms: Double): this.type = js.native
  }
  
  @js.native
  trait TestContextWithDone
    extends StObject
       with TestContextBase {
    
    /**
      * Mark a test as completed.
      */
    def done(): Unit = js.native
    def done(err: js.Any): Unit = js.native
  }
  
  /**
    * [bdd, tdd, qunit]
    *
    * Describe a specification or test-case with the given `title` and callback `fn` acting as a thunk.
    *
    * The name of the function is used as the name of the test if `title` is not supplied.
    */
  @js.native
  trait TestFunction extends StObject {
    
    def apply(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    def apply(options: Optionsasyncfalseundefine): Test_ = js.native
    def apply(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def apply(options: OptionsasynctruefnTestCas): Test_ = js.native
    def apply(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    def apply(title: String): Test_ = js.native
    def apply(title: String, fn: TestCase): Test_ = js.native
    def apply(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def apply(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    def apply(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def apply(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should be executed exclusively.
      */
    def only(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should be executed exclusively.
      */
    def only(options: Optionsasyncfalseundefine): Test_ = js.native
    def only(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should be executed exclusively.
      */
    def only(options: OptionsasynctruefnTestCas): Test_ = js.native
    def only(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should be executed exclusively.
      */
    def only(title: String): Test_ = js.native
    def only(title: String, fn: TestCase): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should be executed exclusively.
      */
    def only(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def only(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should be executed exclusively.
      */
    def only(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def only(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should be executed exclusively.
      */
    @JSName("only")
    var only_Original: ExclusiveTestFunction = js.native
    
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should not be executed.
      */
    def skip(fn: TestCase): Test_ = js.native
    // tslint:disable-next-line: unified-signatures
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should not be executed.
      */
    def skip(options: Optionsasyncfalseundefine): Test_ = js.native
    def skip(options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should not be executed.
      */
    def skip(options: OptionsasynctruefnTestCas): Test_ = js.native
    def skip(options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should not be executed.
      */
    def skip(title: String): Test_ = js.native
    def skip(title: String, fn: TestCase): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should not be executed.
      */
    def skip(title: String, options: Optionsasyncfalseundefine): Test_ = js.native
    def skip(title: String, options: Optionsasyncfalseundefine, fn: TestCase): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should not be executed.
      */
    def skip(title: String, options: OptionsasynctruefnTestCas): Test_ = js.native
    def skip(title: String, options: OptionsasynctruefnTestCas, fn: TestCaseWithDone): Test_ = js.native
    /**
      * [bdd, tdd, qunit]
      *
      * Indicates this test should not be executed.
      */
    @JSName("skip")
    var skip_Original: PendingTestFunction = js.native
  }
  
  type _To = AnyInterface
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: AnyInterface = ^
}
