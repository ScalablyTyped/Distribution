package typings.mocha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object global {
  
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  @scala.inline
  def after: typings.mocha.Mocha.HookFunction = js.Dynamic.global.selectDynamic("after").asInstanceOf[typings.mocha.Mocha.HookFunction]
  
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  @scala.inline
  def afterEach: typings.mocha.Mocha.HookFunction = js.Dynamic.global.selectDynamic("afterEach").asInstanceOf[typings.mocha.Mocha.HookFunction]
  @scala.inline
  def afterEach_=(x: typings.mocha.Mocha.HookFunction): scala.Unit = js.Dynamic.global.updateDynamic("afterEach")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def after_=(x: typings.mocha.Mocha.HookFunction): scala.Unit = js.Dynamic.global.updateDynamic("after")(x.asInstanceOf[js.Any])
  
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  @scala.inline
  def before: typings.mocha.Mocha.HookFunction = js.Dynamic.global.selectDynamic("before").asInstanceOf[typings.mocha.Mocha.HookFunction]
  
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  @scala.inline
  def beforeEach: typings.mocha.Mocha.HookFunction = js.Dynamic.global.selectDynamic("beforeEach").asInstanceOf[typings.mocha.Mocha.HookFunction]
  @scala.inline
  def beforeEach_=(x: typings.mocha.Mocha.HookFunction): scala.Unit = js.Dynamic.global.updateDynamic("beforeEach")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def before_=(x: typings.mocha.Mocha.HookFunction): scala.Unit = js.Dynamic.global.updateDynamic("before")(x.asInstanceOf[js.Any])
  
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def context: typings.mocha.Mocha.SuiteFunction = js.Dynamic.global.selectDynamic("context").asInstanceOf[typings.mocha.Mocha.SuiteFunction]
  @scala.inline
  def context_=(x: typings.mocha.Mocha.SuiteFunction): scala.Unit = js.Dynamic.global.updateDynamic("context")(x.asInstanceOf[js.Any])
  
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def describe: typings.mocha.Mocha.SuiteFunction = js.Dynamic.global.selectDynamic("describe").asInstanceOf[typings.mocha.Mocha.SuiteFunction]
  @scala.inline
  def describe_=(x: typings.mocha.Mocha.SuiteFunction): scala.Unit = js.Dynamic.global.updateDynamic("describe")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def it: typings.mocha.Mocha.TestFunction = js.Dynamic.global.selectDynamic("it").asInstanceOf[typings.mocha.Mocha.TestFunction]
  @scala.inline
  def it_=(x: typings.mocha.Mocha.TestFunction): scala.Unit = js.Dynamic.global.updateDynamic("it")(x.asInstanceOf[js.Any])
  
  // #endregion Reporter augmentations
  // #region Browser augmentations
  /**
    * Mocha global.
    *
    * - _Only supported in the browser._
    */
  @scala.inline
  def mocha: typings.mocha.BrowserMocha = js.Dynamic.global.selectDynamic("mocha").asInstanceOf[typings.mocha.BrowserMocha]
  
  // #region Test interface augmentations
  /**
    * Triggers root suite execution.
    *
    * - _Only available if flag --delay is passed into Mocha._
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#runWithSuite
    */
  @scala.inline
  def run(): scala.Unit = js.Dynamic.global.applyDynamic("run")().asInstanceOf[scala.Unit]
  
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  @scala.inline
  def setup: typings.mocha.Mocha.HookFunction = js.Dynamic.global.selectDynamic("setup").asInstanceOf[typings.mocha.Mocha.HookFunction]
  @scala.inline
  def setup_=(x: typings.mocha.Mocha.HookFunction): scala.Unit = js.Dynamic.global.updateDynamic("setup")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def specify: typings.mocha.Mocha.TestFunction = js.Dynamic.global.selectDynamic("specify").asInstanceOf[typings.mocha.Mocha.TestFunction]
  @scala.inline
  def specify_=(x: typings.mocha.Mocha.TestFunction): scala.Unit = js.Dynamic.global.updateDynamic("specify")(x.asInstanceOf[js.Any])
  
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def suite: typings.mocha.Mocha.SuiteFunction = js.Dynamic.global.selectDynamic("suite").asInstanceOf[typings.mocha.Mocha.SuiteFunction]
  
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  @scala.inline
  def suiteSetup: typings.mocha.Mocha.HookFunction = js.Dynamic.global.selectDynamic("suiteSetup").asInstanceOf[typings.mocha.Mocha.HookFunction]
  @scala.inline
  def suiteSetup_=(x: typings.mocha.Mocha.HookFunction): scala.Unit = js.Dynamic.global.updateDynamic("suiteSetup")(x.asInstanceOf[js.Any])
  
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  @scala.inline
  def suiteTeardown: typings.mocha.Mocha.HookFunction = js.Dynamic.global.selectDynamic("suiteTeardown").asInstanceOf[typings.mocha.Mocha.HookFunction]
  @scala.inline
  def suiteTeardown_=(x: typings.mocha.Mocha.HookFunction): scala.Unit = js.Dynamic.global.updateDynamic("suiteTeardown")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def suite_=(x: typings.mocha.Mocha.SuiteFunction): scala.Unit = js.Dynamic.global.updateDynamic("suite")(x.asInstanceOf[js.Any])
  
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  @scala.inline
  def teardown: typings.mocha.Mocha.HookFunction = js.Dynamic.global.selectDynamic("teardown").asInstanceOf[typings.mocha.Mocha.HookFunction]
  @scala.inline
  def teardown_=(x: typings.mocha.Mocha.HookFunction): scala.Unit = js.Dynamic.global.updateDynamic("teardown")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def test: typings.mocha.Mocha.TestFunction = js.Dynamic.global.selectDynamic("test").asInstanceOf[typings.mocha.Mocha.TestFunction]
  @scala.inline
  def test_=(x: typings.mocha.Mocha.TestFunction): scala.Unit = js.Dynamic.global.updateDynamic("test")(x.asInstanceOf[js.Any])
  
  /**
    * Pending suite.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def xcontext: typings.mocha.Mocha.PendingSuiteFunction = js.Dynamic.global.selectDynamic("xcontext").asInstanceOf[typings.mocha.Mocha.PendingSuiteFunction]
  @scala.inline
  def xcontext_=(x: typings.mocha.Mocha.PendingSuiteFunction): scala.Unit = js.Dynamic.global.updateDynamic("xcontext")(x.asInstanceOf[js.Any])
  
  /**
    * Pending suite.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def xdescribe: typings.mocha.Mocha.PendingSuiteFunction = js.Dynamic.global.selectDynamic("xdescribe").asInstanceOf[typings.mocha.Mocha.PendingSuiteFunction]
  @scala.inline
  def xdescribe_=(x: typings.mocha.Mocha.PendingSuiteFunction): scala.Unit = js.Dynamic.global.updateDynamic("xdescribe")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def xit: typings.mocha.Mocha.PendingTestFunction = js.Dynamic.global.selectDynamic("xit").asInstanceOf[typings.mocha.Mocha.PendingTestFunction]
  @scala.inline
  def xit_=(x: typings.mocha.Mocha.PendingTestFunction): scala.Unit = js.Dynamic.global.updateDynamic("xit")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def xspecify: typings.mocha.Mocha.PendingTestFunction = js.Dynamic.global.selectDynamic("xspecify").asInstanceOf[typings.mocha.Mocha.PendingTestFunction]
  @scala.inline
  def xspecify_=(x: typings.mocha.Mocha.PendingTestFunction): scala.Unit = js.Dynamic.global.updateDynamic("xspecify")(x.asInstanceOf[js.Any])
}
