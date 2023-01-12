package typings.node

import typings.node.NodeJS.ReadableStream
import typings.node.anon.FnCallNameOptionsFn
import typings.node.nodeStrings.testColondiagnostic
import typings.node.nodeStrings.testColonfail
import typings.node.nodeStrings.testColonpass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColontestMod {
  
  @JSImport("node:test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The `test()` function is the value imported from the test module. Each invocation of this
    * function results in the creation of a test point in the TAP output.
    *
    * The {@link TestContext} object passed to the fn argument can be used to perform actions
    * related to the current test. Examples include skipping the test, adding additional TAP
    * diagnostic information, or creating subtests.
    *
    * `test()` returns a {@link Promise} that resolves once the test completes. The return value
    * can usually be discarded for top level tests. However, the return value from subtests should
    * be used to prevent the parent test from finishing first and cancelling the subtest as shown
    * in the following example.
    *
    * ```js
    * test('top level test', async (t) => {
    *   // The setTimeout() in the following subtest would cause it to outlive its
    *   // parent test if 'await' is removed on the next line. Once the parent test
    *   // completes, it will cancel any outstanding subtests.
    *   await t.test('longer running subtest', async (t) => {
    *     return new Promise((resolve, reject) => {
    *       setTimeout(resolve, 1000);
    *     });
    *   });
    * });
    * ```
    * @since v18.0.0
    * @param name The name of the test, which is displayed when reporting test results.
    *    Default: The `name` property of fn, or `'<anonymous>'` if `fn` does not have a name.
    * @param options Configuration options for the test
    * @param fn The function under test. The first argument to this function is a
    *    {@link TestContext} object. If the test uses callbacks, the callback function is
    *    passed as the second argument. Default: A no-op function.
    * @returns A {@link Promise} resolved with `undefined` once the test completes.
    */
  inline def default(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[Unit]]
  inline def default(fn: TestFn): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(name: String, fn: TestFn): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(name: String, options: Unit, fn: TestFn): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(name: String, options: TestOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(name: String, options: TestOptions, fn: TestFn): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(name: Unit, options: Unit, fn: TestFn): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(name: Unit, options: TestOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(name: Unit, options: TestOptions, fn: TestFn): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(options: Unit, fn: TestFn): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(options: TestOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(options: TestOptions, fn: TestFn): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * This function is used to create a hook running after running a suite.
    * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
    *    the second argument. Default: A no-op function.
    * @param options Configuration options for the hook.
    * @since v18.8.0
    */
  inline def after(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("after")().asInstanceOf[Unit]
  inline def after(fn: Unit, options: HookOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def after(fn: HookFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def after(fn: HookFn, options: HookOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * This function is used to create a hook running after each subtest of the current test.
    * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
    *    the second argument. Default: A no-op function.
    * @param options Configuration options for the hook.
    * @since v18.8.0
    */
  inline def afterEach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterEach")().asInstanceOf[Unit]
  inline def afterEach(fn: Unit, options: HookOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterEach")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterEach(fn: HookFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterEach")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterEach(fn: HookFn, options: HookOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterEach")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * This function is used to create a hook running before running a suite.
    * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
    *    the second argument. Default: A no-op function.
    * @param options Configuration options for the hook.
    * @since v18.8.0
    */
  inline def before(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("before")().asInstanceOf[Unit]
  inline def before(fn: Unit, options: HookOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("before")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def before(fn: HookFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("before")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def before(fn: HookFn, options: HookOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("before")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * This function is used to create a hook running before each subtest of the current suite.
    * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
    *    the second argument. Default: A no-op function.
    * @param options Configuration options for the hook.
    * @since v18.8.0
    */
  inline def beforeEach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeEach")().asInstanceOf[Unit]
  inline def beforeEach(fn: Unit, options: HookOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeEach")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeEach(fn: HookFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeEach")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeEach(fn: HookFn, options: HookOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeEach")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @since v18.6.0
    * @param name The name of the suite, which is displayed when reporting suite results.
    *    Default: The `name` property of fn, or `'<anonymous>'` if `fn` does not have a name.
    * @param options Configuration options for the suite
    * @param fn The function under suite. Default: A no-op function.
    */
  inline def describe(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("describe")().asInstanceOf[Unit]
  inline def describe(fn: SuiteFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("describe")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def describe(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("describe")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def describe(name: String, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def describe(name: String, options: Unit, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def describe(name: String, options: TestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def describe(name: String, options: TestOptions, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def describe(name: Unit, options: Unit, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def describe(name: Unit, options: TestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def describe(name: Unit, options: TestOptions, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def describe(options: Unit, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def describe(options: TestOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("describe")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def describe(options: TestOptions, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @since v18.6.0
    * @param name The name of the test, which is displayed when reporting test results.
    *    Default: The `name` property of fn, or `'<anonymous>'` if `fn` does not have a name.
    * @param options Configuration options for the test
    * @param fn The function under test. If the test uses callbacks, the callback function is
    *    passed as the second argument. Default: A no-op function.
    */
  inline def it(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("it")().asInstanceOf[Unit]
  inline def it(fn: ItFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("it")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def it(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("it")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def it(name: String, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("it")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def it(name: String, options: Unit, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("it")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def it(name: String, options: TestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("it")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def it(name: String, options: TestOptions, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("it")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def it(name: Unit, options: Unit, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("it")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def it(name: Unit, options: TestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("it")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def it(name: Unit, options: TestOptions, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("it")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def it(options: Unit, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("it")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def it(options: TestOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("it")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def it(options: TestOptions, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("it")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Programmatically start the test runner.
    * @since v18.9.0
    * @param options Configuration options for running tests.
    * @returns A {@link TapStream} that emits events about the test execution.
    */
  inline def run(): TapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[TapStream]
  inline def run(options: RunOptions): TapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any]).asInstanceOf[TapStream]
  
  /**
    * The `test()` function is the value imported from the test module. Each invocation of this
    * function results in the creation of a test point in the TAP output.
    *
    * The {@link TestContext} object passed to the fn argument can be used to perform actions
    * related to the current test. Examples include skipping the test, adding additional TAP
    * diagnostic information, or creating subtests.
    *
    * `test()` returns a {@link Promise} that resolves once the test completes. The return value
    * can usually be discarded for top level tests. However, the return value from subtests should
    * be used to prevent the parent test from finishing first and cancelling the subtest as shown
    * in the following example.
    *
    * ```js
    * test('top level test', async (t) => {
    *   // The setTimeout() in the following subtest would cause it to outlive its
    *   // parent test if 'await' is removed on the next line. Once the parent test
    *   // completes, it will cancel any outstanding subtests.
    *   await t.test('longer running subtest', async (t) => {
    *     return new Promise((resolve, reject) => {
    *       setTimeout(resolve, 1000);
    *     });
    *   });
    * });
    * ```
    * @since v18.0.0
    * @param name The name of the test, which is displayed when reporting test results.
    *    Default: The `name` property of fn, or `'<anonymous>'` if `fn` does not have a name.
    * @param options Configuration options for the test
    * @param fn The function under test. The first argument to this function is a
    *    {@link TestContext} object. If the test uses callbacks, the callback function is
    *    passed as the second argument. Default: A no-op function.
    * @returns A {@link Promise} resolved with `undefined` once the test completes.
    */
  inline def test(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("test")().asInstanceOf[js.Promise[Unit]]
  inline def test(fn: TestFn): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def test(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def test(name: String, fn: TestFn): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def test(name: String, options: Unit, fn: TestFn): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def test(name: String, options: TestOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def test(name: String, options: TestOptions, fn: TestFn): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def test(name: Unit, options: Unit, fn: TestFn): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def test(name: Unit, options: TestOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def test(name: Unit, options: TestOptions, fn: TestFn): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def test(options: Unit, fn: TestFn): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def test(options: TestOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def test(options: TestOptions, fn: TestFn): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * The hook function. If the hook uses callbacks, the callback function is passed as the
    * second argument.
    */
  type HookFn = js.Function1[/* done */ js.Function1[/* result */ js.UndefOr[Any], Unit], Any]
  
  /**
    * Configuration options for hooks.
    * @since v18.8.0
    */
  trait HookOptions extends StObject {
    
    /**
      * Allows aborting an in-progress hook.
      */
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * A number of milliseconds the hook will fail after. If unspecified, subtests inherit this
      * value from their parent.
      * @default Infinity
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object HookOptions {
    
    inline def apply(): HookOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HookOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HookOptions] (val x: Self) extends AnyVal {
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /**
    * The type of a function under test.
    * If the test uses callbacks, the callback function is passed as an argument
    */
  type ItFn = js.Function1[/* done */ js.Function1[/* result */ js.UndefOr[Any], Unit], Any]
  
  trait RunOptions extends StObject {
    
    /**
      * @default false
      */
    var concurrency: js.UndefOr[Double | Boolean] = js.undefined
    
    /**
      * An array containing the list of files to run. If unspecified, the test runner execution model will be used.
      */
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Allows aborting an in-progress test.
      * @default undefined
      */
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * A number of milliseconds the test will fail after. If unspecified, subtests inherit this
      * value from their parent.
      * @default Infinity
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object RunOptions {
    
    inline def apply(): RunOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunOptions] (val x: Self) extends AnyVal {
      
      inline def setConcurrency(value: Double | Boolean): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /**
    * The type of a function under Suite.
    * If the test uses callbacks, the callback function is passed as an argument
    */
  type SuiteFn = js.Function1[/* done */ js.Function1[/* result */ js.UndefOr[Any], Unit], Unit]
  
  /**
    * A successful call of the run() method will return a new TapStream object, streaming a TAP output.
    * TapStream will emit events in the order of the tests' definitions.
    * @since v18.9.0
    */
  @js.native
  trait TapStream
    extends StObject
       with ReadableStream {
    
    @JSName("addListener")
    def addListener_testdiagnostic(event: testColondiagnostic, listener: js.Function1[/* message */ String, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_testfail(event: testColonfail, listener: js.Function1[/* data */ TestFail, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_testpass(event: testColonpass, listener: js.Function1[/* data */ TestPass, Unit]): this.type = js.native
    
    @JSName("emit")
    def emit_testdiagnostic(event: testColondiagnostic, message: String): Boolean = js.native
    @JSName("emit")
    def emit_testfail(event: testColonfail, data: TestFail): Boolean = js.native
    @JSName("emit")
    def emit_testpass(event: testColonpass, data: TestPass): Boolean = js.native
    
    @JSName("on")
    def on_testdiagnostic(event: testColondiagnostic, listener: js.Function1[/* message */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_testfail(event: testColonfail, listener: js.Function1[/* data */ TestFail, Unit]): this.type = js.native
    @JSName("on")
    def on_testpass(event: testColonpass, listener: js.Function1[/* data */ TestPass, Unit]): this.type = js.native
    
    @JSName("once")
    def once_testdiagnostic(event: testColondiagnostic, listener: js.Function1[/* message */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_testfail(event: testColonfail, listener: js.Function1[/* data */ TestFail, Unit]): this.type = js.native
    @JSName("once")
    def once_testpass(event: testColonpass, listener: js.Function1[/* data */ TestPass, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_testdiagnostic(event: testColondiagnostic, listener: js.Function1[/* message */ String, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_testfail(event: testColonfail, listener: js.Function1[/* data */ TestFail, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_testpass(event: testColonpass, listener: js.Function1[/* data */ TestPass, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_testdiagnostic(event: testColondiagnostic, listener: js.Function1[/* message */ String, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_testfail(event: testColonfail, listener: js.Function1[/* data */ TestFail, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_testpass(event: testColonpass, listener: js.Function1[/* data */ TestPass, Unit]): this.type = js.native
  }
  
  /**
    * An instance of `TestContext` is passed to each test function in order to interact with the
    * test runner. However, the `TestContext` constructor is not exposed as part of the API.
    * @since v18.0.0
    */
  @js.native
  trait TestContext extends StObject {
    
    /**
      * This function is used to write TAP diagnostics to the output. Any diagnostic information is
      * included at the end of the test's results. This function does not return a value.
      * @param message Message to be displayed as a TAP diagnostic.
      * @since v18.0.0
      */
    def diagnostic(message: String): Unit = js.native
    
    /**
      * If `shouldRunOnlyTests` is truthy, the test context will only run tests that have the `only`
      * option set. Otherwise, all tests are run. If Node.js was not started with the `--test-only`
      * command-line option, this function is a no-op.
      * @param shouldRunOnlyTests Whether or not to run `only` tests.
      * @since v18.0.0
      */
    def runOnly(shouldRunOnlyTests: Boolean): Unit = js.native
    
    /**
      * This function causes the test's output to indicate the test as skipped. If `message` is
      * provided, it is included in the TAP output. Calling `skip()` does not terminate execution of
      * the test function. This function does not return a value.
      * @param message Optional skip message to be displayed in TAP output.
      * @since v18.0.0
      */
    def skip(): Unit = js.native
    def skip(message: String): Unit = js.native
    
    /**
      * This function is used to create subtests under the current test. This function behaves in
      * the same fashion as the top level {@link test} function.
      * @since v18.0.0
      * @param name The name of the test, which is displayed when reporting test results.
      *    Default: The `name` property of fn, or `'<anonymous>'` if `fn` does not have a name.
      * @param options Configuration options for the test
      * @param fn The function under test. This first argument to this function is a
      *    {@link TestContext} object. If the test uses callbacks, the callback function is
      *    passed as the second argument. Default: A no-op function.
      * @returns A {@link Promise} resolved with `undefined` once the test completes.
      */
    def test(): js.Promise[Unit] = js.native
    def test(fn: TestFn): js.Promise[Unit] = js.native
    def test(name: String): js.Promise[Unit] = js.native
    def test(name: String, fn: TestFn): js.Promise[Unit] = js.native
    def test(name: String, options: Unit, fn: TestFn): js.Promise[Unit] = js.native
    def test(name: String, options: TestOptions): js.Promise[Unit] = js.native
    def test(name: String, options: TestOptions, fn: TestFn): js.Promise[Unit] = js.native
    def test(name: Unit, options: Unit, fn: TestFn): js.Promise[Unit] = js.native
    def test(name: Unit, options: TestOptions): js.Promise[Unit] = js.native
    def test(name: Unit, options: TestOptions, fn: TestFn): js.Promise[Unit] = js.native
    def test(options: Unit, fn: TestFn): js.Promise[Unit] = js.native
    def test(options: TestOptions): js.Promise[Unit] = js.native
    def test(options: TestOptions, fn: TestFn): js.Promise[Unit] = js.native
    /**
      * This function is used to create subtests under the current test. This function behaves in
      * the same fashion as the top level {@link test} function.
      * @since v18.0.0
      * @param name The name of the test, which is displayed when reporting test results.
      *    Default: The `name` property of fn, or `'<anonymous>'` if `fn` does not have a name.
      * @param options Configuration options for the test
      * @param fn The function under test. This first argument to this function is a
      *    {@link TestContext} object. If the test uses callbacks, the callback function is
      *    passed as the second argument. Default: A no-op function.
      * @returns A {@link Promise} resolved with `undefined` once the test completes.
      */
    @JSName("test")
    var test_Original: FnCallNameOptionsFn = js.native
    
    /**
      * This function adds a `TODO` directive to the test's output. If `message` is provided, it is
      * included in the TAP output. Calling `todo()` does not terminate execution of the test
      * function. This function does not return a value.
      * @param message Optional `TODO` message to be displayed in TAP output.
      * @since v18.0.0
      */
    def todo(): Unit = js.native
    def todo(message: String): Unit = js.native
  }
  
  trait TestFail extends StObject {
    
    /**
      * The test duration.
      */
    var duration: Double
    
    /**
      * The failure casing test to fail.
      */
    var error: js.Error
    
    /**
      * The test name.
      */
    var name: String
    
    /**
      * Present if `context.skip` is called.
      */
    var skip: js.UndefOr[String] = js.undefined
    
    /**
      * The ordinal number of the test.
      */
    var testNumber: Double
    
    /**
      * Present if `context.todo` is called.
      */
    var todo: js.UndefOr[String] = js.undefined
  }
  object TestFail {
    
    inline def apply(duration: Double, error: js.Error, name: String, testNumber: Double): TestFail = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], testNumber = testNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestFail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestFail] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: String): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setTestNumber(value: Double): Self = StObject.set(x, "testNumber", value.asInstanceOf[js.Any])
      
      inline def setTodo(value: String): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
      
      inline def setTodoUndefined: Self = StObject.set(x, "todo", js.undefined)
    }
  }
  
  /**
    * The type of a function under test. The first argument to this function is a
    * {@link TestContext} object. If the test uses callbacks, the callback function is passed as
    * the second argument.
    */
  type TestFn = js.Function2[
    /* t */ TestContext, 
    /* done */ js.Function1[/* result */ js.UndefOr[Any], Unit], 
    Any
  ]
  
  trait TestOptions extends StObject {
    
    /**
      * The number of tests that can be run at the same time. If unspecified, subtests inherit this
      * value from their parent.
      * @default 1
      */
    var concurrency: js.UndefOr[Double] = js.undefined
    
    /**
      * If truthy, and the test context is configured to run `only` tests, then this test will be
      * run. Otherwise, the test is skipped.
      * @default false
      */
    var only: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows aborting an in-progress test.
      * @since v18.8.0
      */
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * If truthy, the test is skipped. If a string is provided, that string is displayed in the
      * test results as the reason for skipping the test.
      * @default false
      */
    var skip: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * A number of milliseconds the test will fail after. If unspecified, subtests inherit this
      * value from their parent.
      * @default Infinity
      * @since v18.7.0
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * If truthy, the test marked as `TODO`. If a string is provided, that string is displayed in
      * the test results as the reason why the test is `TODO`.
      * @default false
      */
    var todo: js.UndefOr[Boolean | String] = js.undefined
  }
  object TestOptions {
    
    inline def apply(): TestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestOptions] (val x: Self) extends AnyVal {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSkip(value: Boolean | String): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTodo(value: Boolean | String): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
      
      inline def setTodoUndefined: Self = StObject.set(x, "todo", js.undefined)
    }
  }
  
  trait TestPass extends StObject {
    
    /**
      * The test duration.
      */
    var duration: Double
    
    /**
      * The test name.
      */
    var name: String
    
    /**
      * Present if `context.skip` is called.
      */
    var skip: js.UndefOr[String] = js.undefined
    
    /**
      * The ordinal number of the test.
      */
    var testNumber: Double
    
    /**
      * Present if `context.todo` is called.
      */
    var todo: js.UndefOr[String] = js.undefined
  }
  object TestPass {
    
    inline def apply(duration: Double, name: String, testNumber: Double): TestPass = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], testNumber = testNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestPass]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestPass] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: String): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setTestNumber(value: Double): Self = StObject.set(x, "testNumber", value.asInstanceOf[js.Any])
      
      inline def setTodo(value: String): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
      
      inline def setTodoUndefined: Self = StObject.set(x, "todo", js.undefined)
    }
  }
}
