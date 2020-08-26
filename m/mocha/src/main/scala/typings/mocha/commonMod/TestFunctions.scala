package typings.mocha.commonMod

import typings.mocha.Mocha
import typings.mocha.Mocha.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestFunctions extends js.Object {
  /**
    * Exclusive test-case.
    */
  def only(mocha: Mocha, test: Test): Test = js.native
  /**
    * Number of retry attempts
    */
  def retries(n: Double): Unit = js.native
  /**
    * Pending test case.
    */
  def skip(title: String): Unit = js.native
}

object TestFunctions {
  @scala.inline
  def apply(only: (Mocha, Test) => Test, retries: Double => Unit, skip: String => Unit): TestFunctions = {
    val __obj = js.Dynamic.literal(only = js.Any.fromFunction2(only), retries = js.Any.fromFunction1(retries), skip = js.Any.fromFunction1(skip))
    __obj.asInstanceOf[TestFunctions]
  }
  @scala.inline
  implicit class TestFunctionsOps[Self <: TestFunctions] (val x: Self) extends AnyVal {
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
    def setOnly(value: (Mocha, Test) => Test): Self = this.set("only", js.Any.fromFunction2(value))
    @scala.inline
    def setRetries(value: Double => Unit): Self = this.set("retries", js.Any.fromFunction1(value))
    @scala.inline
    def setSkip(value: String => Unit): Self = this.set("skip", js.Any.fromFunction1(value))
  }
  
}

