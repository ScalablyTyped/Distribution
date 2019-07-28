package typings.mocha.MochaNs.reportersNs

import typings.mocha.MochaNs.IRunner
import typings.mocha.MochaNs.Runner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Progress` bar test reporter.
  *
  * @see https://mochajs.org/api/Mocha.reporters.Progress.html
  */
@JSGlobal("Mocha.reporters.Progress")
@js.native
class Progress protected () extends Base {
  /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
  def this(runner: IRunner) = this()
  def this(runner: Runner) = this()
  def this(runner: IRunner, options: typings.mocha.MochaNs.reportersNs.ProgressNs.MochaOptions) = this()
  def this(runner: Runner, options: typings.mocha.MochaNs.reportersNs.ProgressNs.MochaOptions) = this()
}

