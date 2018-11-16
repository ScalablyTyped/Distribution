package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Partial interface for Mocha's `Test` class. */
/** @deprecated use `Mocha.Test` instead. */
@js.native
trait ITest extends IRunnable {
  var body: js.UndefOr[java.lang.String] = js.native
  var file: js.UndefOr[java.lang.String] = js.native
  /** @deprecated `.parent` has type `Mocha.Suite | undefined` in `Mocha.Test`. */
  var parent: js.UndefOr[ISuite] = js.native
  var pending: scala.Boolean = js.native
  var state: js.UndefOr[mochaLib.mochaLibStrings.failed | mochaLib.mochaLibStrings.passed] = js.native
  var `type`: mochaLib.mochaLibStrings.test = js.native
  def fullTitle(): java.lang.String = js.native
}

