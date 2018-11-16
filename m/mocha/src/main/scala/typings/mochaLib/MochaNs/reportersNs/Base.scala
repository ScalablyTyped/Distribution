package typings
package mochaLib.MochaNs.reportersNs

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
  def this(runner: mochaLib.MochaNs.IRunner) = this()
  def this(runner: mochaLib.MochaNs.Runner) = this()
  /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
  def this(runner: mochaLib.MochaNs.IRunner, options: mochaLib.MochaNs.MochaOptions) = this()
  def this(runner: mochaLib.MochaNs.Runner, options: mochaLib.MochaNs.MochaOptions) = this()
  var done: js.UndefOr[
    js.Function2[
      /* failures */ scala.Double, 
      /* fn */ js.UndefOr[js.Function1[/* failures */ scala.Double, scala.Unit]], 
      scala.Unit
    ]
  ] = js.native
  /**
               * Test failures
               */
  var failures: js.Array[mochaLib.MochaNs.Test] = js.native
  /**
               * The configured runner
               */
  var runner: mochaLib.MochaNs.Runner = js.native
  /**
               * Test run statistics
               */
  var stats: mochaLib.MochaNs.Stats = js.native
  /**
               * Output common epilogue used by many of the bundled reporters.
               *
               * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
               */
  def epilogue(): scala.Unit = js.native
}

