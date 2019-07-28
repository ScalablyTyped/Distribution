package typings.mocha

import typings.mocha.MochaNs.HookFunction
import typings.mocha.MochaNs.PendingSuiteFunction
import typings.mocha.MochaNs.PendingTestFunction
import typings.mocha.MochaNs.SuiteFunction
import typings.mocha.MochaNs.TestFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  var after: HookFunction = js.native
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  var afterEach: HookFunction = js.native
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  var before: HookFunction = js.native
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  var beforeEach: HookFunction = js.native
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var context: SuiteFunction = js.native
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var describe: SuiteFunction = js.native
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var it: TestFunction = js.native
  // #endregion Reporter augmentations
  // #region Browser augmentations
  /**
    * Mocha global.
    *
    * - _Only supported in the browser._
    */
  val mocha: BrowserMocha = js.native
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  var setup: HookFunction = js.native
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var specify: TestFunction = js.native
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var suite: SuiteFunction = js.native
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  var suiteSetup: HookFunction = js.native
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  var suiteTeardown: HookFunction = js.native
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  var teardown: HookFunction = js.native
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var test: TestFunction = js.native
  /**
    * Pending suite.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var xcontext: PendingSuiteFunction = js.native
  /**
    * Pending suite.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var xdescribe: PendingSuiteFunction = js.native
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var xit: PendingTestFunction = js.native
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  var xspecify: PendingTestFunction = js.native
  // #region Test interface augmentations
  /**
    * Triggers root suite execution.
    *
    * - _Only available if flag --delay is passed into Mocha._
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#runWithSuite
    */
  def run(): Unit = js.native
}

