package typings.mochaSugarFree.mod

import typings.mochaSugarFree.mochaSugarFreeStrings.bdd
import typings.mochaSugarFree.mochaSugarFreeStrings.qunit
import typings.mochaSugarFree.mochaSugarFreeStrings.tdd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region Test functions
trait BaseInterface extends js.Object {
  /**
  		 * The detected Mocha interface.
  		 *
  		 * @default "bdd"
  		 */
  var detectedInterface: bdd | tdd | qunit
  /**
  		 * Triggers root suite execution.
  		 *
  		 * - _Only available if flag `--delay` is passed to Mocha._
  		 *
  		 * @see https://mochajs.org/api/global.html#runWithSuite
  		 */
  def run(): Unit
}

object BaseInterface {
  @scala.inline
  def apply(detectedInterface: bdd | tdd | qunit, run: () => Unit): BaseInterface = {
    val __obj = js.Dynamic.literal(detectedInterface = detectedInterface.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[BaseInterface]
  }
}

