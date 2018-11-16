package typings
package mochaLib.MochaNs.reportersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Initialize a new `XUnit` test reporter.
         *
         * @see https://mochajs.org/api/Mocha.reporters.XUnit.html
         */
@JSGlobal("Mocha.reporters.XUnit")
@js.native
class XUnit protected () extends Base {
  /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
  def this(runner: mochaLib.MochaNs.IRunner) = this()
  def this(runner: mochaLib.MochaNs.Runner) = this()
  /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
  def this(runner: mochaLib.MochaNs.IRunner, options: mochaLib.MochaNs.reportersNs.XUnitNs.MochaOptions) = this()
  def this(runner: mochaLib.MochaNs.Runner, options: mochaLib.MochaNs.reportersNs.XUnitNs.MochaOptions) = this()
  /**
               * Override done to close the stream (if it's a file).
               *
               * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#done
               */
  @JSName("done")
  def done_MXUnit(failures: scala.Double, fn: js.Function1[/* failures */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
               * Output tag for the given `test.`
               *
               * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#test
               */
  def test(test: mochaLib.MochaNs.Test): scala.Unit = js.native
  /**
               * Write out the given line.
               *
               * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#write
               */
  def write(line: java.lang.String): scala.Unit = js.native
}

