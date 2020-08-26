package typings.mochaSugarFree.mod

import typings.mochaSugarFree.mochaSugarFreeStrings.bdd
import typings.mochaSugarFree.mochaSugarFreeStrings.qunit
import typings.mochaSugarFree.mochaSugarFreeStrings.tdd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region Test functions
@js.native
trait BaseInterface extends js.Object {
  /**
    * The detected Mocha interface.
    *
    * @default "bdd"
    */
  var detectedInterface: bdd | tdd | qunit = js.native
  /**
    * Triggers root suite execution.
    *
    * - _Only available if flag `--delay` is passed to Mocha._
    *
    * @see https://mochajs.org/api/global.html#runWithSuite
    */
  def run(): Unit = js.native
}

object BaseInterface {
  @scala.inline
  def apply(detectedInterface: bdd | tdd | qunit, run: () => Unit): BaseInterface = {
    val __obj = js.Dynamic.literal(detectedInterface = detectedInterface.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[BaseInterface]
  }
  @scala.inline
  implicit class BaseInterfaceOps[Self <: BaseInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetectedInterface(value: bdd | tdd | qunit): Self = this.set("detectedInterface", value.asInstanceOf[js.Any])
    @scala.inline
    def setRun(value: () => Unit): Self = this.set("run", js.Any.fromFunction0(value))
  }
  
}

