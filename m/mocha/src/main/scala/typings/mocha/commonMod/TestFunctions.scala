package typings.mocha.commonMod

import typings.mocha.Mocha
import typings.mocha.Mocha.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestFunctions extends js.Object {
  /**
    * Exclusive test-case.
    */
  def only(mocha: Mocha, test: Test): Test
  /**
    * Number of retry attempts
    */
  def retries(n: Double): Unit
  /**
    * Pending test case.
    */
  def skip(title: String): Unit
}

object TestFunctions {
  @scala.inline
  def apply(only: (Mocha, Test) => Test, retries: Double => Unit, skip: String => Unit): TestFunctions = {
    val __obj = js.Dynamic.literal(only = js.Any.fromFunction2(only), retries = js.Any.fromFunction1(retries), skip = js.Any.fromFunction1(skip))
    __obj.asInstanceOf[TestFunctions]
  }
}

