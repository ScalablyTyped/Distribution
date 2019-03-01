package typings
package mochaLib.libInterfacesCommonMod.commonNs

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
    only: js.Function2[mochaLib.Mocha, mochaLib.MochaNs.Test, mochaLib.MochaNs.Test],
    retries: js.Function1[scala.Double, scala.Unit],
    skip: js.Function1[java.lang.String, scala.Unit]
  ): TestFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("only")(only)
    __obj.updateDynamic("retries")(retries)
    __obj.updateDynamic("skip")(skip)
    __obj.asInstanceOf[TestFunctions]
  }
}

