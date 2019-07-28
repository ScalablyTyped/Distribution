package typings.mocha.MochaNs.reportersNs

import typings.mocha.MochaNs.IRunner
import typings.mocha.MochaNs.MochaOptions
import typings.mocha.MochaNs.Runner
import typings.mocha.MochaNs.Stats
import typings.mocha.MochaNs.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Base` reporter.
  *
  * All other reporters generally inherit from this reporter, providing stats such as test duration,
  * number of tests passed / failed, etc.
  *
  * @see https://mochajs.org/api/Mocha.reporters.Base.html
  */
@JSGlobal("Mocha.reporters.Base")
@js.native
class Base protected () extends js.Object {
  /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
  def this(runner: IRunner) = this()
  def this(runner: Runner) = this()
  def this(runner: IRunner, options: MochaOptions) = this()
  def this(runner: Runner, options: MochaOptions) = this()
  var done: js.UndefOr[
    js.Function2[
      /* failures */ Double, 
      /* fn */ js.UndefOr[js.Function1[/* failures */ Double, Unit]], 
      Unit
    ]
  ] = js.native
  /**
    * Test failures
    */
  var failures: js.Array[Test] = js.native
  /**
    * The configured runner
    */
  var runner: Runner = js.native
  /**
    * Test run statistics
    */
  var stats: Stats = js.native
  /**
    * Output common epilogue used by many of the bundled reporters.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
    */
  def epilogue(): Unit = js.native
}

