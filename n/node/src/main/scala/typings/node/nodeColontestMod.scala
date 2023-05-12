package typings.node

import typings.node.NodeJS.ReadableStream
import typings.node.anon.Duration
import typings.node.anon.DurationNumber
import typings.node.anon.FnCallNameOptionsFn
import typings.node.anon.Mock
import typings.node.anon.MockFunction
import typings.node.nodeStrings.testColondiagnostic
import typings.node.nodeStrings.testColonfail
import typings.node.nodeStrings.testColonpass
import typings.node.nodeStrings.testColonplan
import typings.node.nodeStrings.testColonstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColontestMod {
  
  @JSImport("node:test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The `test()` function is the value imported from the `test` module. Each
    * invocation of this function results in reporting the test to the `TestsStream`.
    *
    * The `TestContext` object passed to the `fn` argument can be used to perform
    * actions related to the current test. Examples include skipping the test, adding
    * additional diagnostic information, or creating subtests.
    *
    * `test()` returns a `Promise` that resolves once the test completes.
    * if `test()` is called within a `describe()` block, it resolve immediately.
    * The return value can usually be discarded for top level tests.
    * However, the return value from subtests should be used to prevent the parent
    * test from finishing first and cancelling the subtest
    * as shown in the following example.
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
    *
    * The `timeout` option can be used to fail the test if it takes longer than`timeout` milliseconds to complete. However, it is not a reliable mechanism for
    * canceling tests because a running test might block the application thread and
    * thus prevent the scheduled cancellation.
    * @since v18.0.0, v16.17.0
    * @param [name='The name'] The name of the test, which is displayed when reporting test results.
    * @param options Configuration options for the test. The following properties are supported:
    * @param [fn='A no-op function'] The function under test. The first argument to this function is a {@link TestContext} object. If the test uses callbacks, the callback function is passed as the
    * second argument.
    * @return Resolved with `undefined` once the test completes, or immediately if the test runs within {@link describe}.
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
    * This function is used to create a hook running after  running a suite.
    *
    * ```js
    * describe('tests', async () => {
    *   after(() => console.log('finished running tests'));
    *   it('is a subtest', () => {
    *     assert.ok('some relevant assertion here');
    *   });
    * });
    * ```
    * @since v18.8.0, v16.18.0
    * @param [fn='A no-op function'] The hook function. If the hook uses callbacks, the callback function is passed as the second argument.
    * @param options Configuration options for the hook. The following properties are supported:
    */
  inline def after(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("after")().asInstanceOf[Unit]
  inline def after(fn: Unit, options: HookOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def after(fn: HookFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def after(fn: HookFn, options: HookOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("after")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * This function is used to create a hook running
    * after each subtest of the current test.
    *
    * ```js
    * describe('tests', async () => {
    *   afterEach(() => console.log('finished running a test'));
    *   it('is a subtest', () => {
    *     assert.ok('some relevant assertion here');
    *   });
    * });
    * ```
    * @since v18.8.0, v16.18.0
    * @param [fn='A no-op function'] The hook function. If the hook uses callbacks, the callback function is passed as the second argument.
    * @param options Configuration options for the hook. The following properties are supported:
    */
  inline def afterEach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterEach")().asInstanceOf[Unit]
  inline def afterEach(fn: Unit, options: HookOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterEach")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterEach(fn: HookFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterEach")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterEach(fn: HookFn, options: HookOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterEach")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * This function is used to create a hook running before running a suite.
    *
    * ```js
    * describe('tests', async () => {
    *   before(() => console.log('about to run some test'));
    *   it('is a subtest', () => {
    *     assert.ok('some relevant assertion here');
    *   });
    * });
    * ```
    * @since v18.8.0, v16.18.0
    * @param [fn='A no-op function'] The hook function. If the hook uses callbacks, the callback function is passed as the second argument.
    * @param options Configuration options for the hook. The following properties are supported:
    */
  inline def before(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("before")().asInstanceOf[Unit]
  inline def before(fn: Unit, options: HookOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("before")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def before(fn: HookFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("before")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def before(fn: HookFn, options: HookOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("before")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * This function is used to create a hook running
    * before each subtest of the current suite.
    *
    * ```js
    * describe('tests', async () => {
    *   beforeEach(() => console.log('about to run a test'));
    *   it('is a subtest', () => {
    *     assert.ok('some relevant assertion here');
    *   });
    * });
    * ```
    * @since v18.8.0, v16.18.0
    * @param [fn='A no-op function'] The hook function. If the hook uses callbacks, the callback function is passed as the second argument.
    * @param options Configuration options for the hook. The following properties are supported:
    */
  inline def beforeEach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeEach")().asInstanceOf[Unit]
  inline def beforeEach(fn: Unit, options: HookOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeEach")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeEach(fn: HookFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeEach")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeEach(fn: HookFn, options: HookOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeEach")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object describe {
    
    /**
      * The `describe()` function imported from the `node:test` module. Each
      * invocation of this function results in the creation of a Subtest.
      * After invocation of top level `describe` functions,
      * all top level tests and suites will execute.
      * @param [name='The name'] The name of the suite, which is displayed when reporting test results.
      * @param options Configuration options for the suite. supports the same options as `test([name][, options][, fn])`.
      * @param [fn='A no-op function'] The function under suite declaring all subtests and subsuites. The first argument to this function is a {@link SuiteContext} object.
      * @return `undefined`.
      */
    inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
    inline def apply(fn: SuiteFn): Unit = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(name: String): Unit = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(name: String, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(name: String, options: Unit, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(name: String, options: TestOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(name: String, options: TestOptions, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(name: Unit, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(name: Unit, options: Unit, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(name: Unit, options: TestOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(name: Unit, options: TestOptions, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(options: TestOptions): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(options: TestOptions, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("node:test", "describe")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Shorthand for skipping a suite, same as `describe([name], { skip: true }[, fn])`.
      */
    inline def skip(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")().asInstanceOf[Unit]
    inline def skip(fn: SuiteFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def skip(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def skip(name: String, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def skip(name: String, options: Unit, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def skip(name: String, options: TestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def skip(name: String, options: TestOptions, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def skip(name: Unit, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def skip(name: Unit, options: Unit, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def skip(name: Unit, options: TestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def skip(name: Unit, options: TestOptions, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def skip(options: TestOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def skip(options: TestOptions, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Shorthand for marking a suite as `TODO`, same as `describe([name], { todo: true }[, fn])`.
      */
    inline def todo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("todo")().asInstanceOf[Unit]
    inline def todo(fn: SuiteFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("todo")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def todo(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def todo(name: String, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def todo(name: String, options: Unit, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def todo(name: String, options: TestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def todo(name: String, options: TestOptions, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def todo(name: Unit, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def todo(name: Unit, options: Unit, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def todo(name: Unit, options: TestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def todo(name: Unit, options: TestOptions, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def todo(options: TestOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("todo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def todo(options: TestOptions, fn: SuiteFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object it {
    
    /**
      * Shorthand for `test()`.
      *
      * The `it()` function is imported from the `node:test` module.
      * @since v18.6.0, v16.17.0
      */
    inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
    inline def apply(fn: ItFn): Unit = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(name: String): Unit = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(name: String, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(name: String, options: Unit, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(name: String, options: TestOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(name: String, options: TestOptions, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(name: Unit, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(name: Unit, options: Unit, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(name: Unit, options: TestOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(name: Unit, options: TestOptions, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(options: TestOptions): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(options: TestOptions, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("node:test", "it")
    @js.native
    val ^ : js.Any = js.native
    
    // Shorthand for skipping a test, same as `it([name], { skip: true }[, fn])`.
    inline def skip(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")().asInstanceOf[Unit]
    inline def skip(fn: ItFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def skip(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def skip(name: String, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def skip(name: String, options: Unit, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def skip(name: String, options: TestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def skip(name: String, options: TestOptions, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def skip(name: Unit, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def skip(name: Unit, options: Unit, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def skip(name: Unit, options: TestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def skip(name: Unit, options: TestOptions, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def skip(options: TestOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def skip(options: TestOptions, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    // Shorthand for marking a test as `TODO`, same as `it([name], { todo: true }[, fn])`.
    inline def todo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("todo")().asInstanceOf[Unit]
    inline def todo(fn: ItFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("todo")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def todo(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def todo(name: String, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def todo(name: String, options: Unit, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def todo(name: String, options: TestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def todo(name: String, options: TestOptions, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def todo(name: Unit, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def todo(name: Unit, options: Unit, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def todo(name: Unit, options: TestOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def todo(name: Unit, options: TestOptions, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def todo(options: TestOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("todo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def todo(options: TestOptions, fn: ItFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("todo")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("node:test", "mock")
  @js.native
  val mock: MockTracker = js.native
  
  /**
    * ```js
    * import { tap } from 'node:test/reporters';
    * import process from 'node:process';
    *
    * run({ files: [path.resolve('./tests/test.js')] })
    *   .compose(tap)
    *   .pipe(process.stdout);
    * ```
    * @since v18.9.0, v16.19.0
    * @param options Configuration options for running tests. The following properties are supported:
    */
  inline def run(): TestsStream = ^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[TestsStream]
  inline def run(options: RunOptions): TestsStream = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any]).asInstanceOf[TestsStream]
  
  /**
    * The `test()` function is the value imported from the `test` module. Each
    * invocation of this function results in reporting the test to the `TestsStream`.
    *
    * The `TestContext` object passed to the `fn` argument can be used to perform
    * actions related to the current test. Examples include skipping the test, adding
    * additional diagnostic information, or creating subtests.
    *
    * `test()` returns a `Promise` that resolves once the test completes.
    * if `test()` is called within a `describe()` block, it resolve immediately.
    * The return value can usually be discarded for top level tests.
    * However, the return value from subtests should be used to prevent the parent
    * test from finishing first and cancelling the subtest
    * as shown in the following example.
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
    *
    * The `timeout` option can be used to fail the test if it takes longer than`timeout` milliseconds to complete. However, it is not a reliable mechanism for
    * canceling tests because a running test might block the application thread and
    * thus prevent the scheduled cancellation.
    * @since v18.0.0, v16.17.0
    * @param [name='The name'] The name of the test, which is displayed when reporting test results.
    * @param options Configuration options for the test. The following properties are supported:
    * @param [fn='A no-op function'] The function under test. The first argument to this function is a {@link TestContext} object. If the test uses callbacks, the callback function is passed as the
    * second argument.
    * @return Resolved with `undefined` once the test completes, or immediately if the test runs within {@link describe}.
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
  
  trait DiagnosticData extends StObject {
    
    /**
      * The diagnostic message.
      */
    var message: String
    
    /**
      * The nesting level of the test.
      */
    var nesting: Double
  }
  object DiagnosticData {
    
    inline def apply(message: String, nesting: Double): DiagnosticData = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], nesting = nesting.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagnosticData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DiagnosticData] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setNesting(value: Double): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
    }
  }
  
  type FunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any
  
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
  
  trait MockFunctionCall[F /* <: js.Function */, ReturnType, Args] extends StObject {
    
    /**
      * An array of the arguments passed to the mock function.
      */
    var arguments: Args
    
    /**
      * If the mocked function threw then this property contains the thrown value.
      */
    var error: js.UndefOr[Any] = js.undefined
    
    /**
      * The value returned by the mocked function.
      *
      * If the mocked function threw, it will be `undefined`.
      */
    var result: js.UndefOr[ReturnType] = js.undefined
    
    /**
      * An `Error` object whose stack can be used to determine the callsite of the mocked function invocation.
      */
    var stack: js.Error
    
    /**
      * If the mocked function is a constructor, this field contains the class being constructed.
      * Otherwise this will be `undefined`.
      */
    var target: /* import warning: importer.ImportType#apply Failed type conversion: F extends abstract new (args : any): any ? F : undefined */ js.Any
    
    /**
      * The mocked function's `this` value.
      */
    var `this`: Any
  }
  object MockFunctionCall {
    
    inline def apply[F /* <: js.Function */, ReturnType, Args](
      arguments: Args,
      stack: js.Error,
      target: /* import warning: importer.ImportType#apply Failed type conversion: F extends abstract new (args : any): any ? F : undefined */ js.Any,
      `this`: Any
    ): MockFunctionCall[F, ReturnType, Args] = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockFunctionCall[F, ReturnType, Args]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MockFunctionCall[?, ?, ?], F /* <: js.Function */, ReturnType, Args] (val x: Self & (MockFunctionCall[F, ReturnType, Args])) extends AnyVal {
      
      inline def setArguments(value: Args): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setResult(value: ReturnType): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setStack(value: js.Error): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setTarget(
        value: /* import warning: importer.ImportType#apply Failed type conversion: F extends abstract new (args : any): any ? F : undefined */ js.Any
      ): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setThis(value: Any): Self = StObject.set(x, "this", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The `MockFunctionContext` class is used to inspect or manipulate the behavior of
    * mocks created via the `MockTracker` APIs.
    * @since v19.1.0, v18.13.0
    */
  @js.native
  trait MockFunctionContext[F /* <: js.Function */] extends StObject {
    
    /**
      * This function returns the number of times that this mock has been invoked. This
      * function is more efficient than checking `ctx.calls.length` because `ctx.calls`is a getter that creates a copy of the internal call tracking array.
      * @since v19.1.0, v18.13.0
      * @return The number of times that this mock has been invoked.
      */
    def callCount(): Double = js.native
    
    /**
      * A getter that returns a copy of the internal array used to track calls to the
      * mock. Each entry in the array is an object with the following properties.
      * @since v19.1.0, v18.13.0
      */
    val calls: js.Array[
        MockFunctionCall[
          F, 
          /* import warning: importer.ImportType#apply Failed type conversion: F extends (args : any): infer T ? T : F extends abstract new (args : any): infer T ? T : unknown */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: F extends (args : infer Y): any ? Y : F extends abstract new (args : infer Y): any ? Y : std.Array<unknown> */ js.Any
        ]
      ] = js.native
    
    /**
      * This function is used to change the behavior of an existing mock.
      *
      * The following example creates a mock function using `t.mock.fn()`, calls the
      * mock function, and then changes the mock implementation to a different function.
      *
      * ```js
      * test('changes a mock behavior', (t) => {
      *   let cnt = 0;
      *
      *   function addOne() {
      *     cnt++;
      *     return cnt;
      *   }
      *
      *   function addTwo() {
      *     cnt += 2;
      *     return cnt;
      *   }
      *
      *   const fn = t.mock.fn(addOne);
      *
      *   assert.strictEqual(fn(), 1);
      *   fn.mock.mockImplementation(addTwo);
      *   assert.strictEqual(fn(), 3);
      *   assert.strictEqual(fn(), 5);
      * });
      * ```
      * @since v19.1.0, v18.13.0
      * @param implementation The function to be used as the mock's new implementation.
      */
    def mockImplementation(implementation: js.Function): Unit = js.native
    
    /**
      * This function is used to change the behavior of an existing mock for a single
      * invocation. Once invocation `onCall` has occurred, the mock will revert to
      * whatever behavior it would have used had `mockImplementationOnce()` not been
      * called.
      *
      * The following example creates a mock function using `t.mock.fn()`, calls the
      * mock function, changes the mock implementation to a different function for the
      * next invocation, and then resumes its previous behavior.
      *
      * ```js
      * test('changes a mock behavior once', (t) => {
      *   let cnt = 0;
      *
      *   function addOne() {
      *     cnt++;
      *     return cnt;
      *   }
      *
      *   function addTwo() {
      *     cnt += 2;
      *     return cnt;
      *   }
      *
      *   const fn = t.mock.fn(addOne);
      *
      *   assert.strictEqual(fn(), 1);
      *   fn.mock.mockImplementationOnce(addTwo);
      *   assert.strictEqual(fn(), 3);
      *   assert.strictEqual(fn(), 4);
      * });
      * ```
      * @since v19.1.0, v18.13.0
      * @param implementation The function to be used as the mock's implementation for the invocation number specified by `onCall`.
      * @param onCall The invocation number that will use `implementation`. If the specified invocation has already occurred then an exception is thrown.
      */
    def mockImplementationOnce(implementation: js.Function): Unit = js.native
    def mockImplementationOnce(implementation: js.Function, onCall: Double): Unit = js.native
    
    /**
      * Resets the call history of the mock function.
      * @since v19.3.0, v18.13.0
      */
    def resetCalls(): Unit = js.native
    
    /**
      * Resets the implementation of the mock function to its original behavior. The
      * mock can still be used after calling this function.
      * @since v19.1.0, v18.13.0
      */
    def restore(): Unit = js.native
  }
  
  trait MockFunctionOptions extends StObject {
    
    /**
      * The number of times that the mock will use the behavior of `implementation`.
      * Once the mock function has been called `times` times,
      * it will automatically restore the behavior of `original`.
      * This value must be an integer greater than zero.
      * @default Infinity
      */
    var times: js.UndefOr[Double] = js.undefined
  }
  object MockFunctionOptions {
    
    inline def apply(): MockFunctionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockFunctionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MockFunctionOptions] (val x: Self) extends AnyVal {
      
      inline def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
      
      inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    }
  }
  
  trait MockMethodOptions
    extends StObject
       with MockFunctionOptions {
    
    /**
      * If `true`, `object[methodName]` is treated as a getter.
      * This option cannot be used with the `setter` option.
      */
    var getter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, `object[methodName]` is treated as a setter.
      * This option cannot be used with the `getter` option.
      */
    var setter: js.UndefOr[Boolean] = js.undefined
  }
  object MockMethodOptions {
    
    inline def apply(): MockMethodOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockMethodOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MockMethodOptions] (val x: Self) extends AnyVal {
      
      inline def setGetter(value: Boolean): Self = StObject.set(x, "getter", value.asInstanceOf[js.Any])
      
      inline def setGetterUndefined: Self = StObject.set(x, "getter", js.undefined)
      
      inline def setSetter(value: Boolean): Self = StObject.set(x, "setter", value.asInstanceOf[js.Any])
      
      inline def setSetterUndefined: Self = StObject.set(x, "setter", js.undefined)
    }
  }
  
  /**
    * The `MockTracker` class is used to manage mocking functionality. The test runner
    * module provides a top level `mock` export which is a `MockTracker` instance.
    * Each test also provides its own `MockTracker` instance via the test context's`mock` property.
    * @since v19.1.0, v18.13.0
    */
  @js.native
  trait MockTracker extends StObject {
    
    /**
      * This function is used to create a mock function.
      *
      * The following example creates a mock function that increments a counter by one
      * on each invocation. The `times` option is used to modify the mock behavior such
      * that the first two invocations add two to the counter instead of one.
      *
      * ```js
      * test('mocks a counting function', (t) => {
      *   let cnt = 0;
      *
      *   function addOne() {
      *     cnt++;
      *     return cnt;
      *   }
      *
      *   function addTwo() {
      *     cnt += 2;
      *     return cnt;
      *   }
      *
      *   const fn = t.mock.fn(addOne, addTwo, { times: 2 });
      *
      *   assert.strictEqual(fn(), 2);
      *   assert.strictEqual(fn(), 4);
      *   assert.strictEqual(fn(), 5);
      *   assert.strictEqual(fn(), 6);
      * });
      * ```
      * @since v19.1.0, v18.13.0
      * @param [original='A no-op function'] An optional function to create a mock on.
      * @param implementation An optional function used as the mock implementation for `original`. This is useful for creating mocks that exhibit one behavior for a specified number of calls and
      * then restore the behavior of `original`.
      * @param options Optional configuration options for the mock function. The following properties are supported:
      * @return The mocked function. The mocked function contains a special `mock` property, which is an instance of {@link MockFunctionContext}, and can be used for inspecting and changing the
      * behavior of the mocked function.
      */
    def fn[F /* <: js.Function */](): Mock_[F] = js.native
    def fn[F /* <: js.Function */](original: F): Mock_[F] = js.native
    def fn[F /* <: js.Function */](original: F, options: MockFunctionOptions): Mock_[F] = js.native
    def fn[F /* <: js.Function */](original: Unit, options: MockFunctionOptions): Mock_[F] = js.native
    def fn[F /* <: js.Function */, Implementation /* <: js.Function */](original: F, implementation: Implementation): Mock_[F | Implementation] = js.native
    def fn[F /* <: js.Function */, Implementation /* <: js.Function */](original: F, implementation: Implementation, options: MockFunctionOptions): Mock_[F | Implementation] = js.native
    def fn[F /* <: js.Function */, Implementation /* <: js.Function */](original: F, implementation: Unit, options: MockFunctionOptions): Mock_[F | Implementation] = js.native
    def fn[F /* <: js.Function */, Implementation /* <: js.Function */](original: Unit, implementation: Implementation): Mock_[F | Implementation] = js.native
    def fn[F /* <: js.Function */, Implementation /* <: js.Function */](original: Unit, implementation: Implementation, options: MockFunctionOptions): Mock_[F | Implementation] = js.native
    def fn[F /* <: js.Function */, Implementation /* <: js.Function */](original: Unit, implementation: Unit, options: MockFunctionOptions): Mock_[F | Implementation] = js.native
    @JSName("fn")
    def fn_FImplementation[F /* <: js.Function */, Implementation /* <: js.Function */](): Mock_[F | Implementation] = js.native
    @JSName("fn")
    def fn_FImplementation[F /* <: js.Function */, Implementation /* <: js.Function */](original: F): Mock_[F | Implementation] = js.native
    
    /**
      * This function is syntax sugar for `MockTracker.method` with `options.getter`set to `true`.
      * @since v19.3.0, v18.13.0
      */
    def getter[MockedObject /* <: js.Object */, MethodName /* <: /* keyof MockedObject */ String */](`object`: MockedObject, methodName: MethodName): Mock_[
        js.Function0[
          /* import warning: importer.ImportType#apply Failed type conversion: MockedObject[MethodName] */ js.Any
        ]
      ] = js.native
    def getter[MockedObject /* <: js.Object */, MethodName /* <: /* keyof MockedObject */ String */](`object`: MockedObject, methodName: MethodName, options: MockFunctionOptions): Mock_[
        js.Function0[
          /* import warning: importer.ImportType#apply Failed type conversion: MockedObject[MethodName] */ js.Any
        ]
      ] = js.native
    def getter[MockedObject /* <: js.Object */, MethodName /* <: /* keyof MockedObject */ String */, Implementation /* <: js.Function */](`object`: MockedObject, methodName: MethodName, implementation: Implementation): Mock_[
        (js.Function0[
          /* import warning: importer.ImportType#apply Failed type conversion: MockedObject[MethodName] */ js.Any
        ]) | Implementation
      ] = js.native
    def getter[MockedObject /* <: js.Object */, MethodName /* <: /* keyof MockedObject */ String */, Implementation /* <: js.Function */](
      `object`: MockedObject,
      methodName: MethodName,
      implementation: Implementation,
      options: MockFunctionOptions
    ): Mock_[
        (js.Function0[
          /* import warning: importer.ImportType#apply Failed type conversion: MockedObject[MethodName] */ js.Any
        ]) | Implementation
      ] = js.native
    def getter[MockedObject /* <: js.Object */, MethodName /* <: /* keyof MockedObject */ String */, Implementation /* <: js.Function */](`object`: MockedObject, methodName: MethodName, implementation: Unit, options: MockFunctionOptions): Mock_[
        (js.Function0[
          /* import warning: importer.ImportType#apply Failed type conversion: MockedObject[MethodName] */ js.Any
        ]) | Implementation
      ] = js.native
    @JSName("getter")
    def getter_MockedObjectMethodNameImplementation[MockedObject /* <: js.Object */, MethodName /* <: /* keyof MockedObject */ String */, Implementation /* <: js.Function */](`object`: MockedObject, methodName: MethodName): Mock_[
        (js.Function0[
          /* import warning: importer.ImportType#apply Failed type conversion: MockedObject[MethodName] */ js.Any
        ]) | Implementation
      ] = js.native
    
    def method[MockedObject /* <: js.Object */](
      `object`: MockedObject,
      methodName: /* keyof MockedObject */ String,
      implementation: js.Function,
      options: MockMethodOptions
    ): MockFunction = js.native
    def method[MockedObject /* <: js.Object */](`object`: MockedObject, methodName: /* keyof MockedObject */ String, options: MockMethodOptions): MockFunction = js.native
    /**
      * This function is used to create a mock on an existing object method. The
      * following example demonstrates how a mock is created on an existing object
      * method.
      *
      * ```js
      * test('spies on an object method', (t) => {
      *   const number = {
      *     value: 5,
      *     subtract(a) {
      *       return this.value - a;
      *     },
      *   };
      *
      *   t.mock.method(number, 'subtract');
      *   assert.strictEqual(number.subtract.mock.calls.length, 0);
      *   assert.strictEqual(number.subtract(3), 2);
      *   assert.strictEqual(number.subtract.mock.calls.length, 1);
      *
      *   const call = number.subtract.mock.calls[0];
      *
      *   assert.deepStrictEqual(call.arguments, [3]);
      *   assert.strictEqual(call.result, 2);
      *   assert.strictEqual(call.error, undefined);
      *   assert.strictEqual(call.target, undefined);
      *   assert.strictEqual(call.this, number);
      * });
      * ```
      * @since v19.1.0, v18.13.0
      * @param object The object whose method is being mocked.
      * @param methodName The identifier of the method on `object` to mock. If `object[methodName]` is not a function, an error is thrown.
      * @param implementation An optional function used as the mock implementation for `object[methodName]`.
      * @param options Optional configuration options for the mock method. The following properties are supported:
      * @return The mocked method. The mocked method contains a special `mock` property, which is an instance of {@link MockFunctionContext}, and can be used for inspecting and changing the
      * behavior of the mocked method.
      */
    def method[MockedObject /* <: js.Object */, MethodName /* <: FunctionPropertyNames[MockedObject] */](`object`: MockedObject, methodName: MethodName): /* import warning: importer.ImportType#apply Failed type conversion: MockedObject[MethodName] extends std.Function ? node.node:test.Mock<MockedObject[MethodName]> : never */ js.Any = js.native
    def method[MockedObject /* <: js.Object */, MethodName /* <: FunctionPropertyNames[MockedObject] */](`object`: MockedObject, methodName: MethodName, options: MockFunctionOptions): /* import warning: importer.ImportType#apply Failed type conversion: MockedObject[MethodName] extends std.Function ? node.node:test.Mock<MockedObject[MethodName]> : never */ js.Any = js.native
    def method[MockedObject /* <: js.Object */, MethodName /* <: FunctionPropertyNames[MockedObject] */, Implementation /* <: js.Function */](`object`: MockedObject, methodName: MethodName, implementation: Implementation): /* import warning: importer.ImportType#apply Failed type conversion: MockedObject[MethodName] extends std.Function ? node.node:test.Mock<MockedObject[MethodName] | Implementation> : never */ js.Any = js.native
    def method[MockedObject /* <: js.Object */, MethodName /* <: FunctionPropertyNames[MockedObject] */, Implementation /* <: js.Function */](
      `object`: MockedObject,
      methodName: MethodName,
      implementation: Implementation,
      options: MockFunctionOptions
    ): /* import warning: importer.ImportType#apply Failed type conversion: MockedObject[MethodName] extends std.Function ? node.node:test.Mock<MockedObject[MethodName] | Implementation> : never */ js.Any = js.native
    
    /**
      * This function restores the default behavior of all mocks that were previously
      * created by this `MockTracker` and disassociates the mocks from the`MockTracker` instance. Once disassociated, the mocks can still be used, but the`MockTracker` instance can no longer be
      * used to reset their behavior or
      * otherwise interact with them.
      *
      * After each test completes, this function is called on the test context's`MockTracker`. If the global `MockTracker` is used extensively, calling this
      * function manually is recommended.
      * @since v19.1.0, v18.13.0
      */
    def reset(): Unit = js.native
    
    /**
      * This function restores the default behavior of all mocks that were previously
      * created by this `MockTracker`. Unlike `mock.reset()`, `mock.restoreAll()` does
      * not disassociate the mocks from the `MockTracker` instance.
      * @since v19.1.0, v18.13.0
      */
    def restoreAll(): Unit = js.native
    
    /**
      * This function is syntax sugar for `MockTracker.method` with `options.setter`set to `true`.
      * @since v19.3.0, v18.13.0
      */
    def setter[MockedObject /* <: js.Object */, MethodName /* <: /* keyof MockedObject */ String */](`object`: MockedObject, methodName: MethodName): Mock_[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: MockedObject[MethodName] */ /* value */ js.Any, 
          Unit
        ]
      ] = js.native
    def setter[MockedObject /* <: js.Object */, MethodName /* <: /* keyof MockedObject */ String */](`object`: MockedObject, methodName: MethodName, options: MockFunctionOptions): Mock_[
        js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: MockedObject[MethodName] */ /* value */ js.Any, 
          Unit
        ]
      ] = js.native
    def setter[MockedObject /* <: js.Object */, MethodName /* <: /* keyof MockedObject */ String */, Implementation /* <: js.Function */](`object`: MockedObject, methodName: MethodName, implementation: Implementation): Mock_[
        (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: MockedObject[MethodName] */ /* value */ js.Any, 
          Unit
        ]) | Implementation
      ] = js.native
    def setter[MockedObject /* <: js.Object */, MethodName /* <: /* keyof MockedObject */ String */, Implementation /* <: js.Function */](
      `object`: MockedObject,
      methodName: MethodName,
      implementation: Implementation,
      options: MockFunctionOptions
    ): Mock_[
        (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: MockedObject[MethodName] */ /* value */ js.Any, 
          Unit
        ]) | Implementation
      ] = js.native
    def setter[MockedObject /* <: js.Object */, MethodName /* <: /* keyof MockedObject */ String */, Implementation /* <: js.Function */](`object`: MockedObject, methodName: MethodName, implementation: Unit, options: MockFunctionOptions): Mock_[
        (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: MockedObject[MethodName] */ /* value */ js.Any, 
          Unit
        ]) | Implementation
      ] = js.native
    @JSName("setter")
    def setter_MockedObjectMethodNameImplementation[MockedObject /* <: js.Object */, MethodName /* <: /* keyof MockedObject */ String */, Implementation /* <: js.Function */](`object`: MockedObject, methodName: MethodName): Mock_[
        (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: MockedObject[MethodName] */ /* value */ js.Any, 
          Unit
        ]) | Implementation
      ] = js.native
  }
  
  type Mock_[F /* <: js.Function */] = F & Mock[F]
  
  @js.native
  trait NoOpFunction extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait RunOptions extends StObject {
    
    /**
      * If a number is provided, then that many files would run in parallel.
      * If truthy, it would run (number of cpu cores - 1) files in parallel.
      * If falsy, it would only run one file at a time.
      * If unspecified, subtests inherit this value from their parent.
      * @default true
      */
    var concurrency: js.UndefOr[Double | Boolean] = js.undefined
    
    /**
      * An array containing the list of files to run.
      * If unspecified, the test runner execution model will be used.
      */
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Sets inspector port of test child process.
      * If a nullish value is provided, each process gets its own port,
      * incremented from the primary's `process.debugPort`.
      */
    var inspectPort: js.UndefOr[Double | js.Function0[Double]] = js.undefined
    
    /**
      * Allows aborting an in-progress test execution.
      * @default undefined
      */
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * That can be used to only run tests whose name matches the provided pattern.
      * Test name patterns are interpreted as JavaScript regular expressions.
      * For each test that is executed, any corresponding test hooks, such as `beforeEach()`, are also run.
      */
    var testNamePatterns: js.UndefOr[String | js.RegExp | (js.Array[js.RegExp | String])] = js.undefined
    
    /**
      * A number of milliseconds the test will fail after.
      * If unspecified, subtests inherit this value from their parent.
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
      
      inline def setInspectPort(value: Double | js.Function0[Double]): Self = StObject.set(x, "inspectPort", value.asInstanceOf[js.Any])
      
      inline def setInspectPortFunction0(value: () => Double): Self = StObject.set(x, "inspectPort", js.Any.fromFunction0(value))
      
      inline def setInspectPortUndefined: Self = StObject.set(x, "inspectPort", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setTestNamePatterns(value: String | js.RegExp | (js.Array[js.RegExp | String])): Self = StObject.set(x, "testNamePatterns", value.asInstanceOf[js.Any])
      
      inline def setTestNamePatternsUndefined: Self = StObject.set(x, "testNamePatterns", js.undefined)
      
      inline def setTestNamePatternsVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "testNamePatterns", js.Array(value*))
      
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
    * An instance of `TestContext` is passed to each test function in order to
    * interact with the test runner. However, the `TestContext` constructor is not
    * exposed as part of the API.
    * @since v18.0.0, v16.17.0
    */
  @js.native
  trait TestContext extends StObject {
    
    /**
      * This function is used to create a hook that runs after the current test finishes.
      * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
      *    the second argument. Default: A no-op function.
      * @param options Configuration options for the hook.
      * @since v18.13.0
      */
    def after(): Unit = js.native
    def after(fn: Unit, options: HookOptions): Unit = js.native
    def after(fn: HookFn): Unit = js.native
    def after(fn: HookFn, options: HookOptions): Unit = js.native
    
    /**
      * This function is used to create a hook running after each subtest of the current test.
      * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
      *    the second argument. Default: A no-op function.
      * @param options Configuration options for the hook.
      * @since v18.8.0
      */
    def afterEach(): Unit = js.native
    def afterEach(fn: Unit, options: HookOptions): Unit = js.native
    def afterEach(fn: HookFn): Unit = js.native
    def afterEach(fn: HookFn, options: HookOptions): Unit = js.native
    /**
      * This function is used to create a hook running after each subtest of the current test.
      * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
      *    the second argument. Default: A no-op function.
      * @param options Configuration options for the hook.
      * @since v18.8.0
      */
    @JSName("afterEach")
    var afterEach_Original: js.Function2[/* fn */ js.UndefOr[HookFn], /* options */ js.UndefOr[HookOptions], Unit] = js.native
    
    /**
      * This function is used to create a hook that runs after the current test finishes.
      * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
      *    the second argument. Default: A no-op function.
      * @param options Configuration options for the hook.
      * @since v18.13.0
      */
    @JSName("after")
    var after_Original: js.Function2[/* fn */ js.UndefOr[HookFn], /* options */ js.UndefOr[HookOptions], Unit] = js.native
    
    /**
      * This function is used to create a hook running before subtest of the current test.
      * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
      *    the second argument. Default: A no-op function.
      * @param options Configuration options for the hook.
      * @since v20.1.0
      */
    def before(): Unit = js.native
    def before(fn: Unit, options: HookOptions): Unit = js.native
    def before(fn: HookFn): Unit = js.native
    def before(fn: HookFn, options: HookOptions): Unit = js.native
    
    /**
      * This function is used to create a hook running before each subtest of the current test.
      * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
      *    the second argument. Default: A no-op function.
      * @param options Configuration options for the hook.
      * @since v18.8.0
      */
    def beforeEach(): Unit = js.native
    def beforeEach(fn: Unit, options: HookOptions): Unit = js.native
    def beforeEach(fn: HookFn): Unit = js.native
    def beforeEach(fn: HookFn, options: HookOptions): Unit = js.native
    /**
      * This function is used to create a hook running before each subtest of the current test.
      * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
      *    the second argument. Default: A no-op function.
      * @param options Configuration options for the hook.
      * @since v18.8.0
      */
    @JSName("beforeEach")
    var beforeEach_Original: js.Function2[/* fn */ js.UndefOr[HookFn], /* options */ js.UndefOr[HookOptions], Unit] = js.native
    
    /**
      * This function is used to create a hook running before subtest of the current test.
      * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
      *    the second argument. Default: A no-op function.
      * @param options Configuration options for the hook.
      * @since v20.1.0
      */
    @JSName("before")
    var before_Original: js.Function2[/* fn */ js.UndefOr[HookFn], /* options */ js.UndefOr[HookOptions], Unit] = js.native
    
    /**
      * This function is used to write diagnostics to the output. Any diagnostic
      * information is included at the end of the test's results. This function does
      * not return a value.
      *
      * ```js
      * test('top level test', (t) => {
      *   t.diagnostic('A diagnostic message');
      * });
      * ```
      * @since v18.0.0, v16.17.0
      * @param message Message to be reported.
      */
    def diagnostic(message: String): Unit = js.native
    
    /**
      * Each test provides its own MockTracker instance.
      */
    val mock: MockTracker = js.native
    
    /**
      * The name of the test.
      * @since v18.8.0, v16.18.0
      */
    val name: String = js.native
    
    /**
      * If `shouldRunOnlyTests` is truthy, the test context will only run tests that
      * have the `only` option set. Otherwise, all tests are run. If Node.js was not
      * started with the `--test-only` command-line option, this function is a
      * no-op.
      *
      * ```js
      * test('top level test', (t) => {
      *   // The test context can be set to run subtests with the 'only' option.
      *   t.runOnly(true);
      *   return Promise.all([
      *     t.test('this subtest is now skipped'),
      *     t.test('this subtest is run', { only: true }),
      *   ]);
      * });
      * ```
      * @since v18.0.0, v16.17.0
      * @param shouldRunOnlyTests Whether or not to run `only` tests.
      */
    def runOnly(shouldRunOnlyTests: Boolean): Unit = js.native
    
    /**
      * ```js
      * test('top level test', async (t) => {
      *   await fetch('some/uri', { signal: t.signal });
      * });
      * ```
      * @since v18.7.0, v16.17.0
      */
    val signal: AbortSignal = js.native
    
    /**
      * This function causes the test's output to indicate the test as skipped. If`message` is provided, it is included in the output. Calling `skip()` does
      * not terminate execution of the test function. This function does not return a
      * value.
      *
      * ```js
      * test('top level test', (t) => {
      *   // Make sure to return here as well if the test contains additional logic.
      *   t.skip('this is skipped');
      * });
      * ```
      * @since v18.0.0, v16.17.0
      * @param message Optional skip message.
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
      * This function adds a `TODO` directive to the test's output. If `message` is
      * provided, it is included in the output. Calling `todo()` does not terminate
      * execution of the test function. This function does not return a value.
      *
      * ```js
      * test('top level test', (t) => {
      *   // This test is marked as `TODO`
      *   t.todo('this is a todo');
      * });
      * ```
      * @since v18.0.0, v16.17.0
      * @param message Optional `TODO` message.
      */
    def todo(): Unit = js.native
    def todo(message: String): Unit = js.native
  }
  
  trait TestFail extends StObject {
    
    /**
      * Additional execution metadata.
      */
    var details: Duration
    
    /**
      * The test name.
      */
    var name: String
    
    /**
      * The nesting level of the test.
      */
    var nesting: Double
    
    /**
      * Present if `context.skip` is called.
      */
    var skip: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * The ordinal number of the test.
      */
    var testNumber: Double
    
    /**
      * Present if `context.todo` is called.
      */
    var todo: js.UndefOr[String | Boolean] = js.undefined
  }
  object TestFail {
    
    inline def apply(details: Duration, name: String, nesting: Double, testNumber: Double): TestFail = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nesting = nesting.asInstanceOf[js.Any], testNumber = testNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestFail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestFail] (val x: Self) extends AnyVal {
      
      inline def setDetails(value: Duration): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNesting(value: Double): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: String | Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setTestNumber(value: Double): Self = StObject.set(x, "testNumber", value.asInstanceOf[js.Any])
      
      inline def setTodo(value: String | Boolean): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
      
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
      * If a number is provided, then that many tests would run in parallel.
      * If truthy, it would run (number of cpu cores - 1) tests in parallel.
      * For subtests, it will be `Infinity` tests in parallel.
      * If falsy, it would only run one test at a time.
      * If unspecified, subtests inherit this value from their parent.
      * @default false
      */
    var concurrency: js.UndefOr[Double | Boolean] = js.undefined
    
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
      
      inline def setConcurrency(value: Double | Boolean): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
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
      * Additional execution metadata.
      */
    var details: DurationNumber
    
    /**
      * The test name.
      */
    var name: String
    
    /**
      * The nesting level of the test.
      */
    var nesting: Double
    
    /**
      * Present if `context.skip` is called.
      */
    var skip: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * The ordinal number of the test.
      */
    var testNumber: Double
    
    /**
      * Present if `context.todo` is called.
      */
    var todo: js.UndefOr[String | Boolean] = js.undefined
  }
  object TestPass {
    
    inline def apply(details: DurationNumber, name: String, nesting: Double, testNumber: Double): TestPass = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nesting = nesting.asInstanceOf[js.Any], testNumber = testNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestPass]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestPass] (val x: Self) extends AnyVal {
      
      inline def setDetails(value: DurationNumber): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNesting(value: Double): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: String | Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setTestNumber(value: Double): Self = StObject.set(x, "testNumber", value.asInstanceOf[js.Any])
      
      inline def setTodo(value: String | Boolean): Self = StObject.set(x, "todo", value.asInstanceOf[js.Any])
      
      inline def setTodoUndefined: Self = StObject.set(x, "todo", js.undefined)
    }
  }
  
  trait TestPlan extends StObject {
    
    /**
      * The number of subtests that have ran.
      */
    var count: Double
    
    /**
      * The nesting level of the test.
      */
    var nesting: Double
  }
  object TestPlan {
    
    inline def apply(count: Double, nesting: Double): TestPlan = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], nesting = nesting.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestPlan]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestPlan] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setNesting(value: Double): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestStart extends StObject {
    
    /**
      * The test name.
      */
    var name: String
    
    /**
      * The nesting level of the test.
      */
    var nesting: Double
  }
  object TestStart {
    
    inline def apply(name: String, nesting: Double): TestStart = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nesting = nesting.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestStart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestStart] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNesting(value: Double): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A successful call to `run()` method will return a new `TestsStream` object, streaming a series of events representing the execution of the tests.`TestsStream` will emit events, in the
    * order of the tests definition
    * @since v18.9.0, v16.19.0
    */
  @js.native
  trait TestsStream
    extends StObject
       with ReadableStream {
    
    @JSName("addListener")
    def addListener_testdiagnostic(event: testColondiagnostic, listener: js.Function1[/* data */ DiagnosticData, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_testfail(event: testColonfail, listener: js.Function1[/* data */ TestFail, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_testpass(event: testColonpass, listener: js.Function1[/* data */ TestPass, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_testplan(event: testColonplan, listener: js.Function1[/* data */ TestPlan, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_teststart(event: testColonstart, listener: js.Function1[/* data */ TestStart, Unit]): this.type = js.native
    
    @JSName("emit")
    def emit_testdiagnostic(event: testColondiagnostic, data: DiagnosticData): Boolean = js.native
    @JSName("emit")
    def emit_testfail(event: testColonfail, data: TestFail): Boolean = js.native
    @JSName("emit")
    def emit_testpass(event: testColonpass, data: TestPass): Boolean = js.native
    @JSName("emit")
    def emit_testplan(event: testColonplan, data: TestPlan): Boolean = js.native
    @JSName("emit")
    def emit_teststart(event: testColonstart, data: TestStart): Boolean = js.native
    
    @JSName("on")
    def on_testdiagnostic(event: testColondiagnostic, listener: js.Function1[/* data */ DiagnosticData, Unit]): this.type = js.native
    @JSName("on")
    def on_testfail(event: testColonfail, listener: js.Function1[/* data */ TestFail, Unit]): this.type = js.native
    @JSName("on")
    def on_testpass(event: testColonpass, listener: js.Function1[/* data */ TestPass, Unit]): this.type = js.native
    @JSName("on")
    def on_testplan(event: testColonplan, listener: js.Function1[/* data */ TestPlan, Unit]): this.type = js.native
    @JSName("on")
    def on_teststart(event: testColonstart, listener: js.Function1[/* data */ TestStart, Unit]): this.type = js.native
    
    @JSName("once")
    def once_testdiagnostic(event: testColondiagnostic, listener: js.Function1[/* data */ DiagnosticData, Unit]): this.type = js.native
    @JSName("once")
    def once_testfail(event: testColonfail, listener: js.Function1[/* data */ TestFail, Unit]): this.type = js.native
    @JSName("once")
    def once_testpass(event: testColonpass, listener: js.Function1[/* data */ TestPass, Unit]): this.type = js.native
    @JSName("once")
    def once_testplan(event: testColonplan, listener: js.Function1[/* data */ TestPlan, Unit]): this.type = js.native
    @JSName("once")
    def once_teststart(event: testColonstart, listener: js.Function1[/* data */ TestStart, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_testdiagnostic(event: testColondiagnostic, listener: js.Function1[/* data */ DiagnosticData, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_testfail(event: testColonfail, listener: js.Function1[/* data */ TestFail, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_testpass(event: testColonpass, listener: js.Function1[/* data */ TestPass, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_testplan(event: testColonplan, listener: js.Function1[/* data */ TestPlan, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_teststart(event: testColonstart, listener: js.Function1[/* data */ TestStart, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_testdiagnostic(event: testColondiagnostic, listener: js.Function1[/* data */ DiagnosticData, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_testfail(event: testColonfail, listener: js.Function1[/* data */ TestFail, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_testpass(event: testColonpass, listener: js.Function1[/* data */ TestPass, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_testplan(event: testColonplan, listener: js.Function1[/* data */ TestPlan, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_teststart(event: testColonstart, listener: js.Function1[/* data */ TestStart, Unit]): this.type = js.native
  }
}
