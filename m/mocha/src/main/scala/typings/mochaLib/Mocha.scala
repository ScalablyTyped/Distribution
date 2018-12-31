package typings
package mochaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Mocha")
@js.native
class Mocha () extends js.Object {
  def this(options: mochaLib.MochaNs.MochaOptions) = this()
  var _growl: js.Any = js.native
  var _reporter: js.Any = js.native
  var _ui: js.Any = js.native
  var files: js.Array[java.lang.String] = js.native
  var options: mochaLib.MochaNs.MochaInstanceOptions = js.native
  var suite: mochaLib.MochaNs.Suite = js.native
  /**
    * Add test `file`.
    *
    * @see https://mochajs.org/api/mocha#addFile
    */
  def addFile(file: java.lang.String): this.type = js.native
  /**
    * Enable uncaught errors to propagate (in browser).
    *
    * @see https://mochajs.org/api/mocha#allowUncaught
    */
  def allowUncaught(): scala.Boolean = js.native
  /**
    * Makes all tests async (accepting a callback)
    *
    * @see https://mochajs.org/api/mocha#asyncOnly.
    */
  def asyncOnly(): this.type = js.native
  /**
    * Enable or disable bailing on the first failure.
    *
    * @see https://mochajs.org/api/mocha#bail
    */
  def bail(): this.type = js.native
  def bail(bail: scala.Boolean): this.type = js.native
  /**
    * Enable global leak checking.
    *
    * @see https://mochajs.org/api/mocha#checkLeaks
    */
  def checkLeaks(): this.type = js.native
  /**
    * Delay root suite execution.
    *
    * @see https://mochajs.org/api/mocha#delay
    */
  def delay(): scala.Boolean = js.native
  /**
    * Enable timeouts.
    *
    * @see https://mochajs.org/api/mocha#enableTimeouts
    */
  def enableTimeouts(): this.type = js.native
  def enableTimeouts(enabled: scala.Boolean): this.type = js.native
  /**
    * Escape string and add it to grep as a RegExp.
    *
    * @see https://mochajs.org/api/mocha#fgrep
    */
  def fgrep(str: java.lang.String): this.type = js.native
  /**
    * Tests marked only fail the suite
    *
    * @see https://mochajs.org/api/mocha#forbidOnly
    */
  def forbidOnly(): scala.Boolean = js.native
  /**
    * Pending tests and tests marked skip fail the suite
    *
    * @see https://mochajs.org/api/mocha#forbidPending
    */
  def forbidPending(): scala.Boolean = js.native
  /**
    * Display long stack-trace on failing
    *
    * @see https://mochajs.org/api/mocha#fullTrace
    */
  def fullTrace(): this.type = js.native
  /**
    * Ignore `globals` array or string.
    *
    * @see https://mochajs.org/api/mocha#globals
    */
  def globals(globals: java.lang.String): this.type = js.native
  def globals(globals: js.Array[java.lang.String]): this.type = js.native
  /**
    * Add regexp to grep, if `re` is a string it is escaped.
    *
    * @see https://mochajs.org/api/mocha#grep
    */
  def grep(re: java.lang.String): this.type = js.native
  def grep(re: stdLib.RegExp): this.type = js.native
  /**
    * Enable growl support.
    *
    * @see https://mochajs.org/api/mocha#growl
    */
  def growl(): this.type = js.native
  /**
    * Do not show diffs at all.
    *
    * @see https://mochajs.org/api/mocha#hideDiff
    */
  def hideDiff(hideDiff: scala.Boolean): this.type = js.native
  /**
    * Ignore global leaks.
    *
    * @see https://mochajs.org/api/mocha#ignoreLeaks
    */
  def ignoreLeaks(ignore: scala.Boolean): this.type = js.native
  /**
    * Invert `.grep()` matches.
    *
    * @see https://mochajs.org/api/mocha#invert
    */
  def invert(): this.type = js.native
  /**
    * Load registered files.
    *
    * @see https://mochajs.org/api/mocha#loadFiles
    */
  /* protected */ def loadFiles(): scala.Unit = js.native
  /* protected */ def loadFiles(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Disable syntax highlighting (in browser).
    *
    * @see https://mochajs.org/api/mocha#noHighlighting
    */
  def noHighlighting(): this.type = js.native
  /**
    * Set reporter to the provided constructor, one of the built-in reporters, or loads a reporter
    * from a module path. Defaults to `"spec"`.
    *
    * @see https://mochajs.org/api/mocha#reporter
    */
  def reporter(): this.type = js.native
  def reporter(reporter: java.lang.String): this.type = js.native
  def reporter(reporter: java.lang.String, reporterOptions: js.Any): this.type = js.native
  /**
    * Set reporter to one of the built-in reporters.
    *
    * @see https://mochajs.org/api/mocha#reporter
    */
  def reporter(reporter: mochaLib.MochaNs.Reporter): this.type = js.native
  def reporter(reporter: mochaLib.MochaNs.ReporterConstructor): this.type = js.native
  def reporter(reporter: mochaLib.MochaNs.ReporterConstructor, reporterOptions: js.Any): this.type = js.native
  def reporter(reporter: mochaLib.MochaNs.Reporter, reporterOptions: js.Any): this.type = js.native
  /**
    * Set the number of times to retry failed tests.
    *
    * @see https://mochajs.org/api/mocha#retries
    */
  def retries(n: scala.Double): this.type = js.native
  /**
    * Run tests and invoke `fn()` when complete.
    *
    * Note that `run` relies on Node's `require` to execute
    * the test interface functions and will be subject to the
    * cache - if the files are already in the `require` cache,
    * they will effectively be skipped. Therefore, to run tests
    * multiple times or to run tests in files that are already
    * in the `require` cache, make sure to clear them from the
    * cache first in whichever manner best suits your needs.
    *
    * @see https://mochajs.org/api/mocha#run
    */
  def run(): mochaLib.MochaNs.Runner = js.native
  def run(fn: js.Function1[/* failures */ scala.Double, scala.Unit]): mochaLib.MochaNs.Runner = js.native
  /**
    * Set slowness threshold in milliseconds.
    *
    * @see https://mochajs.org/api/mocha#slow
    */
  def slow(slow: java.lang.String): this.type = js.native
  def slow(slow: scala.Double): this.type = js.native
  /**
    * Set the timeout in milliseconds.
    *
    * @see https://mochajs.org/api/mocha#timeout
    */
  def timeout(timeout: java.lang.String): this.type = js.native
  def timeout(timeout: scala.Double): this.type = js.native
  /**
    * Set test UI to one of the built-in test interfaces or loads a test interface from a module
    * path. Defaults to `"bdd"`.
    *
    * @see https://mochajs.org/api/mocha#ui
    */
  def ui(): this.type = js.native
  def ui(name: java.lang.String): this.type = js.native
  /**
    * Set test UI to one of the built-in test interfaces.
    *
    * @see https://mochajs.org/api/mocha#ui
    */
  def ui(name: mochaLib.MochaNs.Interface): this.type = js.native
  /**
    * Emit color output.
    *
    * @see https://mochajs.org/api/mocha#useColors
    */
  def useColors(colors: scala.Boolean): this.type = js.native
  /**
    * Use inline diffs rather than +/-.
    *
    * @see https://mochajs.org/api/mocha#useInlineDiffs
    */
  def useInlineDiffs(inlineDiffs: scala.Boolean): this.type = js.native
}

