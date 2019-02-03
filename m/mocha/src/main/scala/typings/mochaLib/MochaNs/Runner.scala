package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion Runner "pending" event
// #region Runner untyped events
// #endregion Runner "fail" event
// #region Runner "pending" event
// #endregion Runner "pass" event
// #region Runner "fail" event
// #endregion Runner "hook end" event
// #region Runner "pass" event
// #endregion Runner "hook" event
// #region Runner "hook end" event
// #endregion Runner "test end" event
// #region Runner "hook" event
// #endregion Runner "test" event
// #region Runner "test end" event
// #endregion Runner "suite end" event
// #region Runner "test" event
// #endregion Runner "suite" event
// #region Runner "suite end" event
// #endregion Runner "end" event
// #region Runner "suite" event
// #endregion Runner "start" event
// #region Runner "end" event
// #endregion Runner "waiting" event
// #region Runner "start" event
// #region Runner "waiting" event
/**
  * Initialize a `Runner` for the given `suite`.
  *
  * @see https://mochajs.org/api/Mocha.Runner.html
  */
@JSGlobal("Mocha.Runner")
@js.native
class Runner protected ()
  extends mochaLib.NodeJSNs.EventEmitter {
  /** @deprecated Use the overload that accepts `Mocha.Suite` instead. */
  def this(suite: ISuite, delay: scala.Boolean) = this()
  def this(suite: Suite, delay: scala.Boolean) = this()
  var _abort: js.Any = js.native
  var _defaultGrep: js.Any = js.native
  var _delay: js.Any = js.native
  var _globals: js.Any = js.native
  var allowUncaught: js.UndefOr[scala.Boolean] = js.native
  var asyncOnly: js.UndefOr[scala.Boolean] = js.native
  var currentRunnable: js.UndefOr[Runnable] = js.native
  var failures: scala.Double = js.native
  var forbidOnly: js.UndefOr[scala.Boolean] = js.native
  var forbidPending: js.UndefOr[scala.Boolean] = js.native
  var fullStackTrace: js.UndefOr[scala.Boolean] = js.native
  var hookErr: js.Any = js.native
  var ignoreLeaks: js.UndefOr[scala.Boolean] = js.native
  var next: js.Any = js.native
  var nextSuite: js.Any = js.native
  var prevGlobalsLength: js.Any = js.native
  var started: scala.Boolean = js.native
  var stats: js.UndefOr[Stats] = js.native
  var suite: Suite = js.native
  var test: js.UndefOr[Test] = js.native
  var total: scala.Double = js.native
  /**
    * Cleanly abort execution.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#.Runner#abort
    */
  def abort(): this.type = js.native
  def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_end(event: mochaLib.mochaLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_fail(
    event: mochaLib.mochaLibStrings.fail,
    listener: js.Function2[/* test */ Test, /* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_hook(event: mochaLib.mochaLibStrings.hook, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def `addListener_hook end`(event: mochaLib.mochaLibStrings.`hook end`, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pass(event: mochaLib.mochaLibStrings.pass, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pending(event: mochaLib.mochaLibStrings.pending, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_start(event: mochaLib.mochaLibStrings.start, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_suite(event: mochaLib.mochaLibStrings.suite, listener: js.Function1[/* suite */ Suite, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def `addListener_suite end`(event: mochaLib.mochaLibStrings.`suite end`, listener: js.Function1[/* suite */ Suite, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_test(event: mochaLib.mochaLibStrings.test, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def `addListener_test end`(event: mochaLib.mochaLibStrings.`test end`, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_waiting(event: mochaLib.mochaLibStrings.waiting, listener: js.Function1[/* rootSuite */ Suite, scala.Unit]): this.type = js.native
  /**
    * Check for global variable leaks.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#checkGlobals
    */
  /* protected */ def checkGlobals(test: Test): scala.Unit = js.native
  def emit(name: java.lang.String, args: js.Any*): scala.Boolean = js.native
  @JSName("emit")
  def emit_end(name: mochaLib.mochaLibStrings.end): scala.Boolean = js.native
  @JSName("emit")
  def emit_fail(name: mochaLib.mochaLibStrings.fail, test: Test, err: js.Any): scala.Boolean = js.native
  @JSName("emit")
  def emit_hook(name: mochaLib.mochaLibStrings.hook, hook: Hook): scala.Boolean = js.native
  @JSName("emit")
  def `emit_hook end`(name: mochaLib.mochaLibStrings.`hook end`, hook: Hook): scala.Boolean = js.native
  @JSName("emit")
  def emit_pass(name: mochaLib.mochaLibStrings.pass, test: Test): scala.Boolean = js.native
  @JSName("emit")
  def emit_pending(name: mochaLib.mochaLibStrings.pending, test: Test): scala.Boolean = js.native
  @JSName("emit")
  def emit_start(name: mochaLib.mochaLibStrings.start): scala.Boolean = js.native
  @JSName("emit")
  def emit_suite(name: mochaLib.mochaLibStrings.suite, suite: Suite): scala.Boolean = js.native
  @JSName("emit")
  def `emit_suite end`(name: mochaLib.mochaLibStrings.`suite end`, suite: Suite): scala.Boolean = js.native
  @JSName("emit")
  def emit_test(name: mochaLib.mochaLibStrings.test, test: Test): scala.Boolean = js.native
  @JSName("emit")
  def `emit_test end`(name: mochaLib.mochaLibStrings.`test end`, test: Test): scala.Boolean = js.native
  @JSName("emit")
  def emit_waiting(name: mochaLib.mochaLibStrings.waiting, rootSuite: Suite): scala.Boolean = js.native
  /**
    * Fail the given `test`.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#fail
    */
  /* protected */ def fail(test: Test, err: js.Any): scala.Unit = js.native
  /**
    * Fail the given `hook` with `err`.
    *
    * Hook failures work in the following pattern:
    * - If bail, then exit
    * - Failed `before` hook skips all tests in a suite and subsuites,
    *   but jumps to corresponding `after` hook
    * - Failed `before each` hook skips remaining tests in a
    *   suite and jumps to corresponding `after each` hook,
    *   which is run only once
    * - Failed `after` hook does not alter
    *   execution order
    * - Failed `after each` hook skips remaining tests in a
    *   suite and subsuites, but executes other `after each`
    *   hooks
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#failHook
    */
  /* protected */ def failHook(hook: Hook, err: js.Any): scala.Unit = js.native
  /**
    * Return a list of global properties.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#globalProps
    */
  /* protected */ def globalProps(): js.Array[java.lang.String] = js.native
  /**
    * Gets the allowed globals.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#.Runner#globals
    */
  def globals(): js.Array[java.lang.String] = js.native
  /**
    * Allow the given `arr` of globals.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#.Runner#globals
    */
  def globals(arr: js.Array[java.lang.String]): this.type = js.native
   // added by reporters
  /**
    * Run tests with full titles matching `re`. Updates runner.total
    * with number of tests matched.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#.Runner#grep
    */
  def grep(re: stdLib.RegExp, invert: scala.Boolean): this.type = js.native
  /** @deprecated Use the overload that accepts `Mocha.Suite` instead. */
  def grepTotal(suite: ISuite): scala.Double = js.native
  /**
    * Returns the number of tests matching the grep search for the
    * given suite.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#.Runner#grepTotal
    */
  def grepTotal(suite: Suite): scala.Double = js.native
  /**
    * Run hook `name` callbacks and then invoke `fn()`.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#hook
    */
  /* protected */ def hook(name: java.lang.String, fn: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Run hooks from the bottom up.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#hookDown
    */
  /* protected */ def hookDown(
    name: java.lang.String,
    fn: js.Function2[/* err */ js.UndefOr[js.Any], /* errSuite */ js.UndefOr[Suite], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Run hooks from the top level down.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#hookUp
    */
  /* protected */ def hookUp(
    name: java.lang.String,
    fn: js.Function2[/* err */ js.UndefOr[js.Any], /* errSuite */ js.UndefOr[Suite], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Run hook `name` for the given array of `suites`
    * in order, and callback `fn(err, errSuite)`.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#hooks
    */
  /* protected */ def hooks(
    name: java.lang.String,
    suites: js.Array[Suite],
    fn: js.Function2[/* err */ js.UndefOr[js.Any], /* errSuite */ js.UndefOr[Suite], scala.Unit]
  ): scala.Unit = js.native
  def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: mochaLib.mochaLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_fail(
    event: mochaLib.mochaLibStrings.fail,
    listener: js.Function2[/* test */ Test, /* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_hook(event: mochaLib.mochaLibStrings.hook, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("on")
  def `on_hook end`(event: mochaLib.mochaLibStrings.`hook end`, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_pass(event: mochaLib.mochaLibStrings.pass, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_pending(event: mochaLib.mochaLibStrings.pending, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_start(event: mochaLib.mochaLibStrings.start, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_suite(event: mochaLib.mochaLibStrings.suite, listener: js.Function1[/* suite */ Suite, scala.Unit]): this.type = js.native
  @JSName("on")
  def `on_suite end`(event: mochaLib.mochaLibStrings.`suite end`, listener: js.Function1[/* suite */ Suite, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_test(event: mochaLib.mochaLibStrings.test, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("on")
  def `on_test end`(event: mochaLib.mochaLibStrings.`test end`, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_waiting(event: mochaLib.mochaLibStrings.waiting, listener: js.Function1[/* rootSuite */ Suite, scala.Unit]): this.type = js.native
  def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: mochaLib.mochaLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_fail(
    event: mochaLib.mochaLibStrings.fail,
    listener: js.Function2[/* test */ Test, /* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_hook(event: mochaLib.mochaLibStrings.hook, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("once")
  def `once_hook end`(event: mochaLib.mochaLibStrings.`hook end`, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_pass(event: mochaLib.mochaLibStrings.pass, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_pending(event: mochaLib.mochaLibStrings.pending, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_start(event: mochaLib.mochaLibStrings.start, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_suite(event: mochaLib.mochaLibStrings.suite, listener: js.Function1[/* suite */ Suite, scala.Unit]): this.type = js.native
  @JSName("once")
  def `once_suite end`(event: mochaLib.mochaLibStrings.`suite end`, listener: js.Function1[/* suite */ Suite, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_test(event: mochaLib.mochaLibStrings.test, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("once")
  def `once_test end`(event: mochaLib.mochaLibStrings.`test end`, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_waiting(event: mochaLib.mochaLibStrings.waiting, listener: js.Function1[/* rootSuite */ Suite, scala.Unit]): this.type = js.native
  /**
    * Return an array of parent Suites from closest to furthest.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#parents
    */
  /* protected */ def parents(): js.Array[Suite] = js.native
  def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: mochaLib.mochaLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_fail(
    event: mochaLib.mochaLibStrings.fail,
    listener: js.Function2[/* test */ Test, /* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_hook(event: mochaLib.mochaLibStrings.hook, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def `prependListener_hook end`(event: mochaLib.mochaLibStrings.`hook end`, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pass(event: mochaLib.mochaLibStrings.pass, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pending(event: mochaLib.mochaLibStrings.pending, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_start(event: mochaLib.mochaLibStrings.start, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_suite(event: mochaLib.mochaLibStrings.suite, listener: js.Function1[/* suite */ Suite, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def `prependListener_suite end`(event: mochaLib.mochaLibStrings.`suite end`, listener: js.Function1[/* suite */ Suite, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_test(event: mochaLib.mochaLibStrings.test, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def `prependListener_test end`(event: mochaLib.mochaLibStrings.`test end`, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_waiting(event: mochaLib.mochaLibStrings.waiting, listener: js.Function1[/* rootSuite */ Suite, scala.Unit]): this.type = js.native
  def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: mochaLib.mochaLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_fail(
    event: mochaLib.mochaLibStrings.fail,
    listener: js.Function2[/* test */ Test, /* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_hook(event: mochaLib.mochaLibStrings.hook, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def `prependOnceListener_hook end`(event: mochaLib.mochaLibStrings.`hook end`, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pass(event: mochaLib.mochaLibStrings.pass, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pending(event: mochaLib.mochaLibStrings.pending, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_start(event: mochaLib.mochaLibStrings.start, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_suite(event: mochaLib.mochaLibStrings.suite, listener: js.Function1[/* suite */ Suite, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def `prependOnceListener_suite end`(event: mochaLib.mochaLibStrings.`suite end`, listener: js.Function1[/* suite */ Suite, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_test(event: mochaLib.mochaLibStrings.test, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def `prependOnceListener_test end`(event: mochaLib.mochaLibStrings.`test end`, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_waiting(event: mochaLib.mochaLibStrings.waiting, listener: js.Function1[/* rootSuite */ Suite, scala.Unit]): this.type = js.native
  def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_end(event: mochaLib.mochaLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_fail(
    event: mochaLib.mochaLibStrings.fail,
    listener: js.Function2[/* test */ Test, /* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_hook(event: mochaLib.mochaLibStrings.hook, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def `removeListener_hook end`(event: mochaLib.mochaLibStrings.`hook end`, listener: js.Function1[/* hook */ Hook, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pass(event: mochaLib.mochaLibStrings.pass, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pending(event: mochaLib.mochaLibStrings.pending, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_start(event: mochaLib.mochaLibStrings.start, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_suite(event: mochaLib.mochaLibStrings.suite, listener: js.Function1[/* suite */ Suite, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def `removeListener_suite end`(event: mochaLib.mochaLibStrings.`suite end`, listener: js.Function1[/* suite */ Suite, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_test(event: mochaLib.mochaLibStrings.test, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def `removeListener_test end`(event: mochaLib.mochaLibStrings.`test end`, listener: js.Function1[/* test */ Test, scala.Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_waiting(event: mochaLib.mochaLibStrings.waiting, listener: js.Function1[/* rootSuite */ Suite, scala.Unit]): this.type = js.native
  /**
    * Run the root suite and invoke `fn(failures)` on completion.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#.Runner#run
    */
  def run(): this.type = js.native
  def run(fn: js.Function1[/* failures */ scala.Double, scala.Unit]): this.type = js.native
  /**
    * Run the given `suite` and invoke the callback `fn()` when complete.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#runSuite
    */
  /* protected */ def runSuite(suite: Suite, fn: js.Function1[/* errSuite */ js.UndefOr[Suite], scala.Unit]): scala.Unit = js.native
  /**
    * Run the current test and callback `fn(err)`.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#runTest
    */
  /* protected */ def runTest(fn: Done): js.Any = js.native
  /**
    * Run tests in the given `suite` and invoke the callback `fn()` when complete.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#runTests
    */
  /* protected */ def runTests(suite: Suite, fn: js.Function1[/* errSuite */ js.UndefOr[Suite], scala.Unit]): scala.Unit = js.native
  /**
    * Handle uncaught exceptions.
    *
    * @see https://mochajs.org/api/Mocha.Runner.html#uncaught
    */
  def uncaught(err: js.Any): scala.Unit = js.native
}

/* static members */
@JSGlobal("Mocha.Runner")
@js.native
object Runner extends js.Object {
  /**
    * Wrapper for setImmediate, process.nextTick, or browser polyfill.
    */
  /* protected */ def immediately(callback: js.Function): scala.Unit = js.native
}

