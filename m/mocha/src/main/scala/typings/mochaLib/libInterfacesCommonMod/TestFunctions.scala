package typings
package mochaLib.libInterfacesCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestFunctions extends js.Object {
  /**
    * Exclusive test-case.
    */
  def only(mocha: mochaLib.Mocha, test: mochaLib.MochaNs.Test): mochaLib.MochaNs.Test
  /**
    * Number of retry attempts
    */
  def retries(n: scala.Double): scala.Unit
  /**
    * Pending test case.
    */
  def skip(title: java.lang.String): scala.Unit
}

object TestFunctions {
  @scala.inline
  def apply(
    only: (mochaLib.Mocha, mochaLib.MochaNs.Test) => mochaLib.MochaNs.Test,
    retries: scala.Double => scala.Unit,
    skip: java.lang.String => scala.Unit
  ): TestFunctions = {
    val __obj = js.Dynamic.literal(only = js.Any.fromFunction2(only), retries = js.Any.fromFunction1(retries), skip = js.Any.fromFunction1(skip))
  
    __obj.asInstanceOf[TestFunctions]
  }
}

