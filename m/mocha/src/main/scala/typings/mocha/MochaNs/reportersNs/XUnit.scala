package typings.mocha.MochaNs.reportersNs

import typings.mocha.MochaNs.IRunner
import typings.mocha.MochaNs.Runner
import typings.mocha.MochaNs.Test
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
  def this(runner: IRunner) = this()
  def this(runner: Runner) = this()
  def this(runner: IRunner, options: typings.mocha.MochaNs.reportersNs.XUnitNs.MochaOptions) = this()
  def this(runner: Runner, options: typings.mocha.MochaNs.reportersNs.XUnitNs.MochaOptions) = this()
  /**
    * Override done to close the stream (if it's a file).
    *
    * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#done
    */
  @JSName("done")
  def done_MXUnit(failures: Double, fn: js.Function1[/* failures */ Double, Unit]): Unit = js.native
  /**
    * Output tag for the given `test.`
    *
    * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#test
    */
  def test(test: Test): Unit = js.native
  /**
    * Write out the given line.
    *
    * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#write
    */
  def write(line: String): Unit = js.native
}

