package typings
package mochaLib.MochaNs.reportersNs

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
  def this(runner: mochaLib.MochaNs.IRunner) = this()
  def this(runner: mochaLib.MochaNs.Runner) = this()
  def this(runner: mochaLib.MochaNs.IRunner, options: mochaLib.MochaNs.reportersNs.ProgressNs.MochaOptions) = this()
  def this(runner: mochaLib.MochaNs.Runner, options: mochaLib.MochaNs.reportersNs.ProgressNs.MochaOptions) = this()
}

