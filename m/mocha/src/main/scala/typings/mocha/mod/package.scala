package typings.mocha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  @scala.inline
  def after: typings.mocha.Mocha.HookFunction = typings.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("after").asInstanceOf[typings.mocha.Mocha.HookFunction]
  
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  @scala.inline
  def afterEach: typings.mocha.Mocha.HookFunction = typings.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("afterEach").asInstanceOf[typings.mocha.Mocha.HookFunction]
  @scala.inline
  def afterEach_=(x: typings.mocha.Mocha.HookFunction): scala.Unit = typings.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def after_=(x: typings.mocha.Mocha.HookFunction): scala.Unit = typings.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("after")(x.asInstanceOf[js.Any])
  
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  @scala.inline
  def before: typings.mocha.Mocha.HookFunction = typings.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("before").asInstanceOf[typings.mocha.Mocha.HookFunction]
  
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  @scala.inline
  def beforeEach: typings.mocha.Mocha.HookFunction = typings.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("beforeEach").asInstanceOf[typings.mocha.Mocha.HookFunction]
  @scala.inline
  def beforeEach_=(x: typings.mocha.Mocha.HookFunction): scala.Unit = typings.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def before_=(x: typings.mocha.Mocha.HookFunction): scala.Unit = typings.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("before")(x.asInstanceOf[js.Any])
  
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def describe: typings.mocha.Mocha.SuiteFunction = typings.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("describe").asInstanceOf[typings.mocha.Mocha.SuiteFunction]
  @scala.inline
  def describe_=(x: typings.mocha.Mocha.SuiteFunction): scala.Unit = typings.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("describe")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def it: typings.mocha.Mocha.TestFunction = typings.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("it").asInstanceOf[typings.mocha.Mocha.TestFunction]
  @scala.inline
  def it_=(x: typings.mocha.Mocha.TestFunction): scala.Unit = typings.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("it")(x.asInstanceOf[js.Any])
  
  /**
    * Triggers root suite execution.
    *
    * - _Only available if flag --delay is passed into Mocha._
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#runWithSuite
    */
  @scala.inline
  def run(): scala.Unit = typings.mocha.mod.^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[scala.Unit]
  
  /**
    * Execute before each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#beforeEach
    */
  @scala.inline
  def setup: typings.mocha.Mocha.HookFunction = typings.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("setup").asInstanceOf[typings.mocha.Mocha.HookFunction]
  @scala.inline
  def setup_=(x: typings.mocha.Mocha.HookFunction): scala.Unit = typings.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("setup")(x.asInstanceOf[js.Any])
  
  /**
    * Describe a "suite" containing nested suites and tests.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def suite: typings.mocha.Mocha.SuiteFunction = typings.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("suite").asInstanceOf[typings.mocha.Mocha.SuiteFunction]
  
  /**
    * Execute before running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#before
    */
  @scala.inline
  def suiteSetup: typings.mocha.Mocha.HookFunction = typings.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("suiteSetup").asInstanceOf[typings.mocha.Mocha.HookFunction]
  @scala.inline
  def suiteSetup_=(x: typings.mocha.Mocha.HookFunction): scala.Unit = typings.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("suiteSetup")(x.asInstanceOf[js.Any])
  
  /**
    * Execute after running tests.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#after
    */
  @scala.inline
  def suiteTeardown: typings.mocha.Mocha.HookFunction = typings.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("suiteTeardown").asInstanceOf[typings.mocha.Mocha.HookFunction]
  @scala.inline
  def suiteTeardown_=(x: typings.mocha.Mocha.HookFunction): scala.Unit = typings.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("suiteTeardown")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def suite_=(x: typings.mocha.Mocha.SuiteFunction): scala.Unit = typings.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("suite")(x.asInstanceOf[js.Any])
  
  /**
    * Execute after each test case.
    *
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#afterEach
    */
  @scala.inline
  def teardown: typings.mocha.Mocha.HookFunction = typings.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("teardown").asInstanceOf[typings.mocha.Mocha.HookFunction]
  @scala.inline
  def teardown_=(x: typings.mocha.Mocha.HookFunction): scala.Unit = typings.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("teardown")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def test: typings.mocha.Mocha.TestFunction = typings.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("test").asInstanceOf[typings.mocha.Mocha.TestFunction]
  @scala.inline
  def test_=(x: typings.mocha.Mocha.TestFunction): scala.Unit = typings.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("test")(x.asInstanceOf[js.Any])
  
  /**
    * Describes a pending test case.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @scala.inline
  def xit: typings.mocha.Mocha.PendingTestFunction = typings.mocha.mod.^.asInstanceOf[js.Dynamic].selectDynamic("xit").asInstanceOf[typings.mocha.Mocha.PendingTestFunction]
  @scala.inline
  def xit_=(x: typings.mocha.Mocha.PendingTestFunction): scala.Unit = typings.mocha.mod.^.asInstanceOf[js.Dynamic].updateDynamic("xit")(x.asInstanceOf[js.Any])
}
