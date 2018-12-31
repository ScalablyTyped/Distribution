package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion Suite "post-require" event
// #region Suite untyped events
// #endregion Suite "require" event
// #region Suite "post-require" event
// #endregion Suite "pre-require" event
// #region Suite "require" event
// #endregion Suite "run" event
// #region Suite "pre-require" event
// #endregion Suite "test" event
// #region Suite "run" event
// #endregion Suite "suite" event
// #region Suite "test" event
// #endregion Suite "afterEach" event
// #region Suite "suite" event
// #endregion Suite "beforeEach" event
// #region Suite "afterEach" event
// #endregion Suite "afterAll" event
// #region Suite "beforeEach" event
// #endregion Suite "beforeAll" event
// #region Suite "afterAll" event
// #region Suite "beforeAll" event
// #endregion Runner untyped events
/**
  * Initialize a new `Suite` with the given `title` and `ctx`.
  *
  * @see https://mochajs.org/api/Mocha.Suite.html
  */
@JSGlobal("Mocha.Suite")
@js.native
class Suite protected ()
  extends mochaLib.NodeJSNs.EventEmitter {
  def this(title: java.lang.String) = this()
  def this(title: java.lang.String, parentContext: Context) = this()
  def this(title: java.lang.String, parentContext: IContext) = this()
  var _afterAll: js.Any = js.native
  var _afterEach: js.Any = js.native
  var _bail: js.Any = js.native
  var _beforeAll: js.Any = js.native
  var _beforeEach: js.Any = js.native
  var _enableTimeouts: js.Any = js.native
  var _onlySuites: js.Any = js.native
  var _onlyTests: js.Any = js.native
  var _retries: js.Any = js.native
  var _slow: js.Any = js.native
  var _timeout: js.Any = js.native
  var ctx: Context = js.native
  var delayed: scala.Boolean = js.native
  var file: js.UndefOr[java.lang.String] = js.native
  var parent: js.UndefOr[Suite] = js.native
  var pending: scala.Boolean = js.native
  var root: scala.Boolean = js.native
  var suites: js.Array[Suite] = js.native
  var tests: js.Array[Test] = js.native
  var title: java.lang.String = js.native
  /**
    * Generic hook-creator.
    */
  /* protected */ def _createHook(title: java.lang.String): Hook = js.native
  /* protected */ def _createHook(title: java.lang.String, fn: AsyncFunc): Hook = js.native
  /* protected */ def _createHook(title: java.lang.String, fn: Func): Hook = js.native
  def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_afterAll(event: mochaLib.mochaLibStrings.afterAll, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_afterEach(event: mochaLib.mochaLibStrings.afterEach, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_beforeAll(event: mochaLib.mochaLibStrings.beforeAll, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_beforeEach(event: mochaLib.mochaLibStrings.beforeEach, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def `addListener_post-require`(
    event: mochaLib.mochaLibStrings.`post-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def `addListener_pre-require`(
    event: mochaLib.mochaLibStrings.`pre-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_require(
    event: mochaLib.mochaLibStrings.require,
    listener: js.Function3[
      /* module */ js.Any, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_run(event: mochaLib.mochaLibStrings.run, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_suite(event: mochaLib.mochaLibStrings.suite, listener: js.Function1[/* suite */ this.type, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_test(event: mochaLib.mochaLibStrings.test, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  /** @deprecated Use the overload that accepts `Mocha.ISuite` instead. */
  def addSuite(suite: ISuite): this.type = js.native
  /**
    * Add a test `suite`.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#addSuite
    */
  def addSuite(suite: Suite): this.type = js.native
  /** @deprecated Use the overload that accepts `Mocha.ITest` instead. */
  def addTest(test: ITest): this.type = js.native
  /**
    * Add a `test` to this suite.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#addTest
    */
  def addTest(test: Test): this.type = js.native
  /**
    * Run `fn(test[, done])` after running tests.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#afterAll
    */
  def afterAll(): this.type = js.native
  def afterAll(fn: AsyncFunc): this.type = js.native
  def afterAll(fn: Func): this.type = js.native
  /**
    * Run `fn(test[, done])` after running tests.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#afterAll
    */
  def afterAll(title: java.lang.String): this.type = js.native
  def afterAll(title: java.lang.String, fn: AsyncFunc): this.type = js.native
  def afterAll(title: java.lang.String, fn: Func): this.type = js.native
  /**
    * Run `fn(test[, done])` after each test case.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#afterEach
    */
  def afterEach(): this.type = js.native
  def afterEach(fn: AsyncFunc): this.type = js.native
  def afterEach(fn: Func): this.type = js.native
  /**
    * Run `fn(test[, done])` after each test case.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#afterEach
    */
  def afterEach(title: java.lang.String): this.type = js.native
  def afterEach(title: java.lang.String, fn: AsyncFunc): this.type = js.native
  def afterEach(title: java.lang.String, fn: Func): this.type = js.native
  /**
    * Get whether to bail after first error.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#bail
    */
  def bail(): scala.Boolean = js.native
  /**
    * Set whether to bail after first error.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#bail
    */
  def bail(bail: scala.Boolean): this.type = js.native
  /**
    * Run `fn(test[, done])` before running tests.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#beforeAll
    */
  def beforeAll(): this.type = js.native
  def beforeAll(fn: AsyncFunc): this.type = js.native
  def beforeAll(fn: Func): this.type = js.native
  /**
    * Run `fn(test[, done])` before running tests.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#beforeAll
    */
  def beforeAll(title: java.lang.String): this.type = js.native
  def beforeAll(title: java.lang.String, fn: AsyncFunc): this.type = js.native
  def beforeAll(title: java.lang.String, fn: Func): this.type = js.native
  /**
    * Run `fn(test[, done])` before each test case.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#beforeEach
    */
  def beforeEach(): this.type = js.native
  def beforeEach(fn: AsyncFunc): this.type = js.native
  def beforeEach(fn: Func): this.type = js.native
  /**
    * Run `fn(test[, done])` before each test case.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#beforeEach
    */
  def beforeEach(title: java.lang.String): this.type = js.native
  def beforeEach(title: java.lang.String, fn: AsyncFunc): this.type = js.native
  def beforeEach(title: java.lang.String, fn: Func): this.type = js.native
  /**
    * Iterates through each suite recursively to find all tests. Applies a
    * function in the format `fn(test)`.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#eachTest
    */
  def eachTest(fn: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  def emit(name: java.lang.String, args: js.Any*): scala.Boolean = js.native
  @JSName("emit")
  def emit_afterAll(name: mochaLib.mochaLibStrings.afterAll, hook: Hook): scala.Boolean = js.native
  @JSName("emit")
  def emit_afterEach(name: mochaLib.mochaLibStrings.afterEach, hook: Hook): scala.Boolean = js.native
  @JSName("emit")
  def emit_beforeAll(name: mochaLib.mochaLibStrings.beforeAll, hook: Hook): scala.Boolean = js.native
  @JSName("emit")
  def emit_beforeEach(name: mochaLib.mochaLibStrings.beforeEach, hook: Hook): scala.Boolean = js.native
  @JSName("emit")
  def `emit_post-require`(
    name: mochaLib.mochaLibStrings.`post-require`,
    context: MochaGlobals,
    file: java.lang.String,
    mocha: mochaLib.Mocha
  ): scala.Boolean = js.native
  @JSName("emit")
  def `emit_pre-require`(
    name: mochaLib.mochaLibStrings.`pre-require`,
    context: MochaGlobals,
    file: java.lang.String,
    mocha: mochaLib.Mocha
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_require(
    name: mochaLib.mochaLibStrings.require,
    module: js.Any,
    file: java.lang.String,
    mocha: mochaLib.Mocha
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_run(name: mochaLib.mochaLibStrings.run): scala.Boolean = js.native
  @JSName("emit")
  def emit_suite(name: mochaLib.mochaLibStrings.suite, suite: Suite): scala.Boolean = js.native
  @JSName("emit")
  def emit_test(name: mochaLib.mochaLibStrings.test, test: Test): scala.Boolean = js.native
  /**
    * Get whether timeouts are enabled.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#enableTimeouts
    */
  def enableTimeouts(): scala.Boolean = js.native
  /**
    * Set whether timeouts are `enabled`.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#enableTimeouts
    */
  def enableTimeouts(enabled: scala.Boolean): this.type = js.native
  /**
    * Return the full title generated by recursively concatenating the parent's
    * full title.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#.Suite#fullTitle
    */
  def fullTitle(): java.lang.String = js.native
  /**
    * Check if this suite or its parent suite is marked as pending.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#isPending
    */
  def isPending(): scala.Boolean = js.native
  def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_afterAll(event: mochaLib.mochaLibStrings.afterAll, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_afterEach(event: mochaLib.mochaLibStrings.afterEach, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_beforeAll(event: mochaLib.mochaLibStrings.beforeAll, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_beforeEach(event: mochaLib.mochaLibStrings.beforeEach, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("on")
  def `on_post-require`(
    event: mochaLib.mochaLibStrings.`post-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def `on_pre-require`(
    event: mochaLib.mochaLibStrings.`pre-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_require(
    event: mochaLib.mochaLibStrings.require,
    listener: js.Function3[
      /* module */ js.Any, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_run(event: mochaLib.mochaLibStrings.run, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_suite(event: mochaLib.mochaLibStrings.suite, listener: js.Function1[/* suite */ this.type, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_test(event: mochaLib.mochaLibStrings.test, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_afterAll(event: mochaLib.mochaLibStrings.afterAll, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_afterEach(event: mochaLib.mochaLibStrings.afterEach, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_beforeAll(event: mochaLib.mochaLibStrings.beforeAll, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_beforeEach(event: mochaLib.mochaLibStrings.beforeEach, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("once")
  def `once_post-require`(
    event: mochaLib.mochaLibStrings.`post-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def `once_pre-require`(
    event: mochaLib.mochaLibStrings.`pre-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_require(
    event: mochaLib.mochaLibStrings.require,
    listener: js.Function3[
      /* module */ js.Any, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_run(event: mochaLib.mochaLibStrings.run, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_suite(event: mochaLib.mochaLibStrings.suite, listener: js.Function1[/* suite */ this.type, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_test(event: mochaLib.mochaLibStrings.test, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_afterAll(event: mochaLib.mochaLibStrings.afterAll, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_afterEach(event: mochaLib.mochaLibStrings.afterEach, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_beforeAll(event: mochaLib.mochaLibStrings.beforeAll, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_beforeEach(event: mochaLib.mochaLibStrings.beforeEach, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def `prependListener_post-require`(
    event: mochaLib.mochaLibStrings.`post-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def `prependListener_pre-require`(
    event: mochaLib.mochaLibStrings.`pre-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_require(
    event: mochaLib.mochaLibStrings.require,
    listener: js.Function3[
      /* module */ js.Any, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_run(event: mochaLib.mochaLibStrings.run, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_suite(event: mochaLib.mochaLibStrings.suite, listener: js.Function1[/* suite */ this.type, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_test(event: mochaLib.mochaLibStrings.test, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_afterAll(event: mochaLib.mochaLibStrings.afterAll, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_afterEach(event: mochaLib.mochaLibStrings.afterEach, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_beforeAll(event: mochaLib.mochaLibStrings.beforeAll, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_beforeEach(event: mochaLib.mochaLibStrings.beforeEach, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def `prependOnceListener_post-require`(
    event: mochaLib.mochaLibStrings.`post-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def `prependOnceListener_pre-require`(
    event: mochaLib.mochaLibStrings.`pre-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_require(
    event: mochaLib.mochaLibStrings.require,
    listener: js.Function3[
      /* module */ js.Any, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_run(event: mochaLib.mochaLibStrings.run, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_suite(event: mochaLib.mochaLibStrings.suite, listener: js.Function1[/* suite */ this.type, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_test(event: mochaLib.mochaLibStrings.test, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_afterAll(event: mochaLib.mochaLibStrings.afterAll, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_afterEach(event: mochaLib.mochaLibStrings.afterEach, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_beforeAll(event: mochaLib.mochaLibStrings.beforeAll, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_beforeEach(event: mochaLib.mochaLibStrings.beforeEach, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def `removeListener_post-require`(
    event: mochaLib.mochaLibStrings.`post-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def `removeListener_pre-require`(
    event: mochaLib.mochaLibStrings.`pre-require`,
    listener: js.Function3[
      /* context */ MochaGlobals, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_require(
    event: mochaLib.mochaLibStrings.require,
    listener: js.Function3[
      /* module */ js.Any, 
      /* file */ java.lang.String, 
      /* mocha */ mochaLib.Mocha, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_run(event: mochaLib.mochaLibStrings.run, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_suite(event: mochaLib.mochaLibStrings.suite, listener: js.Function1[/* suite */ this.type, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_test(event: mochaLib.mochaLibStrings.test, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  /**
    * Get number of times to retry a failed test.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#retries
    */
  def retries(): scala.Double = js.native
  /**
    * Set number of times to retry a failed test.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#retries
    */
  def retries(n: java.lang.String): this.type = js.native
  def retries(n: scala.Double): this.type = js.native
  /**
    * This will run the root suite if we happen to be running in delayed mode.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#run
    */
  def run(): scala.Unit = js.native
  /**
    * Get slow `ms`.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#slow
    */
  def slow(): scala.Double = js.native
  /**
    * Set slow `ms` or short-hand such as "2s".
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#slow
    */
  def slow(ms: java.lang.String): this.type = js.native
  def slow(ms: scala.Double): this.type = js.native
  /**
    * Get timeout `ms`.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#timeout
    */
  def timeout(): scala.Double = js.native
  /**
    * Set timeout `ms` or short-hand such as "2s".
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#timeout
    */
  def timeout(ms: java.lang.String): this.type = js.native
  def timeout(ms: scala.Double): this.type = js.native
  /**
    * Return the title path generated by recursively concatenating the parent's
    * title path.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#.Suite#titlePath
    */
  def titlePath(): js.Array[java.lang.String] = js.native
  /**
    * Return the total number of tests.
    *
    * @see https://mochajs.org/api/Mocha.Suite.html#.Suite#total
    */
  def total(): scala.Double = js.native
}

// #endregion Suite "post-require" event
// #region Suite untyped events
// #endregion Suite "require" event
// #region Suite "post-require" event
// #endregion Suite "pre-require" event
// #region Suite "require" event
// #endregion Suite "run" event
// #region Suite "pre-require" event
// #endregion Suite "test" event
// #region Suite "run" event
// #endregion Suite "suite" event
// #region Suite "test" event
// #endregion Suite "afterEach" event
// #region Suite "suite" event
// #endregion Suite "beforeEach" event
// #region Suite "afterEach" event
// #endregion Suite "afterAll" event
// #region Suite "beforeEach" event
// #endregion Suite "beforeAll" event
// #region Suite "afterAll" event
// #region Suite "beforeAll" event
// #endregion Runner untyped events
/**
  * Initialize a new `Suite` with the given `title` and `ctx`.
  *
  * @see https://mochajs.org/api/Mocha.Suite.html
  */
@JSGlobal("Mocha.Suite")
@js.native
object Suite extends js.Object {
  /** @deprecated Use the overload that accepts `Mocha.Suite` instead. */
  def create(parent: mochaLib.MochaNs.ISuite, title: java.lang.String): mochaLib.MochaNs.Suite = js.native
  /**
    * Create a new `Suite` with the given `title` and parent `Suite`. When a suite
    * with the same title is already present, that suite is returned to provide
    * nicer reporter and more flexible meta-testing.
    *
    * @see https://mochajs.org/api/mocha#.exports.create
    */
  def create(parent: mochaLib.MochaNs.Suite, title: java.lang.String): mochaLib.MochaNs.Suite = js.native
}

