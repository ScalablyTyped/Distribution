package typings.mocha.global

import typings.mocha.BrowserMocha
import typings.mocha.Mocha.HookFunction
import typings.mocha.Mocha.PendingSuiteFunction
import typings.mocha.Mocha.PendingTestFunction
import typings.mocha.Mocha.SuiteFunction
import typings.mocha.Mocha.TestFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Execute after running tests.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#after
  */
inline def after: HookFunction = js.Dynamic.global.selectDynamic("after").asInstanceOf[HookFunction]

/**
  * Execute after each test case.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#afterEach
  */
inline def afterEach: HookFunction = js.Dynamic.global.selectDynamic("afterEach").asInstanceOf[HookFunction]
inline def afterEach_=(x: HookFunction): Unit = js.Dynamic.global.updateDynamic("afterEach")(x.asInstanceOf[js.Any])

inline def after_=(x: HookFunction): Unit = js.Dynamic.global.updateDynamic("after")(x.asInstanceOf[js.Any])

/**
  * Execute before running tests.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#before
  */
inline def before: HookFunction = js.Dynamic.global.selectDynamic("before").asInstanceOf[HookFunction]

/**
  * Execute before each test case.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#beforeEach
  */
inline def beforeEach: HookFunction = js.Dynamic.global.selectDynamic("beforeEach").asInstanceOf[HookFunction]
inline def beforeEach_=(x: HookFunction): Unit = js.Dynamic.global.updateDynamic("beforeEach")(x.asInstanceOf[js.Any])

inline def before_=(x: HookFunction): Unit = js.Dynamic.global.updateDynamic("before")(x.asInstanceOf[js.Any])

/**
  * Describe a "suite" containing nested suites and tests.
  *
  * - _Only available when invoked via the mocha CLI._
  */
inline def context: SuiteFunction = js.Dynamic.global.selectDynamic("context").asInstanceOf[SuiteFunction]
inline def context_=(x: SuiteFunction): Unit = js.Dynamic.global.updateDynamic("context")(x.asInstanceOf[js.Any])

/**
  * Describe a "suite" containing nested suites and tests.
  *
  * - _Only available when invoked via the mocha CLI._
  */
inline def describe: SuiteFunction = js.Dynamic.global.selectDynamic("describe").asInstanceOf[SuiteFunction]
inline def describe_=(x: SuiteFunction): Unit = js.Dynamic.global.updateDynamic("describe")(x.asInstanceOf[js.Any])

/**
  * Describes a test case.
  *
  * - _Only available when invoked via the mocha CLI._
  */
inline def it: TestFunction = js.Dynamic.global.selectDynamic("it").asInstanceOf[TestFunction]
inline def it_=(x: TestFunction): Unit = js.Dynamic.global.updateDynamic("it")(x.asInstanceOf[js.Any])

// #endregion Reporter augmentations
// #region Browser augmentations
/**
  * Mocha global.
  *
  * - _Only supported in the browser._
  */
inline def mocha: BrowserMocha = js.Dynamic.global.selectDynamic("mocha").asInstanceOf[BrowserMocha]

// #region Test interface augmentations
/**
  * Triggers root suite execution.
  *
  * - _Only available if flag --delay is passed into Mocha._
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#runWithSuite
  */
inline def run(): Unit = js.Dynamic.global.applyDynamic("run")().asInstanceOf[Unit]

/**
  * Execute before each test case.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#beforeEach
  */
inline def setup: HookFunction = js.Dynamic.global.selectDynamic("setup").asInstanceOf[HookFunction]
inline def setup_=(x: HookFunction): Unit = js.Dynamic.global.updateDynamic("setup")(x.asInstanceOf[js.Any])

/**
  * Describes a test case.
  *
  * - _Only available when invoked via the mocha CLI._
  */
inline def specify: TestFunction = js.Dynamic.global.selectDynamic("specify").asInstanceOf[TestFunction]
inline def specify_=(x: TestFunction): Unit = js.Dynamic.global.updateDynamic("specify")(x.asInstanceOf[js.Any])

/**
  * Describe a "suite" containing nested suites and tests.
  *
  * - _Only available when invoked via the mocha CLI._
  */
inline def suite: SuiteFunction = js.Dynamic.global.selectDynamic("suite").asInstanceOf[SuiteFunction]

/**
  * Execute before running tests.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#before
  */
inline def suiteSetup: HookFunction = js.Dynamic.global.selectDynamic("suiteSetup").asInstanceOf[HookFunction]
inline def suiteSetup_=(x: HookFunction): Unit = js.Dynamic.global.updateDynamic("suiteSetup")(x.asInstanceOf[js.Any])

/**
  * Execute after running tests.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#after
  */
inline def suiteTeardown: HookFunction = js.Dynamic.global.selectDynamic("suiteTeardown").asInstanceOf[HookFunction]
inline def suiteTeardown_=(x: HookFunction): Unit = js.Dynamic.global.updateDynamic("suiteTeardown")(x.asInstanceOf[js.Any])

inline def suite_=(x: SuiteFunction): Unit = js.Dynamic.global.updateDynamic("suite")(x.asInstanceOf[js.Any])

/**
  * Execute after each test case.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#afterEach
  */
inline def teardown: HookFunction = js.Dynamic.global.selectDynamic("teardown").asInstanceOf[HookFunction]
inline def teardown_=(x: HookFunction): Unit = js.Dynamic.global.updateDynamic("teardown")(x.asInstanceOf[js.Any])

/**
  * Describes a test case.
  *
  * - _Only available when invoked via the mocha CLI._
  */
inline def test: TestFunction = js.Dynamic.global.selectDynamic("test").asInstanceOf[TestFunction]
inline def test_=(x: TestFunction): Unit = js.Dynamic.global.updateDynamic("test")(x.asInstanceOf[js.Any])

/**
  * Pending suite.
  *
  * - _Only available when invoked via the mocha CLI._
  */
inline def xcontext: PendingSuiteFunction = js.Dynamic.global.selectDynamic("xcontext").asInstanceOf[PendingSuiteFunction]
inline def xcontext_=(x: PendingSuiteFunction): Unit = js.Dynamic.global.updateDynamic("xcontext")(x.asInstanceOf[js.Any])

/**
  * Pending suite.
  *
  * - _Only available when invoked via the mocha CLI._
  */
inline def xdescribe: PendingSuiteFunction = js.Dynamic.global.selectDynamic("xdescribe").asInstanceOf[PendingSuiteFunction]
inline def xdescribe_=(x: PendingSuiteFunction): Unit = js.Dynamic.global.updateDynamic("xdescribe")(x.asInstanceOf[js.Any])

/**
  * Describes a pending test case.
  *
  * - _Only available when invoked via the mocha CLI._
  */
inline def xit: PendingTestFunction = js.Dynamic.global.selectDynamic("xit").asInstanceOf[PendingTestFunction]
inline def xit_=(x: PendingTestFunction): Unit = js.Dynamic.global.updateDynamic("xit")(x.asInstanceOf[js.Any])

/**
  * Describes a pending test case.
  *
  * - _Only available when invoked via the mocha CLI._
  */
inline def xspecify: PendingTestFunction = js.Dynamic.global.selectDynamic("xspecify").asInstanceOf[PendingTestFunction]
inline def xspecify_=(x: PendingTestFunction): Unit = js.Dynamic.global.updateDynamic("xspecify")(x.asInstanceOf[js.Any])
