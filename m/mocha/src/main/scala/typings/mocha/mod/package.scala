package typings.mocha.mod

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
inline def after: HookFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("after").asInstanceOf[HookFunction]

/**
  * Execute after each test case.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#afterEach
  */
inline def afterEach: HookFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("afterEach").asInstanceOf[HookFunction]
inline def afterEach_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(x.asInstanceOf[js.Any])

inline def after_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("after")(x.asInstanceOf[js.Any])

/**
  * Execute before running tests.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#before
  */
inline def before: HookFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("before").asInstanceOf[HookFunction]

/**
  * Execute before each test case.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#beforeEach
  */
inline def beforeEach: HookFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("beforeEach").asInstanceOf[HookFunction]
inline def beforeEach_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(x.asInstanceOf[js.Any])

inline def before_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("before")(x.asInstanceOf[js.Any])

/**
  * Describe a "suite" containing nested suites and tests.
  *
  * - _Only available when invoked via the mocha CLI._
  */
inline def describe: SuiteFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("describe").asInstanceOf[SuiteFunction]
inline def describe_=(x: SuiteFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("describe")(x.asInstanceOf[js.Any])

/**
  * Describes a test case.
  *
  * - _Only available when invoked via the mocha CLI._
  */
inline def it: TestFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("it").asInstanceOf[TestFunction]
inline def it_=(x: TestFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("it")(x.asInstanceOf[js.Any])

/**
  * Triggers root suite execution.
  *
  * - _Only available if flag --delay is passed into Mocha._
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#runWithSuite
  */
inline def run(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[Unit]

/**
  * Execute before each test case.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#beforeEach
  */
inline def setup: HookFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("setup").asInstanceOf[HookFunction]
inline def setup_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setup")(x.asInstanceOf[js.Any])

/**
  * Describe a "suite" containing nested suites and tests.
  *
  * - _Only available when invoked via the mocha CLI._
  */
inline def suite: SuiteFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("suite").asInstanceOf[SuiteFunction]

/**
  * Execute before running tests.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#before
  */
inline def suiteSetup: HookFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("suiteSetup").asInstanceOf[HookFunction]
inline def suiteSetup_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suiteSetup")(x.asInstanceOf[js.Any])

/**
  * Execute after running tests.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#after
  */
inline def suiteTeardown: HookFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("suiteTeardown").asInstanceOf[HookFunction]
inline def suiteTeardown_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suiteTeardown")(x.asInstanceOf[js.Any])

inline def suite_=(x: SuiteFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suite")(x.asInstanceOf[js.Any])

/**
  * Execute after each test case.
  *
  * - _Only available when invoked via the mocha CLI._
  *
  * @see https://mochajs.org/api/global.html#afterEach
  */
inline def teardown: HookFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("teardown").asInstanceOf[HookFunction]
inline def teardown_=(x: HookFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("teardown")(x.asInstanceOf[js.Any])

/**
  * Describes a test case.
  *
  * - _Only available when invoked via the mocha CLI._
  */
inline def test: TestFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("test").asInstanceOf[TestFunction]
inline def test_=(x: TestFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("test")(x.asInstanceOf[js.Any])

/**
  * Describe a pending suite.
  *
  * - _Only available when invoked via the mocha CLI._
  */
inline def xdescribe: PendingSuiteFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("xdescribe").asInstanceOf[PendingSuiteFunction]
inline def xdescribe_=(x: PendingSuiteFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xdescribe")(x.asInstanceOf[js.Any])

/**
  * Describes a pending test case.
  *
  * - _Only available when invoked via the mocha CLI._
  */
inline def xit: PendingTestFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("xit").asInstanceOf[PendingTestFunction]
inline def xit_=(x: PendingTestFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xit")(x.asInstanceOf[js.Any])
